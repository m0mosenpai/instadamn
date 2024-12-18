package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bmr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26470Bmr extends AbstractC51572Yf {
    public final UserAccountInfo A00;
    public final UserAccountInfo A01;
    public final CWZ A02;
    public final FoaUserSession A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C26470Bmr(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, CWZ cwz, FoaUserSession foaUserSession, Integer num, String str, String str2) {
        C14360o3.A0B(num, 7);
        this.A03 = foaUserSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = userAccountInfo;
        this.A01 = userAccountInfo2;
        this.A02 = cwz;
        this.A04 = num;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        double d;
        C14360o3.A0B(c76223bS, 0);
        AbstractC77313dH.A00(c76223bS, C29892DGg.A00(this, 44), AbstractC25225BEi.A1b());
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            Integer num = this.A04;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    i = 2131977149;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = 2131975096;
            }
            String A0F = AbstractC77623dm.A0F(c76223bS, i);
            InterfaceC16820sZ A00 = AbstractC85303rL.A00(c76223bS, DH2.A01(A06, c76223bS, this, 5));
            if (num == C05F.A01) {
                d = 16.0d;
            } else {
                d = 0.0d;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            AbstractC27448C9q A01 = AbstractC28336CeO.A01(c76223bS, EnumC27353C5i.A02);
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0E = AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(C05F.A08, 0, Double.doubleToRawLongBits(-8.0d)), 0, doubleToRawLongBits);
            long A0D = AbstractC25229BEm.A0D();
            C3F1 c3f1 = AbstractC169037gc.A00;
            C2V3 c2v3 = c2xe.A02.A01;
            C2VF c2vf = c2v3.A02;
            boolean z = c2v3.A0W;
            C168877gM c168877gM = new C168877gM(c2xe);
            AbstractC28336CeO.A02(c168877gM, A01, new MI7(this, A00, A0F, 40));
            return new C168977gW(c3f1, null, null, null, A0E, null, AbstractC168947gT.A00(c2xe, c2vf, AbstractC25232BEp.A0n(c76223bS, A0D), z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false);
        }
        throw AbstractC166997dE.A0g();
    }
}
