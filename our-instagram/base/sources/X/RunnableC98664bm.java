package X;

/* renamed from: X.4bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC98664bm implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4U7 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ RunnableC98664bm(C4U7 c4u7, String str, long j) {
        this.A01 = c4u7;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4U7 c4u7 = this.A01;
        String str = this.A02;
        long j = this.A00;
        C95794Sn c95794Sn = ((C4TV) c4u7.A01).A05;
        c95794Sn.A0v.D9S(j, str, true);
        c95794Sn.A1B = str;
    }
}
