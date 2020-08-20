;;;; Solution provided by https://github.com/mishadoff/project-euler
(ns project-euler.8)

(defn calc-product [lst]
  (reduce * (map #(- (int %) 48) lst)))

(defn solution-8 []
  (reduce max (map calc-product
                   (partition 5 1 (remove #(= \newline %) (seq (slurp "resources/input/i8.txt")))))))
