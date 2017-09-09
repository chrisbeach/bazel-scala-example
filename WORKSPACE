rules_scala_version="031e73c02e0d8bfcd06c6e4086cdfc7f3a3061a8" # update this as needed

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

maven_jar(
    name = "scala_test_maven",
    artifact = "org.scalatest:scalatest_2.12:3.0.1",
)

bind(
  name = "scala_test",
  actual = "@scala_test_maven//jar"
)