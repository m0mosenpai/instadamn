package X;

import android.widget.FrameLayout;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Avv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24661Avv implements Runnable {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public RunnableC24661Avv(C8JT c8jt, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = c8jt;
        this.A01 = audioOverlayTrack;
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
        c8jt.Due(this.A01);
    }
}
