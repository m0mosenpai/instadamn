package X;

/* renamed from: X.MwX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51889MwX extends C0T6 implements InterfaceC57856PlM {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51889MwX) {
                C51889MwX c51889MwX = (C51889MwX) obj;
                if (!C14360o3.A0K(this.A01, c51889MwX.A01) || !C14360o3.A0K(this.A02, c51889MwX.A02) || this.A00 != c51889MwX.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00;
    }

    public C51889MwX(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
