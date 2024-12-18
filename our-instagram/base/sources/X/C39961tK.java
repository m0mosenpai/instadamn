package X;

/* renamed from: X.1tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39961tK {
    public static C39961tK A0A;
    public static final Object A0B = new Object();
    public int A00;
    public int A01;
    public int A02;
    public C39961tK A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06;
    public final long[] A07;
    public final C0CA[] A08;
    public final C0CA[] A09;

    public final void A00() {
        for (int i = 0; i < this.A02; i++) {
            C0CA c0ca = this.A08[i];
            if (c0ca != null) {
                c0ca.A02();
                this.A07[i] = -3;
            }
        }
        for (int i2 = 0; i2 < this.A01; i2++) {
            C0CA c0ca2 = this.A09[i2];
            if (c0ca2 != null) {
                c0ca2.A02();
                this.A06[i2] = -3;
            }
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A00 = 0;
        this.A05 = false;
        this.A04 = false;
        synchronized (A0B) {
            C39961tK c39961tK = A0A;
            if (c39961tK == null || 15 > c39961tK.A00) {
                this.A03 = c39961tK;
                int i3 = 1;
                if (c39961tK != null) {
                    i3 = 1 + c39961tK.A00;
                }
                this.A00 = i3;
                A0A = this;
            }
        }
    }

    public C39961tK(int i) {
        if (i > 0) {
            this.A08 = new C0CA[i];
            this.A09 = new C0CA[i];
            this.A07 = new long[i];
            this.A06 = new long[i];
            this.A02 = 0;
            this.A01 = 0;
            this.A05 = false;
            this.A04 = false;
            this.A00 = 0;
            this.A03 = null;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Invalid batch Size of ", " was given.", i));
    }
}
