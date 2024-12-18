package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.JxV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45101JxV extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final RepostRestrictedReason A05;
    public final String A06;
    public final String A07;
    public final C5Hc A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45101JxV) {
                C45101JxV c45101JxV = (C45101JxV) obj;
                if (!C14360o3.A0K(this.A08, c45101JxV.A08) || this.A04 != c45101JxV.A04 || !C14360o3.A0K(this.A06, c45101JxV.A06) || this.A00 != c45101JxV.A00 || this.A01 != c45101JxV.A01 || this.A02 != c45101JxV.A02 || this.A03 != c45101JxV.A03 || this.A0D != c45101JxV.A0D || this.A0B != c45101JxV.A0B || this.A09 != c45101JxV.A09 || this.A0C != c45101JxV.A0C || this.A0A != c45101JxV.A0A || this.A0F != c45101JxV.A0F || this.A0E != c45101JxV.A0E || !C14360o3.A0K(this.A07, c45101JxV.A07) || this.A05 != c45101JxV.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0D, (((((((((((AbstractC166987dD.A0G(this.A08) + this.A04) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31))))))) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C45101JxV(RepostRestrictedReason repostRestrictedReason, String str, String str2, C5Hc c5Hc, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A08 = c5Hc;
        this.A04 = i;
        this.A06 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A0D = z;
        this.A0B = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A0E = z7;
        this.A07 = str2;
        this.A05 = repostRestrictedReason;
    }

    public C45101JxV() {
        this(null, null, null, C5HZ.A01, 0, 0, 0, 0, 0, false, false, false, false, false, false, false);
    }
}
