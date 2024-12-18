package X;

import java.util.List;

/* renamed from: X.7AM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AM extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C206299Bm A04;
    public final C7AL A05;
    public final C7AJ A06;
    public final C7AI A07;
    public final List A08;
    public final boolean A09;
    public final int A0A;
    public final int A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7AM) {
                C7AM c7am = (C7AM) obj;
                if (!C14360o3.A0K(this.A07, c7am.A07) || !C14360o3.A0K(this.A04, c7am.A04) || !C14360o3.A0K(this.A06, c7am.A06) || !C14360o3.A0K(this.A05, c7am.A05) || !C14360o3.A0K(this.A08, c7am.A08) || this.A00 != c7am.A00 || this.A0B != c7am.A0B || this.A0A != c7am.A0A || this.A01 != c7am.A01 || this.A02 != c7am.A02 || this.A03 != c7am.A03 || this.A09 != c7am.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        C206299Bm c206299Bm = this.A04;
        int i = 0;
        if (c206299Bm == null) {
            hashCode = 0;
        } else {
            hashCode = c206299Bm.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A06.hashCode()) * 31;
        C7AL c7al = this.A05;
        if (c7al != null) {
            i = c7al.hashCode();
        }
        int hashCode4 = (((((((((((((((hashCode3 + i) * 31) + this.A08.hashCode()) * 31) + this.A00) * 31) + this.A0B) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        return hashCode4 + i2;
    }

    public C7AM(C206299Bm c206299Bm, C7AL c7al, C7AJ c7aj, C7AI c7ai, List list, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A07 = c7ai;
        this.A04 = c206299Bm;
        this.A06 = c7aj;
        this.A05 = c7al;
        this.A08 = list;
        this.A00 = i;
        this.A0B = i2;
        this.A0A = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A09 = z;
    }
}
