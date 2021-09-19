package com.example.covidfree;

public class CovidTester
{
    private void testBloodPressure(int systolic, int diastolic)
    {
       if(systolic >=140 && diastolic >=90)
           System.out.println("Irregular Blood Pressure");
       else
           System.out.println("Normal Blood Pressure");
    }

    private void testOxygenLevel(int o2)
    {
        if(o2 >= 92%)
            System.out.println("Irregular Oxygen Level");
        else
            System.out.println("Normal Oxygen Level");

    }

    private void testHeartRate(int heartRate)
    {
        if(heartRate >= 100)
            System.out.println("Irregular Heart Rate");
        else
            System.out.println("Normal Heart Rate");
    }

    private void testChronicLevel(String chronicLevel)
    {
        if(chronicLevel == "yes");
            System.out.println("High Risk");
        else
            System.out.println("Low Risk");


    }

    private void testVaccine(String a)
    {
        if(testVaccine == "yes");
            System.out.println("Low Risk");
        else
            System.out.println("High Risk");

    }

    private void testAge(int age)
    {
        if(testAge >= 80)
            System.out.println("High Risk Age");
        else
            System.out.println("Low Risk Age");

    }

    private void testTemperature(int temp)
    {
        if(testTemperature >= 100)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }

}
