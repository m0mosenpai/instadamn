package X;

import android.os.Handler;

/* renamed from: X.JSf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43647JSf {
    public long A00;
    public JWP A01;
    public final int A02;
    public final Handler A03 = AbstractC167007dF.A0J();
    public final MPN A04;

    public final void A00() {
        JWP jwp = this.A01;
        if (jwp != null) {
            jwp.A01 = true;
            this.A03.removeCallbacks(jwp);
            this.A01 = null;
        }
    }

    public final void A01() {
        if (this.A01 == null) {
            JWP jwp = new JWP(this);
            this.A01 = jwp;
            this.A03.postDelayed(jwp, this.A02);
        }
    }

    public C43647JSf(MPN mpn, int i) {
        this.A02 = i;
        this.A04 = mpn;
    }
}
