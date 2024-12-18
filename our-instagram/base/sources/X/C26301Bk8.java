package X;

import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.Bk8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26301Bk8 extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;

    public C26301Bk8(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0F = AbstractC25229BEm.A0F();
        Integer num = C05F.A06;
        C93E c93e = null;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(null, num, A1Z ? 1 : 0, A0F), C05F.A01, 100.0f, A1Z ? 1 : 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        String A0F2 = AbstractC77623dm.A0F(A12, 2131966554);
        Integer num2 = C05F.A02;
        C88 c88 = C88.A0Z;
        A12.A00(new C26567BoQ(AbstractC25233BEq.A0Z(null, num, 2.0d, A1Z ? 1 : 0), c93e, c88, A0F2, num2, 1, 112));
        String A0F3 = AbstractC77623dm.A0F(A12, 2131966559);
        Integer num3 = C05F.A0A;
        A12.A00(new C26567BoQ(AbstractC25233BEq.A0d(AbstractC25233BEq.A0Z(null, num, 8.0d, A1Z ? 1 : 0), C30181DRm.A01(this, 9)), c93e, c88, A0F3, num3, A1Z ? 1 : 0, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
        return AbstractC76963ci.A05(A12, c76223bS, A0d);
    }
}
