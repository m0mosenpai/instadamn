package X;

/* renamed from: X.MnC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51404MnC extends AbstractC53420Nk9 {
    public final Integer A00;
    public final String A01;

    public C51404MnC(String str, Integer num) {
        C14360o3.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51404MnC) {
                C51404MnC c51404MnC = (C51404MnC) obj;
                if (!C14360o3.A0K(this.A01, c51404MnC.A01) || this.A00 != c51404MnC.A00) {
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
