package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes8.dex */
public final class LNC implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IgFrameLayout A01;
    public final /* synthetic */ C44419JkE A02;

    public LNC(IgFrameLayout igFrameLayout, C44419JkE c44419JkE, int i) {
        this.A01 = igFrameLayout;
        this.A02 = c44419JkE;
        this.A00 = i;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new LN8(this.A01));
        mediaPlayer.setOnCompletionListener(new LN0(this.A02, this.A00));
        mediaPlayer.setVideoScalingMode(1);
    }
}
