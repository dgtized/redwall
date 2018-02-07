(ns redwall.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(def constants {:cells 8000})
(defonce machine (r/atom {:memory (make-array Integer/TYPE (constants :cells))}))

(defn show-memory [e]
  (println (-> e .-currentTarget .-key)))

(defn program-color [instr]
  :lightgrey)

(defn render-machine []
  (let [cells (constants :cells)
        memory (:memory @machine)
        box 128
        edge 0.05
        size (- 1.0 edge)]
    [:svg {:view-box (str "0 0 " box " " box)
           :on-mouse-over show-memory}
     (for [i (range cells)
           :let [x (mod i box) y (quot i box)] ]
       [:rect {:x (+ x edge) :y (+ y edge)
               :width size :height size
               :key (str "m" i)
               :fill (program-color
                      (nth memory i))}])]))

(defn render []
  [:div
   [:center [:h1 "Redwall MARS"]]
   (render-machine)])

(r/render-component
 [render]
 (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
