package utilities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by kdezen on 29/02/16.
 */
public class ScreenHelpers {

    public void runActitivty(Class<?> className,Activity activity,int id){


        final Intent intent=new Intent(activity,className);

        final Activity finalActivity=activity;

        LinearLayout abre=(LinearLayout) activity.findViewById(id);

        // final Class classe=myClass;

        abre.setClickable(true);
        abre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub



                // Activity activity=new Activity();

                finalActivity.startActivity(intent);

            }
        });


    }

    public void voltar(final Activity activity,int id,final boolean tela){
        LinearLayout sair=(LinearLayout) activity.findViewById(id);
        sair.setClickable(true);



        sair.setOnClickListener(new View.OnClickListener() {


            final Activity newActivity=activity;
            @Override
            public void onClick(View v) {

                if(tela==true) {
                    activity.finish();
                    // MediaHelpers mediaHelpers=new MediaHelpers();
                    //  mediaHelpers.playOnly(activity,R.raw.voltar);

                }else{
                    activity.finish();
                    System.exit(0);
                }

            }
        });

    }
}
