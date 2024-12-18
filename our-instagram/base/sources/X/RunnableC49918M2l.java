package X;

/* renamed from: X.M2l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49918M2l implements Runnable {
    public final /* synthetic */ SWY A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC49918M2l(SWY swy, Runnable runnable) {
        this.A00 = swy;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SWY.A03.execute(this.A01);
    }
}
