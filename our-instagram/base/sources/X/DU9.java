package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class DU9 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C25907BdA A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;
    public final /* synthetic */ C51762Yz A04;
    public final /* synthetic */ C168127f7 A05;
    public final /* synthetic */ C26576BoZ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU9(C25907BdA c25907BdA, C51762Yz c51762Yz, C51762Yz c51762Yz2, C51762Yz c51762Yz3, C168127f7 c168127f7, C26576BoZ c26576BoZ, long j) {
        super(2);
        this.A06 = c26576BoZ;
        this.A04 = c51762Yz;
        this.A01 = c25907BdA;
        this.A05 = c168127f7;
        this.A00 = j;
        this.A02 = c51762Yz2;
        this.A03 = c51762Yz3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C51722Yv A0a;
        C51722Yv c51722Yv;
        C76223bS c76223bS = (C76223bS) obj;
        long j = ((C78613fT) obj2).A00;
        C14360o3.A0B(c76223bS, 0);
        C26576BoZ c26576BoZ = this.A06;
        C7N c7n = c26576BoZ.A04;
        C7N c7n2 = C7N.A03;
        C75933ay c75933ay = C51722Yv.A02;
        if (c7n == c7n2) {
            A0a = AbstractC25230BEn.A0d(null, C05F.A01, 100.0f, 0);
        } else {
            A0a = AbstractC25233BEq.A0a(null, C05F.A0Y, c7n.A00);
        }
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0a, num, 100.0f, 0);
        if (c7n == c7n2) {
            C51762Yz c51762Yz = this.A04;
            c51762Yz.A03(new JXD(j, 18));
            c51722Yv = C9CU.A00(null, C05F.A0j, 0, AbstractC25229BEm.A0K(AbstractC166987dD.A0H(c51762Yz.A03)));
        } else {
            c51722Yv = c75933ay;
        }
        C9CT A0m = AbstractC25225BEi.A0m(num, 100.0f, 0);
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A00 = C9CU.A00(AbstractC25225BEi.A0h(c51722Yv, A0m), C05F.A06, 0, AbstractC25229BEm.A0J());
        List list = c26576BoZ.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj3 : list) {
            if ((obj3 instanceof C3R) || (obj3 instanceof C3S)) {
                A1E.add(obj3);
            }
        }
        int i = c26576BoZ.A00;
        AbstractC70653Fc abstractC70653Fc = c26576BoZ.A01;
        C51722Yv c51722Yv2 = c26576BoZ.A02;
        C29890DGe A002 = C29890DGe.A00(this.A02, 35);
        C25907BdA c25907BdA = this.A01;
        C168127f7 c168127f7 = this.A05;
        C2Z3 A0p = AbstractC25225BEi.A0p(this.A00);
        C51762Yz c51762Yz2 = this.A03;
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2XE c2xe = c76223bS.A05;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C28943Cpr c28943Cpr = new C28943Cpr(c2xe);
        c28943Cpr.A00(A1E, DQQ.A00, null, new DT0(23, c26576BoZ, A0d, c51762Yz2, A00));
        return new C168977gW(c3f1, abstractC70653Fc, null, c25907BdA, c51722Yv2, null, new C212149aj(c2xe, c2vf, 1, i, AbstractC25232BEp.A0n(c76223bS, A0D), 2, z), c28943Cpr.A01, c168127f7, null, null, null, null, A0p, null, null, null, 2, null, A002, null, false, false);
    }
}
