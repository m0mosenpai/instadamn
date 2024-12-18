package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6G extends C0T6 {
    public final EnumC33437Eq8 A00;
    public final String A01;
    public final List A02;

    public E6G(EnumC33437Eq8 enumC33437Eq8, String str, List list) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = enumC33437Eq8;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6G) {
                E6G e6g = (E6G) obj;
                if (!C14360o3.A0K(this.A01, e6g.A01) || this.A00 != e6g.A00 || !C14360o3.A0K(this.A02, e6g.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
