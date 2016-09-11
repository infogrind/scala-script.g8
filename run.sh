#!/bin/sh

TARGETDIR=target
TESTDIR=$TARGETDIR/giter8
G8DIR=`pwd`
SCRIPTNAME=testscript

mkdir -p "$TARGETDIR" && rm -Rf "$TESTDIR" && mkdir -p "$TESTDIR"

cd "$TESTDIR"

g8 "file://$G8DIR" \
    --name=$SCRIPTNAME \
    --organization=ch.hostuff.scalascript \
    --version=0.0.1-SNAPSHOT \
    --scalaversion=2.11.5

cd "$SCRIPTNAME"

sbt "csRun $SCRIPTNAME $@"

cd "$G8DIR"
