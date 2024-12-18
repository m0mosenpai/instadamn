package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dfc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30740Dfc extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ InterfaceC30798DgZ A00;
    public final /* synthetic */ C26009Bex A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16620sF A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ C5Hc A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30740Dfc(InterfaceC30798DgZ interfaceC30798DgZ, C26009Bex c26009Bex, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, boolean z) {
        super(4);
        this.A01 = c26009Bex;
        this.A07 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ;
        this.A09 = z;
        this.A02 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ2;
        this.A03 = interfaceC16820sZ2;
        this.A06 = interfaceC16620sF2;
        this.A08 = c5Hc;
        this.A00 = interfaceC30798DgZ;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        boolean A1X = AbstractC25231BEo.A1X(obj4, obj);
        if (C0fH.A02()) {
            C0fH.A01(1888598224, "com.instagram.archive.updateshub.UpdatesHubHeader.<anonymous>.<anonymous> (UpdatesHubHeader.kt:54)");
        }
        if (A1a) {
            ImageUrl imageUrl = null;
            Modifier A0M = AbstractC25227BEk.A0M(AbstractC25225BEi.A0N(c5Tl, -298483335), 32.0f);
            C26009Bex c26009Bex = this.A01;
            if (c26009Bex != null) {
                imageUrl = c26009Bex.A02;
            }
            c5Tl.Eno(-286717679);
            InterfaceC16620sF interfaceC16620sF = this.A07;
            boolean A1W = AbstractC25230BEn.A1W(c5Tl, interfaceC16620sF, c26009Bex);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A12(c5Tl, interfaceC16620sF, c26009Bex, 37);
            }
            AbstractC25225BEi.A1V(c5Tl, A1X);
            AbstractC27536CDg.A00(c5Tl, A0M, imageUrl, (InterfaceC16660sJ) EEc, this.A04, 6, A1X ? 1 : 0);
        } else {
            c5Tl.Eno(-298183379);
            boolean z = this.A09;
            C26009Bex c26009Bex2 = this.A01;
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            CXS.A01(c5Tl, null, this.A00, c26009Bex2, interfaceC16820sZ, this.A03, interfaceC16660sJ, this.A06, this.A08, A1X ? 1 : 0, 1, z);
        }
        if (AbstractC25230BEn.A1Z(c5Tl, A1X)) {
            C0fH.A00(1868888485);
        }
        return C0eB.A00;
    }
}
