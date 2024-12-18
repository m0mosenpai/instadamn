package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7m extends C0T6 implements InterfaceC37242Gar {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7m) {
                E7m e7m = (E7m) obj;
                if (!C14360o3.A0K(this.A02, e7m.A02) || this.A00 != e7m.A00 || !C14360o3.A0K(this.A03, e7m.A03) || this.A01 != e7m.A01 || !C14360o3.A0K(this.A04, e7m.A04) || !C14360o3.A0K(this.A06, e7m.A06) || !C14360o3.A0K(this.A05, e7m.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, (AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0J(this.A02) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A06)) * 31);
    }

    public E7m(String str, String str2, String str3, List list, List list2, int i, int i2) {
        AbstractC167017dG.A1Q(str, str2);
        AbstractC167007dF.A1H(str3, 5, list2);
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = i2;
        this.A04 = str3;
        this.A06 = list;
        this.A05 = list2;
    }
}
