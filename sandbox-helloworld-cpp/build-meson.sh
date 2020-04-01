#!/usr/bin/env sh
cd `dirname $0`
meson --reconfigure build
cd build
ninja
