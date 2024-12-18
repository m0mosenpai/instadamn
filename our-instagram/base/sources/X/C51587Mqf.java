package X;

/* renamed from: X.Mqf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51587Mqf extends C0T6 {
    public String A01 = "";
    public String A00 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51587Mqf) {
                C51587Mqf c51587Mqf = (C51587Mqf) obj;
                if (!C14360o3.A0K(this.A01, c51587Mqf.A01) || !C14360o3.A0K(this.A00, c51587Mqf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
