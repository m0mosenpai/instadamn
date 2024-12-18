package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K93 extends AbstractC46368Kfq {
    public final int A00;
    public final C51745MtU A01;
    public final C50627MWo A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K93) {
                K93 k93 = (K93) obj;
                if (!C14360o3.A0K(this.A03, k93.A03) || this.A00 != k93.A00 || !C14360o3.A0K(this.A04, k93.A04) || !C14360o3.A0K(this.A01, k93.A01) || !C14360o3.A0K(this.A02, k93.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A04, (AbstractC166987dD.A0J(this.A03) + this.A00) * 31)));
    }

    public K93(C51745MtU c51745MtU, C50627MWo c50627MWo, String str, List list, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A04 = list;
        this.A01 = c51745MtU;
        this.A02 = c50627MWo;
    }
}
