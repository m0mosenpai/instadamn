package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import java.util.List;

/* renamed from: X.DdA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30589DdA extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ EnumC27391C6u A04;
    public final /* synthetic */ EnumC132255y4 A05;
    public final /* synthetic */ C6H4 A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ InterfaceC16620sF A0B;
    public final /* synthetic */ C5Hc A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30589DdA(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74963Ym interfaceC74963Ym, EnumC27391C6u enumC27391C6u, EnumC132255y4 enumC132255y4, C6H4 c6h4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2, boolean z) {
        super(3);
        this.A06 = c6h4;
        this.A0C = c5Hc;
        this.A02 = interfaceC74953Yl;
        this.A04 = enumC27391C6u;
        this.A0D = z;
        this.A0A = interfaceC16660sJ;
        this.A0B = interfaceC16620sF;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = enumC132255y4;
        this.A09 = interfaceC16660sJ2;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A03 = interfaceC74963Ym;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(interfaceC16820sZ, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-950924542, "com.instagram.barcelona.feed.post.ui.PostKaraokeCaptions.<anonymous> (PostKaraokeCaptions.kt:55)");
            }
            String str = (String) this.A03.getValue();
            C6H4 c6h4 = C6H4.A01;
            LineType lineType = LineType.A05;
            Modifier A00 = AbstractC118175Wb.A00(this.A06.A00, Modifier.A00);
            List list = this.A0C;
            if (list == null) {
                list = C5HZ.A01;
            }
            InterfaceC74953Yl interfaceC74953Yl = this.A02;
            C127055oj c127055oj = (C127055oj) interfaceC74953Yl.getValue();
            EnumC27391C6u enumC27391C6u = this.A04;
            DLS dls = DLS.A00;
            C14360o3.A0B(A00, 0);
            AbstractC25233BEq.A0x(1, list, dls, enumC27391C6u);
            Modifier A02 = C5X3.A02(A00, C5XU.A00, new C30540DcN(c127055oj, enumC27391C6u, list, interfaceC16820sZ, dls));
            boolean z = this.A0D;
            C30634Ddu c30634Ddu = C30634Ddu.A00;
            InterfaceC16660sJ interfaceC16660sJ = this.A0A;
            InterfaceC16620sF interfaceC16620sF = this.A0B;
            int i = this.A00;
            int i2 = this.A01;
            EnumC132255y4 enumC132255y4 = this.A05;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A09;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A07;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -484828133);
            if (A0q == C5UI.A00) {
                A0q = AbstractC25230BEn.A0v(c5Tl, interfaceC74953Yl, 7);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6H5.A00(c5Tl, A02, null, lineType, null, enumC132255y4, c6h4, null, null, str, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16660sJ, interfaceC16660sJ2, (InterfaceC16660sJ) A0q, null, interfaceC16620sF, c30634Ddu, i, i2, 115019184, 100663296, 0, 33030144, false, z, false, false, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-1107219571);
            }
        }
        return C0eB.A00;
    }
}
