package com.bl.generic;

public class FindMaxFloat {
    public static Float findMax(Float x, Float y, Float z) {
        Float maximum = x;
        if(y.compareTo(maximum)> 0)
            maximum = y;
        if(z.compareTo(maximum)>0)
            maximum = z;
        System.out.printf("The maximum of three numbers %s %s %s is : %s \n",x,y,z,maximum);
        return maximum;
    }
    public static void main(String[] args) {
        //testcase 1.1 maximum no. at first
        Float float1 = 28.40f, float2 = 29.30f,float3 = 30.42f;
        Float maximum = findMax(float1,float2,float3);

        //testcase 1.2 max no. at second
        Float float4 = 31.22f,float5 = 75.12f,float6 = 42.30f;
        float maximum1 = findMax(float4,float5,float6);

        //testcase 1.3 max no. at third
        Float float7 = 46.22f,float8 = 61.30f,float9 = 81.23f;
        float maximum2 = findMax(float7,float8,float9);
    }
}
