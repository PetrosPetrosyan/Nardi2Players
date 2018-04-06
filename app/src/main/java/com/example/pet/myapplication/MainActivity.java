package com.example.pet.myapplication;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text, zar1, zar2;
    private Button generate;
    protected int z1, z2;
    protected float qarx, qary;
    protected int i, j, k, d, qanak;
    protected int[][] arr = new int[24][16];
    protected boolean arvac = false, spitakverj = false, sevverj = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int n = 0; n < 24; n++) {
            for (int l = 0; l < 16; l++) {
                arr[n][l] = 0;
            }
        }
        for (int n = 0; n < 15; n++) {
            arr[0][n] = 1;
            arr[12][n] = 2;
        }

        text = findViewById(R.id.tv);
        text.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                zar1 = findViewById(R.id.zar1);
                zar2 = findViewById(R.id.zar2);
                generate = findViewById(R.id.generate);
                generate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        z1 = (int) (Math.random() * 5.9 + 1);
                        z2 = (int) (Math.random() * 5.9 + 1);
                        arvac = !arvac;
                        if (z1 == z2) qanak = 4;
                        else qanak = 2;
                        switch (z1) {
                            case 1 : zar1.setBackgroundResource(R.drawable.z1);break;
                            case 2 : zar1.setBackgroundResource(R.drawable.z2);break;
                            case 3 : zar1.setBackgroundResource(R.drawable.z3);break;
                            case 4 : zar1.setBackgroundResource(R.drawable.z4);break;
                            case 5 : zar1.setBackgroundResource(R.drawable.z5);break;
                            case 6 : zar1.setBackgroundResource(R.drawable.z6);break;
                        }
                        switch (z2) {
                            case 1 : zar2.setBackgroundResource(R.drawable.z1);break;
                            case 2 : zar2.setBackgroundResource(R.drawable.z2);break;
                            case 3 : zar2.setBackgroundResource(R.drawable.z3);break;
                            case 4 : zar2.setBackgroundResource(R.drawable.z4);break;
                            case 5 : zar2.setBackgroundResource(R.drawable.z5);break;
                            case 6 : zar2.setBackgroundResource(R.drawable.z6);break;
                        }
                    }
                });
                final RelativeLayout layout = findViewById(R.id.layout);
                layout.removeView(text);
                final float a = layout.getWidth();
                final float b = layout.getHeight();
                final int qar = (int) (a / 14);
                final int r = 5, l = (int) (2 * a / 25);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(qar, qar);

                final Button spitak1 = new Button(MainActivity.this);
                spitak1.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak1, lp);
                spitak1.setX(r);
                spitak1.setY((int) (b - qar));
                spitak1.setId(R.id.spitak1);

                final Button spitak2 = new Button(MainActivity.this);
                spitak2.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak2, lp);
                spitak2.setX(r);
                spitak2.setY((int) (b - qar) - qar);
                spitak2.setId(R.id.spitak2);

                final Button spitak3 = new Button(MainActivity.this);
                spitak3.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak3, lp);
                spitak3.setX(r);
                spitak3.setY((int) (b - qar) - 2 * qar);
                spitak3.setId(R.id.spitak3);

                final Button spitak4 = new Button(MainActivity.this);
                spitak4.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak4, lp);
                spitak4.setX(r);
                spitak4.setY((int) (b - qar) - 3 * qar);
                spitak4.setId(R.id.spitak4);

                final Button spitak5 = new Button(MainActivity.this);
                spitak5.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak5, lp);
                spitak5.setX(r);
                spitak5.setY((int) (b - qar) - 4 * qar);
                spitak5.setId(R.id.spitak5);

                final Button spitak6 = new Button(MainActivity.this);
                spitak6.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak6, lp);
                spitak6.setX(r);
                spitak6.setY((int) (b - qar) - 5 * qar);
                spitak6.setId(R.id.spitak6);

                final Button spitak7 = new Button(MainActivity.this);
                spitak7.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak7, lp);
                spitak7.setX(r);
                spitak7.setY((int) (b - qar) - 6 * qar);
                spitak7.setId(R.id.spitak7);

                final Button spitak8 = new Button(MainActivity.this);
                spitak8.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak8, lp);
                spitak8.setX(r);
                spitak8.setY((int) (b - qar) - 7 * qar);
                spitak8.setId(R.id.spitak8);

                final Button spitak9 = new Button(MainActivity.this);
                spitak9.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak9, lp);
                spitak9.setX(r);
                spitak9.setY((int) (b - qar) - 8 * qar);
                spitak9.setId(R.id.spitak9);

                final Button spitak10 = new Button(MainActivity.this);
                spitak10.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak10, lp);
                spitak10.setX(r);
                spitak10.setY((int) (b - qar) - 9 * qar);
                spitak10.setId(R.id.spitak10);

                final Button spitak11 = new Button(MainActivity.this);
                spitak11.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak11, lp);
                spitak11.setX(r);
                spitak11.setY((int) (b - qar) - 10 * qar);
                spitak11.setId(R.id.spitak11);

                final Button spitak12 = new Button(MainActivity.this);
                spitak12.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak12, lp);
                spitak12.setX(r);
                spitak12.setY((int) (b - qar) - 11 * qar);
                spitak12.setId(R.id.spitak12);

                final Button spitak13 = new Button(MainActivity.this);
                spitak13.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak13, lp);
                spitak13.setX(r);
                spitak13.setY((int) (b - qar) - 12 * qar);
                spitak13.setId(R.id.spitak13);

                final Button spitak14 = new Button(MainActivity.this);
                spitak14.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak14, lp);
                spitak14.setX(r);
                spitak14.setY((int) (b - qar) - 13 * qar);
                spitak14.setId(R.id.spitak14);

                final Button spitak15 = new Button(MainActivity.this);
                spitak15.setBackgroundResource(R.drawable.spitak);
                layout.addView(spitak15, lp);
                spitak15.setX(r);
                spitak15.setY((int) (b - qar) - 14 * qar);
                spitak15.setId(R.id.spitak15);


                final Button sev1 = new Button(MainActivity.this);
                sev1.setBackgroundResource(R.drawable.sev);
                layout.addView(sev1, lp);
                sev1.setX((int) (a - r - l));
                sev1.setY(0);
                sev1.setId(R.id.sev1);

                final Button sev2 = new Button(MainActivity.this);
                sev2.setBackgroundResource(R.drawable.sev);
                layout.addView(sev2, lp);
                sev2.setX((int) (a - r - l));
                sev2.setY(qar);
                sev2.setId(R.id.sev2);

                final Button sev3 = new Button(MainActivity.this);
                sev3.setBackgroundResource(R.drawable.sev);
                layout.addView(sev3, lp);
                sev3.setX((int) (a - r - l));
                sev3.setY(2 * qar);
                sev3.setId(R.id.sev3);

                final Button sev4 = new Button(MainActivity.this);
                sev4.setBackgroundResource(R.drawable.sev);
                layout.addView(sev4, lp);
                sev4.setX((int) (a - r - l));
                sev4.setY(3 * qar);
                sev4.setId(R.id.sev4);

                final Button sev5 = new Button(MainActivity.this);
                sev5.setBackgroundResource(R.drawable.sev);
                layout.addView(sev5, lp);
                sev5.setX((int) (a - r - l));
                sev5.setY(4 * qar);
                sev5.setId(R.id.sev5);

                final Button sev6 = new Button(MainActivity.this);
                sev6.setBackgroundResource(R.drawable.sev);
                layout.addView(sev6, lp);
                sev6.setX((int) (a - r - l));
                sev6.setY(5 * qar);
                sev6.setId(R.id.sev6);

                final Button sev7 = new Button(MainActivity.this);
                sev7.setBackgroundResource(R.drawable.sev);
                layout.addView(sev7, lp);
                sev7.setX((int) (a - r - l));
                sev7.setY(6 * qar);
                sev7.setId(R.id.sev7);

                final Button sev8 = new Button(MainActivity.this);
                sev8.setBackgroundResource(R.drawable.sev);
                layout.addView(sev8, lp);
                sev8.setX((int) (a - r - l));
                sev8.setY(7 * qar);
                sev8.setId(R.id.sev8);

                final Button sev9 = new Button(MainActivity.this);
                sev9.setBackgroundResource(R.drawable.sev);
                layout.addView(sev9, lp);
                sev9.setX((int) (a - r - l));
                sev9.setY(8 * qar);
                sev9.setId(R.id.sev9);

                final Button sev10 = new Button(MainActivity.this);
                sev10.setBackgroundResource(R.drawable.sev);
                layout.addView(sev10, lp);
                sev10.setX((int) (a - r - l));
                sev10.setY(9 * qar);
                sev10.setId(R.id.sev10);

                final Button sev11 = new Button(MainActivity.this);
                sev11.setBackgroundResource(R.drawable.sev);
                layout.addView(sev11, lp);
                sev11.setX((int) (a - r - l));
                sev11.setY(10 * qar);
                sev11.setId(R.id.sev11);

                final Button sev12 = new Button(MainActivity.this);
                sev12.setBackgroundResource(R.drawable.sev);
                layout.addView(sev12, lp);
                sev12.setX((int) (a - r - l));
                sev12.setY(11 * qar);
                sev12.setId(R.id.sev12);

                final Button sev13 = new Button(MainActivity.this);
                sev13.setBackgroundResource(R.drawable.sev);
                layout.addView(sev13, lp);
                sev13.setX((int) (a - r - l));
                sev13.setY(12 * qar);
                sev13.setId(R.id.sev13);

                final Button sev14 = new Button(MainActivity.this);
                sev14.setBackgroundResource(R.drawable.sev);
                layout.addView(sev14, lp);
                sev14.setX((int) (a - r - l));
                sev14.setY(13 * qar);
                sev14.setId(R.id.sev14);

                final Button sev15 = new Button(MainActivity.this);
                sev15.setBackgroundResource(R.drawable.sev);
                layout.addView(sev15, lp);
                sev15.setX((int) (a - r - l));
                sev15.setY(14 * qar);
                sev15.setId(R.id.sev15);


                spitak1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak1);
                    }
                });
                spitak2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak2);
                    }
                });
                spitak3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak3);
                    }
                });
                spitak4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak4);
                    }
                });
                spitak5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak5);
                    }
                });
                spitak6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak6);
                    }
                });
                spitak7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak7);
                    }
                });
                spitak8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak8);
                    }
                });
                spitak9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak9);
                    }
                });
                spitak10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak10);
                    }
                });
                spitak11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak11);
                    }
                });
                spitak12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak12);
                    }
                });
                spitak13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak13);
                    }
                });
                spitak14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak14);
                    }
                });
                spitak15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelspitak(spitak15);
                    }
                });


                sev1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev1);
                    }
                });
                sev2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev2);
                    }
                });
                sev3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev3);
                    }
                });
                sev4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev4);
                    }
                });
                sev5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev5);
                    }
                });
                sev6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev6);
                    }
                });
                sev7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev7);
                    }
                });
                sev8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev8);
                    }
                });
                sev9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev9);
                    }
                });
                sev10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev10);
                    }
                });
                sev11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev11);
                    }
                });
                sev12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev12);
                    }
                });
                sev13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev13);
                    }
                });
                sev14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev14);
                    }
                });
                sev15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        qaylelsev(sev15);
                    }
                });


            }
        });


    }

    public void qaylelspitak(final Button knopka) {
        if (arvac == true) {

            boolean sz1 = true, sz2 = true;
            final RelativeLayout layout = findViewById(R.id.layout);
            k = 0;
            d = 0;

            for (int l = 0; l < 18; l++) {
                if (arr[l][0] != 1) {
                    spitakverj = true;
                } else {
                    spitakverj = false;
                    break;
                }
            }

            final float a = layout.getWidth();
            final float b = layout.getHeight();
            final int qar = (int) (a / 14);
            final int r = 5, l = (int) (2 * a / 25);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(qar, qar);

            final Button qayl1 = new Button(MainActivity.this);
            qayl1.setBackgroundResource(R.drawable.ringgreen);
            qayl1.setId(R.id.qayl1);

            final Button qayl2 = new Button(MainActivity.this);
            qayl2.setBackgroundResource(R.drawable.ringgreen);
            qayl2.setId(R.id.qayl2);

            layout.removeView(qayl1);
            layout.removeView(qayl2);
            qarx = knopka.getX();
            qary = knopka.getY();

            if (qarx < 6 * l) {
                i = (int) ((qarx) / l);
            } else {
                i = (int) ((qarx - l / 2) / l);
            }
            if ((b - qary) / qar == (int) ((b - qary) / qar)) {
                j = (int) ((b - qary) / qar) - 1;
            } else {
                j = (int) (qary / qar);
                i = 23 - i;
            }
            if (arr[i][j + 1] == 0 && spitakverj == true) {
                if (i + z1 > 23) {
                    layout.removeView(qayl1);
                    layout.addView(qayl1, lp);

                    qayl1.setX(l * 3);
                    qayl1.setY(b / 2);
                    qayl1.setId(R.id.qayl1);
                    qayl1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            layout.removeView(qayl1);
                            layout.removeView(qayl2);
                            arr[i][j] = 0;
                            layout.removeView(knopka);
                            if (qanak <= 2) z1 = 0;
                            --qanak;
                        }
                    });
                }
                if (i + z2 > 23) {
                    layout.removeView(qayl2);
                    layout.addView(qayl2, lp);

                    qayl2.setX(l * 4);
                    qayl2.setY(b / 2);
                    qayl2.setId(R.id.qayl2);
                    qayl2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            layout.removeView(qayl1);
                            layout.removeView(qayl2);
                            arr[i][j] = 0;
                            layout.removeView(knopka);
                            if (qanak <= 2) z2 = 0;
                            --qanak;
                        }
                    });
                }
            }
            if (arr[i][j + 1] != 0 || i + z1 > 23 || i + z2 > 23) {

            } else {
                if (arr[i + z1][0] == 2 || z1 == 0) {
                    sz1 = false;
                }
                if (arr[i + z2][0] == 2 || z2 == 0) {
                    sz2 = false;
                }
                k = 0;
                while (arr[i + z1][k] != 0) {
                    k++;
                }
                d = 0;
                while (arr[i + z2][d] != 0) {
                    ++d;
                }
                layout.removeView(qayl1);
                if (sz1 == true) {
                    layout.addView(qayl1, lp);
                }
                layout.removeView(qayl2);
                if (sz2 == true) {
                    layout.addView(qayl2, lp);
                }
                if (i < 6) {
                    if (sz1 == true) {
                        if (i + z1 > 5) {
                            qayl1.setX(qarx + l * z1 + l / 2);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(qarx + l * z1 + l / 2);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;


                                }
                            });
                        } else {
                            qayl1.setX(qarx + l * z1);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(qarx + l * z1);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 5) {
                            qayl2.setX(qarx + l * z2 + l / 2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl2);
                                    layout.removeView(qayl1);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(qarx + l * z2 + l / 2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;


                                }
                            });
                        } else {
                            qayl2.setX(qarx + l * z2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl2);
                                    layout.removeView(qayl1);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(qarx + l * z2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }
                if (i >= 6 && i < 12) {
                    if (sz1 == true) {
                        if (i + z1 > 11) {
                            qayl1.setX(a - r - l - l * (i + z1 - 12));
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(a - r - l - l * (i + z1 - 12));
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl1.setX(qarx + l * z1);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(qarx + l * z1);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 11) {
                            qayl2.setX(a - r - l - l * (i + z2 - 12));
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(a - r - l - l * (i + z2 - 12));
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl2.setX(qarx + l * z2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(qarx + l * z2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }
                if (i >= 12 && i <= 17) {
                    if (sz1 == true) {

                        if (i + z1 > 17) {
                            qayl1.setX(r + (23 - i - z1) * l);
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(r + (23 - i - z1) * l);
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl1.setX(a - l - r - l * (i + z1 - 12));
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 1;
                                    knopka.setX(a - l - r - l * (i + z1 - 12));
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 17) {
                            qayl2.setX(r + (23 - i - z2) * l);
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(r + (23 - i - z2) * l);
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl2.setX(a - l - r - l * (i + z2 - 12));
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 1;
                                    knopka.setX(a - l - r - l * (i + z2 - 12));
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }

                if (i > 17) {
                    if (sz1 == true) {
                        qayl1.setX(r + (23 - i - z1) * l);
                        qayl1.setY(qar * (k));
                        qayl1.setId(R.id.qayl1);
                        qayl1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                layout.removeView(qayl1);
                                layout.removeView(qayl2);
                                arr[i][j] = 0;
                                arr[i + z1][k] = 1;
                                knopka.setX(r + (23 - i - z1) * l);
                                knopka.setY((k) * qar);
                                k = 0;
                                if (qanak <= 2) z1 = 0;
                                --qanak;

                            }
                        });
                    }
                    if (sz2 == true) {
                        qayl2.setX(r + (23 - i - z2) * l);
                        qayl2.setY(qar * (d));
                        qayl2.setId(R.id.qayl2);
                        qayl2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                layout.removeView(qayl1);
                                layout.removeView(qayl2);
                                arr[i][j] = 0;
                                arr[i + z2][d] = 1;
                                knopka.setX(r + (23 - i - z2) * l);
                                knopka.setY((d) * qar);
                                d = 0;
                                if (qanak <= 2) z2 = 0;
                                --qanak;

                            }
                        });
                    }
                }


            }
        }
    }

    public void qaylelsev(final Button knopka) {
        if (arvac == false) {

            boolean sz1 = true, sz2 = true;
            final RelativeLayout layout = findViewById(R.id.layout);
            k = 0;
            d = 0;

            for (int l = 0; l < 18; l++) {
                if (l < 6) {
                    if (arr[l][0] != 1) {
                        sevverj = true;
                    } else {
                        sevverj = false;
                        break;
                    }
                } else {
                    if (arr[l + 6][0] != 1) {
                        sevverj = true;
                    } else {
                        sevverj = false;
                        break;
                    }
                }
            }

            final float a = layout.getWidth();
            final float b = layout.getHeight();
            final int qar = (int) (a / 14);
            final int r = 5, l = (int) (2 * a / 25);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(qar, qar);

            final Button qayl1 = new Button(MainActivity.this);
            qayl1.setBackgroundResource(R.drawable.ringgreen);
            qayl1.setId(R.id.qayl1);

            final Button qayl2 = new Button(MainActivity.this);
            qayl2.setBackgroundResource(R.drawable.ringgreen);
            qayl2.setId(R.id.qayl2);

            layout.removeView(qayl1);
            layout.removeView(qayl2);
            qarx = knopka.getX();
            qary = knopka.getY();
            if (qarx < 6 * l) {
                i = (int) ((qarx) / l);
            } else {
                i = (int) ((qarx - l / 2) / l);
            }
            if ((b - qary) / qar == (int) ((b - qary) / qar)) {
                j = (int) ((b - qary) / qar) - 1;
            } else {
                j = (int) (qary / qar);
                i = 23 - i;
            }
            if (arr[i][j + 1] != 0) {

            } else {
                if (i < 12 && i + z1 > 11) {
                    if (sevverj == false) {
                        sz1 = false;
                    } else {
                        layout.removeView(qayl1);
                        layout.addView(qayl1);

                        qayl1.setX(a - l * 3);
                        qayl1.setY(b / 2);
                        qayl1.setId(R.id.qayl1);
                        qayl1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                layout.removeView(qayl1);
                                layout.removeView(qayl2);
                                arr[i][j] = 0;
                                layout.removeView(knopka);
                                if (qanak <= 2) z1 = 0;
                                --qanak;
                            }
                        });
                    }
                }
                if (i < 12 && i + z2 > 11) {
                    if (sevverj == false) {
                        sz2 = false;
                    } else {
                        layout.removeView(qayl2);
                        layout.addView(qayl2);

                        qayl2.setX(a - l * 4);
                        qayl2.setY(b / 2);
                        qayl2.setId(R.id.qayl2);
                        qayl2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                layout.removeView(qayl1);
                                layout.removeView(qayl2);
                                arr[i][j] = 0;
                                layout.removeView(knopka);
                                if (qanak <= 2) z2 = 0;
                                --qanak;
                            }
                        });
                    }
                }
                if (i + z1 > 23) {
                    if (arr[i + z1 - 24][0] == 1) {
                        sz1 = false;
                    }
                    k = 0;
                    while (arr[i + z1 - 24][k] != 0) {
                        k++;
                    }
                } else {
                    if (arr[i + z1][0] == 1) {
                        sz1 = false;
                    }
                    k = 0;
                    while (arr[i + z1][k] != 0) {
                        k++;
                    }
                }
                if (i + z2 > 23) {
                    if (arr[i + z2 - 24][0] == 1) {
                        sz2 = false;
                    }
                    d = 0;
                    while (arr[i + z2 - 24][d] != 0) {
                        ++d;
                    }
                } else {
                    if (arr[i + z2][0] == 1) {
                        sz2 = false;
                    }
                    d = 0;
                    while (arr[i + z2][d] != 0) {
                        ++d;
                    }
                }
                if (z1 == 0) sz1 = false;
                if (z2 == 0) sz2 = false;

                layout.removeView(qayl1);
                if (sz1 == true) {
                    layout.addView(qayl1, lp);
                }
                layout.removeView(qayl2);
                if (sz2 == true) {
                    layout.addView(qayl2, lp);
                }
                if (i < 6) {
                    if (sz1 == true) {
                        if (i + z1 > 5) {
                            qayl1.setX(qarx + l * z1 + l / 2);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(qarx + l * z1 + l / 2);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl1.setX(qarx + l * z1);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(qarx + l * z1);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 5) {
                            qayl2.setX(qarx + l * z2 + l / 2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl2);
                                    layout.removeView(qayl1);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(qarx + l * z2 + l / 2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl2.setX(qarx + l * z2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl2);
                                    layout.removeView(qayl1);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(qarx + l * z2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }
                if (i >= 6 && i < 12) {
                    if (sz1 == true) {
                        if (i + z1 > 11) {
                        } else {
                            qayl1.setX(qarx + l * z1);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(qarx + l * z1);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 11) {
                        } else {
                            qayl2.setX(qarx + l * z2);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(qarx + l * z2);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }
                if (i >= 12 && i <= 17) {
                    if (sz1 == true) {

                        if (i + z1 > 17) {
                            qayl1.setX(r + (23 - i - z1) * l);
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(r + (23 - i - z1) * l);
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl1.setX(a - l - r - l * (i + z1 - 12));
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(a - l - r - l * (i + z1 - 12));
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 > 17) {
                            qayl2.setX(r + (23 - i - z2) * l);
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(r + (23 - i - z2) * l);
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl2.setX(a - l - r - l * (i + z2 - 12));
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(a - l - r - l * (i + z2 - 12));
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }

                if (i > 17) {
                    if (sz1 == true) {
                        if (i + z1 < 24) {
                            qayl1.setX(r + (23 - i - z1) * l);
                            qayl1.setY(qar * (k));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1][k] = 2;
                                    knopka.setX(r + (23 - i - z1) * l);
                                    knopka.setY((k) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl1.setX(r + (i + z1 - 24) * l);
                            qayl1.setY(b - qar * (k + 1));
                            qayl1.setId(R.id.qayl1);
                            qayl1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z1 - 24][k] = 2;
                                    knopka.setX(r + (i + z1 - 24) * l);
                                    knopka.setY(b - (k + 1) * qar);
                                    k = 0;
                                    if (qanak <= 2) z1 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                    if (sz2 == true) {
                        if (i + z2 < 24) {
                            qayl2.setX(r + (23 - i - z2) * l);
                            qayl2.setY(qar * (d));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2][d] = 2;
                                    knopka.setX(r + (23 - i - z2) * l);
                                    knopka.setY((d) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        } else {
                            qayl2.setX(r + (i + z2 - 24) * l);
                            qayl2.setY(b - qar * (d + 1));
                            qayl2.setId(R.id.qayl2);
                            qayl2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    layout.removeView(qayl1);
                                    layout.removeView(qayl2);
                                    arr[i][j] = 0;
                                    arr[i + z2 - 24][d] = 2;
                                    knopka.setX(r + (i + z2 - 24) * l);
                                    knopka.setY(b - (d + 1) * qar);
                                    d = 0;
                                    if (qanak <= 2) z2 = 0;
                                    --qanak;

                                }
                            });
                        }
                    }
                }


            }
        }
    }
}
