(ns redwall.parser
  (:require [instaparse.core :as insta :refer-macros [defparser]]
            [redwall.slurp :refer-macros [slurp]]))

(defparser whitespace
  "whitespace = #'[ \\t]+'")
(defparser redcode
  "resources/redcode.txt"
  :auto-whitespace whitespace)

(def dwarf (slurp "resources/dwarf.asm"))

(comment
  (redcode "; comment\nMOV 0, 1")
  (redcode "MOV 0, 1")
  (redcode dwarf))

