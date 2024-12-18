package X;

import android.media.MediaPlayer;

/* renamed from: X.Ogz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55336Ogz implements MediaPlayer.OnCompletionListener {
    public static final C55336Ogz A00 = new C55336Ogz();

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
    }
}
