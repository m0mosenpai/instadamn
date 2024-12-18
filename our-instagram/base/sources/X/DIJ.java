package X;

import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIJ extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i) {
        super(1);
        this.A00 = i;
        this.A07 = obj;
        this.A08 = str;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj7;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C28944Cps c28944Cps = (C28944Cps) obj;
            C14360o3.A0B(c28944Cps, 0);
            List list = (List) this.A01;
            DQA dqa = DQA.A00;
            String str = this.A08;
            FoaUserSession foaUserSession = (FoaUserSession) this.A03;
            DT6 dt6 = new DT6(foaUserSession, this.A06, this.A07, str, 3);
            C14360o3.A0B(dqa, 1);
            if (list.iterator().hasNext()) {
                c28944Cps.A02.add(new C29461Cyb(list, dqa, dt6));
            }
            AbstractC50812Vc abstractC50812Vc = (AbstractC50812Vc) this.A05;
            if (abstractC50812Vc != null) {
                c28944Cps.A00(abstractC50812Vc);
            }
            AbstractC50812Vc abstractC50812Vc2 = (AbstractC50812Vc) this.A04;
            if (abstractC50812Vc2 != null) {
                c28944Cps.A00(abstractC50812Vc2);
            }
            C28481ChZ.A00.A05(foaUserSession);
            AbstractC50812Vc abstractC50812Vc3 = (AbstractC50812Vc) this.A02;
            if (abstractC50812Vc3 != null) {
                c28944Cps.A00(abstractC50812Vc3);
            }
        } else {
            C6Nu c6Nu = (C6Nu) obj;
            C14360o3.A0B(c6Nu, 0);
            String str2 = this.A08;
            Object obj2 = this.A05;
            Object obj3 = this.A06;
            Object obj4 = this.A01;
            c6Nu.EoP(null, null, C5UA.A04(new C30559Dcg(obj4, obj2, obj3, this.A04, str2, 0), -1211286911, true));
            C51734MtH c51734MtH = (C51734MtH) this.A07;
            boolean z = c51734MtH.A05;
            if (!z) {
                AbstractC25227BEk.A13(c6Nu, new C30716DfE(14, this.A02, c51734MtH), 1042818072);
            }
            if (c51734MtH.A04) {
                c6Nu.CgH(null, CM2.A00);
            } else if (z) {
                Object obj5 = this.A02;
                AbstractC25227BEk.A13(c6Nu, new C30716DfE(15, obj5, c51734MtH), -804180784);
                List list2 = (List) c51734MtH.A01;
                C30378DZl c30378DZl = C30378DZl.A00;
                Object obj6 = this.A03;
                c6Nu.CgN(new X67(24, list2, c30378DZl), new C50356MLi(list2, 5), C5UA.A04(new C30752Dfp(1, obj6, obj4, list2), -1091073711, true), list2.size());
                if (AbstractC166987dD.A1b(list2)) {
                    AbstractC25227BEk.A13(c6Nu, new C30716DfE(16, obj5, c51734MtH), 1166520427);
                }
            }
        }
        return C0eB.A00;
    }
}
