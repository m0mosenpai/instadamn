package X;

import com.facebook.tigon.tigonhuc.HucClient;
import java.util.List;

/* renamed from: X.Bmb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26454Bmb extends AbstractC51572Yf {
    public final List A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16620sF A03;
    public final float A04;
    public final C51722Yv A05;

    public C26454Bmb(C51722Yv c51722Yv, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, float f) {
        AbstractC167007dF.A1F(interfaceC16620sF, 3, interfaceC16660sJ);
        this.A00 = list;
        this.A04 = f;
        this.A03 = interfaceC16620sF;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16820sZ;
        this.A05 = c51722Yv;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i = 0;
        C14360o3.A0B(c76223bS, 0);
        long j = ((C2Z3) AbstractC77183d4.A00(c76223bS, C29910DGy.A01(c76223bS, 16), new Object[0])).A00;
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DEY.A00);
        C168127f7 c168127f7 = (C168127f7) AbstractC77183d4.A00(c76223bS, DEZ.A00, new Object[0]);
        C25907BdA c25907BdA = new C25907BdA(2, c168127f7, A00, this);
        C51722Yv c51722Yv = this.A05;
        C93E c93e = null;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        float f = this.A04;
        long A0J = AbstractC25229BEm.A0J();
        int A08 = AbstractC25228BEl.A08(A0P, A0J);
        long A0F = AbstractC25229BEm.A0F();
        int A082 = AbstractC25228BEl.A08(A0P, A0F);
        ?? obj = new Object();
        obj.A00 = (AbstractC167007dF.A0K(AbstractC77363dM.A00(A0P)).widthPixels - (A08 * 2)) - A082;
        int A083 = AbstractC25228BEl.A08(A0P, A0F);
        float f2 = obj.A00 / f;
        List list = this.A00;
        if (list.size() < 2) {
            obj.A00 += A082;
        }
        Integer num = C05F.A01;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(C9CU.A00(AbstractC25230BEn.A0d(null, C05F.A00, 100.0f, 0), num, 0, ((int) f2) | 9221401712017801216L), C05F.A1I, 0, A083 | 9221401712017801216L);
        C2Z3 A0p = AbstractC25225BEi.A0p(A0J);
        C2Z3 A0p2 = AbstractC25225BEi.A0p(A0J);
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2XE ArD = A0P.ArD();
        C2V3 c2v3 = ArD.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168887gN c168887gN = new C168887gN();
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C30182DRn A01 = C30182DRn.A01(obj2, 26);
            C30170DRa A003 = C30170DRa.A00(obj2, A00, 4);
            DV3 dv3 = new DV3(A00, obj2, this, obj, i2, A08, 3, j);
            c168887gN.A01(A01.invoke(obj2), new C57261Pbj(12, new C168937gS(ArD), dv3, obj2), (Object[]) A003.invoke(obj2), 100.0f);
            i2 = i3;
        }
        A0P.A00(new C168977gW(c3f1, null, null, c25907BdA, A002, null, AbstractC168947gT.A01(ArD, c2vf, num, 0, Integer.MAX_VALUE, AbstractC25232BEp.A0n(A0P, A0D), false, z), c168887gN, c168127f7, null, A0p, A0p2, null, null, false, false, null, 2, null, null, null, true, false));
        String A0F2 = AbstractC77623dm.A0F(A0P, 2131966474);
        Integer num2 = C05F.A0O;
        return AbstractC25227BEk.A0V(new C26567BoQ(AbstractC25234BEr.A0E(C9CU.A00(null, C05F.A0E, 0, A0F), AbstractC25226BEj.A0m(0, AbstractC25229BEm.A0E()), 0, AbstractC25230BEn.A0L()), c93e, C88.A0Z, A0F2, num2, i, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A0P, c76223bS, c51722Yv);
    }
}
