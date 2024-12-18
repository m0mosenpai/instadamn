package X;

import android.media.MediaPlayer;

/* renamed from: X.Ogy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55335Ogy implements MediaPlayer.OnCompletionListener {
    public static final C55335Ogy A00 = new C55335Ogy();

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
    }
}
