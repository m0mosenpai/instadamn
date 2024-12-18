package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7p extends C0T6 implements InterfaceC37244Gat {
    public final List A00;
    public final String A01;

    public E7p(List list, String str) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7p) {
                E7p e7p = (E7p) obj;
                if (!C14360o3.A0K(this.A00, e7p.A00) || !C14360o3.A0K(this.A01, e7p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
