cmake_minimum_required(VERSION 3.5)

project(hello_world)

set(SOURCE src/main.cpp)

add_executable(${PROJECT_NAME} ${SOURCE})
