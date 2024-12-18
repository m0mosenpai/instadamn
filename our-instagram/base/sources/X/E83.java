package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E83 extends C0T6 implements Gb2 {
    public final List A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E83) {
                E83 e83 = (E83) obj;
                if (!C14360o3.A0K(this.A00, e83.A00) || this.A01 != e83.A01 || !C14360o3.A0K(this.A02, e83.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (AbstractC166987dD.A0G(this.A00) + this.A01) * 31);
    }

    public E83(List list, List list2, int i) {
        AbstractC167017dG.A1Q(list, list2);
        this.A00 = list;
        this.A01 = i;
        this.A02 = list2;
    }
}
