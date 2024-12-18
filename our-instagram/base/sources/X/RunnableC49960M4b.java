package X;

/* renamed from: X.M4b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49960M4b implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC49960M4b(InterfaceC16660sJ interfaceC16660sJ, double d) {
        this.A00 = d;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(Double.valueOf(this.A00));
    }
}
