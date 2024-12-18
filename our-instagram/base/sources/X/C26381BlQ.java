package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26381BlQ extends AbstractC51572Yf {
    public final UserSession A00;
    public final C75113Zb A01;
    public final C120985dq A02;

    public C26381BlQ(C120985dq c120985dq, UserSession userSession, C75113Zb c75113Zb) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c75113Zb;
        this.A02 = c120985dq;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C25548BRk A00;
        Integer num;
        double d;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, C29883DFx.A00);
        AbstractC77313dH.A00(c76223bS, new D8I(1, C29904DGs.A00(c76223bS, A002, new Object[0], 47), this), AbstractC25230BEn.A1a());
        UserSession userSession = this.A00;
        C120985dq c120985dq = this.A02;
        boolean A08 = C59942oc.A08(c120985dq, userSession);
        Number number = (Number) A002.A03;
        if (A08) {
            A00 = AbstractC58577Pxv.A01(userSession, number.longValue());
        } else {
            A00 = AbstractC58577Pxv.A00(c120985dq, userSession, number.longValue(), true, true);
        }
        if (C59942oc.A08(c120985dq, userSession)) {
            C14360o3.A0B(userSession, 0);
            userSession.A01(C63129SdZ.class, new C43203J8a(userSession, 10));
            int A07 = AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36601414946328782L);
            if (A07 == 0) {
                A07 = CJV.A00(userSession).A00;
            }
            num = Integer.valueOf(A07);
        } else {
            num = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num2 = C05F.A0Y;
        C51722Yv A003 = C9CV.A00(null, num2, enumC77933eL, 3);
        C2XE c2xe = c76223bS.A05;
        C14360o3.A0B(c2xe, 0);
        C2WK c2wk = new C2WK();
        C2XH c2xh = c2xe.A0D;
        EnumC77763e0 enumC77763e0 = EnumC77763e0.ALL;
        if (c2xh != null) {
            c2wk.A01(enumC77763e0, 5);
            c2wk.A00(enumC77763e0, AbstractC25228BEl.A09(c76223bS, R.color.green_5));
            Integer num3 = C05F.A01;
            C51722Yv A004 = C9CV.A00(A003, num3, c2wk, 3);
            float f = ((float) A00.A03) * 100.0f;
            float f2 = 85.0f - (((float) A00.A01) * 100.0f);
            C2WH A0M = AbstractC76963ci.A0M(c76223bS, AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(A004, C05F.A15, f, 1), C05F.A1I, f2, 1), C05F.A02, ((float) A00.A00) * 100.0f, 1), C05F.A03, 100.0f - (((float) A00.A02) * 100.0f), 1));
            C51722Yv A0d = AbstractC25230BEn.A0d(C9CV.A00(null, num2, EnumC77933eL.STATIC, 3), num3, 1.0f, 1);
            C2Z0 A11 = AbstractC25232BEp.A11(A0M, c2xe);
            C51722Yv A005 = C9CV.A00(null, num2, enumC77933eL, 3);
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            Integer num4 = C05F.A00;
            C51722Yv A006 = C9CV.A00(A005, num4, enumC77683ds, 3);
            C2Z0 A13 = AbstractC25232BEp.A13(A11);
            C51722Yv A0Y = AbstractC25231BEo.A0Y(C9CU.A00(C9CU.A00(C9CV.A00(C9CV.A00(null, num3, "android.widget.Button", 0), num4, AbstractC25225BEi.A0i(AbstractC77623dm.A03(A13, R.color.fds_white_alpha80)), 4), C05F.A06, 0, AbstractC77623dm.A06(A13)), C05F.A0A, 0, AbstractC77623dm.A04(A13)), DRY.A00(this, A13, 19));
            C2XE c2xe2 = A13.A00;
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe2);
            int A01 = AbstractC77623dm.A01(A0P);
            long A0r = AbstractC25232BEp.A0r(14.0f);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(A0P.A00, null, "reset history", 0);
            AbstractC25233BEq.A1B(A0P, A0a, A01, A0r);
            A0a.A0S(0);
            AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
            A0a.A0X(num4);
            AbstractC25234BEr.A1D(A0a, num4, 1.0f, false, true);
            A0a.A06(null);
            AbstractC25227BEk.A1J(A0P, A0a);
            AbstractC25227BEk.A1I(A0P, A13, A0Y);
            C51722Yv A007 = C9CV.A00(null, num4, AbstractC25225BEi.A0i(A13.BoZ().A02(R.color.grey_10_80_transparent)), 4);
            int A02 = A13.BoZ().A02(R.color.design_dark_default_color_on_background);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("dwell: ");
            A1C.append(AbstractC166997dE.A0z("%.2f", AbstractC166997dE.A1b(Float.valueOf(number.floatValue() / 1000.0f), 1)));
            A1C.append("s\nmax angle: ");
            A1C.append(AbstractC166987dD.A02(A00.A05));
            A1C.append("\nmin distance: ");
            A1C.append(A00.A04 * 16.0d);
            A1C.append("\nruleBasedGCR: ");
            C14360o3.A0B(userSession, 0);
            if (c120985dq != null && !c120985dq.CdW() && !C18U.A06(C06090Tz.A06, userSession, 36317517611406662L)) {
                d = 0.0d;
            } else if (C18U.A06(C06090Tz.A06, userSession, 36317517611996491L)) {
                C63333Shk A008 = CLT.A00(userSession);
                synchronized (A008) {
                    d = A008.A00;
                }
            } else {
                Py1 A009 = BSJ.A00(userSession);
                synchronized (A009) {
                    d = A009.A00;
                }
            }
            A1C.append(AbstractC166997dE.A0z("%.2f", AbstractC166997dE.A1b(Double.valueOf(d), 1)));
            A1C.append("\nconstraints: ");
            A1C.append(AbstractC58577Pxv.A02(c120985dq, userSession));
            C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe2, null, AbstractC167017dG.A0n(num, "\npolicy identifier: ", A1C), 0);
            AbstractC25233BEq.A1B(A13, A0a2, A02, A0r);
            A0a2.A0S(0);
            AbstractC25234BEr.A0o(typeface, A13, A0a2, A0D);
            A0a2.A0X(num4);
            AbstractC25234BEr.A1D(A0a2, num4, 1.0f, false, true);
            AbstractC25233BEq.A1A(A13, A007, A0a2);
            AbstractC25227BEk.A1H(A13, A11, A006);
            return AbstractC76963ci.A0I(A11, c76223bS, A0d);
        }
        throw AbstractC166987dD.A14("This builder has already been disposed / built!");
    }
}
