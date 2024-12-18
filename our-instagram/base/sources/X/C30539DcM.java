package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DcM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30539DcM extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30539DcM(InterfaceC74953Yl interfaceC74953Yl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(3);
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A04 = interfaceC16660sJ;
        this.A01 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-780475519, "com.instagram.aistudio.editor.AiConversationScreen.<anonymous>.<anonymous>.<anonymous> (AiConversationScreen.kt:58)");
            }
            String A00 = C5YD.A00(c5Tl, 2131952859);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC74953Yl interfaceC74953Yl = this.A01;
            InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) interfaceC74953Yl.getValue();
            String str = this.A03;
            c5Tl.Eno(-1663395334);
            int i = this.A00;
            boolean AH2 = c5Tl.AH2(i);
            String str2 = this.A02;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, str2, AH2);
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, interfaceC16660sJ, A1X);
            Object EEc = c5Tl.EEc();
            if (A1X2 || EEc == C5UI.A00) {
                EEc = new C43815JZc(interfaceC16660sJ, interfaceC74953Yl, str2, i, 1);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28505Chy.A06(c5Tl, c1130158n, interfaceC30801Dgc, Integer.valueOf(i), str, A00, (InterfaceC16660sJ) EEc, 2, Integer.MAX_VALUE, 1772544);
            if (C0fH.A02()) {
                C0fH.A00(1407441281);
            }
        }
        return C0eB.A00;
    }
}
