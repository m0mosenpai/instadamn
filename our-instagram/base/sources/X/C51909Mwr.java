package X;

/* renamed from: X.Mwr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51909Mwr extends C0T6 implements InterfaceC57858PlO {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51909Mwr) {
                C51909Mwr c51909Mwr = (C51909Mwr) obj;
                if (this.A01 != c51909Mwr.A01 || !C14360o3.A0K(this.A00, c51909Mwr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0O(this.A00);
    }

    public C51909Mwr(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
