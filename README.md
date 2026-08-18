# SMS Commons

[![License: GPL-3.0](https://img.shields.io/badge/license-GPL--3.0-blue.svg)](./LICENSE)

> Historical Android library. This repository preserves the shared UI and platform layer used by the final Smsgram release.

SMS Commons is a Kotlin Android library that centralizes reusable application infrastructure for [`smsgram`](https://github.com/favrora/smsgram). It packages common dialogs, storage and permission workflows, theming, biometric helpers, media utilities, RecyclerView components, and localized resources behind one Maven artifact.

## Library Scope

- Reusable Material dialogs and shared Android UI primitives
- File, document, image, and EXIF helpers
- Theme, color, and device configuration utilities
- Biometric and pattern-lock integrations
- Room, Glide, Gson, and vCard support boundaries
- Shared icons, dimensions, styles, and broad localization resources
- Sample application for validating library behavior

## Modules

```text
commons/   Reusable Android library published as com.favrora.commons:commons
samples/   Small application for exercising the library components
```

## Build Snapshot

The repository preserves the final 2023 build configuration and targets Android API 33 with JDK 17. Some original third-party Android artifacts have since disappeared from their upstream repositories, so this source snapshot is not presented as a supported modern package.

```bash
./gradlew assemble
./gradlew publishToMavenLocal
```

Publishing locally produces `com.favrora.commons:commons:1.0.7`, which is consumed by Smsgram.

## License

Released under the [GNU General Public License v3.0](./LICENSE).
