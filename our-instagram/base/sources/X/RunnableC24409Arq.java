package X;

import android.widget.FrameLayout;

/* renamed from: X.Arq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24409Arq implements Runnable {
    public final /* synthetic */ C8JT A00;

    public RunnableC24409Arq(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JT c8jt = this.A00;
        C86Q c86q = c8jt.A1d;
        FrameLayout frameLayout = c86q.A00;
        if (frameLayout != null) {
            AbstractC167017dG.A16(frameLayout, c86q);
            c86q.A00 = null;
            C8JT.A0m(c8jt);
        }
        C9GR.A0C(c8jt.A11, "extract_audio_failed");
    }
}
