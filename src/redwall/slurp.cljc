(ns redwall.slurp
  (:refer-clojure :exclude [slurp]))

#?(:clj
   (defmacro slurp [file]
     (clojure.core/slurp file)))

