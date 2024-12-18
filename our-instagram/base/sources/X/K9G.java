package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K9G extends AbstractC46370Kfs {
    public final C45127Jxw A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K9G) {
                K9G k9g = (K9G) obj;
                if (!C14360o3.A0K(this.A04, k9g.A04) || !C14360o3.A0K(this.A03, k9g.A03) || !C14360o3.A0K(this.A02, k9g.A02) || !C14360o3.A0K(this.A00, k9g.A00) || this.A01 != k9g.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A04))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A01);
    }

    public K9G(C45127Jxw c45127Jxw, Integer num, String str, String str2, List list) {
        AbstractC167027dH.A13(list, str, str2);
        C14360o3.A0B(num, 5);
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c45127Jxw;
        this.A01 = num;
    }
}
