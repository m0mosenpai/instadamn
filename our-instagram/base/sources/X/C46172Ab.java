package X;

/* renamed from: X.2Ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46172Ab {
    public int A00;
    public long A01;
    public final C1HT A02 = new C1HT(32);
    public final C46192Ad A03;
    public final C46192Ad A04;
    public final C46192Ad A05;
    public final /* synthetic */ C2AZ A06;

    public final synchronized void A00() {
        this.A00 = 0;
        this.A02.A02();
        C46192Ad c46192Ad = this.A03;
        c46192Ad.A01 = 0;
        c46192Ad.A00 = 0;
        C46192Ad c46192Ad2 = this.A04;
        c46192Ad2.A01 = 0;
        c46192Ad2.A00 = 0;
        C46192Ad c46192Ad3 = this.A05;
        c46192Ad3.A01 = 0;
        c46192Ad3.A00 = 0;
    }

    public C46172Ab(C2AZ c2az) {
        this.A06 = c2az;
        this.A03 = new C46192Ad(c2az);
        this.A04 = new C46192Ad(c2az);
        this.A05 = new C46192Ad(c2az);
    }
}
