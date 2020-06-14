package com.example.tradecheck;

import java.util.ArrayList;

public class CompanyProvider {


   // static String[] companyNames= {"Microsoft, PWC, Spark NZ, Fonterra, HoneyWell, Qantas,Singapore Airlines "};
    static String[] ids= {"001","002","003","004"};
    static String[] countries={ "Australia","NZ", "Singapore","United States"};

    // Companies who fall under different categories
    static int[] AustraliaId={5, 6};
    static int[] NZId={3, 4};
    static int[] SingaporeId={7};
    static int[] USId={1, 2};

    static int[] pictures={R.drawable.au,R.drawable.nz,R.drawable.sg,R.drawable.us}; //Just a small letter. Should be the same as the file name.

    public static int[] getCompanyIDs(String country) {
        int[] companyIDs = AustraliaId;

        if (country.equals("NZ"))
                companyIDs = NZId;
        else if (country.equals("Singapore"))
                companyIDs = SingaporeId;
        else if (country.equals("United States"))
                companyIDs = USId;

        return companyIDs;
    }

    public static String[] getCountries() {
        return countries;
    }

    public static ArrayList<Countries> generateData() {
        ArrayList<Countries> listOfCountries = new ArrayList<Countries>();


        for (int i = 0; i < 4; i++) {

            String id = ids[i];
            String countriesname = countries[i];
            int flags = pictures[i];
            Countries aCountry = new Countries(countriesname, flags, id);
            listOfCountries.add(aCountry);
        }
        return listOfCountries;
    }

}