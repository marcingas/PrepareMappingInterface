Create Mappable output: 
Result: text that could be printed out to a file, for exchanging data with a mapping application.

FInal Output should look like this example: 

for BUILDING:

"properties": "type": "POINT", "lable":"Town Hall(GOVERNMENT)", "marker": "RED STAR", "name": "Town Hall", "usage":"GOVERNMENT"}

for UTILITYLINE: 

"properties": "type": "LINE", "lable":"College St(FIBER_OPTIC)", "marker": "GREEN DOTTED", "name": "College St", "utility":"FIBER_OPTIC"}


File: GEOJSON 

PROJECT BASICS: 

Interface MAPPABLE: 
should have 3 methods:
labe-> how item will be described on a map.
geometry type(return) -> what the type will look like on the map 
icon type(return) -> map marker
interface should also include: 
constant STRING JSON_PROPERTY -> "properties"" {%s}
defoult method to JSON() that points out : type, label, marker
static method: that takes a Mappable instance as an argument . 
This method should print out the properties for each mappable type.

TWO CLASSES that implements this interface: BUILDING, UTILITYLINE 

Example of String for every feature that will be mapped: 
"properties” : { "name” : "Town Hall", "usage"/"utility": "GOVERNMENT"}


PROJECT DESING:

interface MAPPABLE(JSON_PROPERTY: STRING, static void mapIt(Mappable mappable), defoult toJSON(): String, getLabel(): String, getMarker(): String, getShape(): Geometry)
ENUM: Geometry(LINE,POINT,POLYGON)
ENUM: Color(BLACK,BLUE,GREEN, BLUE, ORANGE)
ENUM: PointMarkers(CIRCLE, PUSH_PIN, TRIANGLE, STAR, SQUARE ) 
ENUM: LineMArkers(DASHED,DOTTED,SOLID)

classes Building and UtilityLine implements Interface :

name: String 
type:
Enum: Usage Type(Building) 
Enum: Utility Type(UtilityLine)
