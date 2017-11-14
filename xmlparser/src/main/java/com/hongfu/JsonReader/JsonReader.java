package com.hongfu.JsonReader;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    public static void main(String[] args ){
        File file = new File("E:\\test.txt");
        StringBuilder result = new StringBuilder();
        List<String> orgCodelist = new ArrayList<String>();
        List<String> orgNamelist = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//读取文件
            String s = null;
            while((s = br.readLine())!=null){
                result.append(s);
            }
            JSONArray jsonArray = JSONArray.parseArray(result.toString());
            int size = jsonArray.size();
            System.out.println("Size: " + size);
            for(int  i = 0; i < size; i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                orgCodelist.add(jsonObject.get("orgNo").toString());
                orgNamelist.add(jsonObject.get("name").toString());
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        for(String orgName : orgNamelist){
            System.out.println(orgName);
        }
    }
}
