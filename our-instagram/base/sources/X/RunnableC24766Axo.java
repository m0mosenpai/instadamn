package X;

/* renamed from: X.Axo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24766Axo implements Runnable {
    public final /* synthetic */ C3OO A00;
    public final /* synthetic */ C180607zo A01;
    public final /* synthetic */ C5SU A02;

    public RunnableC24766Axo(C3OO c3oo, C180607zo c180607zo, C5SU c5su) {
        this.A02 = c5su;
        this.A00 = c3oo;
        this.A01 = c180607zo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = this.A02;
        c5su.A03(((C180677zv) this.A00).A04);
        c5su.A00().A07(this.A01.A01);
    }
}
