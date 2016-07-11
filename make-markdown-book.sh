#!/bin/bash

SRC="./compendium"
DEST="./build_markdown"

mkdir -p $DEST
mkdir -p ${DEST}/modules

pandoc -s ${SRC}/compendium.tex -o ${DEST}/compendium.md

for file in ${SRC}/modules/*; do
    echo "Converting $file";
    # name is actually path + name without file extension
    name=$(echo $file | sed 's/\..*$//g')
    pandoc -s $file -o ${DEST}/${name}.md
done
