package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dc3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30520Dc3 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C118125Vw A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30520Dc3(C118125Vw c118125Vw, int i, int i2) {
        super(3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c118125Vw;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        Integer valueOf;
        float f;
        float f2;
        Object A0F;
        int i3;
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, 408240218)) {
            C0fH.A01(1506546821, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
        }
        int i4 = this.A01;
        int i5 = this.A00;
        AbstractC122435ge.A00(i4, i5);
        if (i4 == 1 && i5 == Integer.MAX_VALUE) {
            A0F = Modifier.A00;
            if (C0fH.A02()) {
                i3 = 1951954748;
                C0fH.A00(i3);
            }
        } else {
            InterfaceC1128957x A0h = AbstractC25228BEl.A0h(A0S);
            C5DD c5dd = (C5DD) A0S.AJX(C5V2.A03);
            AnonymousClass583 anonymousClass583 = (AnonymousClass583) AbstractC25226BEj.A18(A0S);
            C118125Vw c118125Vw = this.A02;
            boolean A1W = AbstractC25230BEn.A1W(A0S, c118125Vw, anonymousClass583);
            Object EEc = A0S.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = AbstractC122525gn.A00(c118125Vw, anonymousClass583);
                A0S.FBy(EEc);
            }
            C118125Vw c118125Vw2 = (C118125Vw) EEc;
            boolean A1W2 = AbstractC25230BEn.A1W(A0S, c5dd, c118125Vw2);
            Object EEc2 = A0S.EEc();
            if (A1W2 || EEc2 == C5UI.A00) {
                C5W3 c5w3 = c118125Vw2.A02;
                AbstractC119845bi abstractC119845bi = c5w3.A05;
                C5W5 c5w5 = c5w3.A08;
                if (c5w5 == null) {
                    c5w5 = C5W5.A04;
                }
                C122165gC c122165gC = c5w3.A06;
                if (c122165gC != null) {
                    i = c122165gC.A00;
                } else {
                    i = 0;
                }
                C122175gD c122175gD = c5w3.A07;
                if (c122175gD != null) {
                    i2 = c122175gD.A00;
                } else {
                    i2 = 1;
                }
                EEc2 = c5dd.EKD(abstractC119845bi, c5w5, i, i2);
                A0S.FBy(EEc2);
            }
            InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) EEc2;
            boolean AH4 = A0S.AH4(interfaceC74963Ym.getValue()) | AbstractC25225BEi.A1X(A0S, anonymousClass583, AbstractC25232BEp.A1a(A0S, c5dd, c118125Vw, A0S.AH4(A0h)));
            Object EEc3 = A0S.EEc();
            if (AH4 || EEc3 == C5UI.A00) {
                EEc3 = Integer.valueOf(C119055aN.A00(CZS.A00(c118125Vw2, c5dd, A0h, CZS.A00, 1)));
                A0S.FBy(EEc3);
            }
            int A0H = AbstractC166987dD.A0H(EEc3);
            boolean A1V = AbstractC25228BEl.A1V(A0S, interfaceC74963Ym.getValue(), A0S.AH4(anonymousClass583), AbstractC25232BEp.A1a(A0S, c5dd, c118125Vw, A0S.AH4(A0h)));
            Object EEc4 = A0S.EEc();
            if (A1V || EEc4 == C5UI.A00) {
                String str = CZS.A00;
                EEc4 = Integer.valueOf(C119055aN.A00(CZS.A00(c118125Vw2, c5dd, A0h, AnonymousClass001.A0T(str, str, '\n'), 2)));
                A0S.FBy(EEc4);
            }
            int A0H2 = AbstractC166987dD.A0H(EEc4) - A0H;
            Integer num = null;
            if (i4 == 1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((i4 - 1) * A0H2) + A0H);
            }
            if (i5 != Integer.MAX_VALUE) {
                num = Integer.valueOf(A0H + (A0H2 * (i5 - 1)));
            }
            C1130158n c1130158n = Modifier.A00;
            if (valueOf != null) {
                f = A0h.EqI(valueOf.intValue());
            } else {
                f = Float.NaN;
            }
            if (num != null) {
                f2 = A0h.EqI(num.intValue());
            } else {
                f2 = Float.NaN;
            }
            A0F = AbstractC118185Wd.A0F(c1130158n, f, f2);
            if (C0fH.A02()) {
                i3 = 1944257450;
                C0fH.A00(i3);
            }
        }
        AbstractC25225BEi.A1T(A0S);
        return A0F;
    }
}
