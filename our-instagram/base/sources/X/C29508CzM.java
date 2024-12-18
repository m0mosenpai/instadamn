package X;

import java.util.List;

/* renamed from: X.CzM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29508CzM implements InterfaceC30845DhK {
    public final List A00;
    public final List A01;

    public C29508CzM(List list, List list2) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29508CzM) {
                C29508CzM c29508CzM = (C29508CzM) obj;
                if (!C14360o3.A0K(this.A01, c29508CzM.A01) || !C14360o3.A0K(this.A00, c29508CzM.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Success(suggestions=");
        A1C.append(this.A01);
        A1C.append(", spotlightItems=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
