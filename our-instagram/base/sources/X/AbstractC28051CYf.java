package X;

import android.media.MediaPlayer;

/* renamed from: X.CYf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28051CYf {
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028f, code lost:
    
        if ((r57 & 48) == 32) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024f, code lost:
    
        if ((r57 & 48) == 32) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C28729CmL r52, X.C5Tl r53, X.C51760Mtj r54, X.InterfaceC16660sJ r55, X.InterfaceC16660sJ r56, int r57) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28051CYf.A01(X.CmL, X.5Tl, X.Mtj, X.0sJ, X.0sJ, int):void");
    }

    public static final void A00(MediaPlayer mediaPlayer, QJ0 qj0, QJ0 qj02, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        if (C14360o3.A0K(qj02, qj0)) {
            interfaceC16660sJ.invoke(null);
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
                interfaceC16660sJ2.invoke(null);
                return;
            }
            return;
        }
        interfaceC16660sJ.invoke(qj0);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            interfaceC16660sJ2.invoke(null);
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        interfaceC16660sJ2.invoke(mediaPlayer2);
        mediaPlayer2.setDataSource(qj0.A03);
        mediaPlayer2.setOnPreparedListener(C28575Cj7.A00);
        mediaPlayer2.prepareAsync();
        mediaPlayer2.setOnCompletionListener(new LN1(0, interfaceC16660sJ, interfaceC16660sJ2));
    }
}
