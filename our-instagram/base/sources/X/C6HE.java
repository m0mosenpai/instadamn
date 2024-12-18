package X;

/* renamed from: X.6HE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HE extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final InterfaceC99414dE A02;
    public final C132175xv A03;
    public final C26036BfP A04;
    public final EnumC132255y4 A05;
    public final InterfaceC132185xw A06;
    public final C132275y6 A07;
    public final String A08;
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
            if (obj instanceof C6HE) {
                C6HE c6he = (C6HE) obj;
                if (!C14360o3.A0K(this.A03, c6he.A03) || !C14360o3.A0K(this.A04, c6he.A04) || this.A00 != c6he.A00 || this.A01 != c6he.A01 || !C14360o3.A0K(this.A08, c6he.A08) || this.A0A != c6he.A0A || this.A05 != c6he.A05 || !C14360o3.A0K(this.A07, c6he.A07) || !C14360o3.A0K(this.A02, c6he.A02) || !C14360o3.A0K(this.A06, c6he.A06) || this.A0B != c6he.A0B || this.A09 != c6he.A09 || this.A0C != c6he.A0C || this.A0D != c6he.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "compact_text_with_media", this.A03.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int hashCode5 = (((i2 + i3) * 31) + this.A05.hashCode()) * 31;
        C132275y6 c132275y6 = this.A07;
        if (c132275y6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c132275y6.hashCode();
        }
        int i4 = (hashCode5 + hashCode2) * 31;
        InterfaceC99414dE interfaceC99414dE = this.A02;
        if (interfaceC99414dE == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC99414dE.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        InterfaceC132185xw interfaceC132185xw = this.A06;
        if (interfaceC132185xw != null) {
            i = interfaceC132185xw.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A09) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0D) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    public C6HE(InterfaceC99414dE interfaceC99414dE, C132175xv c132175xv, C26036BfP c26036BfP, EnumC132255y4 enumC132255y4, InterfaceC132185xw interfaceC132185xw, C132275y6 c132275y6, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = c132175xv;
        this.A04 = c26036BfP;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A0A = z;
        this.A05 = enumC132255y4;
        this.A07 = c132275y6;
        this.A02 = interfaceC99414dE;
        this.A06 = interfaceC132185xw;
        this.A0B = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0D = z5;
    }
}
