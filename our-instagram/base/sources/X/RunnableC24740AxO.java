package X;

/* renamed from: X.AxO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24740AxO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8f3 A01;
    public final /* synthetic */ Object A02;

    public RunnableC24740AxO(C8f3 c8f3, Object obj, int i) {
        this.A01 = c8f3;
        this.A02 = obj;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8f3.A02(this.A01, this.A02, this.A00);
    }
}
