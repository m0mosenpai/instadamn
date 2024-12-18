package X;

/* renamed from: X.AyR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24805AyR implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144386fK A02;

    public RunnableC24805AyR(C41181vS c41181vS, C84823qW c84823qW, C144386fK c144386fK) {
        this.A02 = c144386fK;
        this.A00 = c41181vS;
        this.A01 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144386fK c144386fK = this.A02;
        C41181vS c41181vS = this.A00;
        C84823qW c84823qW = this.A01;
        boolean CdW = c41181vS.CdW();
        InterfaceC09390do interfaceC09390do = c144386fK.A04;
        if (CdW) {
            C138436Oz.A02(AbstractC166987dD.A0d(interfaceC09390do), (AbstractC166987dD.A07(AbstractC124845kp.A01(AbstractC166987dD.A0d(interfaceC09390do))) * 0.5f) - (AbstractC166987dD.A07(AbstractC166987dD.A0d(interfaceC09390do)) * 0.5f), (r4.getHeight() - AbstractC166987dD.A0d(interfaceC09390do).getHeight()) - AbstractC167017dG.A03(c144386fK.A01), true);
        } else {
            AbstractC167017dG.A17(AbstractC166987dD.A0d(interfaceC09390do), c41181vS, c84823qW, c144386fK.A02.getWidth(), AbstractC124845kp.A01(AbstractC166987dD.A0d(interfaceC09390do)).getHeight());
        }
    }
}
