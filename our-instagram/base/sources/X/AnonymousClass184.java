package X;

/* renamed from: X.184, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass184 extends C16Q {
    public C5F1 A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public AnonymousClass184 A04;
    public final AnonymousClass184 A05;

    @Override // X.C16Q
    public final /* bridge */ /* synthetic */ C16Q A00() {
        return this.A05;
    }

    @Override // X.C16Q
    public final Object A01() {
        return this.A01;
    }

    @Override // X.C16Q
    public final String A03() {
        return this.A02;
    }

    @Override // X.C16Q
    public final void A04(Object obj) {
        this.A01 = obj;
    }

    public final int A05() {
        int i = super.A01;
        if (i == 2) {
            if (!this.A03) {
                return 5;
            }
            this.A03 = false;
            super.A00++;
            return 2;
        }
        int i2 = super.A00;
        if (i == 1) {
            super.A00 = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        }
        int i3 = i2 + 1;
        super.A00 = i3;
        if (i3 == 0) {
            return 0;
        }
        return 3;
    }

    public final int A06(String str) {
        AnonymousClass182 anonymousClass182;
        if (super.A01 == 2 && !this.A03) {
            this.A03 = true;
            this.A02 = str;
            C5F1 c5f1 = this.A00;
            if (c5f1 != null && c5f1.A00(str)) {
                Object obj = c5f1.A03;
                String A0g = AnonymousClass001.A0g("Duplicate field '", str, "'");
                if (obj instanceof AnonymousClass182) {
                    anonymousClass182 = (AnonymousClass182) obj;
                } else {
                    anonymousClass182 = null;
                }
                throw new C60567R8h(anonymousClass182, A0g);
            }
            if (super.A00 >= 0) {
                return 1;
            }
            return 0;
        }
        return 4;
    }

    public final AnonymousClass184 A07() {
        C5F1 c5f1;
        AnonymousClass184 anonymousClass184 = this.A04;
        if (anonymousClass184 == null) {
            C5F1 c5f12 = this.A00;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            AnonymousClass184 anonymousClass1842 = new AnonymousClass184(c5f1, this, 1);
            this.A04 = anonymousClass1842;
            return anonymousClass1842;
        }
        ((C16Q) anonymousClass184).A01 = 1;
        ((C16Q) anonymousClass184).A00 = -1;
        anonymousClass184.A02 = null;
        anonymousClass184.A03 = false;
        anonymousClass184.A01 = null;
        C5F1 c5f13 = anonymousClass184.A00;
        if (c5f13 == null) {
            return anonymousClass184;
        }
        c5f13.A00 = null;
        c5f13.A01 = null;
        c5f13.A02 = null;
        return anonymousClass184;
    }

    public final AnonymousClass184 A08() {
        C5F1 c5f1;
        AnonymousClass184 anonymousClass184 = this.A04;
        if (anonymousClass184 == null) {
            C5F1 c5f12 = this.A00;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            AnonymousClass184 anonymousClass1842 = new AnonymousClass184(c5f1, this, 2);
            this.A04 = anonymousClass1842;
            return anonymousClass1842;
        }
        ((C16Q) anonymousClass184).A01 = 2;
        ((C16Q) anonymousClass184).A00 = -1;
        anonymousClass184.A02 = null;
        anonymousClass184.A03 = false;
        anonymousClass184.A01 = null;
        C5F1 c5f13 = anonymousClass184.A00;
        if (c5f13 == null) {
            return anonymousClass184;
        }
        c5f13.A00 = null;
        c5f13.A01 = null;
        c5f13.A02 = null;
        return anonymousClass184;
    }

    public final AnonymousClass184 A09(Object obj) {
        C5F1 c5f1;
        AnonymousClass184 anonymousClass184 = this.A04;
        if (anonymousClass184 == null) {
            C5F1 c5f12 = this.A00;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            AnonymousClass184 anonymousClass1842 = new AnonymousClass184(c5f1, this, obj, 1);
            this.A04 = anonymousClass1842;
            return anonymousClass1842;
        }
        ((C16Q) anonymousClass184).A01 = 1;
        ((C16Q) anonymousClass184).A00 = -1;
        anonymousClass184.A02 = null;
        anonymousClass184.A03 = false;
        anonymousClass184.A01 = obj;
        C5F1 c5f13 = anonymousClass184.A00;
        if (c5f13 != null) {
            c5f13.A00 = null;
            c5f13.A01 = null;
            c5f13.A02 = null;
        }
        return anonymousClass184;
    }

    public final AnonymousClass184 A0A(Object obj) {
        C5F1 c5f1;
        AnonymousClass184 anonymousClass184 = this.A04;
        if (anonymousClass184 == null) {
            C5F1 c5f12 = this.A00;
            if (c5f12 == null) {
                c5f1 = null;
            } else {
                c5f1 = new C5F1(c5f12.A03);
            }
            AnonymousClass184 anonymousClass1842 = new AnonymousClass184(c5f1, this, obj, 2);
            this.A04 = anonymousClass1842;
            return anonymousClass1842;
        }
        ((C16Q) anonymousClass184).A01 = 2;
        ((C16Q) anonymousClass184).A00 = -1;
        anonymousClass184.A02 = null;
        anonymousClass184.A03 = false;
        anonymousClass184.A01 = obj;
        C5F1 c5f13 = anonymousClass184.A00;
        if (c5f13 != null) {
            c5f13.A00 = null;
            c5f13.A01 = null;
            c5f13.A02 = null;
        }
        return anonymousClass184;
    }

    public AnonymousClass184(C5F1 c5f1, AnonymousClass184 anonymousClass184, Object obj, int i) {
        super.A01 = i;
        this.A05 = anonymousClass184;
        this.A00 = c5f1;
        super.A00 = -1;
        this.A01 = obj;
    }

    public AnonymousClass184(C5F1 c5f1, AnonymousClass184 anonymousClass184, int i) {
        super.A01 = i;
        this.A05 = anonymousClass184;
        this.A00 = c5f1;
        super.A00 = -1;
    }
}
