; reference: "Living Clojure" by Carin Meier

(def animals [:mouse :duck :dodo])

(def colors [:black :pink :purple])


; map with routine on the same call
(map #(str %) animals)
; expected output: (":mouse" ":duck" ":dodo")


; map with previsouly defined function
(defn gen-animal-string [animal color]
  (str animal "-" color))
  
(map gen-animal-string animals colors)
; expected output: ["mouse-black" "mouse-pink" "mouse-purple" "duck-black" "duck-pink" "duck-purple" "dodo-black" "dodo-pink" "dodo-purple"]
