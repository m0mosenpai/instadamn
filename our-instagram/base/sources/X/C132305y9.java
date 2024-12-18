package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.5y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132305y9 extends C0T6 implements InterfaceC132245y2 {
    public final RepostRestrictedReason A00;
    public final C132175xv A01;
    public final C26036BfP A02;
    public final InterfaceC132315yA A03;
    public final C132275y6 A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C132305y9(RepostRestrictedReason repostRestrictedReason, C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132315yA interfaceC132315yA, C132275y6 c132275y6, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14360o3.A0B(c26036BfP, 2);
        this.A01 = c132175xv;
        this.A02 = c26036BfP;
        this.A0D = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A08 = z4;
        this.A06 = z5;
        this.A09 = z6;
        this.A07 = z7;
        this.A0G = z8;
        this.A05 = str;
        this.A0I = z9;
        this.A0H = z10;
        this.A04 = c132275y6;
        this.A03 = interfaceC132315yA;
        this.A00 = repostRestrictedReason;
        this.A0C = z11;
        this.A0F = z12;
        this.A0A = z13;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132305y9) {
                C132305y9 c132305y9 = (C132305y9) obj;
                if (!C14360o3.A0K(this.A01, c132305y9.A01) || !C14360o3.A0K(this.A02, c132305y9.A02) || this.A0D != c132305y9.A0D || this.A0E != c132305y9.A0E || this.A0B != c132305y9.A0B || this.A08 != c132305y9.A08 || this.A06 != c132305y9.A06 || this.A09 != c132305y9.A09 || this.A07 != c132305y9.A07 || this.A0G != c132305y9.A0G || !C14360o3.A0K(this.A05, c132305y9.A05) || this.A0I != c132305y9.A0I || this.A0H != c132305y9.A0H || !C14360o3.A0K(this.A04, c132305y9.A04) || !C14360o3.A0K(this.A03, c132305y9.A03) || this.A00 != c132305y9.A00 || this.A0C != c132305y9.A0C || this.A0F != c132305y9.A0F || this.A0A != c132305y9.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "ufi", this.A01.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode4 + i) * 31;
        int i3 = 1237;
        if (this.A0E) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0B) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A08) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A06) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A07) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0G) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        String str = this.A05;
        int i17 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i18 = (i16 + hashCode) * 31;
        int i19 = 1237;
        if (this.A0I) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0H) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        C132275y6 c132275y6 = this.A04;
        if (c132275y6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c132275y6.hashCode();
        }
        int i23 = (i22 + hashCode2) * 31;
        InterfaceC132315yA interfaceC132315yA = this.A03;
        if (interfaceC132315yA == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC132315yA.hashCode();
        }
        int i24 = (i23 + hashCode3) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A00;
        if (repostRestrictedReason != null) {
            i17 = repostRestrictedReason.hashCode();
        }
        int i25 = (i24 + i17) * 31;
        int i26 = 1237;
        if (this.A0C) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0F) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        int i30 = 1237;
        if (this.A0A) {
            i30 = 1231;
        }
        return i29 + i30;
    }
}
