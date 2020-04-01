#!/usr/bin/env sh
cd `dirname $0`
mkdir -p build
cd build
cmake .. -G Ninja
ninja
mv hello_world ..
