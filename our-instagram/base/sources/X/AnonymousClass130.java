package X;

/* renamed from: X.130, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass130 extends C12T {
    public long A00;
    public C01U A01;
    public boolean A02;

    public abstract long A06();

    public abstract void A07();

    public final void A08(C1E4 c1e4) {
        C01U c01u = this.A01;
        if (c01u == null) {
            c01u = new C01U();
            this.A01 = c01u;
        }
        c01u.addLast(c1e4);
    }

    public final void A09(boolean z) {
        long j;
        long j2 = this.A00;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.A00 = j3;
        if (j3 <= 0 && this.A02) {
            A07();
        }
    }

    public final boolean A0A() {
        C1E4 c1e4;
        C01U c01u = this.A01;
        if (c01u == null || (c1e4 = (C1E4) c01u.A0S()) == null) {
            return false;
        }
        c1e4.run();
        return true;
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        AbstractC214112t.A00(i);
        return this;
    }
}
