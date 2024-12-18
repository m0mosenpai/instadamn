package X;

import java.util.List;

/* renamed from: X.H4p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38749H4p extends C0T6 implements JJW {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    @Override // X.JJW
    public final C38749H4p Eyj(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38749H4p) {
                C38749H4p c38749H4p = (C38749H4p) obj;
                if (!C14360o3.A0K(this.A04, c38749H4p.A04) || !C14360o3.A0K(this.A05, c38749H4p.A05) || this.A00 != c38749H4p.A00 || !C14360o3.A0K(this.A01, c38749H4p.A01) || !C14360o3.A0K(this.A02, c38749H4p.A02) || !C14360o3.A0K(this.A03, c38749H4p.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, (AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A04)) + this.A00) * 31)));
    }

    public C38749H4p(String str, String str2, String str3, List list, List list2, int i) {
        AbstractC25234BEr.A1P(list, list2, str);
        AbstractC167017dG.A1T(str2, str3);
        this.A04 = list;
        this.A05 = list2;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.JJW
    public final JJW E9h(C1DY c1dy) {
        return this;
    }
}
