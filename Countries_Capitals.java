import java.io.*;
class Countries_Capitals extends Number_Game{
    static String list[]={"Afghanistan","Kabul","Albania","Tirana","Algeria","Algiers","Andorra","Andorra la Vella","Angola","Luanda","Antigua and Barbuda","Saint John's","Argentina",
    "Buenos Aires","Armenia","Yerevan","Australia","Canberra","Austria","Vienna","Azerbaijan","Baku","Bahamas","Nassau","Bahrain","Manama","Bangladesh","Dhaka",
    "Barbados","Bridgetown","Belarus","Minsk","Belgium","Brussels","Belize","Belmopan","Benin","Porto-Novo","Bhutan","Thimphu","Bolivia","La Paz (administrative) and Sucre (judicial)",
    "Bosnia and Herzegovina","Sarajevo","Botswana","Gaborone","Brazil","Brasilia","Brunei","Bandar Seri Begawan","Bulgaria","Sofia","Burkina Faso","Ouagadougou","Burundi",
    "Bujumbura","Cabo Verde","Praia","Cambodia","Phnom Penh","Cameroon","Yaounde","Canada","Ottawa","Central African Republic","Bangui","Chad","N'Djamena","Chile",
    "Santiago","China","Beijing","Colombia","Bogota","Comoros","Moroni","Congo","Brazzaville","Costa Rica","San Jose","Cote d'Ivoire","Yamoussoukro","Croatia","Zagreb",
    "Cuba","Havana","Cyprus","Nicosia","Czech Republic","Prague","Denmark","Copenhagen","Djibouti","Djibouti City","Dominica","Roseau","Dominican Republic","Santo Domingo",
    "Ecuador","Quito","Egypt","Cairo","El Salvador","San Salvador","Equatorial Guinea","Malabo","Eritrea","Asmara","Estonia","Tallinn","Ethiopia","Addis Ababa","Fiji",
    "Suva","Finland","Helsinki","France","Paris","Gabon","Libreville","Gambia","Banjul","Georgia","Tbilisi","Germany","Berlin","Ghana","Accra","Greece","Athens","Grenada",
    "St. George's","Guatemala","Guatemala City","Guinea","Conakry","Guinea-Bissau","Bissau","Guyana","Georgetown","Haiti","Port-au-Prince","Honduras","Tegucigalpa",
    "Hungary","Budapest","Iceland","Reykjavik","India","New Delhi","Indonesia","Jakarta","Iran","Tehran","Iraq","Baghdad","Ireland","Dublin","Israel","Jerusalem",
    "Italy","Rome","Jamaica","Kingston","Japan","Tokyo","Jordan","Amman","Kazakhstan","Astana","Kenya","Nairobi","Kiribati","South Tarawa","Kosovo","Pristina",
    "Kuwait","Kuwait City","Kyrgyzstan","Bishkek","Laos","Vientiane","Latvia","Riga","Lebanon","Beirut","Lesotho","Maseru","Liberia","Monrovia","Libya","Tripoli",
    "Liechtenstein","Vaduz","Lithuania","Vilnius","Luxembourg","Luxembourg","Macedonia","Skopje","Madagascar","Antananarivo","Malawi","Lilongwe","Malaysia","Kuala Lumpur",
    "Maldives","Male","Mali","Bamako","Malta","Valletta","Marshall Islands","Majuro","Mauritania","Nouakchott","Mauritius","Port Louis","Mexico","Mexico City","Micronesia",
    "Palikir","Moldova","Chisinau","Monaco","Monaco","Mongolia","Ulaanbaatar","Montenegro","Podgorica","Morocco","Rabat","Mozambique","Maputo","Myanmar","Naypyidaw",
    "Burma","Naypyidaw","Namibia","Windhoek","Nauru","Yaren District","Nepal","Kathmandu","Netherlands","Amsterdam","New Zealand","Wellington","Nicaragua","Managua",
    "Niger","Niamey","Nigeria","Abuja","North Korea","Pyongyang","Norway","Oslo","Oman","Muscat","Pakistan","Islamabad","Palau","Ngerulmud","Palestine","Ramallah",
    "Panama","Panama City","Papua New Guinea","Port Moresby","Paraguay","Asunción","Peru","Lima","Philippines","Manila","Poland","Warsaw","Portugal","Lisbon",
    "Qatar","Doha","Romania","Bucharest","Russia","Moscow","Rwanda","Kigali","Saint Kitts and Nevis","Basseterre","Saint Lucia","Castries","Saint Vincent and the Grenadines",
    "Kingstown","Samoa","Apia","San Marino","San Marino","Sao Tome and Principe","São Tomé","Saudi Arabia","Riyadh","Senegal","Dakar","Serbia","Belgrade","Seychelles",
    "Victoria","Sierra Leone","Freetown","Singapore","Singapore","Slovakia","Bratislava","Slovenia","Ljubljana","Solomon Islands","Honiara","Somalia","Mogadishu",
    "South Africa","Pretoria (administrative), Cape Town (legislative) and Bloemfontein (judicial)","South Korea","Seoul","South Sudan","Juba","Spain","Madrid",
    "Sri Lanka","Sri Jayawardenepura Kotte","Sudan","Khartoum","Suriname","Paramaribo","Swaziland","Mbabane","Sweden","Stockholm","Switzerland","Bern","Syria","Damascus",
    "Taiwan","Taipei","Tajikistan","Dushanbe","Tanzania","Dodoma","Thailand","Bangkok","Timor-Leste","Dili","Togo","Lome","Tonga","Nuku'alofa","Trinidad and Tobago",
    "Port of Spain","Tunisia","Tunis","Turkey","Ankara","Turkmenistan","Ashgabat","Tuvalu","Funafuti","Uganda","Kampala","Ukraine","Kyiv","United Arab Emirates",
    "Abu Dhabi","United Kingdom","London","Britain","London","United States of America","Washington, D.C.","USA","Washington, D.C.","Uruguay","Montevideo","Uzbekistan",
    "Tashkent","Vanuatu","Port Vila","Vatican City","Vatican City","Venezuela","Caracas","Vietnam","Hanoi","Yemen","Sana'a","Zambia","Lusaka","Zimbabwe","Harare"};
    protected static String capital(String country){
        int i=0;
        for(i=0;i<list.length;i++){
            if(country.equalsIgnoreCase(list[i])==true){
                if(list[i].equalsIgnoreCase("South Africa")==false)
                    return list[i+1];
                else
                    return list[i+1]+" "+list[i+2]+" "+list[i+3];
            }
        }
        return "INVALID";
    }
}