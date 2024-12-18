package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* loaded from: classes8.dex */
public final class LNB implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ C47675L3i A01;

    public LNB(VideoView videoView, C47675L3i c47675L3i) {
        this.A00 = videoView;
        this.A01 = c47675L3i;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C14360o3.A0B(mediaPlayer, 0);
        mediaPlayer.setLooping(true);
        this.A00.start();
        C47675L3i c47675L3i = this.A01;
        c47675L3i.A03.setVisibility(4);
        c47675L3i.A02.setVisibility(0);
    }
}
