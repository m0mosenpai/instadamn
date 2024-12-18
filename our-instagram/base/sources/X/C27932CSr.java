package X;

import android.content.Context;

/* renamed from: X.CSr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27932CSr {
    public final Context A00;
    public final CWL A01;
    public final C28279CdO A02;
    public final InterfaceC16660sJ A03;
    public final C05A A04;
    public final C0UO A05;

    public C27932CSr(Context context, CWL cwl, InterfaceC16660sJ interfaceC16660sJ) {
        Integer num;
        this.A00 = context;
        this.A01 = cwl;
        this.A03 = interfaceC16660sJ;
        if (cwl.A09) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        C28279CdO c28279CdO = new C28279CdO(null, null, null, new C28276CdL(C87.A0G, null, C88.A0X, null, C05F.A00, "Close Bottom Sheet", C30181DRm.A01(this, 3)), AbstractC166997dE.A0p(context, 2131966498), null, C05F.A06, num, AbstractC25230BEn.A0M(), true, false, true);
        this.A02 = c28279CdO;
        C008002u A1H = AbstractC25225BEi.A1H(c28279CdO);
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
    }
}
