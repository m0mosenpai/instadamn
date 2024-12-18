package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JUM extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public JUM(String str) {
        this((C8r2) null, (C52435NIf) null, EnumC50657MXx.A05, str, AbstractC166987dD.A1E(), AbstractC166987dD.A1E(), AbstractC166987dD.A1E());
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof JUM) {
                    JUM jum = (JUM) obj;
                    if (jum.A00 != 1 || !C14360o3.A0K(this.A07, jum.A07) || this.A01 != jum.A01 || !C14360o3.A0K(this.A03, jum.A03) || !C14360o3.A0K(this.A06, jum.A06) || !C14360o3.A0K(this.A05, jum.A05) || !C14360o3.A0K(this.A02, jum.A02) || !C14360o3.A0K(this.A04, jum.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof JUM)) {
                return false;
            }
            JUM jum2 = (JUM) obj;
            if (jum2.A00 != 0 || !C14360o3.A0K(this.A01, jum2.A01) || !C14360o3.A0K(this.A03, jum2.A03) || !C14360o3.A0K(this.A02, jum2.A02) || !C14360o3.A0K(this.A07, jum2.A07) || !C14360o3.A0K(this.A06, jum2.A06) || !C14360o3.A0K(this.A05, jum2.A05) || this.A04 != jum2.A04) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0J(this.A06, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A07)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31));
        }
        return ((AbstractC166997dE.A0J(this.A06, (((((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public JUM(C9BW c9bw, AbstractC46437Kgx abstractC46437Kgx, AbstractC46494Kht abstractC46494Kht, AbstractC46438Kgy abstractC46438Kgy, AbstractC46439Kgz abstractC46439Kgz, EnumC1569072t enumC1569072t, String str) {
        this.A01 = abstractC46437Kgx;
        this.A03 = abstractC46438Kgy;
        this.A02 = abstractC46494Kht;
        this.A07 = str;
        this.A06 = abstractC46439Kgz;
        this.A05 = c9bw;
        this.A04 = enumC1569072t;
    }

    public JUM(C8r2 c8r2, C52435NIf c52435NIf, EnumC50657MXx enumC50657MXx, String str, List list, List list2, List list3) {
        C14360o3.A0B(str, 1);
        AbstractC43594JPz.A1P(enumC50657MXx, list);
        AbstractC167017dG.A1U(list2, list3);
        this.A07 = str;
        this.A01 = enumC50657MXx;
        this.A03 = c52435NIf;
        this.A06 = list;
        this.A05 = c8r2;
        this.A02 = list2;
        this.A04 = list3;
    }
}
