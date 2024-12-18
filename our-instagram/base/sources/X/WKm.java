package X;

import android.view.Choreographer;

/* loaded from: classes11.dex */
public final class WKm implements Choreographer.FrameCallback {
    public final /* synthetic */ C142196bc A00;

    public WKm(C142196bc c142196bc) {
        this.A00 = c142196bc;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C142196bc c142196bc = this.A00;
        try {
            Thread.sleep(c142196bc.A02);
        } catch (Exception unused) {
            if (!c142196bc.A01) {
                AbstractC166987dD.A1T(C18950wb.A01, "OnScroll has been interrupted", 817895459);
                c142196bc.A01 = true;
            }
        }
        if (c142196bc.A00) {
            c142196bc.A04.postFrameCallback(c142196bc.A03);
        }
    }
}
