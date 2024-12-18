package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.Fzv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36300Fzv implements InterfaceC13000lm, C07W {
    public C17C A00;
    public InterfaceC37187GZy A01;
    public InterfaceC37219GaU A02;
    public InterfaceC37268GbL A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public String A07;
    public String A08;
    public final AbstractC12990ll A09;
    public final InterfaceC42271xH A0A;

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public void cleanUp() {
        InterfaceC37268GbL interfaceC37268GbL = this.A03;
        if (interfaceC37268GbL != null) {
            interfaceC37268GbL.getLifecycle().A0A(this);
        }
        this.A03 = null;
        this.A07 = null;
        this.A04 = null;
        this.A02 = null;
        this.A06 = null;
        this.A08 = null;
        this.A05 = null;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A09).A02(this.A0A, C36112Fwm.class);
    }

    public C36300Fzv(AbstractC12990ll abstractC12990ll) {
        C31728DwZ A00 = C31728DwZ.A00(this, 30);
        this.A0A = A00;
        this.A09 = abstractC12990ll;
        AbstractC25651Mw.A00(abstractC12990ll).A01(A00, C36112Fwm.class);
    }
}
