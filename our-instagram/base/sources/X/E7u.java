package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7u extends C0T6 implements InterfaceC37247Gaw {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7u) {
                E7u e7u = (E7u) obj;
                if (!C14360o3.A0K(this.A01, e7u.A01) || !C14360o3.A0K(this.A00, e7u.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public E7u(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
