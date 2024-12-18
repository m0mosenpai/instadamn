package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K9E extends AbstractC46370Kfs {
    public final C45127Jxw A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K9E) {
                K9E k9e = (K9E) obj;
                if (!C14360o3.A0K(this.A03, k9e.A03) || !C14360o3.A0K(this.A02, k9e.A02) || !C14360o3.A0K(this.A00, k9e.A00) || this.A01 != k9e.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A01);
    }

    public K9E(C45127Jxw c45127Jxw, Integer num, String str, List list) {
        AbstractC43594JPz.A1P(str, num);
        this.A03 = list;
        this.A02 = str;
        this.A00 = c45127Jxw;
        this.A01 = num;
    }
}
