package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E89 extends C0T6 implements InterfaceC37252Gb5 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E89) {
                E89 e89 = (E89) obj;
                if (!C14360o3.A0K(this.A00, e89.A00) || !C14360o3.A0K(this.A01, e89.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public E89(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
