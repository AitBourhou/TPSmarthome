package Ensa.ma.TpSmartHome;

SmartHome smartHomeSystem = new SmartHome
.SmartHomeBuilder()
.withName("RaspberrySmartHomeSystem")
.withSerialNumber(3627)
.withAddressName("Main Street")
.withAddressNumber("14a")
.inCity("Kumanovo")
.inCountry("Macedonia")
.withPostalCode("1300")
.withDoor1PortNum(342)
.withDoor2PortNum(343)
.withLight1PortNum(211)
.withLight2PortNum(212)
.withMicrowavePortNum(11)
.withTvPortNum(12)
.withWaterHeaterPortNum(13)
.build();

System.out.println(smartHomeSystem.toString());
