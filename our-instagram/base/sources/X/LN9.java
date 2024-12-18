package X;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes8.dex */
public final class LN9 implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ ConstraintLayout A00;

    public LN9(ConstraintLayout constraintLayout) {
        this.A00 = constraintLayout;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            this.A00.setVisibility(0);
            return true;
        }
        return true;
    }
}
