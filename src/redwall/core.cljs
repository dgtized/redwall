(ns redwall.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(def constants { :cells 2048})

(defn render-machine []
  [:div
   [:center [:h1 "Redwall MARS"]]
   (let [c 128
         edge 0.05
         size (- 1.0 edge)]
     [:svg {:view-box (str "0 0 96 96") :width 1280 :height 768}
      (for [i (range (constants :cells)) :let [x (mod i c) y (quot i c)] ]
        [:g {:key (str "m" i)}
         [:rect {:x (+ x edge) :y (+ y edge) :width size :height size :fill :grey}]])])])

(r/render-component
 [render-machine]
 (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
