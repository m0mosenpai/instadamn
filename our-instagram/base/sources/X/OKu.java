package X;

/* loaded from: classes9.dex */
public abstract class OKu {
    public final C38321qM A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final float A04;

    public OKu(C38321qM c38321qM, String str, String str2) {
        C38321qM c38321qM2;
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        if (c38321qM.A5O()) {
            c38321qM2 = c38321qM.A1e(0);
            if (c38321qM2 == null) {
                throw AbstractC166997dE.A0g();
            }
        } else {
            c38321qM2 = c38321qM;
        }
        this.A00 = c38321qM2;
        this.A03 = c38321qM.Cff();
        this.A04 = 1.0f;
    }

    public final float A00() {
        if (this instanceof C52617NPm) {
            return 0.8f;
        }
        return this.A04;
    }

    public boolean A01() {
        return true;
    }
}
