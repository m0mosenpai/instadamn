package X;

import android.os.Handler;
import com.instagram.user.model.User;

/* renamed from: X.GmT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37931GmT extends AbstractC127945qN implements InterfaceC127975qQ {
    public C75113Zb A00;
    public boolean A01;
    public C38321qM A02;
    public final long A03;
    public final Handler A04;
    public final Runnable A05;
    public final String A06;
    public final String A07;
    public final long A08;

    public final void A05() {
        this.A01 = false;
        this.A04.removeCallbacks(this.A05);
        C75113Zb c75113Zb = this.A00;
        c75113Zb.A0m(false, true);
        c75113Zb.A2O = false;
        c75113Zb.A1K = null;
        AbstractC115715Lh.A00().A00(c75113Zb);
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return this.A08;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        if (this instanceof C38205GrA) {
            return ((C38205GrA) this).A00;
        }
        return this.A02;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37931GmT(X.C127915qK r3, X.C130505uv r4, X.C130505uv r5, X.C38321qM r6) {
        /*
            r2 = this;
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L42
            r2.<init>(r3, r4, r0)
            X.3Zb r0 = X.AbstractC37303Gc4.A0E(r6)
            r2.A00 = r0
            X.Gqu r0 = new X.Gqu
            r0.<init>(r2)
            r2.A05 = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r2.A03 = r0
            android.os.Handler r0 = X.AbstractC167007dF.A0J()
            r2.A04 = r0
            r1 = 0
            if (r5 == 0) goto L40
            X.1qM r0 = r5.A0A
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.Biv()
        L2b:
            r2.A06 = r0
            if (r5 == 0) goto L37
            X.1qM r0 = r5.A0A
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.A2u()
        L37:
            r2.A07 = r1
            r2.A02 = r6
            r0 = 31
            r2.A08 = r0
            return
        L40:
            r0 = r1
            goto L2b
        L42:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37931GmT.<init>(X.5qK, X.5uv, X.5uv, X.1qM):void");
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A02 */
    public final String getKey() {
        String id = BQN().getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A04() {
        C38321qM BQN = BQN();
        User A14 = AbstractC25226BEj.A14(BQN);
        boolean z = false;
        if (A14 != null && !A14.A2N()) {
            z = true;
        }
        User A142 = AbstractC25226BEj.A14(BQN);
        if (z) {
            if (A142 == null) {
                return null;
            }
            return A142.getUsername();
        }
        if (A142 == null) {
            return null;
        }
        return A142.getFullName();
    }
}
