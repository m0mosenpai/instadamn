package X;

import java.util.List;

/* renamed from: X.DfH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30719DfH extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ InterfaceC16620sF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30719DfH(List list, InterfaceC16620sF interfaceC16620sF, float f) {
        super(4);
        this.A01 = list;
        this.A00 = f;
        this.A02 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = AbstractC25232BEp.A0R(c5Tl, obj) | A0H2;
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
                AbstractC25225BEi.A1J(713035017);
            }
            InterfaceC30797DgY interfaceC30797DgY = (InterfaceC30797DgY) this.A01.get(A0H);
            c5Tl.Eno(-863809012);
            AbstractC28460ChC.A03(c5Tl, null, interfaceC30797DgY, this.A02, this.A00, ((i & 14) << 3) & 896, 1);
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(-902241588);
            }
        }
        return C0eB.A00;
    }
}
