package X;

/* renamed from: X.AxD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24729AxD implements Runnable {
    public final /* synthetic */ C203858zu A00;
    public final /* synthetic */ BCV A01;
    public final /* synthetic */ String A02;

    public RunnableC24729AxD(C203858zu c203858zu, BCV bcv, String str) {
        this.A00 = c203858zu;
        this.A02 = str;
        this.A01 = bcv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A02.DDs(this.A01, this.A02);
    }
}
