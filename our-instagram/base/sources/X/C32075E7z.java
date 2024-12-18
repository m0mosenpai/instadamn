package X;

/* renamed from: X.E7z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32075E7z extends C0T6 implements InterfaceC37250Gaz {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32075E7z) {
                C32075E7z c32075E7z = (C32075E7z) obj;
                if (this.A00 != c32075E7z.A00 || this.A01 != c32075E7z.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A00));
    }

    public C32075E7z(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
