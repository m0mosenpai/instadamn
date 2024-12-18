package X;

import android.media.MediaPlayer;

/* loaded from: classes8.dex */
public final class LNF implements MediaPlayer.OnPreparedListener {
    public static final LNF A00 = new LNF();

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C14360o3.A0B(mediaPlayer, 0);
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
        mediaPlayer.setLooping(true);
    }
}
