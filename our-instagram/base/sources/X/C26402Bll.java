package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Bll, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26402Bll extends AbstractC51572Yf {
    public final String A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC59172nI A02;
    public final String A03;

    public C26402Bll(InterfaceC59172nI interfaceC59172nI, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str2, 3);
        this.A02 = interfaceC59172nI;
        this.A03 = str;
        this.A00 = str2;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC31128DmB A00 = C28351CfB.A00(AbstractC28337CeP.A00(c76223bS));
        int i = 1;
        Drawable A002 = AbstractC27723CKq.A00(c76223bS, C29890DGe.A00(c76223bS, 22), AbstractC25225BEi.A1b());
        C93E c93e = null;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        InterfaceC59172nI interfaceC59172nI = this.A02;
        String str = this.A03;
        int EKF = A00.EKF(C05F.A0b);
        int EKF2 = A00.EKF(C05F.A0d);
        int EKF3 = A00.EKF(C05F.A0c);
        int EKF4 = A00.EKF(C05F.A0e);
        long A0A = AbstractC25225BEi.A0A(EKF3);
        int A003 = AbstractC28406CgC.A00(A0P, C88.A06);
        long A0M = AbstractC25230BEn.A0M();
        C2XE ArD = A0P.ArD();
        BSB bsb = new BSB(ArD, new BSA());
        BSA bsa = bsb.A01;
        bsa.A0C = true;
        bsa.A02 = A003;
        bsa.A00 = AbstractC25228BEl.A08(A0P, A0A);
        bsa.A01 = AbstractC25228BEl.A08(A0P, A0M);
        bsa.A03 = 0;
        bsa.A06 = 922746880;
        bsa.A05 = 50331648;
        bsa.A04 = -1;
        bsa.A0A = false;
        bsa.A0B = false;
        bsa.A08 = false;
        bsa.A09 = false;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A004 = C9CU.A00(null, C05F.A0N, 0, AbstractC25225BEi.A0A(EKF));
        long A0A2 = AbstractC25225BEi.A0A(EKF2);
        Integer num = C05F.A01;
        C51722Yv A005 = C9CU.A00(C9CU.A00(A004, num, 0, A0A2), C05F.A1F, 0, AbstractC25229BEm.A0F());
        C2Z0 A0P2 = AbstractC167007dF.A0P(ArD);
        if (interfaceC59172nI == null) {
            A0P2.A00(new C75723ad());
        } else {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            C51722Yv A0d = AbstractC25230BEn.A0d(null, C05F.A0Y, 1.0f, 1);
            long A0A3 = AbstractC25225BEi.A0A(EKF4);
            C51722Yv A006 = C9CU.A00(A0d, num, 0, A0A3);
            Integer num2 = C05F.A00;
            A0P2.A00(new C26620BpH(A002, null, scaleType, null, null, interfaceC59172nI, null, AbstractC25234BEr.A0H(A006, AbstractC25225BEi.A0n(num2, 0, A0A3), num2), "SearchLinkSearchInfoComponent", 0));
        }
        if (str == null) {
            str = "";
        }
        Integer num3 = C05F.A0u;
        BSB.A01(AbstractC25227BEk.A0W(new C26567BoQ(AbstractC25233BEq.A0Z(AbstractC25232BEp.A15(null, C05F.A00, EnumC77683ds.CENTER), num3, 4.0d, 0), c93e, C88.A0Z, str, num3, i, 112), A0P2, A0P, A005), bsb);
        A0P.A00(new C26555BoE(bsa, c75933ay, new C29472Cym(num, num, num), C29890DGe.A00(this, 21), null));
        return new C2WF(null, null, null, A0P.A01, false);
    }
}
