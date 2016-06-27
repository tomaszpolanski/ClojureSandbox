 (ns Basics)

; Hello worlds and functions
(def hello (fn [] (printf "Hello world\n") ))
(hello)

(defn hello ( [] (printf "Hello world\n") ))
(hello)

(def addInt (fn [] (+ 1 2 3 4)))

; Conditions
(if true
  "This is True"
  "This is False")


(if false
  "True case won't ever happen, will return nil as no false case")

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

