package X;

/* loaded from: classes5.dex */
public final class D2E implements Runnable {
    public final /* synthetic */ C9J0 A00;
    public final /* synthetic */ JXC A01;
    public final /* synthetic */ AbstractC51174MjI A02;

    public D2E(C9J0 c9j0, JXC jxc, AbstractC51174MjI abstractC51174MjI) {
        this.A02 = abstractC51174MjI;
        this.A00 = c9j0;
        this.A01 = jxc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC51174MjI.A00(this.A00, this.A01, this.A02);
    }
}
