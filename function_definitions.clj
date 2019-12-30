; defining a named function
(fn add-five [x] (+ x 5)) 3)

; passing an argument 
(fn [x] (+ x 5)) 3)

(#(+ % 5) 3)

(partial + 5) 3)

; variable amount of args - sum example
(defn sum [& args] (apply + args))
