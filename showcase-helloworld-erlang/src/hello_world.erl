-module(hello_world).

-export([hello/0, main/1]).

main(_Args) -> hello(), erlang:halt(0).

hello() -> io:format("Hello, world!~n").
