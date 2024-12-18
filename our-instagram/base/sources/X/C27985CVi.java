package X;

/* renamed from: X.CVi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27985CVi {
    public final Integer A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27985CVi) {
                C27985CVi c27985CVi = (C27985CVi) obj;
                if (!C14360o3.A0K(this.A01, c27985CVi.A01) || !C14360o3.A0K(this.A02, c27985CVi.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + 64218586) * 31) + 1231;
    }

    public C27985CVi(String str, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = interfaceC16820sZ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SearchOverlayNavigationBarModel(title=");
        A1C.append(this.A01);
        A1C.append(", action=");
        A1C.append("CLOSE");
        A1C.append(", onActionClick=");
        A1C.append(this.A02);
        A1C.append(", enableSearchEndActionAddOn=");
        return AbstractC25236BEt.A0a(A1C, true);
    }
}
