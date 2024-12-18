package X;

import android.media.MediaPlayer;

/* loaded from: classes11.dex */
public final class WIU implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ C66610UOx A00;

    public WIU(C66610UOx c66610UOx) {
        this.A00 = c66610UOx;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C66610UOx c66610UOx = this.A00;
        MediaPlayer mediaPlayer2 = c66610UOx.A00;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            c66610UOx.A00 = null;
        }
    }
}
