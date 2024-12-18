package X;

import android.content.Context;
import android.text.Spanned;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.BoD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26554BoD extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final UserAccountInfo A03;
    public final UserAccountInfo A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        C6Z c6z;
        C14360o3.A0B(c76223bS, 0);
        AbstractC77313dH.A00(c76223bS, C29892DGg.A00(this, 46), AbstractC25225BEi.A1b());
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            Context A00 = AbstractC77363dM.A00(c76223bS);
            UserAccountInfo userAccountInfo = this.A03;
            C14360o3.A0B(userAccountInfo, 1);
            Spanned A01 = AbstractC07900bA.A01(A00.getResources(), new String[]{userAccountInfo.A0A}, 2131975105);
            C14360o3.A07(A01);
            FoaUserSession foaUserSession = this.A00;
            C14360o3.A0B(foaUserSession, 0);
            String str = AbstractC28057CYl.A00(foaUserSession).userId;
            C14360o3.A0B(str, 0);
            long j = AbstractC19750y3.A01(C1AV.A1V.toString()).getLong(AbstractC71973Kv.A00(str), 0L);
            if (j != 0 && j >= System.currentTimeMillis()) {
                if (j == Long.MAX_VALUE) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A00;
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    c6z = C6Z.A03;
                } else {
                    c6z = C6Z.A02;
                }
            } else {
                c6z = C6Z.A04;
            }
            C51762Yz A002 = AbstractC77073ct.A00(c76223bS, C29890DGe.A00(c6z, 1));
            C30179DRk A012 = C30179DRk.A01(A002, 39);
            AbstractC27448C9q A013 = AbstractC28336CeO.A01(c76223bS, EnumC27353C5i.A02);
            C75933ay c75933ay = C51722Yv.A02;
            long A0M = AbstractC25230BEn.A0M();
            Integer num2 = C05F.A08;
            C51722Yv A003 = C9CU.A00(null, num2, 0, A0M);
            long A0F = AbstractC25229BEm.A0F();
            C51722Yv A004 = C9CU.A00(A003, C05F.A1I, 0, A0F);
            long A0D = AbstractC25229BEm.A0D();
            Integer num3 = C05F.A00;
            C3F1 c3f1 = AbstractC169037gc.A00;
            C2V3 c2v3 = c2xe.A02.A01;
            C2VF c2vf = c2v3.A02;
            boolean z = c2v3.A0W;
            C168877gM c168877gM = new C168877gM(c2xe);
            C51722Yv A005 = C9CU.A00(null, C05F.A0A, 0, AbstractC25230BEn.A0K());
            Integer num4 = C05F.A04;
            C51722Yv A006 = C9CU.A00(A005, num4, 0, A0F);
            C2XE c2xe2 = c168877gM.A00;
            c168877gM.A00(AbstractC25227BEk.A0W(new C26488Bn9(EnumC72394Xcg.A2B, null, C93E.TEXT_START, A01, num3, 0, A0M, AbstractC25229BEm.A0G()), AbstractC167007dF.A0P(c2xe2), c168877gM, A006), null, -1.0f, -1.0f);
            AbstractC28336CeO.A02(c168877gM, A013, new C30184DRp(40, A002, A012, this));
            C51722Yv A0F2 = AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(num4, 0, A0F), 0, AbstractC25230BEn.A0N());
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe2);
            C2Z0 A13 = AbstractC25232BEp.A13(A0P);
            String A0F3 = AbstractC77623dm.A0F(A13, 2131975107);
            Integer num5 = C05F.A01;
            boolean A1a = AbstractC25229BEm.A1a(c6z, A002.A03);
            MEB meb = new MEB(36, A06, c6z, this, A13, A002);
            EnumC27424C8r enumC27424C8r = EnumC27424C8r.FILLED;
            C28138Cal c28138Cal = C28138Cal.A00;
            A13.A00(new C26499BnK(enumC27424C8r, null, c28138Cal, A0F3, num5, num3, num3, meb, A1a));
            A13.A00(new C26499BnK(enumC27424C8r, new C51722Yv(null, null).A00(C9CU.A00(null, num2, 0, AbstractC25230BEn.A0L())), c28138Cal, AbstractC77623dm.A0F(A13, 2131975102), num5, num5, num3, C29890DGe.A00(A06, 0), true));
            c168877gM.A00(AbstractC25227BEk.A0V(AbstractC76963ci.A00(A13), A0P, c168877gM, A0F2), null, -1.0f, -1.0f);
            return new C168977gW(c3f1, null, null, null, A004, null, AbstractC168947gT.A00(c2xe, c2vf, AbstractC25232BEp.A0n(c76223bS, A0D), z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C29456CyW A03(C6Z c6z, C6Z c6z2) {
        EnumC72438Xdi enumC72438Xdi;
        EnumC27424C8r enumC27424C8r;
        EnumC27423C8q enumC27423C8q;
        EnumC72394Xcg enumC72394Xcg;
        if (c6z == c6z2) {
            enumC72438Xdi = EnumC72438Xdi.CIRCLE_CIRCLE;
            enumC27424C8r = EnumC27424C8r.OUTLINE;
            enumC27423C8q = EnumC27423C8q.SIZE_24;
            enumC72394Xcg = EnumC72394Xcg.A39;
        } else {
            enumC72438Xdi = EnumC72438Xdi.CIRCLE;
            enumC27424C8r = EnumC27424C8r.OUTLINE;
            enumC27423C8q = EnumC27423C8q.SIZE_24;
            enumC72394Xcg = EnumC72394Xcg.A38;
        }
        return new C29456CyW(enumC72438Xdi, null, enumC27423C8q, enumC27424C8r, enumC72394Xcg);
    }

    public C26554BoD(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, FoaUserSession foaUserSession, String str, String str2) {
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = userAccountInfo;
        this.A04 = userAccountInfo2;
    }
}
