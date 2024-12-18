package X;

import java.util.List;

/* renamed from: X.DfJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30721DfJ extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30721DfJ(String str, String str2, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(4);
        this.A02 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = interfaceC16660sJ;
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
                AbstractC25225BEi.A1J(614452188);
            }
            C28224CcU c28224CcU = (C28224CcU) this.A02.get(A0H);
            c5Tl.Eno(1158933282);
            AbstractC28306Cds.A02(c5Tl, C5UA.A01(c5Tl, new DSZ(c28224CcU, this.A03, this.A01, 3), -2069582924), 20.0f, 432, C14360o3.A0K(c28224CcU.A04, this.A00));
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(-932376043);
            }
        }
        return C0eB.A00;
    }
}
