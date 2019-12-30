; Reference - "Living Clojure" by Carin Meier

; simple recursion
(def ads ["normal" "too small" "too big" "is swimming"])
(defn alice-is [in out]
  (if (empty? in)
    out
    (alice-is
      (rest in)
      (conj out 
        (str "Alice is " (first in))))))
(alice-is adjs [])
; expected output: ["Alice is normal" "Alice is too small" "Alice is too big" "Alice is swimming"]

; simple recursion rewritten with "loop" and "recur"
(defn alice-is [input]
  (loop [in input
         out []]
    (if (empty? in)
      out
      (recur (rest in) 
      (conj out 
            (str "Alice is " (first in))))))
