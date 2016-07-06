# 75.67 - Fallas I

#### Cómo clonar branch App

* Crear directorio **Guillotina** en alguna ubicación, tal como podría ser en **Escritorio** para su rapido acceso.
`mkdir Guillotina`
* Ubicarse dentro del directorio **Guillotina**
`cd Guillotina`

Para clonar el branch y empezar a desarrollar sobre el mismo, desde la linea de comandos ubicarse en el directorio **Guillotina** y ejecutar:

`git clone -b App https://github.com/agrojas/75.67-fallas.git`

## Generar el proyecto

Para generar el script de ejecucion del programa ejecutar el siguiente comando en la carpeta raiz del proyecto:
```shell
.\gradlew distZip
```
Esto va a generar un directorio `build`, donde se va a poder encontrar el archivo `.zip` para distribuir el programa. El mismo se encuentra en la carpeta `distributions` con el nombre `Guillotina-<version>.zip`.

## Ejecutar el programa

Se puede conseguir el zip con el programa en la seccion de releases o compilandolo como se indico en la seccion anterior. Una vez extraido se va a poder ejecutar desde los scripts en la carpeta `bin`.

### Linux

```shell
.\Guillotina
```

### Windows

```shell
.\Guillotina.bat
```
