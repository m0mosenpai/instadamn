package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DSs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30213DSs extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30213DSs(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        super(2);
        this.A00 = str;
        this.A04 = z;
        this.A01 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
        this.A02 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1046568379, "com.instagram.schools.management.ui.SchoolManagementBottomSheetComposeView.<anonymous> (SchoolManagementBottomSheetComposeView.kt:27)");
            }
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            String str = this.A00;
            boolean z = this.A04;
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A03;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            CK8.A00(str, c5Tl, 0);
            CKA.A00(c5Tl, 0);
            c5Tl.Eno(-2010344092);
            if (z) {
                String A002 = C5YD.A00(c5Tl, 2131964644);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ, -2010338894);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = new C37016GSx(interfaceC16820sZ, 49);
                    c5Tl.FBy(EEc);
                }
                AbstractC25705BXp.A0E(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A0T, EEc), C29198Cu3.A00, A002);
            }
            C117505Tk.A0L(c117505Tk, false);
            String A003 = C5YD.A00(c5Tl, 2131966021);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ2, -2010331564);
            Object EEc2 = c5Tl.EEc();
            if (A1Y2 || EEc2 == C5UI.A00) {
                EEc2 = C29886DGa.A00(c5Tl, interfaceC16820sZ2, 0);
            }
            Modifier A05 = C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), true);
            C29198Cu3 c29198Cu3 = C29198Cu3.A00;
            AbstractC25705BXp.A0E(c5Tl, A05, c29198Cu3, A003);
            String A004 = C5YD.A00(c5Tl, 2131972292);
            boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ3, -2010324622);
            Object EEc3 = c5Tl.EEc();
            if (A1Y3 || EEc3 == C5UI.A00) {
                EEc3 = C29886DGa.A00(c5Tl, interfaceC16820sZ3, 1);
            }
            AbstractC25705BXp.A0I(c5Tl, C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), true), c29198Cu3, A004, 129788, AbstractC25226BEj.A07(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1352596499);
            }
        }
        return C0eB.A00;
    }
}
