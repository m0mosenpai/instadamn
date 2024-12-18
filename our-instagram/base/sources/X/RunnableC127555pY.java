package X;

/* renamed from: X.5pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC127555pY implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C96184Ub A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ RunnableC127555pY(C96184Ub c96184Ub, String str, long j) {
        this.A01 = c96184Ub;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C96184Ub c96184Ub = this.A01;
        String str = this.A02;
        long j = this.A00;
        C95794Sn c95794Sn = ((C4TV) c96184Ub.A01).A05;
        c95794Sn.A0v.D9S(j, str, false);
        c95794Sn.A1A = str;
    }
}
