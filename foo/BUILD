package(default_visibility = ["//visibility:public"])

scala_library(
    name = "foo",
    srcs = glob(["src/main/scala/foo/*.scala"]),
    deps = [
        "//bar"
    ]
)

scala_test(
    name = "foo_test",
    srcs = glob(["src/test/scala/foo/*.scala"]),
    size = "small", # Expect this test to run quickly
    deps = [
        ":foo"
    ]
)