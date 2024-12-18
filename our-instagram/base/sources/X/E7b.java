package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7b extends C0T6 implements InterfaceC37235Gak {
    public final Long A00;
    public final String A01;
    public final List A02;

    public E7b(Long l, String str, List list) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A01 = str;
        this.A00 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7b) {
                E7b e7b = (E7b) obj;
                if (!C14360o3.A0K(this.A02, e7b.A02) || !C14360o3.A0K(this.A01, e7b.A01) || !C14360o3.A0K(this.A00, e7b.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
