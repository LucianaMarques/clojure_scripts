; Returns a lazy sequence of successive matches of pattern in string
(re-seq #"[A-Z]+" "bA1B3Ce ")
; expected: ("A" "B" "C")
