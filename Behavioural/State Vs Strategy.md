
Honestly, the two patterns are pretty similar in practice, and the defining difference between them tends to vary depending on who you ask. Some popular choices are:

-   States store a reference to the context object that contains them. Strategies do not.
-   States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
-   Strategies are passed to the context object as parameters, while States are created by the context object itself.
-   Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most everything) the context object does.

A "classic" implementation would match either State or Strategy for every item on the list, but you do run across hybrids that have mixes of both. Whether a particular one is more State-y or Strategy-y is ultimately a subjective question.

States are able to change itself, if a strategy were to change, it must be done by the client. Can change states during runtime done during run-time