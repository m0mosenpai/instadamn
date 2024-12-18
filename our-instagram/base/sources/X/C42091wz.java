package X;

/* renamed from: X.1wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42091wz implements InterfaceC41801wU, InterfaceC42101x0 {
    public long A00;
    public C133045zT A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC42071wx A05;
    public final C42031wt A06;
    public volatile boolean A07;

    public final void A00(Object obj, long j) {
        if (!this.A07) {
            if (!this.A03) {
                synchronized (this) {
                    if (!this.A07 && this.A00 != j) {
                        if (this.A02) {
                            C133045zT c133045zT = this.A01;
                            if (c133045zT == null) {
                                c133045zT = new C133045zT();
                                this.A01 = c133045zT;
                            }
                            c133045zT.A01(obj);
                        } else {
                            this.A04 = true;
                            this.A03 = true;
                        }
                    }
                    return;
                }
            }
            test(obj);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A07) {
            this.A07 = true;
            this.A06.A03(this);
        }
    }

    @Override // X.InterfaceC42101x0, X.InterfaceC42111x1
    public final boolean test(Object obj) {
        if (!this.A07 && !EnumC42671xv.A00(this.A05, obj)) {
            return false;
        }
        return true;
    }

    public C42091wz(InterfaceC42071wx interfaceC42071wx, C42031wt c42031wt) {
        this.A05 = interfaceC42071wx;
        this.A06 = c42031wt;
    }
}
