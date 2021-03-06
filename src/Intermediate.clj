 (ns Intermediate)

; Documentation
 (doc map)

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

; % as function
(#(% [1 2 3]) count)

; You can map (almost) everything
(map #(str "This and " %) '(1 2 3))
(map #(str "This and " (second %)) {:f "Value"})

(map str ["1" "2" ] ["a" "b"])

; List of functions
(def sum #(reduce + %))
(sum [1 2 3])
(def avg #(/ (sum %) (count %)))
(avg [2 6])

(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))
(stats [1 2 3 4])

; Keys as functions
(def some-list
  [{:name "John" :last "Smith"}
   {:name "Tomek" :last "Polanski"}])
(map :name some-list)

; New item in map
(assoc {:key "value"} :newKey "newValue")
(reduce (fn [new-map [key value]]
          (assoc new-map key (inc value)))
        {}
        {:first 1 :second 2})

; Take, skip
(take-while #( > 5 %) (range 0 10))

;Filter
(some #( > % 20) (range 0 10))

; Time
(time (map inc [1 2 3]))

; Repeat
(take 3 (repeatedly #(rand-int 10)) )
(take 3 (repeatedly (fn [] (rand-int 10))))

; Lazy sequence
(defn even-numbers
  ([] (even-numbers 0))
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))
(take 10 (even-numbers))

; Combining lists
(concat [0] [1])
(into [0] #{1})
(conj [0] 1)

