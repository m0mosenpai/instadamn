package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

/* renamed from: X.AqC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24307AqC implements Runnable {
    public final /* synthetic */ LIj A00;

    public RunnableC24307AqC(LIj lIj) {
        this.A00 = lIj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C95334Qt c95334Qt;
        ClipsTrimFilmstrip clipsTrimFilmstrip;
        LIj lIj = this.A00;
        if (!lIj.A04 && (c95334Qt = lIj.A03) != null && c95334Qt.A09.A0I.A0J()) {
            int currentPosition = c95334Qt.getCurrentPosition();
            if (currentPosition >= lIj.A00) {
                c95334Qt.seekTo(lIj.A01);
                clipsTrimFilmstrip = lIj.A0E;
                currentPosition = lIj.A01;
            } else {
                if (currentPosition > 0) {
                    clipsTrimFilmstrip = lIj.A0E;
                }
                lIj.A08.postOnAnimation(lIj.A0D);
            }
            clipsTrimFilmstrip.setSeekPosition(currentPosition);
            lIj.A08.postOnAnimation(lIj.A0D);
        }
    }
}
