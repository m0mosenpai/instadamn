package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.BIq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25321BIq extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC16620sF A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25321BIq(AbstractC59962oe abstractC59962oe, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        super(2);
        this.A03 = z;
        this.A00 = abstractC59962oe;
        this.A02 = z2;
        this.A01 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(415307389, "com.instagram.compose.fragment.IgComposeView.<anonymous>.<anonymous> (IgComposeView.kt:21)");
            }
            c5Tl.Eno(-842563413);
            if (this.A03) {
                CG8.A00(c5Tl, 0);
            }
            AbstractC25225BEi.A1T(c5Tl);
            AbstractC25324BIt.A00(c5Tl, this.A00, C5UA.A01(c5Tl, new C30192DRx(this.A01, 9), 1739742371), DalvikInternals.IOPRIO_BACKGROUND, this.A02, false, false);
            if (C0fH.A02()) {
                C0fH.A00(31746160);
            }
        }
        return C0eB.A00;
    }
}
