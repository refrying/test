#!/bin/sh
export GRADLE_OPTS="-Xmx1g"
exec ./gradle/wrapper/gradle-wrapper.jar "$@"