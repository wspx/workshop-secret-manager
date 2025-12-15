#!/bin/sh
export INFISICAL_TOKEN=$(infisical login --method=universal-auth --client-id=bc39f741-9aec-4a17-9716-0e8dc82721a2 --client-secret=46ebc4358fe608d779f50ea9fc75514e47839cf59ec2b51c74816548de6df724 --plain --silent)

#Debug
infisical --token "$INFISICAL_TOKEN" --projectId 7c69adc0-c969-4a12-944a-f291cfb87ce8 --env prod secrets
infisical run  --token "$INFISICAL_TOKEN" --projectId 7c69adc0-c969-4a12-944a-f291cfb87ce8 --env prod -- printenv


exec infisical run --token "$INFISICAL_TOKEN" --projectId 7c69adc0-c969-4a12-944a-f291cfb87ce8 --env prod -- java -jar app.jar