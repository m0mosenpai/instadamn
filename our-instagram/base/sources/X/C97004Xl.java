package X;

/* renamed from: X.4Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97004Xl extends AbstractC96984Xi {
    public C116695Py A00;
    public C4YH A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C4WJ A05;
    public final C96604Vv A06;
    public final boolean A07;

    @Override // X.AbstractC96994Xj, X.C4XV
    public final void A0B() {
        this.A04 = false;
        this.A03 = false;
        super.A0B();
    }

    @Override // X.AbstractC96994Xj, X.C4XW
    public final void Cp0() {
    }

    @Override // X.C4XW
    public final void EEP(C4Z0 c4z0) {
        C116695Py c116695Py = (C116695Py) c4z0;
        if (c116695Py.A02 != null) {
            C4XW c4xw = c116695Py.A03;
            c4xw.getClass();
            c4xw.EEP(c116695Py.A02);
        }
        if (c4z0 == this.A00) {
            this.A00 = null;
        }
    }

    public static void A00(C97004Xl c97004Xl, long j) {
        C116695Py c116695Py = c97004Xl.A00;
        int A06 = c97004Xl.A01.A06(c116695Py.A05.A04);
        if (A06 != -1) {
            long j2 = c97004Xl.A01.A0D(c97004Xl.A05, A06, false).A01;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0L, j2 - 1);
            }
            c116695Py.A00 = j;
        }
    }

    @Override // X.C4XW
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C116695Py AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j) {
        C116695Py c116695Py = new C116695Py(c4wx, interfaceC96344Us, j);
        C4XW c4xw = ((AbstractC96984Xi) this).A00;
        boolean z = false;
        if (c116695Py.A03 == null) {
            z = true;
        }
        C4B8.A04(z);
        c116695Py.A03 = c4xw;
        if (this.A04) {
            Object obj = c4wx.A04;
            C4YH c4yh = this.A01;
            Object obj2 = C4YH.A02;
            if (c4yh.A00 != null && obj.equals(C4YH.A02)) {
                obj = this.A01.A00;
            }
            c116695Py.A00(c4wx.A00(obj));
        } else {
            this.A00 = c116695Py;
            if (!this.A03) {
                this.A03 = true;
                A0F(c4xw, null);
                return c116695Py;
            }
        }
        return c116695Py;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r5.CdN() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C97004Xl(X.C4XW r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>(r5)
            r3 = 1
            if (r6 == 0) goto Ld
            boolean r1 = r5.CdN()
            r0 = 1
            if (r1 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            r4.A07 = r0
            X.4Vv r0 = new X.4Vv
            r0.<init>()
            r4.A06 = r0
            X.4WJ r0 = new X.4WJ
            r0.<init>()
            r4.A05 = r0
            com.google.android.exoplayer2.Timeline r2 = r5.BHj()
            if (r2 == 0) goto L2f
            r1 = 0
            X.4YH r0 = new X.4YH
            r0.<init>(r2, r1, r1)
            r4.A01 = r0
            r4.A02 = r3
            return
        L2f:
            X.4W2 r1 = r5.BRA()
            java.lang.Object r0 = X.C4YH.A02
            X.5Pf r3 = new X.5Pf
            r3.<init>(r1)
            java.lang.Object r2 = X.C96604Vv.A0H
            java.lang.Object r1 = X.C4YH.A02
            X.4YH r0 = new X.4YH
            r0.<init>(r3, r2, r1)
            r4.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97004Xl.<init>(X.4XW, boolean):void");
    }
}
