package X;

import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class PTM implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C51380Mmf A02;
    public final /* synthetic */ boolean A03;

    public PTM(C51380Mmf c51380Mmf, float f, float f2, boolean z) {
        this.A02 = c51380Mmf;
        this.A03 = z;
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51380Mmf c51380Mmf = this.A02;
        boolean z = this.A03;
        float f = this.A01;
        float f2 = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = c51380Mmf.A0C;
        ViewGroup.LayoutParams layoutParams = AbstractC166987dD.A0d(interfaceC09390do).getLayoutParams();
        String A00 = AbstractC111324zv.A00(0);
        C14360o3.A0C(layoutParams, A00);
        C56302iJ c56302iJ = (C56302iJ) layoutParams;
        InterfaceC09390do interfaceC09390do2 = c51380Mmf.A0B;
        ViewGroup.LayoutParams layoutParams2 = AbstractC166987dD.A0d(interfaceC09390do2).getLayoutParams();
        C14360o3.A0C(layoutParams2, A00);
        C56302iJ c56302iJ2 = (C56302iJ) layoutParams2;
        float f3 = c56302iJ.A02;
        if (f == f3 && f2 == c56302iJ2.A02) {
            return;
        }
        if (!z) {
            c56302iJ.A02 = f;
            c56302iJ2.A02 = f2;
            AbstractC166987dD.A0d(interfaceC09390do).setLayoutParams(c56302iJ);
            AbstractC166987dD.A0d(interfaceC09390do2).setLayoutParams(c56302iJ2);
            return;
        }
        C50799McG c50799McG = new C50799McG(c56302iJ, c56302iJ2, c51380Mmf, f3, f, c56302iJ2.A02, f2);
        c50799McG.setDuration(300L);
        AbstractC166987dD.A0d(interfaceC09390do).startAnimation(c50799McG);
    }
}
