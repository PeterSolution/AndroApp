package com.example.kolokwiumpiotrwolff;

import android.app.Dialog;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class grakarta extends AppCompatActivity {

    int[] wincond=new int[9];
    TextView t1;
    TextView t2;
    int gracz=0;
    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;
    int flag7=0;
    int flag8=0;
    int flag9=0;

    ImageView im;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;
    ImageView im6;
    ImageView im7;
    ImageView im8;
    ImageView im9;
    DbFunction dbFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grakarta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dbFunction=new DbFunction();

        Button btnreset=findViewById(R.id.button_first);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset(view);
            }
        });

        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
         im=(ImageView) findViewById(R.id.imageView);
         im2=(ImageView)findViewById(R.id.imageView4);
         im3=(ImageView)findViewById(R.id.imageView5);
         im4=(ImageView)findViewById(R.id.imageView6);
         im5=(ImageView)findViewById(R.id.imageView7);
         im6=(ImageView)findViewById(R.id.imageView8);
         im7=(ImageView)findViewById(R.id.imageView9);
         im8=(ImageView)findViewById(R.id.imageView10);
         im9=(ImageView)findViewById(R.id.imageView11);
        t1.setVisibility(View.GONE);
        t2.setVisibility(View.GONE);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1==0) {
                    if (gracz == 0) {
                        im.setImageResource(R.drawable.kolo);
                        gracz = 1;
                        wincond[0]=1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                            dbFunction.dodajpoledogra(getApplication().getApplicationContext(),"wygrał gracz 1");
                        }
                    } else {
                        im.setImageResource(R.drawable.krzyzyk);
                        wincond[0]=2;

                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag1=1;
                }
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2==0) {
                    if (gracz == 0) {
                        im2.setImageResource(R.drawable.kolo);

                        wincond[1]=1;
                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im2.setImageResource(R.drawable.krzyzyk);

                        wincond[1]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag2=1;
                }
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3==0) {
                    if (gracz == 0) {
                        wincond[2]=1;
                        im3.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im3.setImageResource(R.drawable.krzyzyk);

                        wincond[2]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag3=1;
                }
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4==0) {
                    if (gracz == 0) {
                        wincond[3]=1;
                        im4.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im4.setImageResource(R.drawable.krzyzyk);

                        wincond[3]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag4=1;
                }
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5==0) {
                    if (gracz == 0) {
                        wincond[4]=1;
                        im5.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im5.setImageResource(R.drawable.krzyzyk);

                        wincond[4]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag5=1;
                }
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6==0) {
                    if (gracz == 0) {
                        wincond[5]=1;
                        im6.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im6.setImageResource(R.drawable.krzyzyk);

                        wincond[5]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag6=1;
                }
            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag7==0) {
                    if (gracz == 0) {
                        wincond[6]=1;
                        im7.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im7.setImageResource(R.drawable.krzyzyk);

                        gracz = 0;
                        wincond[6]=2;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag7=1;
                }
            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag8==0) {
                    if (gracz == 0) {
                        wincond[7]=1;
                        im8.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im8.setImageResource(R.drawable.krzyzyk);

                        wincond[7]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag8=1;
                }
            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag9==0) {
                    if (gracz == 0) {
                        wincond[8]=1;
                        im9.setImageResource(R.drawable.kolo);

                        gracz = 1;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 1");
                        }
                    } else {
                        im9.setImageResource(R.drawable.krzyzyk);

                        wincond[8]=2;
                        gracz = 0;
                        if(iswin(view)){
                            endofgame(view);
                            t2.setText("wygrał gracz 2");
                        }
                    }
                    flag9=1;
                }
            }
        });
    }

    void reset(View v){
        gracz=0;
        flag1=0;
        flag2=0;
        flag3=0;
        flag4=0;
        flag5=0;
        flag6=0;
        flag7=0;
        flag8=0;
        flag9=0;

        im.setImageResource(R.drawable.szaretlo);
        im.setVisibility(View.VISIBLE);
        im2.setImageResource(R.drawable.szaretlo);
        im2.setVisibility(View.VISIBLE);
        im3.setImageResource(R.drawable.szaretlo);
        im3.setVisibility(View.VISIBLE);
        im4.setImageResource(R.drawable.szaretlo);
        im4.setVisibility(View.VISIBLE);
        im5.setImageResource(R.drawable.szaretlo);
        im5.setVisibility(View.VISIBLE);
        im6.setImageResource(R.drawable.szaretlo);
        im6.setVisibility(View.VISIBLE);
        im7.setImageResource(R.drawable.szaretlo);
        im7.setVisibility(View.VISIBLE);
        im8.setImageResource(R.drawable.szaretlo);
        im8.setVisibility(View.VISIBLE);
        im9.setImageResource(R.drawable.szaretlo);
        im9.setVisibility(View.VISIBLE);
        t1.setVisibility(View.GONE);
        t2.setVisibility(View.GONE);
        wincond[0]=0;
        wincond[1]=0;
        wincond[2]=0;
        wincond[3]=0;
        wincond[4]=0;
        wincond[5]=0;
        wincond[6]=0;
        wincond[7]=0;
        wincond[8]=0;

    }
    void endofgame(View view){

        im.setVisibility(View.GONE);
        im2.setVisibility(View.GONE);
        im3.setVisibility(View.GONE);
        im4.setVisibility(View.GONE);
        im5.setVisibility(View.GONE);
        im6.setVisibility(View.GONE);
        im7.setVisibility(View.GONE);
        im8.setVisibility(View.GONE);
        im9.setVisibility(View.GONE);
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);

    }
    boolean iswin(View view){
        if(
        wincond[0]==wincond[1]&&wincond[1]==wincond[2]&&wincond[0]!=0
            || wincond[3]==wincond[4]&&wincond[4]==wincond[5]&&wincond[3]!=0
            || wincond[6]==wincond[7]&&wincond[7]==wincond[8]&&wincond[6]!=0
                || wincond[0]==wincond[3]&&wincond[3]==wincond[6]&&wincond[0]!=0
                || wincond[1]==wincond[4]&&wincond[4]==wincond[7]&&wincond[1]!=0
                || wincond[2]==wincond[5]&&wincond[5]==wincond[8]&&wincond[2]!=0
            || wincond[0]==wincond[4]&&wincond[4]==wincond[8]&&wincond[0]!=0
            || wincond[2]==wincond[4]&&wincond[4]==wincond[6]&&wincond[2]!=0)
        {
            return true;
        }
        else{
            return false;
        }


    }
}