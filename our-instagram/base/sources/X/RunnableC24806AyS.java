package X;

/* renamed from: X.AyS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24806AyS implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144406fM A02;

    public RunnableC24806AyS(C41181vS c41181vS, C84823qW c84823qW, C144406fM c144406fM) {
        this.A02 = c144406fM;
        this.A00 = c41181vS;
        this.A01 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144406fM c144406fM = this.A02;
        C41181vS c41181vS = this.A00;
        C84823qW c84823qW = this.A01;
        InterfaceC09390do interfaceC09390do = c144406fM.A03;
        AbstractC167017dG.A17(AbstractC166987dD.A0d(interfaceC09390do), c41181vS, c84823qW, c144406fM.A01.getWidth(), AbstractC124845kp.A01(AbstractC166987dD.A0d(interfaceC09390do)).getHeight());
    }
}
