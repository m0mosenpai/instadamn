package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class URX extends C0T6 implements InterfaceC50391MMt {
    public final int A00;
    public final C45125Jxu A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public URX(C45125Jxu c45125Jxu, String str, String str2, List list, int i) {
        C14360o3.A0B(list, 5);
        this.A00 = i;
        this.A01 = c45125Jxu;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URX) {
                URX urx = (URX) obj;
                if (this.A00 != urx.A00 || !C14360o3.A0K(this.A01, urx.A01) || !C14360o3.A0K(this.A03, urx.A03) || !C14360o3.A0K(this.A02, urx.A02) || !C14360o3.A0K(this.A04, urx.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A01, this.A00 * 31))) + this.A04.hashCode();
    }
}
