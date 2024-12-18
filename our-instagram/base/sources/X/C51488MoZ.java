package X;

/* renamed from: X.MoZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51488MoZ extends AbstractC53425NkE {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51488MoZ) {
                C51488MoZ c51488MoZ = (C51488MoZ) obj;
                if (!C14360o3.A0K(this.A01, c51488MoZ.A01) || !C14360o3.A0K(this.A00, c51488MoZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51488MoZ(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
