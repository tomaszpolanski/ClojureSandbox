 (ns Basics)

(def hello (fn [] (printf "Hello world\n") ))
(hello)

(defn hello ( [] (printf "Hello world\n") ))
(hello)

(def addInt (fn [] (+ 1 2 3 4)))

(if true
  "This is True"
  "This is False")

(if false
  "True case won't ever happen, will return nil")

(if true
  (do (printf "Print this")  "Return this"))

(when true
  (do (printf "When is like an if")  "but with no else"))

(nil? "This is not nil")

(nil? nil)

(= nil nil)

(if nil
  "Does nil work with if?"
  "nil works with if!")

(or false nil "This is not false")

(and false nil "This is not false, so what?")

(and :firstTrue :secondTrueThatWillBeReturned)

(def this_is_a_value
  ["I" "mean" "a" "list" "value"])

{:first_key "This is a key"
 :first_value "and the value"}

{:keyOfAMapWithFunction +}

(hash-map :a "valueA" :b "valueB")

(get {"key" 1} "key")

((get {:keyOfAMapWithFunction +} :keyOfAMapWithFunction) 1 2)

(get-in {:shallow {:deeper "Deeper value"}} [:shallow :deeper])

({:mapsAsFunctions "Yes, why not?"} :mapsAsFunctions)

(:keywordAsAFunction {:keywordAsAFunction "Yep"})

(:missing {:first 1 :second 2} "Not found this time")