package X;

/* renamed from: X.AxI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24734AxI implements Runnable {
    public final /* synthetic */ C212409b9 A00;
    public final /* synthetic */ C22862A6i A01;
    public final /* synthetic */ C176137sW A02;

    public RunnableC24734AxI(C212409b9 c212409b9, C22862A6i c22862A6i, C176137sW c176137sW) {
        this.A02 = c176137sW;
        this.A01 = c22862A6i;
        this.A00 = c212409b9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1808580n.A03("onFirstDataWrittenToFileError");
        C22862A6i c22862A6i = this.A01;
        C212409b9 c212409b9 = this.A00;
        C176097sS c176097sS = c22862A6i.A01;
        c176097sS.A04(c212409b9);
        c176097sS.A06(c22862A6i.A00);
    }
}
