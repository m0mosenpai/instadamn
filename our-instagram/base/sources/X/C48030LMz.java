package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* renamed from: X.LMz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48030LMz implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;

    public C48030LMz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                mediaPlayer.release();
                return;
            case 2:
                i = 0;
                C14360o3.A0B(mediaPlayer, 0);
                break;
            case 3:
                i = 0;
                break;
            case 4:
                C14360o3.A0B(mediaPlayer, 0);
                try {
                    mediaPlayer.seekTo(0);
                    VideoView videoView = ((C45484KBy) this.A01).A01;
                    if (videoView == null) {
                        C14360o3.A0F("videoPlayerView");
                        throw C00O.createAndThrow();
                    }
                    videoView.start();
                    return;
                } catch (IllegalStateException e) {
                    C0w9.A07("DirectClipsPreviewViewModel mediaPlayer.seekTo failed", e);
                    return;
                }
            default:
                KBP kbp = (KBP) this.A01;
                KBL kbl = kbp.A01;
                if (kbl == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                M47 m47 = new M47(kbl, kbp.A00);
                if (kbl.A06) {
                    kbl.A07.postDelayed(m47, 2500L);
                    return;
                }
                return;
        }
        mediaPlayer.seekTo(i);
        ((VideoView) this.A01).start();
    }
}
