 (ns Intermediate)

; Let
(def x 0)
(let [x (inc x)] x)

(let [[ first & rest] '(1 2 3)]
  [first rest])

; Into
(into [] (set [:a :a]))

; Loop
(loop [ i 0]
  (println (str "Iteration " i))
  (if (< i 5)
    (recur (inc i))))

; Regexp
(re-find #"^start-" "start-end")

(defn test-rename
  [test]
  {:name (clojure.string/replace (:name test) #"^test" "")
   :line-count (:line-count test)})
(test-rename {:name "testGetProperties" :line-count 25})