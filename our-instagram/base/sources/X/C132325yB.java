package X;

/* renamed from: X.5yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132325yB extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final C132175xv A02;
    public final C26036BfP A03;
    public final InterfaceC132315yA A04;
    public final C132275y6 A05;
    public final C5Hc A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132325yB) {
                C132325yB c132325yB = (C132325yB) obj;
                if (!C14360o3.A0K(this.A02, c132325yB.A02) || !C14360o3.A0K(this.A03, c132325yB.A03) || this.A00 != c132325yB.A00 || this.A0B != c132325yB.A0B || this.A01 != c132325yB.A01 || this.A0C != c132325yB.A0C || this.A08 != c132325yB.A08 || !C14360o3.A0K(this.A06, c132325yB.A06) || this.A07 != c132325yB.A07 || this.A09 != c132325yB.A09 || this.A0E != c132325yB.A0E || this.A0D != c132325yB.A0D || !C14360o3.A0K(this.A05, c132325yB.A05) || !C14360o3.A0K(this.A04, c132325yB.A04) || this.A0A != c132325yB.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "collapsedchildcontent", this.A02.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (((hashCode2 + i) * 31) + this.A01) * 31;
        int i3 = 1237;
        if (this.A0C) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int hashCode3 = (((i4 + i5) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (hashCode3 + i6) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0E) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0D) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        C132275y6 c132275y6 = this.A05;
        int i14 = 0;
        if (c132275y6 == null) {
            hashCode = 0;
        } else {
            hashCode = c132275y6.hashCode();
        }
        int i15 = (i13 + hashCode) * 31;
        InterfaceC132315yA interfaceC132315yA = this.A04;
        if (interfaceC132315yA != null) {
            i14 = interfaceC132315yA.hashCode();
        }
        int i16 = (i15 + i14) * 31;
        int i17 = 1237;
        if (this.A0A) {
            i17 = 1231;
        }
        return i16 + i17;
    }

    public C132325yB(C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132315yA interfaceC132315yA, C132275y6 c132275y6, C5Hc c5Hc, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A02 = c132175xv;
        this.A03 = c26036BfP;
        this.A00 = i;
        this.A0B = z;
        this.A01 = i2;
        this.A0C = z2;
        this.A08 = z3;
        this.A06 = c5Hc;
        this.A07 = z4;
        this.A09 = z5;
        this.A0E = z6;
        this.A0D = z7;
        this.A05 = c132275y6;
        this.A04 = interfaceC132315yA;
        this.A0A = z8;
    }
}
