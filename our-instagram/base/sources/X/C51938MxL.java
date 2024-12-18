package X;

/* renamed from: X.MxL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51938MxL extends C0T6 implements InterfaceC57876Plg {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51938MxL) {
                C51938MxL c51938MxL = (C51938MxL) obj;
                if (!C14360o3.A0K(this.A01, c51938MxL.A01) || !C14360o3.A0K(this.A00, c51938MxL.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
    }

    public C51938MxL(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
