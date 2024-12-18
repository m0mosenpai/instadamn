package X;

/* renamed from: X.D0y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29571D0y implements Runnable {
    public final /* synthetic */ CU4 A00;

    public RunnableC29571D0y(CU4 cu4) {
        this.A00 = cu4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CU4 cu4 = this.A00;
        cu4.A03.invoke();
        cu4.A01.postDelayed(this, 200L);
    }
}
