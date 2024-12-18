package X;

/* renamed from: X.GQf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36962GQf implements Runnable {
    public boolean A00;
    public boolean A01;
    public final C166057bY A02;
    public final C1ON A03;
    public final String A04;

    public RunnableC36962GQf(C166057bY c166057bY, C1ON c1on, String str) {
        C14360o3.A0B(c166057bY, 2);
        this.A02 = c166057bY;
        this.A04 = str;
        this.A03 = c1on;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A01) {
            this.A01 = true;
            this.A02.A04(this.A04, false);
            C1GJ.A03(this.A03);
        }
    }
}
