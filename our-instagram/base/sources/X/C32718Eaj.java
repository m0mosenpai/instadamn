package X;

import java.util.List;

/* renamed from: X.Eaj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32718Eaj extends AbstractC33532Es6 {
    public final int A00;
    public final int A01;
    public final C5QE A02;
    public final C5QE A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C32718Eaj(C5QE c5qe, C5QE c5qe2, Integer num, String str, String str2, List list, int i, int i2) {
        C14360o3.A0B(num, 1);
        this.A04 = num;
        this.A03 = c5qe;
        this.A02 = c5qe2;
        this.A06 = str;
        this.A00 = i;
        this.A07 = list;
        this.A01 = i2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32718Eaj) {
                C32718Eaj c32718Eaj = (C32718Eaj) obj;
                if (this.A04 != c32718Eaj.A04 || !C14360o3.A0K(this.A03, c32718Eaj.A03) || !C14360o3.A0K(this.A02, c32718Eaj.A02) || !C14360o3.A0K(this.A06, c32718Eaj.A06) || this.A00 != c32718Eaj.A00 || !C14360o3.A0K(this.A07, c32718Eaj.A07) || this.A01 != c32718Eaj.A01 || !C14360o3.A0K(this.A05, c32718Eaj.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, F2B.A00(this.A04) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + this.A01) * 31) + AbstractC25227BEk.A07(this.A05);
    }
}
