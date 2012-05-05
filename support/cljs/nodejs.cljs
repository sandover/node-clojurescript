; Projects compiled with :target :nodejs can 'require' this namespace
; to get the nodejs globals loaded into cljs.nodejs and get
; ClojureScript's 'print' set up correctly.
(ns cljs.nodejs)

; http://nodejs.org/api/globals.html
; Define namespaced references to Node's externed globals:
(def global (js* "global"))
(def process (js* "process"))
(def console (js* "console"))
(def buffer (js* "Buffer"))
(def require (js* "require"))
(def __filename (js* "__filename"))
(def __dirname (js* "__dirname"))
(def module (js* "module"))
(def exports (js* "exports"))
(def timeout (js* "setTimeout"))
(def clear-timeout (js* "clearTimeout"))
(def interval (js* "setInterval"))
(def clear-interval (js* "clearInterval"))

; Have ClojureScript print using Node's console.log function
(set! cljs.core/string-print (.-log console))