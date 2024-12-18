package X;

/* renamed from: X.YIt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73547YIt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CK A01;
    public final /* synthetic */ XP0 A02;
    public final /* synthetic */ XP9 A03;
    public final /* synthetic */ XP3 A04;
    public final /* synthetic */ C6PU A05;
    public final /* synthetic */ C6VU A06;
    public final /* synthetic */ Throwable A07;

    public RunnableC73547YIt(C9CK c9ck, XP0 xp0, XP9 xp9, XP3 xp3, C6PU c6pu, C6VU c6vu, Throwable th, int i) {
        this.A02 = xp0;
        this.A06 = c6vu;
        this.A01 = c9ck;
        this.A05 = c6pu;
        this.A04 = xp3;
        this.A00 = i;
        this.A03 = xp9;
        this.A07 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XP0 xp0 = this.A02;
        xp0.A00 = null;
        C6VU c6vu = this.A06;
        C9CK c9ck = this.A01;
        C6PU c6pu = this.A05;
        C6VU.A01(c9ck, xp0, this.A03, this.A04, c6pu, c6vu, this.A07, this.A00 + 1);
    }
}
