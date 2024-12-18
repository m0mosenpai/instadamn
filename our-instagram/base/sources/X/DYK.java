package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DYK extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC50412MNo A02;
    public final /* synthetic */ CWQ A03;
    public final /* synthetic */ C28364CfO A04;
    public final /* synthetic */ BXF A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ Modifier A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ Modifier A09;
    public final /* synthetic */ C118125Vw A0A;
    public final /* synthetic */ InterfaceC31114Dlw A0B;
    public final /* synthetic */ C5C3 A0C;
    public final /* synthetic */ InterfaceC31101Dlj A0D;
    public final /* synthetic */ InterfaceC1128957x A0E;
    public final /* synthetic */ InterfaceC16660sJ A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DYK(InterfaceC50412MNo interfaceC50412MNo, CWQ cwq, C28364CfO c28364CfO, BXF bxf, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, C118125Vw c118125Vw, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, InterfaceC31101Dlj interfaceC31101Dlj, InterfaceC1128957x interfaceC1128957x, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A03 = cwq;
        this.A0A = c118125Vw;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c28364CfO;
        this.A0C = c5c3;
        this.A0D = interfaceC31101Dlj;
        this.A06 = modifier;
        this.A07 = modifier2;
        this.A09 = modifier3;
        this.A08 = modifier4;
        this.A02 = interfaceC50412MNo;
        this.A05 = bxf;
        this.A0H = z;
        this.A0G = z2;
        this.A0F = interfaceC16660sJ;
        this.A0B = interfaceC31114Dlw;
        this.A0E = interfaceC1128957x;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier c28817Cnn;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1808783433, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
            }
            C1130158n c1130158n = Modifier.A00;
            CWQ cwq = this.A03;
            Modifier A09 = AbstractC118185Wd.A09(c1130158n, ((C119145aW) cwq.A0D.getValue()).A00);
            C118125Vw c118125Vw = this.A0A;
            int i = this.A01;
            int i2 = this.A00;
            InterfaceC16660sJ interfaceC16660sJ = C5XU.A00;
            Modifier A02 = C5X3.A02(A09, interfaceC16660sJ, new C30520Dc3(c118125Vw, i, i2));
            C28364CfO c28364CfO = this.A04;
            C5C3 c5c3 = this.A0C;
            InterfaceC31101Dlj interfaceC31101Dlj = this.A0D;
            boolean AH6 = c5Tl.AH6(cwq);
            Object EEc = c5Tl.EEc();
            if (AH6 || EEc == C5UI.A00) {
                EEc = new DGT(cwq, 28);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
            C6M3 c6m3 = (C6M3) c28364CfO.A04.getValue();
            long j = c5c3.A00;
            int i3 = (int) (j >> 32);
            long j2 = c28364CfO.A00;
            if (i3 == ((int) (j2 >> 32)) && (i3 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                i3 = C5C2.A01(j);
            }
            c28364CfO.A00 = j;
            CVF A00 = AbstractC28412CgI.A00(c5c3.A01, interfaceC31101Dlj);
            int ordinal = c6m3.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c28817Cnn = new C28816Cnm(c28364CfO, A00, interfaceC16820sZ, i3);
                } else {
                    throw B4Z.A00();
                }
            } else {
                c28817Cnn = new C28817Cnn(c28364CfO, A00, interfaceC16820sZ, i3);
            }
            CB6.A00(c5Tl, C5X3.A02(C6L2.A00(A02).Eq3(c28817Cnn).Eq3(this.A06).Eq3(this.A07), interfaceC16660sJ, C30712DfA.A00(c118125Vw, 9)).Eq3(this.A09).Eq3(this.A08).Eq3(new BringIntoViewRequesterElement(this.A02)), C5UA.A01(c5Tl, new DVN(cwq, this.A05, this.A0B, c5c3, this.A0E, this.A0F, i2, this.A0H, this.A0G), -363167407), 48, 0);
            if (C0fH.A02()) {
                C0fH.A00(-162830004);
            }
        }
        return C0eB.A00;
    }
}
