# Java 8 Lambda
---
## Javascript(ECMAScript)
### First-class functions
### arrow-functions (lambda)
##Java8
### Anonymous Inner Class
### Funtional Interface
- Consumer\<T>
T -> {doSomethingWithTAndDoNotReturn(T)}
- Supplier\<T>
() -> T
- Predicate\<T> 
T -> boolean
- Function<T, R>
T -> R
UnaryOperator\<T>
T -> T
- BiFunction<T, U, R>
(T, U) -> R
BinaryOperator\<T>
(T, T) -> T

#Optional
---
- static Optional\<T> of(T value)
- static Optional\<T> ofNullable(T value)
- static Optional\<T> empty()
- T get()
- boolean isPresent()
- T	orElse(T other)
- T	orElseGet(Supplier<? extends T> other)
- T	orElseThrow(Supplier<? extends X> exceptionSupplier)
- void	ifPresent(Consumer<? super T> consumer)
- Optional\<U> map(Function<? super T,? extends U> mapper)
- Optional\<U> flatMap(Function<? super T,Optional\<U>> mapper)
- Optional\<T> filter(Predicate<? super T> predicate)
