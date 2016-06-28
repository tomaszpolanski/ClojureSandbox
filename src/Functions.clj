 (ns Functions)

(map inc [1 2 3 4])

(defn hellofun
  "This is hello world function"
  [what_hello]
  (str "Hello, " what_hello)) (hellofun "me")

;Documentation
(doc hellofun)

(defn overloading
  ([first second]
   (printf (str first " " second) ))
  ([onlyOne]
   (printf (str "Only one: " onlyOne))))

(defn recursion
  ([question answer]
   (println (str "Is this " question "? " answer)))
  ([answer]
   (recursion "recursion" answer)))

 (recursion "Yes!")

;Diffrent return types
(defn different_returns
  ([]
   "This is a string")
  ([number]
   number))

;Argument list
(defn arguments
  ([ & args]
   (str  "Arguments " (clojure.string/join ", " args) )))
(arguments "first" "second")

;Destructuring arguments
(defn descruct
  [[first]]
  first)

(descruct [1 2 3])

(defn descructImproved
  [[first & rest]]
  rest)

(descructImproved [1 2 3])

;Destructing sets

(defn descructingSets
  [{lat :lat lng :lng}]
  (str lat " " lng))

(descructingSets {:lat 28.22 :lng 81.33})

; Annonymous functions

(map (fn [name]  (str name)) [1 2 3])

((fn [num] (+ 1 num)) 2)

;Not so annonymous anymore
(def not_so_annonumous (fn [num] (+ 1 num)))
(not_so_annonumous 1)

; % is like it
(#(+ % 3) 8)
(map #(str "" %) [1 2 3])
(#(str %1 " and " %2) "first" "second")
(identity 1)

; The rest of args
(#(identity %&) 1 "second")