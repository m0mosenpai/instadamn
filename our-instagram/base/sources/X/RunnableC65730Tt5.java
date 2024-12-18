package X;

/* renamed from: X.Tt5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65730Tt5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C65714Tsn A03;

    public RunnableC65730Tt5(C65714Tsn c65714Tsn, int i, long j, long j2) {
        this.A03 = c65714Tsn;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C65714Tsn c65714Tsn = this.A03;
        new RunnableC65729Tt4(c65714Tsn, this.A00).A00(c65714Tsn.A02);
    }
}
