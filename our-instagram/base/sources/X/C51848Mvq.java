package X;

/* renamed from: X.Mvq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51848Mvq extends C0T6 implements JJA {
    public final C38321qM A00;
    public final Integer A01;

    public C51848Mvq(C38321qM c38321qM, Integer num) {
        C14360o3.A0B(c38321qM, 2);
        this.A01 = num;
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51848Mvq) {
                C51848Mvq c51848Mvq = (C51848Mvq) obj;
                if (!C14360o3.A0K(this.A01, c51848Mvq.A01) || !C14360o3.A0K(this.A00, c51848Mvq.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0M(this.A01) * 31);
    }
}
