package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6K extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6K) {
                E6K e6k = (E6K) obj;
                if (!C14360o3.A0K(this.A00, e6k.A00) || !C14360o3.A0K(this.A03, e6k.A03) || !C14360o3.A0K(this.A01, e6k.A01) || this.A02 != e6k.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0O(this.A00) * 31)));
    }

    public E6K(String str, List list, List list2, boolean z) {
        AbstractC167017dG.A1R(list, list2);
        this.A00 = str;
        this.A03 = list;
        this.A01 = list2;
        this.A02 = z;
    }
}
