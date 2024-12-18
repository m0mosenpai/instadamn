package X;

/* loaded from: classes12.dex */
public final class Y11 {
    public static Y11 A05;
    public static final Object A06 = AbstractC58318PtA.A0b();
    public int A00;
    public int A01;
    public Y11 A02;
    public boolean A03;
    public final C0CA[] A04;

    public final void A00() {
        for (int i = 0; i < this.A01; i++) {
            C0CA c0ca = this.A04[i];
            if (c0ca != null) {
                c0ca.A02();
            }
        }
        this.A01 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A03 = false;
        synchronized (A06) {
            Y11 y11 = A05;
            if (y11 == null || 15 > y11.A00) {
                this.A02 = y11;
                int i2 = 1;
                if (y11 != null) {
                    i2 = 1 + y11.A00;
                }
                this.A00 = i2;
                A05 = this;
            }
        }
    }

    public Y11(int i) {
        if (i > 0) {
            this.A04 = new C0CA[i];
            this.A01 = 0;
            this.A03 = false;
            this.A00 = 0;
            this.A02 = null;
            return;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0c("Invalid batch Size of ", " was given.", i));
    }
}
