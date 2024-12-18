package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IaT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41580IaT {
    public final UserSession A00;
    public final JPq A01;
    public final INL A02;

    public C41580IaT(UserSession userSession, JPq jPq, INL inl) {
        AbstractC167027dH.A13(userSession, jPq, inl);
        this.A00 = userSession;
        this.A01 = jPq;
        this.A02 = inl;
    }

    public static final C42332Iou A00(IN1 in1, IKK ikk, InterfaceC16820sZ interfaceC16820sZ) {
        String A01 = in1.A01();
        Integer num = in1.A02;
        String str = in1.A03;
        float f = in1.A00;
        C41630IbL c41630IbL = in1.A01;
        boolean A1N = AbstractC167007dF.A1N(ikk.A02);
        boolean z = true;
        if (ikk.A01 != 1) {
            z = false;
        }
        return new C42332Iou(new C38632GyZ(c41630IbL, num, str, f, A1N, ikk.A07, z), new IDQ(interfaceC16820sZ), A01);
    }
}
