package X;

/* renamed from: X.MnB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51403MnB extends AbstractC53420Nk9 {
    public final Integer A00;
    public final String A01;

    public C51403MnB(String str, Integer num) {
        C14360o3.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51403MnB) {
                C51403MnB c51403MnB = (C51403MnB) obj;
                if (!C14360o3.A0K(this.A01, c51403MnB.A01) || this.A00 != c51403MnB.A00) {
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
