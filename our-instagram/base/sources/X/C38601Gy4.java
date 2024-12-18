package X;

/* renamed from: X.Gy4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38601Gy4 extends C0T6 {
    public final C38321qM A00;
    public final Integer A01;

    public C38601Gy4(C38321qM c38321qM, Integer num) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38601Gy4) {
                C38601Gy4 c38601Gy4 = (C38601Gy4) obj;
                if (!C14360o3.A0K(this.A00, c38601Gy4.A00) || !C14360o3.A0K(this.A01, c38601Gy4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
