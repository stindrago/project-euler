(ns project-euler.1
  "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.")

(defn multiple-of [x]
  (reduce + (filter (fn [n] 
                      (or 
                       (= (mod n 5) 0)
                       (= (mod n 3) 0)))
                    (range 1 x))))

(defn solution-1 []
  (multiple-of 1000))
