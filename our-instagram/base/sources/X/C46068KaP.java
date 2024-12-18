package X;

import android.text.Editable;

/* renamed from: X.KaP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46068KaP extends WKa {
    public final /* synthetic */ KF6 A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public C46068KaP(KF6 kf6, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = kf6;
        this.A02 = c102884kP;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fg;
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE interfaceC103384lE = this.A03;
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(editable.toString());
        C6FP.A03(this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
    }
}
