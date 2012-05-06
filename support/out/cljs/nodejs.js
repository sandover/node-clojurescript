goog.provide('cljs.nodejs');
goog.require('cljs.core');
cljs.nodejs.global = global;
cljs.nodejs.process = process;
cljs.nodejs.console = console;
cljs.nodejs.buffer = Buffer;
cljs.nodejs.require = require;
cljs.nodejs.__filename = __filename;
cljs.nodejs.__dirname = __dirname;
cljs.nodejs.module = module;
cljs.nodejs.exports = exports;
cljs.nodejs.timeout = setTimeout;
cljs.nodejs.clear_timeout = clearTimeout;
cljs.nodejs.interval = setInterval;
cljs.nodejs.clear_interval = clearInterval;
cljs.core.string_print = cljs.nodejs.console.log;