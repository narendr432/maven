#!/bin/bash

mvn_tasks="clean test"
base_mvn_parameters="-Ptest.group=${TEST_GROUP}"
mvn_parameters="$base_gradle_parameters"
chmod +x mvnw # making executable
echo "$mvn_tasks $mvn_parameters $env_url" | xargs mvnw


