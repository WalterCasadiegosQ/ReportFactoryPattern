📊 Report Generator - Factory Method

Este proyecto es una implementación en Java del patrón de diseño Factory Method, combinando el uso de DataSource para abstraer las fuentes de datos.
Permite generar reportes en PDF, Excel y HTML, utilizando diferentes orígenes de información (texto, números, contenido HTML).

🔑 Características

Implementa el patrón creacional Factory Method para crear reportes sin acoplar el código cliente a clases concretas.

Uso de DataSource como abstracción de entrada de datos:

PdfDataSource → Contenido textual.

ExcelDataSource → Listado de números.

HtmlDataSource → Fragmento de HTML.

Menú interactivo en consola para que el usuario seleccione:

Tipo de reporte a generar.

Datos a incluir en el reporte.

Opción de terminar el programa.

🏗️ Arquitectura

Report → Interfaz base para todos los reportes (generate).

PdfReport, ExcelReport, HtmlReport → Implementaciones concretas de reportes.

ReportDataSource → Clase abstracta que define cómo obtener los datos.

Fábricas (PdfReportFactory, ExcelReportFactory, HtmlReportFactory) → Se encargan de crear instancias de los reportes.

Main → Cliente con menú en consola para ejecutar dinámicamente la creación de reportes.

⚙️ Ejecución

Clonar el repositorio.

Abrir en IntelliJ IDEA o cualquier IDE de Java.

Ejecutar la clase Main.

Seguir las instrucciones del menú interactivo para generar reportes.

📚 Patrón aplicado

El proyecto aplica el patrón Factory Method porque:

Define una interfaz común (Report) para productos.

Cada fábrica concreta sabe cómo instanciar su producto correspondiente.

El cliente (Main) trabaja con la abstracción (ReportFactory) y no conoce las clases concretas.

Esto facilita la extensión: si en el futuro se necesita soportar otro tipo de reporte (ej. JSON o CSV), basta con crear una nueva clase de reporte, un DataSource y una fábrica concreta.
