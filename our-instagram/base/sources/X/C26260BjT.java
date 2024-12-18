package X;

/* renamed from: X.BjT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26260BjT extends C0T6 implements InterfaceC30893Di6 {
    public final String A00;
    public final C26135BhM A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26260BjT) {
                C26260BjT c26260BjT = (C26260BjT) obj;
                if (!C14360o3.A0K(this.A01, c26260BjT.A01) || !C14360o3.A0K(this.A00, c26260BjT.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31;
    }

    public C26260BjT(C26135BhM c26135BhM, String str) {
        this.A01 = c26135BhM;
        this.A00 = str;
    }
}
