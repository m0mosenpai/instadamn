package X;

/* loaded from: classes11.dex */
public final class V7v extends AbstractC154286wd {
    public final C69137ViS A00;
    public final /* synthetic */ C69413Vmx A01;

    public V7v(C69413Vmx c69413Vmx, C69137ViS c69137ViS) {
        this.A01 = c69413Vmx;
        this.A00 = c69137ViS;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-89215242);
        this.A00.A02.A05.DFf();
        C0f9.A0A(-1513950945, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-634024537);
        this.A00.A02.A05.DRY();
        C0f9.A0A(1779405374, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-864113750);
        this.A00.A02.A05.DRb();
        C0f9.A0A(-712064630, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-887818242);
        C67847UzS c67847UzS = (C67847UzS) obj;
        int A032 = C0f9.A03(-526134979);
        this.A01.A00 = new C69138ViT(c67847UzS.A01, c67847UzS.A02, c67847UzS.A05);
        C69137ViS c69137ViS = this.A00;
        c69137ViS.A02.A05.DGX(c69137ViS.A00, c67847UzS, c69137ViS.A01);
        C0f9.A0A(-229800454, A032);
        C0f9.A0A(-1073959037, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1863688116);
        C0f9.A0A(-253792996, C0f9.A03(-1220847876));
        C0f9.A0A(-356201160, A03);
    }
}
