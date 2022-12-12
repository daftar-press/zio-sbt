[//]: # (This file was autogenerated using `zio-sbt-website` plugin via `sbt generateReadme` command.)
[//]: # (So please do not edit it manually. Instead, change "docs/index.md" file or sbt setting keys)
[//]: # (e.g. "readmeDocumentation" and "readmeSupport".)


# ZIO SBT

_ZIO SBT_ is an sbt plugin for ZIO projects. It provides high-level SBT utilities that simplify the development of ZIO applications.

Project Stage | CI | Release | Snapshot | Discord | Github |
--------------|----|---------|----------|---------|--------|
[![Production Ready](https://img.shields.io/badge/Project%20Stage-Production%20Ready-brightgreen.svg)](https://github.com/zio/zio/wiki/Project-Stages)        |![CI Badge](https://github.com/zio/zio-sbt/workflows/CI/badge.svg) |[![Sonatype Releases](https://img.shields.io/nexus/r/https/oss.sonatype.org/dev.zio/zio-sbt-website_2.12.svg)](https://oss.sonatype.org/content/repositories/releases/dev/zio/zio-sbt-website_2.12/) |[![Sonatype Snapshots](https://img.shields.io/nexus/s/https/oss.sonatype.org/dev.zio/zio-sbt-website_2.12.svg)](https://oss.sonatype.org/content/repositories/snapshots/dev/zio/zio-sbt-website_2.12/) |[![Chat on Discord!](https://img.shields.io/discord/629491597070827530?logo=discord)](https://discord.gg/2ccFBr4) |[![ZIO SBT](https://img.shields.io/github/stars/zio/zio-sbt?style=social)](https://github.com/zio/zio-sbt) |


## Installation




Add the following lines to your `plugin.sbt` fil:

```scala
addSbtPlugin("dev.zio" % "zio-sbt-website" % "0.1.5")
```



Then you can enable it by using the following code in your `build.sbt` file:

```scala
enablePlugins(WebsitePlugin)
```

## ZIO SBT Website

ZIO SBT Website is an SBT plugin that has the following tasks:

- `sbt compileDocs`— compile documentation inside `docs` directory. The compilation result will be inside `website/docs` directory.
- `sbt installWebsite`— creates a website for the project inside the `website` directory
- `sbt previewWebsite`— runs a local webserver that serves documentation locally on http://localhost:3000. By changing the documentation inside the `docs` directory, the website will be reloaded with new content.
- `sbt publishToNpm`— publishes documentation inside the `docs` directory to the npm registry.
- `sbt generateGithubWorkflow`— generates GitHub workflow which publishes documentation for each library release.
- `sbt generateReadme`— generate README.md file using `README.template.md` and `docs/index.md` files.

## Documentation

Learn more on the [ZIO SBT homepage](https://zio.dev/zio-sbt)!

## Contributing

For the general guidelines, see ZIO [contributor's guide](https://zio.dev/about/contributing).
#### TL;DR

Before you submit a PR, make sure your tests are passing, and that the code is properly formatted

```
sbt prepare

sbt testPlugin
```


## Code of Conduct

See the [Code of Conduct](https://zio.dev/about/code-of-conduct)

## Support

Come chat with us on [![Badge-Discord]][Link-Discord].

[Badge-Discord]: https://img.shields.io/discord/629491597070827530?logo=discord "chat on discord"
[Link-Discord]: https://discord.gg/2ccFBr4 "Discord"

## License

[License](LICENSE)
