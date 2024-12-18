package X;

/* renamed from: X.DuB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC31583DuB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC10360h2 A01;
    public final /* synthetic */ C54802fd A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ RunnableC31583DuB(AbstractC10360h2 abstractC10360h2, C54802fd c54802fd, int i, boolean z) {
        this.A02 = c54802fd;
        this.A01 = abstractC10360h2;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54802fd.A04(this.A01, this.A02, this.A00, this.A03, false);
    }
}
