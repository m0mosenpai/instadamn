package X;

/* renamed from: X.BiY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26208BiY extends C0T6 implements InterfaceC30824Dgz {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26208BiY) {
                C26208BiY c26208BiY = (C26208BiY) obj;
                if (this.A00 != c26208BiY.A00 || !C14360o3.A0K(this.A01, c26208BiY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public C26208BiY(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
