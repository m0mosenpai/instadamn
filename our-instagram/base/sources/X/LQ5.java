package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LQ5 implements View.OnFocusChangeListener {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public LQ5(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C102884kP c102884kP = this.A01;
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
            C6FG c6fg = this.A00;
            A0I.A02(c6fg);
            C6FP.A03(c6fg, c102884kP, A0I.A00(), interfaceC103384lE);
        }
    }
}
