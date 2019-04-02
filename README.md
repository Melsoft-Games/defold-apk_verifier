![](docs/logo.png)

# Defold-Apk_verifier

Defold-Apk_verifier [Native Extension](https://www.defold.com/manuals/extensions/) for the [Defold Game Engine](https://www.defold.com) 

This Extension allows you calculate MD5 in native from string


## Platforms

* **Android**

## Setup

You can use the Defold-Apk_verifier extension in your own project by adding this project as a [Defold library dependency](https://www.defold.com/manuals/libraries/). Open your game.project file and in the dependencies field under project add:

> https://github.com/Melsoft-Games/defold-apk_verifier/archive/master.zip

Or point to the ZIP file of a [specific release](https://github.com/Melsoft-Games/defold-apk_verifier/releases).

## API

#### `apk_verifier.get_package_name()`
return string for compare with project package name

#### `apk_verifier.is_installed_from_market()`
return bool for check play market installation


## License, Authors
*MIT license*
This NE wrapped by [Denis Smirnov](https://github.com/trouble1337)

## Issues and suggestions

If you have any issues, questions or suggestions please [create an issue](https://github.com/Melsoft-Games/defold-apk_verifier/issues) or contact me: insality@gmail.com
