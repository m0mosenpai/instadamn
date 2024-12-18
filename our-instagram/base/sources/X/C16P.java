package X;

/* renamed from: X.16P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16P extends C16Q {
    public int A00;
    public int A01;
    public C5F1 A02;
    public Object A03;
    public String A04;
    public C16P A05;
    public final C16P A06;

    public final C16P A05(int i, int i2) {
        C5F1 c5f1;
        C16P c16p = this.A05;
        if (c16p == null) {
            C5F1 c5f12 = this.A02;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            C16P c16p2 = new C16P(c5f1, this, 1, i, i2);
            this.A05 = c16p2;
            return c16p2;
        }
        c16p.A07(1, i, i2);
        return c16p;
    }

    public final C16P A06(int i, int i2) {
        C5F1 c5f1;
        C16P c16p = this.A05;
        if (c16p == null) {
            C5F1 c5f12 = this.A02;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            C16P c16p2 = new C16P(c5f1, this, 2, i, i2);
            this.A05 = c16p2;
            return c16p2;
        }
        c16p.A07(2, i, i2);
        return c16p;
    }

    @Override // X.C16Q
    public final /* bridge */ /* synthetic */ C16Q A00() {
        return this.A06;
    }

    @Override // X.C16Q
    public final Object A01() {
        return this.A03;
    }

    @Override // X.C16Q
    public final String A03() {
        return this.A04;
    }

    @Override // X.C16Q
    public final void A04(Object obj) {
        this.A03 = obj;
    }

    public final void A07(int i, int i2, int i3) {
        super.A01 = i;
        super.A00 = -1;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = null;
        this.A03 = null;
        C5F1 c5f1 = this.A02;
        if (c5f1 != null) {
            c5f1.A00 = null;
            c5f1.A01 = null;
            c5f1.A02 = null;
        }
    }

    public final void A08(String str) {
        C16L c16l;
        this.A04 = str;
        C5F1 c5f1 = this.A02;
        if (c5f1 != null && c5f1.A00(str)) {
            Object obj = c5f1.A03;
            if (obj instanceof C16L) {
                c16l = (C16L) obj;
            } else {
                c16l = null;
            }
            throw new C90173zy(c16l, AnonymousClass001.A0g("Duplicate field '", str, "'"));
        }
    }

    public C16P(C5F1 c5f1, C16P c16p, int i, int i2, int i3) {
        this.A06 = c16p;
        this.A02 = c5f1;
        super.A01 = i;
        this.A01 = i2;
        this.A00 = i3;
        super.A00 = -1;
    }
}
