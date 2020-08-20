(ns project-euler.core
  (:gen-class))

(set! *warn-on-reflection* true)

(defn run-problem [n]
  (let [number (.format (new java.text.DecimalFormat "0") n)
        solution-function (symbol (str "solution-" number))]
    (use (vec (list (symbol (str "project-euler." number))
                    :only (list solution-function))))
    (eval (list solution-function))))

(defn -main
  "Solution runner"
  [& args]
  (if (and args (= 1 (count args)))
    (println (time (run-problem (Integer/parseInt (first args)))))
    (println "Usage: lein run [number]")))
