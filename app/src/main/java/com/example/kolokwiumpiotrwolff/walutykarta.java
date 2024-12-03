package com.example.kolokwiumpiotrwolff;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class walutykarta extends AppCompatActivity {
    WebView webView;
    TextView textView;
    String link;
    ListView view;
    List<String> items;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_walutykarta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        i=0;
        view=findViewById(R.id.listaview1);
        items=new ArrayList<>();
        items.add("THB");
        items.add("USD");
        items.add("AUD");
        items.add("HKD");
        items.add("CAD");
        items.add("NZD");
        items.add("SGD");
        items.add("EUR");
        items.add("HUF");
        items.add("CHF");
        items.add("GBP");
        items.add("UAH");
        items.add("JPY");
        items.add("CZK");
        items.add("DKK");
        items.add("ISK");
        items.add("NOK");
        items.add("SEK");
        items.add("RON");
        items.add("BGN");
        items.add("TRY");
        items.add("ILS");
        items.add("CLP");
        items.add("PHP");
        items.add("ZAR");
        textView = findViewById(R.id.textView3);
        link="https://api.nbp.pl/api/exchangerates/rates/a/";
        String apilink = link+"usd";

        // Pobierz dane z API NBP
        fetchExchangeRates(apilink);
    }
    void btnclick(View view){
        
    }

    private void fetchExchangeRates(String url) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            // Odczytanie danych
                            JSONObject rateData = response.getJSONArray("rates").getJSONObject(0);
                            String date = rateData.getString("effectiveDate"); // Data notowania
                            String price = rateData.getString("mid"); // Cena

                            // Wyświetlenie ceny w TextView
                            textView.setText("Data: " + date + "\nKurs USD: " + price + " PLN");

                        } catch (JSONException e) {
                            e.printStackTrace();
                            textView.setText("Błąd w przetwarzaniu danych: \n" + e.getMessage());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Błąd połączenia: " + error.getMessage());
            }
        });

        Volley.newRequestQueue(this).add(jsonObjectRequest);
    }

//    private void fetchExchangeRates() {
//        apilink = "https://api.nbp.pl/api/cenyzlota";
//
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, apilink, null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        try {
//                            // Zakładamy, że API zwraca tablicę wyników, z którego bierzemy pierwszy obiekt
//                            JSONObject goldData = response.getJSONObject(0);
//                            String date = goldData.getString("data"); // Data notowania
//                            String price = goldData.getString("cena"); // Cena złota
//
//                            // Przykład, jak wyświetlić cenę w TextView
//                            textView.setText("Data: " + date + "\nCena złota: " + price + " PLN");
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                            textView.setText("Błąd w przetwarzaniu danych: \n" + e.getMessage());
//                        }
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                textView.setText("Błąd połączenia: " + error.getMessage());
//            }
//        });
//
//        Volley.newRequestQueue(this).add(jsonArrayRequest);
//    }

}