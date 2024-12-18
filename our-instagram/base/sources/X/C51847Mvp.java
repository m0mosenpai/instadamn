package X;

import java.util.List;

/* renamed from: X.Mvp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51847Mvp extends C0T6 implements InterfaceC58255Prz {
    public final C51851Mvt A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51847Mvp) {
                C51847Mvp c51847Mvp = (C51847Mvp) obj;
                if (!C14360o3.A0K(this.A01, c51847Mvp.A01) || !C14360o3.A0K(this.A02, c51847Mvp.A02) || !C14360o3.A0K(this.A00, c51847Mvp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0O(this.A01) * 31));
    }

    public C51847Mvp(C51851Mvt c51851Mvt, String str, List list) {
        AbstractC167017dG.A1R(list, c51851Mvt);
        this.A01 = str;
        this.A02 = list;
        this.A00 = c51851Mvt;
    }
}
