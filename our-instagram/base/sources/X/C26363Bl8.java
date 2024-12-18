package X;

import java.util.List;

/* renamed from: X.Bl8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26363Bl8 extends AbstractC51572Yf {
    public final List A00;
    public final C51722Yv A01;
    public final InterfaceC16820sZ A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A01;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        Integer num = C05F.A01;
        C75933ay c75933ay = C51722Yv.A02;
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A00 = C9CU.A00(null, C05F.A06, 0, A0J);
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2XE c2xe = A0P.A00;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168877gM c168877gM = new C168877gM(c2xe);
        c168877gM.A01(this.A00, C30147DQd.A00, C30466DbB.A00);
        A0P.A00(new C168977gW(c3f1, null, null, null, A00, null, AbstractC168947gT.A01(c2xe, c2vf, num, 0, Integer.MIN_VALUE, AbstractC25232BEp.A0n(A0P, A0D), false, z), c168877gM.A01, null, null, null, null, null, null, false, false, null, 2, null, null, null, true, false));
        String A0F = AbstractC77623dm.A0F(A0P, 2131966202);
        Integer num2 = C05F.A00;
        return AbstractC25226BEj.A0l(new C26519Bne(C9CU.A00(AbstractC25233BEq.A0Z(AbstractC25230BEn.A0d(null, C05F.A0C, 0.0f, 1), num, 36.0d, 0), C05F.A0E, 0, A0J), null, null, null, A0F, num, num2, num2, null, this.A02), A0P, c76223bS, c51722Yv);
    }

    public C26363Bl8(C51722Yv c51722Yv, List list, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = list;
        this.A02 = interfaceC16820sZ;
        this.A01 = c51722Yv;
    }
}
