package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class AZG implements BDF {
    public final /* synthetic */ InterfaceC178817wt A00;
    public final /* synthetic */ ABD A01;
    public final /* synthetic */ AZA A02;

    @Override // X.BDF
    public final void Czd(Bitmap bitmap, long j) {
        this.A00.BQq().EFO(0, this.A02);
        ABD abd = this.A01;
        YRH yrh = abd.A00;
        yrh.D2Q(bitmap, "BasicPhotoCaptureCoordinator");
        AbstractC196788n8.A01(abd.A01.A00, "BasicPhotoCaptureCoordinator", abd.hashCode());
        yrh.D2M();
    }

    @Override // X.BDF
    public final void DEF(Exception exc) {
        this.A00.BQq().EFO(0, this.A02);
        this.A01.A00(new AbstractC223559ty(10015, exc));
    }

    @Override // X.BDF
    public final void DLI() {
    }

    public AZG(InterfaceC178817wt interfaceC178817wt, ABD abd, AZA aza) {
        this.A01 = abd;
        this.A00 = interfaceC178817wt;
        this.A02 = aza;
    }
}
