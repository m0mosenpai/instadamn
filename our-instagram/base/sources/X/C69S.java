package X;

/* renamed from: X.69S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69S extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final C26036BfP A01;
    public final Integer A02;
    public final C5Hc A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final String A08;

    public C69S(C132175xv c132175xv, C26036BfP c26036BfP, Integer num, C5Hc c5Hc, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(c26036BfP, 2);
        C14360o3.A0B(c5Hc, 3);
        this.A00 = c132175xv;
        this.A01 = c26036BfP;
        this.A03 = c5Hc;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A02 = num;
        this.A08 = AbstractC132295y8.A01(this, "carousel", c132175xv.A03);
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69S) {
                C69S c69s = (C69S) obj;
                if (!C14360o3.A0K(this.A00, c69s.A00) || !C14360o3.A0K(this.A01, c69s.A01) || !C14360o3.A0K(this.A03, c69s.A03) || this.A05 != c69s.A05 || this.A06 != c69s.A06 || this.A04 != c69s.A04 || this.A07 != c69s.A07 || !C14360o3.A0K(this.A02, c69s.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A08;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i8 + hashCode;
    }
}
