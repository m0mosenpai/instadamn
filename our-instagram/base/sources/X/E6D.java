package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6D extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public E6D(String str, List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = str;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6D) {
                E6D e6d = (E6D) obj;
                if (!C14360o3.A0K(this.A01, e6d.A01) || !C14360o3.A0K(this.A00, e6d.A00) || this.A02 != e6d.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A00)) * 31);
    }
}
