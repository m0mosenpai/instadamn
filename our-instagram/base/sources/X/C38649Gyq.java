package X;

import java.util.List;

/* renamed from: X.Gyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38649Gyq extends C0T6 {
    public String A05 = null;
    public Integer A03 = null;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public List A09 = null;
    public List A0A = null;
    public List A08 = null;
    public String A07 = null;
    public String A06 = null;
    public Integer A02 = null;
    public Integer A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38649Gyq) {
                C38649Gyq c38649Gyq = (C38649Gyq) obj;
                if (!C14360o3.A0K(this.A05, c38649Gyq.A05) || this.A03 != c38649Gyq.A03 || !C14360o3.A0K(this.A00, c38649Gyq.A00) || !C14360o3.A0K(this.A01, c38649Gyq.A01) || !C14360o3.A0K(this.A09, c38649Gyq.A09) || !C14360o3.A0K(this.A0A, c38649Gyq.A0A) || !C14360o3.A0K(this.A08, c38649Gyq.A08) || !C14360o3.A0K(this.A07, c38649Gyq.A07) || !C14360o3.A0K(this.A06, c38649Gyq.A06) || !C14360o3.A0K(this.A02, c38649Gyq.A02) || !C14360o3.A0K(this.A04, c38649Gyq.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A0O = AbstractC167017dG.A0O(this.A05) * 31;
        Integer num = this.A03;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, I9M.A00(num));
        }
        return ((((((((((((((((((A0O + A0C) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }
}
