FROM ubuntu:latest
LABEL authors="quyng"

ENTRYPOINT ["top", "-b"]