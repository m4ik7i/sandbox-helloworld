cmake_minimum_required(VERSION 3.5)

project(hello_world)

set(SOURCE src/main.c)

add_executable(${PROJECT_NAME} ${SOURCE})
