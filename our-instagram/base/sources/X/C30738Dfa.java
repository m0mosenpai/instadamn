package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dfa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30738Dfa extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132365yF A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16620sF A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30738Dfa(C5yI c5yI, InterfaceC132365yF interfaceC132365yF, UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, float f) {
        super(4);
        this.A04 = list;
        this.A00 = f;
        this.A07 = interfaceC16660sJ;
        this.A03 = userSession;
        this.A08 = interfaceC16620sF;
        this.A05 = interfaceC16660sJ2;
        this.A06 = interfaceC16660sJ3;
        this.A01 = c5yI;
        this.A02 = interfaceC132365yF;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Modifier A0K;
        C6IV c6iv = (C6IV) obj;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, c6iv);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl, A0H);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1248596440, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            Object obj5 = this.A04.get(A0H);
            int A02 = AbstractC25225BEi.A02(i);
            C9C6 c9c6 = (C9C6) obj5;
            c5Tl.Eno(621551701);
            boolean z = false;
            float f = 0.0f;
            if (A0H == 0) {
                f = 16.0f;
            }
            Modifier modifier = Modifier.A00;
            Modifier AVE = c6iv.AVE(modifier, this.A00);
            boolean z2 = c9c6.A04;
            if (z2) {
                A0K = AbstractC118175Wb.A0E(modifier, f, 16.0f, 0.0f, 16.0f);
            } else {
                A0K = AbstractC25227BEk.A0K(modifier, f);
            }
            Modifier Eq3 = AVE.Eq3(A0K);
            c5Tl.Eno(-811216624);
            InterfaceC16660sJ interfaceC16660sJ = this.A07;
            boolean AH4 = c5Tl.AH4(interfaceC16660sJ);
            if ((((A02 & 896) ^ 384) > 256 && c5Tl.AH4(c9c6)) || (A02 & 384) == 256) {
                z = true;
            }
            boolean z3 = AH4 | z;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = new D8M(33, interfaceC16660sJ, c9c6);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            Modifier A00 = AbstractC136476Gb.A00(AbstractC25228BEl.A0Z(C6L7.A01(C6G9.A00(1.0f, AbstractC25226BEj.A0E(c5Tl)), C5XR.A06(Eq3, (InterfaceC16820sZ) EEc), C5WF.A01(16.0f)), 16.0f, AbstractC25226BEj.A09(c5Tl)), this.A03, c9c6.A03, this.A05, this.A06, this.A08);
            if (!z2) {
                modifier = AbstractC25227BEk.A0N(modifier, 4.0f);
            }
            C6L8.A02(c5Tl, A00.Eq3(modifier), C5UA.A01(c5Tl, C30487DbW.A00(this.A01, this.A02, c9c6, 31), 716899458));
            if (AbstractC25227BEk.A1a(A0J)) {
                C0fH.A00(-1581251800);
            }
        }
        return C0eB.A00;
    }
}
