(ns redwall.parser
  (:require [instaparse.core :as insta :refer-macros [defparser]]
            [redwall.slurp :refer-macros [slurp]]))

(defparser whitespace
  "whitespace = #'[ \\t]+'")
(defparser redcode
  "resources/redcode.txt"
  :string-ci true
  :auto-whitespace whitespace)

(def dwarf (slurp "resources/dwarf.asm"))
(def dwarf-2 (slurp "resources/dwarf-2.asm"))
(def imp (slurp "resources/imp.asm"))

(comment
  (redcode "; comment\nMOV 0, 1")
  (redcode "MOV 0, 1")
  (redcode dwarf)
  (redcode dwarf-2)
  (redcode imp))

