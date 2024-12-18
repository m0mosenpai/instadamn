package X;

import android.os.Handler;

/* renamed from: X.7wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178707wi extends AbstractC178657wd implements InterfaceC178717wj {
    public C197908p1 A00;
    public C179877yd A01;
    public C23128AMg A02;
    public volatile InterfaceC178817wt A03;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A01 = new C179877yd(((AbstractC178657wd) this).A00.getContext().getResources());
        this.A03 = (InterfaceC178817wt) A0A(InterfaceC178817wt.A01);
    }

    @Override // X.InterfaceC178717wj
    public final void AP1() {
        C23128AMg c23128AMg = this.A02;
        if (c23128AMg != null) {
            Handler handler = c23128AMg.A0K;
            handler.post(new RunnableC24270Apb(c23128AMg));
            handler.post(new RunnableC24269Apa(c23128AMg));
            handler.getLooper().quitSafely();
            this.A02 = null;
        }
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178717wj.A00;
    }
}
