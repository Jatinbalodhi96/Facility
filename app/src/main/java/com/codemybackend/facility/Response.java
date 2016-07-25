package com.codemybackend.facility;

import java.util.List;

/**
 * Created by jatin on 23/7/16.
 */
public class Response {


    /**
     * help : Search a datastore table. :param resource_id: id or alias of the data that is going to be selected.
     * success : true
     * count : 69
     * fields : {"id":{"type":"serial","size":"normal","not null":true,"description":""},"state":{"type":"varchar","size":"normal","length":"50","not null":false,"description":""},"h_name":{"type":"varchar","size":"normal","length":"150","not null":false,"description":""},"address":{"type":"varchar","size":"normal","length":"150","not null":false,"description":""},"email":{"type":"varchar","size":"normal","length":"50","not null":false,"description":""},"contact":{"type":"varchar","size":"normal","length":"150","not null":false,"description":""},"latitude":{"type":"varchar","size":"normal","length":"50","not null":false,"description":""},"longitude":{"type":"varchar","size":"normal","length":"50","not null":false,"description":""}}
     * records : [{"id":"476","state":"Delhi","h_name":"Jan Jagriti Blood bank","address":"Mission Jan Jagriti, Blood Bank. C/o Jeevan Anmol Hospital Mayur Vihar Phase I","email":"drnkbhatia@yahoo.com","contact":"NA","latitude":"28.605975","longitude":"77.295427"},{"id":"458","state":"Delhi","h_name":"Sir Ganga Ram Hospital","address":"Sir Ganga Ram Road, Old Rajendra NagarNew Delhi- 110060","email":"yogesh.gaur1963@gmail.com, deepusinghrawat@gmail.c","contact":"011 42251800, 011 42251868,011 42251869,011 42251872, 011 25750000, 011 25751111, 011 25735205, 011 25861463","latitude":"28.638574","longitude":"77.189791"},{"id":"457","state":"Delhi","h_name":"Dharamshila Cancer Foundation and Research Centre","address":"Vasundhara Enclave, Mayur Vihar.","email":"NA","contact":"011 43066424 ,011 43066425, 011 43066432, 011 22617771, 011 22617772, 011 22617773, 011 22617774,011 22617775, 011 43066407","latitude":"28.602512","longitude":"77.314182"},{"id":"456","state":"Delhi","h_name":"Mission Jan Jagriti Blood Bank, Altius Sonia Hospital","address":"1, Altius Sonia Hospital, Basement, 1, Gulshan Park, Rohtak Road, Nangloi metro station, Metro Piller Number 444","email":"drnkbhatia@yahoo.com","contact":"011 30580345, 011 30777777","latitude":"28.501683","longitude":"77.246745"},{"id":"455","state":"Delhi","h_name":"Rotary Blood Bank","address":"56-57,Institutional Area, Tughlakabad , next to batra hospital","email":"blood@rotarybloodbank.org","contact":"011 29054068, 011 29054066,011 29962078","latitude":"28.513193","longitude":"77.242089"},{"id":"454","state":"Delhi","h_name":"Blood Bank Organisation","address":"11/6B Shanti Chamber, Opposite Telephone Exchange, Pusa Road","email":"bloodbankorg@gmail.com","contact":"011 25721870, 011 25721870","latitude":"28.642777","longitude":"77.18156"},{"id":"453","state":"Delhi","h_name":"Batra Hospital and Medical Research Centre","address":"1,Tuglakabad Institutional Area, Mehrauli Badarpur Road, Tughlakabad","email":"NA","contact":"011 29958747 , 011 29957487","latitude":"28.513468","longitude":"77.245773"},{"id":"452","state":"Delhi","h_name":"Lions Blood Bank","address":"A.K.-100, Shalimar Bagh","email":"poonamshrivastava1@gmail.com","contact":"011 42258080,011 47122000","latitude":"28.704163","longitude":"77.162458"},{"id":"451","state":"Delhi","h_name":"Pitampura Blood Bank","address":"B-294, Saraswati Vihar, Outer Ring Road, Pitampura","email":"pitampurabloodbank@gmail.com","contact":"NA","latitude":"28.70028","longitude":"77.125444"},{"id":"450","state":"Delhi","h_name":"Mission Jan Jagriti","address":"MGS Hospital, Rohtak road, 35/37 West Punjabi Bagh","email":"info@missionjanjagriti.org","contact":"011 47053443","latitude":"28.606008","longitude":"77.295437"},{"id":"449","state":"Delhi","h_name":"White Cross Blood Bank","address":"A-60, East Of Kailash","email":"NA","contact":"011 26831063, 011 26844140","latitude":"28.560797","longitude":"77.253565"},{"id":"448","state":"Delhi","h_name":"Hakeem Abdul Hameed Centenary Hospital","address":"Jamia Hamdard, Hamdard Nagar","email":"bloodbankjamiahamdard@gmail.com","contact":"011 26059668","latitude":"28.51499","longitude":"77.252188"},{"id":"447","state":"Delhi","h_name":"Max Super Specialty Hospital (A Unit of Max Health Care Institute Ltd)","address":"FC-50, Block C and D, Shalimar Bagh","email":"NA","contact":"011 66422222","latitude":"28.72765","longitude":"77.15282"},{"id":"446","state":"Delhi","h_name":"Primus Ortho and Spine Hospital","address":"Primus Super Speciality Hospital,02, Chandragupta Marg, Lower Ground Floor, Chanakyapuri","email":"mgarg1964@yahoo.co.in","contact":"011 66206630, 011 66206640","latitude":"28.5929","longitude":"77.181273"},{"id":"445","state":"Delhi","h_name":"Rockland Hospital Qutab","address":"B, 33-34, Qutab Institutional Area","email":"labrh@yahoo.com","contact":"011 47667357","latitude":"28.538926","longitude":"77.184583"},{"id":"444","state":"Delhi","h_name":"Indian Red Cross Society","address":"1, Red Cross Road, Opposite Parliament House-New Delhi","email":"directorbloodbank@indianredcross.org","contact":"011 23716441, 011 23716442, 011 23716443,011 23716426, 011 23716916, 011 23711551, 011 23716441","latitude":"28.618675","longitude":"77.21089"},{"id":"459","state":"Delhi","h_name":"Sant Parmanand Hospital","address":"18, Shyamnath Marg, Civil Lines","email":"bloodbank@sphdelhi.org","contact":"011 23994401, 011 23994402, 011 23994405, 011 23994410","latitude":"28.678052","longitude":"77.224193"},{"id":"460","state":"Delhi","h_name":"R. B. T. C (wz),Deen Dayal Upadhyay Hospital","address":"Hari Nagar, Near clock tower","email":"dduhbloodbank@gmail.com","contact":"011 25129345, 011 25494403, 011 25494405","latitude":"28.628307","longitude":"77.11236"},{"id":"475","state":"Delhi","h_name":"Cardio Neuro Centre, AIIMS","address":"AIIMS, Ansari Nagar","email":"anjalihz@gmail.com","contact":"011 26593625, 011 26593749","latitude":"28.566645","longitude":"77.209078"},{"id":"474","state":"Delhi","h_name":"Pushpavati Shinghania Research Institute for Liver","address":"Reneals and Digestive Diseases, Press Enclave Marg, Sheikh Sarai, Phase-II","email":"inchargebloodbank@psri.net","contact":"NA","latitude":"28.533452","longitude":"77.225154"},{"id":"473","state":"Delhi","h_name":"Lions Blood Bank","address":"369, II Floor, FIE, Near M.C.D. Office, Patparganj Industrial Area,","email":"lionsbloodbankeastdelhi@gmail.com","contact":"NA","latitude":"28.643183","longitude":"77.309908"},{"id":"472","state":"Delhi","h_name":"Central Poly Clinic Blood Bank","address":"3, Gangan Vihar, Shahdara Road","email":"drlalchandanidelhi@yahoo.com","contact":"NA","latitude":"28.646038","longitude":"77.292509"},{"id":"471","state":"Delhi","h_name":"Dr.Hedgewar ArogayaSansthan","address":"Dr. Hedgewar Arogya Sansthan, F-18, Karkardooma","email":"NA","contact":"011 22301148, 011 22301149, 011 22309407","latitude":"28.656123","longitude":"77.293421"},{"id":"470","state":"Delhi","h_name":"Jaipur Golden Hospital","address":"2, Industrial Area, Rohini, Sector-III","email":"NA","contact":"NA","latitude":"28.698074","longitude":"77.109863"},{"id":"469","state":"Delhi","h_name":"Northern Railway Central Hospital","address":"Northern Railway Hospital, Basant Lane","email":"NA","contact":"011 23747989011 23744150, 011 23744170","latitude":"28.636768","longitude":"77.21746"},{"id":"468","state":"Delhi","h_name":"Fortis Escort Heart Institute","address":"Fortis Escort Heart Institute, Okhla Road","email":"NA","contact":"011 26825053","latitude":"28.560326","longitude":"77.273731"},{"id":"467","state":"Delhi","h_name":"Apollo Hospital","address":"Indraprastha Medical Corporation, Sarita Vihar","email":"NA","contact":"011 26925801, 011 26925858, 011 26825707","latitude":"28.541377","longitude":"77.283418"},{"id":"466","state":"Delhi","h_name":"Rajiv Gandhi Cancer Institute and Research Center","address":"Rajiv Gandhi Cancer Institute, Sector-V Rohini","email":"NA","contact":"011 47022222, 011 27051011","latitude":"28.714709","longitude":"77.115161"},{"id":"465","state":"Delhi","h_name":"Fortis Flt. Lt. Rajan Dhall Hospital (A unit of Flt. Lt. Ranjan Dhall Charitable Trust Regd.)","address":"Sector-B, Pocket-1, Aruna Asaf Ali Marg, Vasant Kunj","email":"sljain49@yahoo.com","contact":"011 42776222","latitude":"28.519666","longitude":"77.160419"},{"id":"464","state":"Delhi","h_name":"Saroj Hospital and Heart Institute Run by Ganesh Das Chowla Charitable Trust (Regd.)","address":"Saroj Hospital and Heart Institute, Sector-14, Rohini, Madhuban Chowk","email":"rbansal1970@yahoo.com","contact":"011 27903333, 011 27903276","latitude":"28.706383","longitude":"77.129034"},{"id":"463","state":"Delhi","h_name":"Max Super Specialty Hospital (Max Balaji Hospital)","address":"A unit of Balaji Medical and Diagnostic Research Centre, 108-A, Indraprastha Extension, Opposite Sanchar Apartment, Patparganj","email":"reeta.rai@maxhealthcare.com","contact":"011 66242515, 011 43033333","latitude":"28.634535","longitude":"77.308612"},{"id":"462","state":"Delhi","h_name":"Brahm Shakti Hospital and Research Centre","address":"Brahma Shakti Hospital, U-1/78, Budh Vihar","email":"info.brahmshaktibloodbank@gmail.com","contact":"011 27537894, 011 27532428, 011 27531683, 011 27537967","latitude":"28.712612","longitude":"77.081215"},{"id":"461","state":"Delhi","h_name":"Jai Prakash Narayan Apex Trauma Centre","address":"Jai Prakash Narayen Apex Trauma Centre, AIIMS, Raj Nagar,Ring Road","email":"arulselvi.jpnatc@gmail.com","contact":"011 26731166, 011 26731179, 011 26731169, 011 26108000, 011 26109000","latitude":"28.569676","longitude":"77.200506"},{"id":"443","state":"Delhi","h_name":"Bensups Hospital","address":"Bansups Avenue, Sector ? 12, Dwarka","email":"NA","contact":"011 45017615","latitude":"28.593305","longitude":"77.044154"},{"id":"442","state":"Delhi","h_name":"Saket City Hospital","address":"Mandir Marg, Press Enclave Road, Saket","email":"bloodbank@saketcityhospital.com","contact":"011 40699999, 011 71211062","latitude":"28.527686","longitude":"77.214348"},{"id":"441","state":"Delhi","h_name":"Indian Spinal Injuries Centre","address":"C-8, Vasant Kunj","email":"NA","contact":"011 42255387","latitude":"28.533173","longitude":"77.141876"},{"id":"423","state":"Delhi","h_name":"Kasturba Gandhi Hospital","address":"Near Jama Masjid, Daryaganj","email":"NA","contact":"011 23275023, 011 23275024","latitude":"28.64878","longitude":"77.237987"},{"id":"422","state":"Delhi","h_name":"Hindu Rao Hospital","address":"DR. J.S. Kkaranwal Memorial Road, Near Malka Ganj, Sabji Mandi, Malka Ganj","email":"NA","contact":"011 23905713","latitude":"28.67538","longitude":"77.212312"},{"id":"421","state":"Delhi","h_name":"Lal Bahadur Shastri Hospital","address":"Near Kalyanvas Colony/Mayur Vihar Phase -II, GNCTD Kichdipur","email":"mslbsh.delhi@gov.in","contact":"011 22786688, 011 22223167, 011 22774145, 011 22774146, 011 22786828, 011 22786818, 011 22778282","latitude":"28.617976","longitude":"77.311463"},{"id":"420","state":"Delhi","h_name":"Institute of Liver and Biliary Sciences","address":"D-1, Vasant Kunj","email":"NA","contact":"011 46300000","latitude":"28.506259","longitude":"77.165051"},{"id":"419","state":"Delhi","h_name":"Dr. Baba Sahab Ambedkar Hospital","address":"Sector-6, Rohini","email":"msidhar67@gmail.com","contact":"011 27049950, 011 27055585","latitude":"28.715052","longitude":"77.113639"},{"id":"418","state":"Delhi","h_name":"Sanjay Gandhi Memorial Hospital","address":"S- Block, Mangolpuri","email":"NA","contact":"011 27922843, 011 27916137","latitude":"28.693762","longitude":"77.080637"},{"id":"417","state":"Delhi","h_name":"Sushrut Trauma Centre","address":"Civil Lines, 9, Metcalf Road","email":"mfhtc9metcalfroad@gmail.com","contact":"011 23906014, 011 23906028","latitude":"28.680339","longitude":"77.227674"},{"id":"416","state":"Delhi","h_name":"Regional Blood tranfusion Center of Central zone","address":"2 Jawarlal Nehru Marg, Delhi Gate","email":"btolnh@gmail.com","contact":"011 23233809, 011 23231023","latitude":"28.638986","longitude":"77.23836"},{"id":"415","state":"Delhi","h_name":"Guru Tegh Bahadur Hospital","address":"G T B Hospital, Shahadara","email":"NA","contact":"011 22590148","latitude":"28.683856","longitude":"77.309903"},{"id":"414","state":"Delhi","h_name":"Govind Ballabh Pant Hospital","address":"G.B. Pant Hospital,Jawahar Lal Nehru Marg, Delhi Gate","email":"NA","contact":"011 23234242","latitude":"28.639542","longitude":"77.235159"},{"id":"413","state":"Delhi","h_name":"Sucheta Kriplani Hospital","address":"C-604, Shaheed Bhagat Singh Road, DIZ Area","email":"bloodbanklhmc@gmail.com","contact":"011 23408271","latitude":"28.63566","longitude":"77.213327"},{"id":"412","state":"Delhi","h_name":"Safdarjung Hospital","address":"Safdarjung Hospital, Ansari Nagar, Ring Road","email":"NA","contact":"011 26707254, 011 26707124","latitude":"28.568016","longitude":"77.205765"},{"id":"411","state":"Delhi","h_name":"E.S.I. Hospital","address":"ESI Hospital, Basai Darapur, Ring Road","email":"dr.ajay.sagar@esic.in","contact":"011 25970808, 011 25100664","latitude":"28.663241","longitude":"77.131607"},{"id":"410","state":"Delhi","h_name":"Dr. Ram Manohar Lohia Hospital","address":"Baba Kharak Singh Marg, near Gurudwara Bangla Sahib, Connaught Place","email":"NA","contact":"011 23404292, 011 23404298","latitude":"28.3734","longitude":"77.125"},{"id":"409","state":"Delhi","h_name":"Armed Forces Transfusion Centre","address":"Delhi Cantonment, Area Sadar Bazar, Army Public School","email":"aftcdelhicant@gmail.com","contact":"011 23336685","latitude":"28.596425","longitude":"77.117561"},{"id":"424","state":"Delhi","h_name":"Swami Dayanand Hospital","address":"Dilshad Garden","email":"NA","contact":"011 22581031, 011 22583809","latitude":"28.678471","longitude":"77.304087"},{"id":"425","state":"Delhi","h_name":"Holy Family Hospital","address":"Okhla Road","email":"NA","contact":"011 26332800","latitude":"28.561312","longitude":"77.275291"},{"id":"440","state":"Delhi","h_name":"Bhagat Chandra Hospital","address":"RZF-1/1, Mahavir Enclave, Palam","email":"NA","contact":"011 45254525","latitude":"28.593248","longitude":"77.081245"},{"id":"439","state":"Delhi","h_name":"Fortis Hospital","address":"A- Block, Shalimar Bagh","email":"NA","contact":"011 45302222","latitude":"28.70923","longitude":"77.170359"},{"id":"438","state":"Delhi","h_name":"Park Hospital","address":"Keshopur Sabzi Mandi, New Chaukhandi, Vishnu Garden","email":"info@parkhospital.org, drrekha29@gmail.com, hospit","contact":"011 45323232","latitude":"28.656166","longitude":"77.091526"},{"id":"437","state":"Delhi","h_name":"Kalra Hospital and Shri Ram Cardiothoracic and Neurosciences Center (SRCNC)","address":"Kalra Hospital SRNCNC, A-4, Kirti Nagar","email":"NA","contact":"011 45005700","latitude":"28.65795","longitude":"77.144886"},{"id":"436","state":"Delhi","h_name":"Dr. BL Kapoor Memorial Hospital","address":"B.L.K. Memorial Hospital, 5 Pusa Road","email":"NA","contact":"011 30653095, 011 30653926","latitude":"28.643642","longitude":"77.179979"},{"id":"435","state":"Delhi","h_name":"Max Super Specialty Hospital, Heart and Vascular Institute( A Unit of Devki Devi Foundation Institute)","address":"2, Press Enclave Road, Saket","email":"NA","contact":"011 26515050, 011 26505252","latitude":"28.527282","longitude":"77.211542"},{"id":"434","state":"Delhi","h_name":"Shree Balaji Action Medical Institute","address":"FC-34, A-4, Paschim Vihar","email":"NA","contact":"011 42888888, 011 45666666","latitude":"28.674057","longitude":"77.110288"},{"id":"433","state":"Delhi","h_name":"Delhi Heart and Lung Institute","address":"3 MM-11, Panchkuian Road","email":"bloodbank@dhli.in","contact":"011 42999999, 011 42988899, 011 23538351","latitude":"28.641636","longitude":"77.205219"},{"id":"432","state":"Delhi","h_name":"Maharaja Agrasen Hospital","address":"West Punjabi bagh","email":"NA","contact":"40777777, Extension 6700","latitude":"28.69168","longitude":"77.164603"},{"id":"431","state":"Delhi","h_name":"Pushpawati Singhania Research Institute (For Liver, Renal and Digestive Disease)","address":"Press Enclave Marg, Sheikh Sarai, Phase II","email":"inchargebloodbank@psri.net","contact":"011 30611871","latitude":"28.533244","longitude":"77.225187"},{"id":"430","state":"Delhi","h_name":"St. Stephens Hospital","address":"St. Stephen Hospital, Tis Hazari","email":"NA","contact":"011 23966021, 011 23966022, 011 23966023, 011 23966024","latitude":"28.665211","longitude":"77.214371"},{"id":"429","state":"Delhi","h_name":"Sunder Lal Jain Charitable Hospital","address":"Ashok Vihar, Phase-III","email":"sljhosp@ndf.vsnl.net.in","contact":"011 47030900","latitude":"28.691919","longitude":"77.181584"},{"id":"428","state":"Delhi","h_name":"National Heart Institute","address":"49, Community Center, East of Kailash","email":"info@nationalheartinstitute.com","contact":"011 26414156, 011 26414157","latitude":"28.5574087","longitude":"77.2457177"},{"id":"427","state":"Delhi","h_name":"Shri Moolchand Khariti-ram Hospital and Ayurvedic Research Institute","address":"Mool Chand Hospital, Lajpat Nagar-III","email":"info@mcdh.in","contact":"011 42000476","latitude":"28.566225","longitude":"77.235575"},{"id":"426","state":"Delhi","h_name":"Mata Chanan Devi Hospital","address":"C-1 JANAKPURI NEW DELHI","email":"NA","contact":"011 45582193, 011 45582194","latitude":"28.6165972","longitude":"77.088433"},{"id":"408","state":"Delhi","h_name":"All India Institute of Medical Sciences (AIIMS)","address":"AIIMS, Main Blood Bank, Ansari Nagar, Ring Road","email":"kabitachatterjee@gmail.com, poonamcoshic@gmail.com","contact":"011 26594438, 011 26594400","latitude":"28.567152","longitude":"77.20902"}]
     */

    private String help;
    private boolean success;
    private int count;
    /**
     * id : {"type":"serial","size":"normal","not null":true,"description":""}
     * state : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * h_name : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * address : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * email : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * contact : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * latitude : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * longitude : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     */

    //private FieldsBean fields;
    /**
     * id : 476
     * state : Delhi
     * h_name : Jan Jagriti Blood bank
     * address : Mission Jan Jagriti, Blood Bank. C/o Jeevan Anmol Hospital Mayur Vihar Phase I
     * email : drnkbhatia@yahoo.com
     * contact : NA
     * latitude : 28.605975
     * longitude : 77.295427
     */

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        private String id;
        private String state;
        private String h_name;
        private String address;
        private String email;
        private String contact;
        private String latitude;
        private String longitude;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getH_name() {
            return h_name;
        }

        public void setH_name(String h_name) {
            this.h_name = h_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }
}
