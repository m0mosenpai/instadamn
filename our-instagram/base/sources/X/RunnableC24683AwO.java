package X;

/* renamed from: X.AwO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24683AwO implements Runnable {
    public final /* synthetic */ C164477Xm A00;
    public final /* synthetic */ C7DC A01;

    public RunnableC24683AwO(C164477Xm c164477Xm, C7DC c7dc) {
        this.A00 = c164477Xm;
        this.A01 = c7dc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C164477Xm c164477Xm = this.A00;
        c164477Xm.A01.A0J(this.A01);
        c164477Xm.A04.run();
        c164477Xm.A05.run();
    }
}
