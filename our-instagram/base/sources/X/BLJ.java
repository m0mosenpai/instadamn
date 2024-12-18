package X;

/* loaded from: classes5.dex */
public final class BLJ extends C0T6 implements InterfaceC31167DnB, InterfaceC31047Dkl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public BLJ(C51688MsJ c51688MsJ, C25434BMz c25434BMz, C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, BLG blg, BLE ble, C25586BSz c25586BSz, int i) {
        this.A00 = i;
        this.A02 = c120985dq;
        this.A04 = c37644Ghd;
        this.A03 = c25377BKu;
        this.A07 = c51688MsJ;
        this.A05 = c25434BMz;
        this.A08 = ble;
        this.A06 = blg;
        this.A01 = c25586BSz;
    }

    @Override // X.InterfaceC31167DnB
    public final C25586BSz Atl() {
        return (C25586BSz) this.A01;
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return (C120985dq) this.A02;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        return (C25377BKu) this.A03;
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        return (C37644Ghd) this.A04;
    }

    @Override // X.InterfaceC31167DnB
    public final C25434BMz BR5() {
        return (C25434BMz) this.A05;
    }

    @Override // X.InterfaceC31167DnB
    public final BLG Bbg() {
        return (BLG) this.A06;
    }

    @Override // X.InterfaceC31167DnB
    public final BLE CCE() {
        return (BLE) this.A08;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof BLJ) {
            BLJ blj = (BLJ) obj;
            if (blj.A00 != i || !C14360o3.A0K(this.A02, blj.A02) || !C14360o3.A0K(this.A04, blj.A04) || !C14360o3.A0K(this.A03, blj.A03) || !C14360o3.A0K(this.A07, blj.A07) || !C14360o3.A0K(this.A05, blj.A05) || !C14360o3.A0K(this.A08, blj.A08) || !C14360o3.A0K(this.A06, blj.A06) || !C14360o3.A0K(this.A01, blj.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        int A0J = (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A02)))))) + AbstractC167017dG.A0M(this.A06)) * 31;
        Object obj = this.A01;
        if (i != 0) {
            return A0J + AbstractC166997dE.A0I(obj);
        }
        return AbstractC166987dD.A0I(obj, A0J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BLJ(X.C51688MsJ r12, X.C25434BMz r13, X.C25377BKu r14, X.C120985dq r15, X.C37644Ghd r16, X.BLG r17, X.BLE r18, int r19, int r20) {
        /*
            r11 = this;
            r7 = r17
            r9 = 0
            r1 = r11
            r0 = r20
            r11.A00 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            int r20 = 1 - r20
            if (r20 == 0) goto L1e
            r0 = r19 & 64
            if (r0 == 0) goto L19
            r7 = r9
        L19:
            r10 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L1e:
            r10 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLJ.<init>(X.MsJ, X.BMz, X.BKu, X.5dq, X.Ghd, X.BLG, X.BLE, int, int):void");
    }
}
