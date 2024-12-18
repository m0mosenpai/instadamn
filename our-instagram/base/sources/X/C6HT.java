package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.6HT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HT extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final RepostRestrictedReason A04;
    public final C132175xv A05;
    public final C26036BfP A06;
    public final C132275y6 A07;
    public final String A08;
    public final C5Hc A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HT) {
                C6HT c6ht = (C6HT) obj;
                if (!C14360o3.A0K(this.A05, c6ht.A05) || !C14360o3.A0K(this.A06, c6ht.A06) || this.A00 != c6ht.A00 || this.A01 != c6ht.A01 || this.A02 != c6ht.A02 || this.A03 != c6ht.A03 || this.A0H != c6ht.A0H || this.A0I != c6ht.A0I || this.A0F != c6ht.A0F || this.A0C != c6ht.A0C || this.A0A != c6ht.A0A || this.A0D != c6ht.A0D || this.A0B != c6ht.A0B || this.A0M != c6ht.A0M || this.A0L != c6ht.A0L || !C14360o3.A0K(this.A08, c6ht.A08) || !C14360o3.A0K(this.A07, c6ht.A07) || this.A04 != c6ht.A04 || !C14360o3.A0K(this.A09, c6ht.A09) || this.A0G != c6ht.A0G || this.A0J != c6ht.A0J || this.A0E != c6ht.A0E || this.A0K != c6ht.A0K) {
                }
            }
            return false;
        }
        return true;
    }

    public C6HT(RepostRestrictedReason repostRestrictedReason, C132175xv c132175xv, C26036BfP c26036BfP, C132275y6 c132275y6, String str, C5Hc c5Hc, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14360o3.A0B(c5Hc, 19);
        this.A05 = c132175xv;
        this.A06 = c26036BfP;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A0H = z;
        this.A0I = z2;
        this.A0F = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0D = z6;
        this.A0B = z7;
        this.A0M = z8;
        this.A0L = z9;
        this.A08 = str;
        this.A07 = c132275y6;
        this.A04 = repostRestrictedReason;
        this.A09 = c5Hc;
        this.A0G = z10;
        this.A0J = z11;
        this.A0E = z12;
        this.A0K = z13;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "dense_ufi", this.A05.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        int i = 1237;
        if (this.A0H) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A0I) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0F) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0C) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0D) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0B) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0M) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0L) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        String str = this.A08;
        int i19 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i20 = (i18 + hashCode) * 31;
        C132275y6 c132275y6 = this.A07;
        if (c132275y6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c132275y6.hashCode();
        }
        int i21 = (i20 + hashCode2) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A04;
        if (repostRestrictedReason != null) {
            i19 = repostRestrictedReason.hashCode();
        }
        int hashCode4 = (((i21 + i19) * 31) + this.A09.hashCode()) * 31;
        int i22 = 1237;
        if (this.A0G) {
            i22 = 1231;
        }
        int i23 = (hashCode4 + i22) * 31;
        int i24 = 1237;
        if (this.A0J) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        int i26 = 1237;
        if (this.A0E) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0K) {
            i28 = 1231;
        }
        return i27 + i28;
    }
}
