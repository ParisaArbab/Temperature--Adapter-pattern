# Temperature--Adapter-pattern
A system uses three (3) temperature sensors produced by the same vendor V1 to monitor the condition of a
hardware device at a specific time:
– The first sensor is of type TS1.
– The second sensor is of type TS2.
– The third sensor is of type TS3.
TS1, TS2, and TS3 accept as input a date and time (given in Eastern Standard Time or EST) and return a
temperature in Fahrenheit. Time is in the 24-hour time keeping system (e.g., 23:59:59). V1 supplies a class to
interface with its sensors:
Class TS1 {
Public double getTemp(date d, time t) { // returns Temp in Fahrenheit
// t is in EST time
// t is in the 24-hour time keeping system (e.g., 23:59:59)
// Code Goes here } }
Class TS2 {
Public double getTemp(date d, time t) {// returns Temp in Fahrenheit
// t is in EST time
// t is in the 24-hour time keeping system (e.g., 23:59:59)
// Code Goes here } }
Class TS3 {
Public double getTemp(date d, time t) {// returns Temp in Fahrenheit
// t is in EST time
// t is in the 24-hour time keeping system (e.g., 23:59:59)
// Code Goes here } }
We would like to add a third sensor of type TS4 provided by vendor V2. TS4 accepts as inputs a year, month,
day, and time (specified in Pacific Standard Time or PST) and returns a temperature in 1/10 of Celsius. Time is
specified in the AM/PM format (12-hour clock). Below is the interface for TS4:
Class TS4 {
Public double getTS4Temp(year y, month m, day d, time t, string when) {
// returns Temp in 1/10 Celsius
// Fahrenheit = (Celsius -32) * 5/9
// t is in PST time
// t is specified in the AM/PM format (12-hour clock)
// PST = EST – 3
// when=”AM” or when=”PM”
// Code Goes here } }
