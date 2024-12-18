package X;

/* renamed from: X.R8j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60569R8j extends C16Q {
    public String A00;
    public Object A01;
    public final TID A02;
    public final C16Q A03;

    @Override // X.C16Q
    public final C16Q A00() {
        return this.A03;
    }

    @Override // X.C16Q
    public final Object A01() {
        return this.A01;
    }

    @Override // X.C16Q
    public final String A03() {
        return this.A00;
    }

    public C60569R8j(C16Q c16q, C16D c16d) {
        TID tid;
        super.A01 = c16q.A01;
        super.A00 = c16q.A00;
        this.A03 = c16q.A00();
        this.A00 = c16q.A03();
        this.A01 = c16q.A01();
        if (c16q instanceof C16P) {
            C16P c16p = (C16P) c16q;
            tid = new TID(c16d, c16p.A01, c16p.A00, -1L, -1L);
        } else {
            tid = TID.A06;
        }
        this.A02 = tid;
    }

    @Override // X.C16Q
    public final void A04(Object obj) {
        this.A01 = obj;
    }

    public C60569R8j(C60569R8j c60569R8j, int i) {
        super.A01 = i;
        super.A00 = -1;
        this.A03 = c60569R8j;
        this.A02 = c60569R8j.A02;
    }

    public C60569R8j(TID tid, C16Q c16q) {
        super.A01 = c16q.A01;
        super.A00 = c16q.A00;
        this.A03 = c16q.A00();
        this.A00 = c16q.A03();
        this.A01 = c16q.A01();
        this.A02 = tid;
    }

    public C60569R8j() {
        super.A01 = 0;
        super.A00 = -1;
        this.A03 = null;
        this.A02 = TID.A06;
    }
}
