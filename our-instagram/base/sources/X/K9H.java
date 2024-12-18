package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K9H extends AbstractC46370Kfs {
    public final C45127Jxw A00;
    public final C45116Jxl A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public K9H(C45127Jxw c45127Jxw, C45116Jxl c45116Jxl, Integer num, String str, String str2, String str3, List list) {
        AbstractC167027dH.A0a(1, list, str, str2, str3);
        C14360o3.A0B(num, 7);
        this.A06 = list;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = c45116Jxl;
        this.A00 = c45127Jxw;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K9H) {
                K9H k9h = (K9H) obj;
                if (!C14360o3.A0K(this.A06, k9h.A06) || !C14360o3.A0K(this.A04, k9h.A04) || !C14360o3.A0K(this.A05, k9h.A05) || !C14360o3.A0K(this.A03, k9h.A03) || !C14360o3.A0K(this.A01, k9h.A01) || !C14360o3.A0K(this.A00, k9h.A00) || this.A02 != k9h.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A06))))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A02);
    }
}
