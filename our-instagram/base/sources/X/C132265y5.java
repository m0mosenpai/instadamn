package X;

/* renamed from: X.5y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132265y5 extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final InterfaceC99414dE A02;
    public final C132175xv A03;
    public final C26036BfP A04;
    public final EnumC132255y4 A05;
    public final C132275y6 A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132265y5) {
                C132265y5 c132265y5 = (C132265y5) obj;
                if (!C14360o3.A0K(this.A03, c132265y5.A03) || !C14360o3.A0K(this.A04, c132265y5.A04) || this.A00 != c132265y5.A00 || !C14360o3.A0K(this.A07, c132265y5.A07) || this.A0A != c132265y5.A0A || this.A01 != c132265y5.A01 || this.A05 != c132265y5.A05 || !C14360o3.A0K(this.A06, c132265y5.A06) || !C14360o3.A0K(this.A02, c132265y5.A02) || this.A0C != c132265y5.A0C || this.A0B != c132265y5.A0B || this.A0D != c132265y5.A0D || this.A08 != c132265y5.A08 || this.A09 != c132265y5.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "text", this.A03.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int hashCode3 = (((((hashCode2 + i) * 31) + this.A01) * 31) + this.A05.hashCode()) * 31;
        C132275y6 c132275y6 = this.A06;
        int i2 = 0;
        if (c132275y6 == null) {
            hashCode = 0;
        } else {
            hashCode = c132275y6.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        InterfaceC99414dE interfaceC99414dE = this.A02;
        if (interfaceC99414dE != null) {
            i2 = interfaceC99414dE.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        int i5 = 1237;
        if (this.A0C) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0D) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A09) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    public C132265y5(InterfaceC99414dE interfaceC99414dE, C132175xv c132175xv, C26036BfP c26036BfP, EnumC132255y4 enumC132255y4, C132275y6 c132275y6, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = c132175xv;
        this.A04 = c26036BfP;
        this.A00 = i;
        this.A07 = str;
        this.A0A = z;
        this.A01 = i2;
        this.A05 = enumC132255y4;
        this.A06 = c132275y6;
        this.A02 = interfaceC99414dE;
        this.A0C = z2;
        this.A0B = z3;
        this.A0D = z4;
        this.A08 = z5;
        this.A09 = z6;
    }
}
