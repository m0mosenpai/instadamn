package X;

/* loaded from: classes7.dex */
public final class H3D extends C0T6 implements InterfaceC43465JId {
    public final C47I A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3D) {
                H3D h3d = (H3D) obj;
                if (!C14360o3.A0K(this.A01, h3d.A01) || !C14360o3.A0K(this.A00, h3d.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H3D(C47I c47i, String str) {
        this.A01 = str;
        this.A00 = c47i;
    }
}
