add_rules("mode.debug", "mode.release")

target("hello_world")
    set_kind("binary")
    add_files("src/main.cpp")
