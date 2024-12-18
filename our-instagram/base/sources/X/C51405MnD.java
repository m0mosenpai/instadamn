package X;

/* renamed from: X.MnD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51405MnD extends AbstractC53420Nk9 {
    public final Integer A00;
    public final String A01;

    public C51405MnD(String str, Integer num) {
        C14360o3.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51405MnD) {
                C51405MnD c51405MnD = (C51405MnD) obj;
                if (!C14360o3.A0K(this.A01, c51405MnD.A01) || this.A00 != c51405MnD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166987dD.A0J(this.A01);
        Integer num = this.A00;
        return A0J + AbstractC25230BEn.A0C(num, AbstractC72879XqD.A01(num));
    }
}
