package utilities;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by kdezen on 06/05/15.
 */
public class MediaHelpers {

    public void playMusic(final Activity activity,final int raw,int id){

        LinearLayout linearLayout=(LinearLayout) activity.findViewById(id);
        linearLayout.setClickable(true);
        final MediaPlayer mediaPalyer= MediaPlayer.create(activity,raw);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mediaPalyer.start();

            }
        });

    }



    public void playOnly(final Activity tela, int raw){

        MediaPlayer mediaPalyer= MediaPlayer.create(tela,raw);

        mediaPalyer.start();

    }

}