package X;

import android.view.View;

/* renamed from: X.CbU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28182CbU {
    public View A00;
    public final C6FG A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public static final void A00(C28182CbU c28182CbU, C102884kP c102884kP, boolean z, boolean z2) {
        ((CUA) c28182CbU.A04.getValue()).A01 = true;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) c28182CbU.A03.getValue();
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(Boolean.valueOf(z));
        C6FP.A03(c28182CbU.A01, c102884kP, AbstractC25227BEk.A0f(A0s, Boolean.valueOf(z2), 1), interfaceC103384lE);
    }

    public C28182CbU(C6FG c6fg, C102884kP c102884kP) {
        this.A01 = c6fg;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C57514Pfo(c102884kP, 43));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C57514Pfo(c102884kP, 42));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new DH1(37, c102884kP, this));
    }
}
