package X;

/* renamed from: X.YIs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73546YIs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CK A01;
    public final /* synthetic */ XP0 A02;
    public final /* synthetic */ C72127XOz A03;
    public final /* synthetic */ C72122XOt A04;
    public final /* synthetic */ XP9 A05;
    public final /* synthetic */ C6PU A06;
    public final /* synthetic */ Throwable A07;

    public RunnableC73546YIs(C9CK c9ck, XP0 xp0, C72127XOz c72127XOz, C72122XOt c72122XOt, XP9 xp9, C6PU c6pu, Throwable th, int i) {
        this.A02 = xp0;
        this.A04 = c72122XOt;
        this.A01 = c9ck;
        this.A06 = c6pu;
        this.A03 = c72127XOz;
        this.A00 = i;
        this.A05 = xp9;
        this.A07 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XP0 xp0 = this.A02;
        xp0.A00 = null;
        C72122XOt c72122XOt = this.A04;
        C9CK c9ck = this.A01;
        C6PU c6pu = this.A06;
        C72122XOt.A00(c9ck, xp0, this.A03, c72122XOt, this.A05, c6pu, this.A07, this.A00 + 1);
    }
}
