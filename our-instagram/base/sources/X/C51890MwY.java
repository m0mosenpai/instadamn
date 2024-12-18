package X;

import java.util.List;

/* renamed from: X.MwY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51890MwY extends C0T6 implements InterfaceC57856PlM {
    public final List A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51890MwY) {
                C51890MwY c51890MwY = (C51890MwY) obj;
                if (this.A02 != c51890MwY.A02 || !C14360o3.A0K(this.A01, c51890MwY.A01) || !C14360o3.A0K(this.A00, c51890MwY.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC25225BEi.A08(this.A02)));
    }

    public C51890MwY(List list, List list2, boolean z) {
        AbstractC167017dG.A1R(list, list2);
        this.A02 = z;
        this.A01 = list;
        this.A00 = list2;
    }
}
