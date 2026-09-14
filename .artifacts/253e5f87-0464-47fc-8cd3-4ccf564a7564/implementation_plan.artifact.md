# Finalizar Configuración de Gradle para que el Proyecto Funcione

Has avanzado mucho configurando el `libs.versions.toml`, pero falta aplicar esos cambios en los archivos de construcción (`build.gradle.kts`) y corregir las versiones del SDK para que sean estables.

## Revisión del Usuario Requerida

> [!IMPORTANT]
> Voy a cambiar las versiones de `compileSdk` y `targetSdk` a **35**. Las versiones 36 y 37 son experimentales/preview y pueden causar problemas de compatibilidad o errores de compilación inesperados si no tienes el SDK preview instalado.

## Cambios Propuestos

### Configuración de Build

#### [MODIFY] [build.gradle.kts](file:///C:/Users/Lenovo/AndroidStudioProjects/Celular1/build.gradle.kts)
- Registrar los plugins `kotlin-android` y `ksp` usando el version catalog.

#### [MODIFY] [app/build.gradle.kts](file:///C:/Users/Lenovo/AndroidStudioProjects/Celular1/app/build.gradle.kts)
- Aplicar los plugins `kotlin-android` y `ksp`.
- Cambiar `compileSdk` y `targetSdk` a la versión 35.
- Agregar las dependencias de Room (`runtime`, `ktx`, `compiler`) usando los alias del version catalog.

## Plan de Verificación

### Pruebas Automatizadas
- Ejecutar una sincronización de Gradle en el IDE.
- Compilar el proyecto con `./gradlew assembleDebug` para verificar que KSP genera correctamente el código de Room.

### Verificación Manual
- Abrir los archivos de datos (`UserDao.kt`, `AppDatabase.kt`) y verificar que no haya errores de importación (rojos) una vez sincronizado.
