package X;

import android.media.MediaPlayer;

/* renamed from: X.Oh4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55339Oh4 implements MediaPlayer.OnPreparedListener {
    public static final C55339Oh4 A00 = new C55339Oh4();

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C14360o3.A0B(mediaPlayer, 0);
        mediaPlayer.setVolume(0.0f, 0.0f);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
}
