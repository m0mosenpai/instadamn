package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutElement;

/* renamed from: X.Dd0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30579Dd0 extends C0YY implements InterfaceC16610sE {
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
    public C30579Dd0(InterfaceC30798DgZ interfaceC30798DgZ, C26009Bex c26009Bex, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, boolean z) {
        super(3);
        this.A00 = interfaceC30798DgZ;
        this.A09 = z;
        this.A01 = c26009Bex;
        this.A07 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ;
        this.A02 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ2;
        this.A03 = interfaceC16820sZ2;
        this.A06 = interfaceC16620sF2;
        this.A08 = c5Hc;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0R(c5Tl, obj);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1960716536, "com.instagram.archive.updateshub.UpdatesGrid.<anonymous>.<anonymous>.<anonymous> (UpdatesHub.kt:186)");
            }
            Modifier Eq3 = AbstractC25228BEl.A0W().Eq3(new LayoutElement(C30626Ddm.A00)).Eq3(new LazyLayoutAnimateItemElement(AbstractC25236BEt.A0F()));
            InterfaceC30798DgZ interfaceC30798DgZ = this.A00;
            boolean z = this.A09;
            C26009Bex c26009Bex = this.A01;
            InterfaceC16620sF interfaceC16620sF = this.A07;
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            CXS.A00(c5Tl, Eq3, interfaceC30798DgZ, c26009Bex, this.A02, this.A03, interfaceC16660sJ, this.A05, interfaceC16620sF, this.A06, this.A08, 0, 0, z);
            if (C0fH.A02()) {
                C0fH.A00(1572352995);
            }
        }
        return C0eB.A00;
    }
}
