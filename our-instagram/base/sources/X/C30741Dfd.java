package X;

import java.util.List;

/* renamed from: X.Dfd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30741Dfd extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ InterfaceC74963Ym A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ InterfaceC16600sD A08;
    public final /* synthetic */ InterfaceC65696TsI A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30741Dfd(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, InterfaceC65696TsI interfaceC65696TsI, float f, boolean z) {
        super(4);
        this.A05 = list;
        this.A0A = z;
        this.A00 = f;
        this.A03 = interfaceC74963Ym;
        this.A09 = interfaceC65696TsI;
        this.A04 = interfaceC74963Ym2;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16620sF;
        this.A08 = interfaceC16600sD;
        this.A02 = interfaceC74953Yl;
        this.A01 = interfaceC74953Yl2;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        InterfaceC30766Dg3 interfaceC30766Dg3 = (InterfaceC30766Dg3) obj;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, interfaceC30766Dg3);
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
                C0fH.A01(-1373340540, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
            }
            Object obj5 = this.A05.get(A0H);
            c5Tl.Eno(1783507378);
            C5UP c5up = C5V2.A07;
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, c5up);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1165914248);
            if (A0q == C5UI.A00) {
                A0q = AbstractC28499Chs.A01(A0U);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            C117685Ud A02 = c5up.A02(A0q);
            boolean z = this.A0A;
            float f = this.A00;
            InterfaceC74963Ym interfaceC74963Ym = this.A03;
            InterfaceC65696TsI interfaceC65696TsI = this.A09;
            AbstractC25230BEn.A17(c5Tl, A02, new DX1(interfaceC30766Dg3, this.A02, this.A01, interfaceC74963Ym, this.A04, obj5, this.A06, this.A07, this.A08, interfaceC65696TsI, f, z), -1387406252);
            if (AbstractC25227BEk.A1a(A0J)) {
                C0fH.A00(-1136928832);
            }
        }
        return C0eB.A00;
    }
}
