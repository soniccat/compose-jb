includeBuild("buildSrc2")
include(
    ":common:utils",
    ":common:database",
    ":common:main",
    ":common:edit",
    ":common:root",
    ":common:compose-ui",
    ":android",
    ":desktop",
    ":web"
)
