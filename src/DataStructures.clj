 (ns DataStructures)

; Values
(def this_is_a_value
  ["I" "mean" "a" "list" "value"])

; And sets
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

; Vectors
[1 2 3]
(vector 1 2 3)

(get [1 2 3] 0)

(conj ["This" "is" "just"] "concat")

; Lists
'(1 2 3)
(list 1 2 3)

(nth '(1 2 3) 1)
; dont use get with lists, returns nil:
(get '(1 2 3) 1)

; conj differs from vactor!
(conj '("is" "just" "concat")  "This")

;HashSet

#{ 1 2 3}

(hash-set 1 2 3)
(hash-set "this" "removes" "duplicates" "duplicates" )

#{"this" "not!" "not!"}

;Set from vactor
(set [ 1 2 2 3])

(contains? #{1 3 2 nil} 3 )

;you can use get

(get #{1 3 2 nil} 3 )
;but then:
(get #{1 3 2 nil} nil )
;you dont know

(:first #{ :first "second"})

