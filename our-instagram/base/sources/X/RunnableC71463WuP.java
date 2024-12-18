package X;

/* renamed from: X.WuP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71463WuP implements Runnable {
    public final /* synthetic */ C4V3 A00;
    public final /* synthetic */ C4XU A01;

    public RunnableC71463WuP(C4V3 c4v3, C4XU c4xu) {
        this.A01 = c4xu;
        this.A00 = c4v3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A00.A0U;
        C4XU c4xu = this.A01;
        if (z) {
            C4XU.A06(c4xu, false);
        } else {
            C4XU.A05(c4xu, false);
        }
    }
}
