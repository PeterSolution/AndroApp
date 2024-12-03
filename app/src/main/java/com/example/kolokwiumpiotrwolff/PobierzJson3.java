//package com.example.lab5_zad2_29102024_piotrwolff;
//import android.app.Activity;
//import android.os.AsyncTask;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//class PobierzJson3 extends AsyncTask<Void, Void, String> {
//    String[] daneZczytane;
//    public String danePierwsza;
//    public String daneOstatnia;
//    public String daneWybrana;
//    public String daneCalosc;
//    public int pozWybranej;
//    public ListView listView;
//    public Activity aktynowsc=null;
//
//
//    String adresStrony;
//    public void wywolajSkrypt(String adresWWW, com.example.lab5_zad2_29102024_piotrwolff.MainActivity mainActivit) {
//        aktynowsc=mainActivit;
//        class RunSkrypt extends AsyncTask<Void, Void, String> {
//            @Override
//            protected String doInBackground(Void... voids) {
//
//                try {
//                    URL url = new URL(adresWWW);
//                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                    httpURLConnection.getInputStream();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                return null;
//            }
//        }
//        RunSkrypt runSkrypt = new RunSkrypt();
//        runSkrypt.execute();
//    }
//    protected void onPostExecute(String s){
//        super.onPostExecute(s);
//        try {
//            daneCalosc=s;
//            JSONArray jsonArray= new JSONArray(s);
//            daneZczytane= new String[jsonArray.length()];
//            for (int i=0; i<jsonArray.length(); i++){
//                JSONObject jsonObject= jsonArray.getJSONObject(i);
//                //daneZczytane[i]= jsonObject.getString("nazwa");
//                if (i==0) {
//                    // danePierwsza=jsonObject.getString("nazwa");
//                    com.example.lab5_zad2_29102024_piotrwolff.MainActivity.daneCalosc=daneCalosc;
//                    com.example.lab5_zad2_29102024_piotrwolff.MainActivity.sek=jsonObject.getString("sek");
//                    com.example.lab5_zad2_29102024_piotrwolff.MainActivity.min=jsonObject.getString("min");
//                }
//                if(i==pozWybranej){
//                    daneWybrana=jsonObject.getString("nazwa");
//                }
//                daneOstatnia=jsonObject.getString("nazwa");
//            }
//            if (aktynowsc!=null){
//                ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(aktynowsc, android.R.layout.simple_list_item_1,daneZczytane);
//                listView.setAdapter(arrayAdapter);
//            }
//
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//    @Override
//    protected String doInBackground(Void... voids) {
//        try {
//            URL url= new URL(adresStrony);
//            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
//            StringBuffer stringBuffer= new StringBuffer();
//            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//            String json;
//            while ((json=bufferedReader.readLine())!=null){
//                stringBuffer.append(json + "\n");
//            }
//            return stringBuffer.toString().trim();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
