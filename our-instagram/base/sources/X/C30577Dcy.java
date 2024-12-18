package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1;
import com.meta.compose.component.swipeable.SwipeableState;
import java.util.Map;

/* renamed from: X.Dcy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30577Dcy extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C6M3 A00;
    public final /* synthetic */ C5XO A01;
    public final /* synthetic */ CV5 A02;
    public final /* synthetic */ SwipeableState A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16620sF A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30577Dcy(C6M3 c6m3, C5XO c5xo, CV5 cv5, SwipeableState swipeableState, Map map, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        super(3);
        this.A04 = map;
        this.A03 = swipeableState;
        this.A02 = cv5;
        this.A07 = interfaceC16620sF;
        this.A00 = c6m3;
        this.A08 = z;
        this.A01 = c5xo;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16620sF2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, -1201063724)) {
            C0fH.A01(501583043, "com.meta.compose.component.swipeable.swipeable.<anonymous> (Swipeable.kt:546)");
        }
        Map map = this.A04;
        if (!map.isEmpty()) {
            if (AbstractC001800i.A0W(map.values()).size() == map.size()) {
                InterfaceC1128957x A0b = AbstractC25230BEn.A0b(A0S);
                SwipeableState swipeableState = this.A03;
                if (((Map) swipeableState.A05.getValue()).isEmpty()) {
                    Float A00 = AbstractC27718CKl.A00(swipeableState.A07.getValue(), map);
                    if (A00 != null) {
                        swipeableState.A09.Egh(A00);
                        swipeableState.A04.Egh(A00);
                    } else {
                        throw AbstractC166987dD.A12("The initial value must have an associated anchor.");
                    }
                }
                boolean A1Y = AbstractC25232BEp.A1Y(A0S, swipeableState, map, 1768951867);
                CV5 cv5 = this.A02;
                boolean A1X = AbstractC25225BEi.A1X(A0S, cv5, A1Y);
                InterfaceC16620sF interfaceC16620sF = this.A07;
                boolean A1a = AbstractC25232BEp.A1a(A0S, interfaceC16620sF, A0b, A1X) | A0S.AH1(125.0f);
                Object EEc = A0S.EEc();
                if (A1a || EEc == C5UI.A00) {
                    EEc = new SwipeableKt$swipeable$5$3$1(A0b, cv5, swipeableState, map, null, interfaceC16620sF, 125.0f);
                    A0S.FBy(EEc);
                }
                C117505Tk A0J = AbstractC25225BEi.A0J(A0S);
                C5UX.A02(A0S, map, swipeableState, (InterfaceC16620sF) EEc);
                C1130158n c1130158n = Modifier.A00;
                boolean A1X2 = AbstractC25230BEn.A1X(swipeableState.A08);
                InterfaceC30902DiF interfaceC30902DiF = swipeableState.A03;
                C6M3 c6m3 = this.A00;
                boolean z = this.A08;
                C5XO c5xo = this.A01;
                A0S.Eno(1768976817);
                InterfaceC16660sJ interfaceC16660sJ = this.A05;
                boolean AH4 = A0S.AH4(interfaceC16660sJ);
                Object EEc2 = A0S.EEc();
                if (AH4 || EEc2 == C5UI.A00) {
                    EEc2 = new D5A(interfaceC16660sJ, null, 2);
                    A0S.FBy(EEc2);
                }
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) EEc2;
                C117505Tk.A0I(A0J);
                A0S.Eno(1768978911);
                InterfaceC16620sF interfaceC16620sF2 = this.A06;
                boolean AH6 = A0S.AH6(interfaceC16620sF2);
                Object EEc3 = A0S.EEc();
                if (AH6 || EEc3 == C5UI.A00) {
                    EEc3 = new C57177Pa2(interfaceC16620sF2, null, 3);
                    A0S.FBy(EEc3);
                }
                C117505Tk.A0I(A0J);
                InterfaceC16610sE interfaceC16610sE2 = BG5.A00;
                Modifier Eq3 = c1130158n.Eq3(new DraggableElement(interfaceC30902DiF, c6m3, c5xo, interfaceC16610sE, (InterfaceC16610sE) EEc3, z, A1X2));
                if (C0fH.A02()) {
                    C0fH.A00(1257141676);
                }
                C117505Tk.A0I(A0J);
                return Eq3;
            }
            throw AbstractC166987dD.A12("You cannot have two anchors mapped to the same state.");
        }
        throw AbstractC166987dD.A12("You must have at least one anchor.");
    }
}
