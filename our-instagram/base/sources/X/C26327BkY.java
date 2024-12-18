package X;

import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.BkY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26327BkY extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final InterfaceC16820sZ A01;

    public C26327BkY(C51722Yv c51722Yv, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c51722Yv, 2);
        this.A00 = c51722Yv;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A00;
        long A0F = AbstractC25229BEm.A0F();
        Integer num = C05F.A06;
        C9CU A0n = AbstractC25225BEi.A0n(num, 0, A0F);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0n);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        String A0F2 = AbstractC77623dm.A0F(A12, 2131966507);
        Integer num2 = C05F.A02;
        C88 c88 = C88.A0i;
        A12.A00(new C26567BoQ(AbstractC25233BEq.A0Z(null, num, 2.0d, 0), null, c88, A0F2, num2, 1, 112));
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            A12.A00(new C26567BoQ(AbstractC25233BEq.A0d(AbstractC25233BEq.A0Z(null, num, 8.0d, 0), C30182DRn.A01(interfaceC16820sZ, 25)), null, c88, AbstractC77623dm.A0F(A12, 2131966494), C05F.A0A, 0, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
        }
        return AbstractC76963ci.A05(A12, c76223bS, A0h);
    }
}
