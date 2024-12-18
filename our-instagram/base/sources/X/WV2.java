package X;

import android.view.Choreographer;

/* loaded from: classes11.dex */
public final class WV2 implements C0KF {
    public final Choreographer A03;
    public final C0KE A04;
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer.FrameCallback A05 = new WKp(this, 0);

    @Override // X.C0KF
    public final void APM() {
        this.A02 = false;
        this.A03.removeFrameCallback(this.A05);
    }

    @Override // X.C0KF
    public final void ARQ() {
        if (!this.A02) {
            this.A00 = -1L;
        }
        this.A02 = true;
        this.A03.postFrameCallback(this.A05);
    }

    public WV2(Choreographer choreographer, C0KE c0ke) {
        this.A03 = choreographer;
        this.A04 = c0ke;
    }
}
