package X;

/* renamed from: X.5y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132285y7 extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final C26036BfP A01;
    public final InterfaceC132185xw A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final String A0A;

    public C132285y7(C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132185xw interfaceC132185xw, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(c26036BfP, 2);
        this.A00 = c132175xv;
        this.A01 = c26036BfP;
        this.A02 = interfaceC132185xw;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A03 = num;
        this.A0A = AbstractC132295y8.A01(this, "single_media", c132175xv.A03);
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132285y7) {
                C132285y7 c132285y7 = (C132285y7) obj;
                if (!C14360o3.A0K(this.A00, c132285y7.A00) || !C14360o3.A0K(this.A01, c132285y7.A01) || !C14360o3.A0K(this.A02, c132285y7.A02) || this.A05 != c132285y7.A05 || this.A07 != c132285y7.A07 || this.A06 != c132285y7.A06 || this.A04 != c132285y7.A04 || this.A08 != c132285y7.A08 || this.A09 != c132285y7.A09 || !C14360o3.A0K(this.A03, c132285y7.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A0A;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A04) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i12 + hashCode;
    }
}
