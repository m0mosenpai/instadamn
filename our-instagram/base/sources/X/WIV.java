package X;

import android.media.MediaPlayer;

/* loaded from: classes11.dex */
public final class WIV implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ C66610UOx A00;

    public WIV(C66610UOx c66610UOx) {
        this.A00 = c66610UOx;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C66610UOx c66610UOx = this.A00;
        MediaPlayer mediaPlayer2 = c66610UOx.A00;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            c66610UOx.A00 = null;
            return true;
        }
        return true;
    }
}
