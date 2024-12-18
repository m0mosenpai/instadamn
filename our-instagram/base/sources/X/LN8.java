package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes8.dex */
public final class LN8 implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ IgFrameLayout A00;

    public LN8(IgFrameLayout igFrameLayout) {
        this.A00 = igFrameLayout;
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
