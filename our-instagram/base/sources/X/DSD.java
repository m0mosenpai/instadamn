package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DSD extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC30909DiM A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSD(InterfaceC30909DiM interfaceC30909DiM, Modifier modifier, long j, boolean z) {
        super(2);
        this.A00 = j;
        this.A03 = z;
        this.A02 = modifier;
        this.A01 = interfaceC30909DiM;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC118275Wp interfaceC118275Wp;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1403892287, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
            }
            long j = this.A00;
            if (j != 9205357640488583168L) {
                c5Tl.Eno(-837727128);
                boolean z = this.A03;
                if (z) {
                    interfaceC118275Wp = CNG.A01;
                } else {
                    interfaceC118275Wp = CNG.A00;
                }
                Modifier Eq3 = this.A02.Eq3(new SizeElement(C5XU.A00, AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j), Float.NaN, Float.NaN, false));
                InterfaceC30909DiM interfaceC30909DiM = this.A01;
                InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, C118195Wf.A05, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, Eq3);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A02, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C1130158n c1130158n = Modifier.A00;
                boolean AH6 = c5Tl.AH6(interfaceC30909DiM);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = new DGT(interfaceC30909DiM, 42);
                    c5Tl.FBy(EEc);
                }
                AbstractC28376Cfe.A03(c5Tl, c1130158n, (InterfaceC16820sZ) EEc, 6, z);
                c5Tl.ASW();
            } else {
                c5Tl.Eno(-836867312);
                Modifier modifier = this.A02;
                InterfaceC30909DiM interfaceC30909DiM2 = this.A01;
                boolean AH62 = c5Tl.AH6(interfaceC30909DiM2);
                Object EEc2 = c5Tl.EEc();
                if (AH62 || EEc2 == C5UI.A00) {
                    EEc2 = new DGT(interfaceC30909DiM2, 43);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28376Cfe.A03(c5Tl, modifier, (InterfaceC16820sZ) EEc2, 0, this.A03);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(1201407438);
            }
        }
        return C0eB.A00;
    }
}
