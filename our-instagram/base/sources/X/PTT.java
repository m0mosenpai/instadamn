package X;

/* loaded from: classes9.dex */
public final class PTT implements Runnable {
    public final /* synthetic */ C9J0 A00;
    public final /* synthetic */ JXC A01;
    public final /* synthetic */ AbstractC51356MmH A02;
    public final /* synthetic */ AbstractC51174MjI A03;

    public PTT(C9J0 c9j0, JXC jxc, AbstractC51356MmH abstractC51356MmH, AbstractC51174MjI abstractC51174MjI) {
        this.A02 = abstractC51356MmH;
        this.A00 = c9j0;
        this.A01 = jxc;
        this.A03 = abstractC51174MjI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC51356MmH abstractC51356MmH = this.A02;
        if (C14360o3.A0K(abstractC51356MmH.A00, this.A00)) {
            abstractC51356MmH.A02 = this.A01;
            AbstractC51174MjI.A02(abstractC51356MmH, this.A03);
        }
    }
}
