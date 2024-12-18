package X;

/* renamed from: X.7ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170307ij extends C0T6 implements InterfaceC168577fr {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170307ij) {
                C170307ij c170307ij = (C170307ij) obj;
                if (this.A01 != c170307ij.A01 || !C14360o3.A0K(this.A00, c170307ij.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    public C170307ij(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
