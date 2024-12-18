package X;

import android.view.GestureDetector;

/* loaded from: classes5.dex */
public final class DII extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ C82713mZ A02;
    public final /* synthetic */ BLI A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DII(GestureDetector gestureDetector, C18920wW c18920wW, C82713mZ c82713mZ, BLI bli, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2, boolean z3) {
        super(1);
        this.A00 = gestureDetector;
        this.A02 = c82713mZ;
        this.A01 = c18920wW;
        this.A08 = z;
        this.A03 = bli;
        this.A07 = z2;
        this.A05 = interfaceC16820sZ;
        this.A06 = z3;
        this.A04 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ;
        BLI bli;
        MWD mwd;
        String A1E;
        C2XB A0k = AbstractC25228BEl.A0k(obj);
        if (this.A00.onTouchEvent(A0k.A00)) {
            Xij.A00(EnumC39652Hih.A0R, this.A01, this.A02);
            if (this.A08 && (mwd = (bli = this.A03).A0E) != null && (A1E = AbstractC25232BEp.A1E(bli)) != null) {
                AbstractC25229BEm.A1H(mwd, null, A1E, "lead_ads_first_question_tap_to_dismiss_click");
            }
        } else if (A0k.A00.getAction() == 1) {
            Xij.A00(EnumC39652Hih.A0S, this.A01, this.A02);
        }
        if (A0k.A00.getAction() == 1) {
            if (this.A07) {
                interfaceC16820sZ = this.A05;
            } else if (this.A06) {
                interfaceC16820sZ = this.A04;
            }
            interfaceC16820sZ.invoke();
        }
        return true;
    }
}
