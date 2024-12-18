package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bm4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26421Bm4 extends AbstractC51572Yf {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final InterfaceC16660sJ A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        String[] strArr = {AbstractC77623dm.A0F(c76223bS, 2131956476), AbstractC77623dm.A0F(c76223bS, 2131956473), AbstractC77623dm.A0F(c76223bS, 2131956477), AbstractC77623dm.A0F(c76223bS, 2131956475), AbstractC77623dm.A0F(c76223bS, 2131956474)};
        C14360o3.A0B(strArr, 0);
        List A0I = AbstractC009903n.A0I(strArr);
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        int color = context.getColor(AbstractC53242c7.A0D(context));
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(C9CU.A00(AbstractC25230BEn.A0e(AbstractC25233BEq.A0b(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, AbstractC25225BEi.A0i(color), 4)), num, 0), C05F.A0Y, C30185DRq.A02(this, 8), null), C05F.A05, 0, AbstractC25229BEm.A0B()), C05F.A01, 0, AbstractC25229BEm.A0I());
        long A0J = AbstractC25229BEm.A0J();
        C25906Bd9 A002 = CCM.A00(c76223bS, AbstractC25225BEi.A0p(A0J), AbstractC25225BEi.A0p(A0J), AbstractC25225BEi.A0p(A0J));
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168877gM c168877gM = new C168877gM(c2xe);
        c168877gM.A01(A0I, DMW.A00, new C30192DRx(this, 4));
        return new C168977gW(c3f1, A002, null, null, A00, null, AbstractC168947gT.A01(c2xe, c2vf, num, 0, Integer.MIN_VALUE, AbstractC25232BEp.A0n(c76223bS, A0D), false, z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false);
    }

    public C26421Bm4(UserSession userSession, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1P(userSession, interfaceC16660sJ);
        this.A00 = userSession;
        this.A04 = interfaceC16660sJ;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }
}
