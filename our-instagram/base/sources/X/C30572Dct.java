package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputElement;

/* renamed from: X.Dct, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30572Dct extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CWQ A01;
    public final /* synthetic */ CU9 A02;
    public final /* synthetic */ BXF A03;
    public final /* synthetic */ InterfaceC31114Dlw A04;
    public final /* synthetic */ C5C3 A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30572Dct(CWQ cwq, CU9 cu9, BXF bxf, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z, boolean z2) {
        super(3);
        this.A01 = cwq;
        this.A03 = bxf;
        this.A05 = c5c3;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = interfaceC31114Dlw;
        this.A02 = cu9;
        this.A06 = interfaceC16660sJ;
        this.A00 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, 851809892)) {
            C0fH.A01(364308721, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
        }
        Object EEc = A0S.EEc();
        Object obj4 = C5UI.A00;
        if (EEc == obj4) {
            EEc = new Object();
            A0S.FBy(EEc);
        }
        CON con = (CON) EEc;
        Object EEc2 = A0S.EEc();
        if (EEc2 == obj4) {
            EEc2 = new Object();
            A0S.FBy(EEc2);
        }
        CWQ cwq = this.A01;
        BXF bxf = this.A03;
        C5C3 c5c3 = this.A05;
        boolean z = this.A07;
        boolean z2 = this.A08;
        InterfaceC31114Dlw interfaceC31114Dlw = this.A04;
        C28188Cbc c28188Cbc = new C28188Cbc((COK) EEc2, AbstractC68618VXu.A00, cwq, this.A02, bxf, con, interfaceC31114Dlw, c5c3, this.A06, this.A00, z, z2);
        C1130158n c1130158n = Modifier.A00;
        boolean AH6 = A0S.AH6(c28188Cbc);
        Object EEc3 = A0S.EEc();
        if (AH6 || EEc3 == obj4) {
            EEc3 = AbstractC25230BEn.A0t(A0S, c28188Cbc, 0);
        }
        Modifier Eq3 = c1130158n.Eq3(new KeyInputElement((InterfaceC16660sJ) ((C0YS) EEc3), null));
        if (C0fH.A02()) {
            C0fH.A00(2147310479);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq3;
    }
}
