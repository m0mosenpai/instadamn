package X;

/* renamed from: X.3dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77353dL extends C0T6 implements InterfaceC76583c3 {
    public final C26085BgE A00;
    public final C76353bf A01;
    public final C9C1 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77353dL) {
                C77353dL c77353dL = (C77353dL) obj;
                if (!C14360o3.A0K(this.A00, c77353dL.A00) || !C14360o3.A0K(this.A01, c77353dL.A01) || !C14360o3.A0K(this.A02, c77353dL.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        C76353bf c76353bf = this.A01;
        int hashCode2 = (hashCode + (c76353bf == null ? 0 : c76353bf.hashCode())) * 31;
        C9C1 c9c1 = this.A02;
        return hashCode2 + (c9c1 != null ? c9c1.hashCode() : 0);
    }

    public C77353dL(C9C1 c9c1, C26085BgE c26085BgE, C76353bf c76353bf) {
        this.A00 = c26085BgE;
        this.A01 = c76353bf;
        this.A02 = c9c1;
    }
}
