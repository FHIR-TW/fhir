#!/bin/bash
THISDIR=`pwd`
cd ..
rm -rf build-fhir
git clone --depth 1 $THISDIR build-fhir
cp  -R $THISDIR/zh-tw/source/* build-fhir/source
cd build-fhir
echo "Running publication process now..."
./gradlew publish 2>&1 | tee $THISDIR/zh-tw/build.log