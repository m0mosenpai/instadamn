package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Bog, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26583Bog extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C25377BKu A01;
    public final ClipsViewerConfig A02;
    public final C120985dq A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final C3PD A06;
    public final InterfaceC60442pS A07;
    public final User A08;
    public final InterfaceC31137Dmc A09;
    public final C37616GhB A0A;
    public final boolean A0B;
    public final float A0C;
    public final InterfaceC11380iw A0D;
    public final boolean A0E;

    public C26583Bog(C51722Yv c51722Yv, C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, InterfaceC31137Dmc interfaceC31137Dmc, C37616GhB c37616GhB, float f, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(2, c25377BKu, interfaceC11380iw, c37644Ghd);
        AbstractC25233BEq.A0y(6, interfaceC60442pS, interfaceC31137Dmc, clipsViewerConfig);
        C14360o3.A0B(c37616GhB, 10);
        this.A03 = c120985dq;
        this.A01 = c25377BKu;
        this.A05 = userSession;
        this.A0D = interfaceC11380iw;
        this.A04 = c37644Ghd;
        this.A07 = interfaceC60442pS;
        this.A08 = user;
        this.A09 = interfaceC31137Dmc;
        this.A02 = clipsViewerConfig;
        this.A0A = c37616GhB;
        this.A0B = z;
        this.A0E = z2;
        this.A00 = c51722Yv;
        this.A0C = f;
        this.A06 = new C27074Bwy(this, 5);
    }

    private final C77973eP A03(C2Z1 c2z1) {
        C27078Bx2 c27078Bx2 = new C27078Bx2(this, 0);
        C75933ay c75933ay = C51722Yv.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(44.0d);
        Integer num = C05F.A00;
        C51722Yv A15 = AbstractC25232BEp.A15(AbstractC25234BEr.A0L(null, num, 0, doubleToRawLongBits), num, EnumC77683ds.CENTER);
        User user = this.A08;
        C51722Yv A00 = C9CV.A00(A15, C05F.A0N, AbstractC77623dm.A0G(c2z1, user.getUsername(), 2131970237), 0);
        C120985dq c120985dq = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        return new C77973eP(AbstractC25233BEq.A0N(EnumC77673dr.A0Q, C9CV.A00(AbstractC25230BEn.A0d(C9CV.A00(AbstractC25396BLn.A02(EnumC71343Hv.A0N, A00, c120985dq, this.A05, interfaceC60442pS, true), C05F.A08, "profile_picture", 4), C05F.A0C, 0.0f, 1), C05F.A0D, "clips_author_info_profile_pic_component", 4)), interfaceC60442pS, user.Bhu(), c27078Bx2, c2z1.BoZ().A02(AbstractC53242c7.A04(c2z1.ArD().A0C)), 0, -16777216, false, true, false);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float f;
        AbstractC50812Vc A03;
        SpannableStringBuilder A0H;
        EnumC77923eK enumC77923eK;
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        int A0C = AbstractC166987dD.A0C(A0E, 44);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29904DGs.A01(this, 4));
        UserSession userSession = this.A05;
        float f2 = 108.0f;
        if (AbstractC28342CeU.A01(userSession)) {
            f2 = 85.0f;
        }
        if (this.A0E) {
            f = C57992lC.A01();
        } else {
            f = 0.0f;
        }
        if (AbstractC28342CeU.A00(userSession) || !AbstractC28342CeU.A01(userSession)) {
            f = AbstractC13880nE.A01(A0E, this.A0C + f + 6.0f);
        }
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num = C05F.A0Y;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0n(num, enumC77933eL));
        long A09 = AbstractC25225BEi.A09(f2);
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CU.A00(A0h, num2, 0, A09);
        Integer num3 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A002, num3, 100.0f, 0);
        C51722Yv c51722Yv = this.A00;
        C51722Yv A003 = A0d.A00(c51722Yv);
        DRT A004 = DRT.A00(this, 33);
        Integer num4 = C05F.A1F;
        C9CV A0o = AbstractC25225BEi.A0o(num4, A004, 4);
        if (A003 == c75933ay) {
            A003 = null;
        }
        C51722Yv A0h2 = AbstractC25225BEi.A0h(A003, A0o);
        long A092 = AbstractC25225BEi.A09(f);
        Integer num5 = C05F.A08;
        C51722Yv A005 = C9CU.A00(A0h2, num5, 0, A092);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        Reel reel = (Reel) A00.A03;
        C120985dq c120985dq = this.A03;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            Integer A01 = BL2.A01(c120985dq, userSession, c38321qM, false);
            C2XE ArD = A0P.ArD();
            Context A0E2 = AbstractC25225BEi.A0E(ArD);
            long A0K = AbstractC25229BEm.A0K(AbstractC14670of.A05(A0E2, A0C, AbstractC166987dD.A0C(A0E2, 54)));
            if (!this.A0B || ((A01 != num && A01 != num3 && A01 != C05F.A0N) || reel == null)) {
                A03 = A03(A0P);
            } else {
                C14360o3.A07(A0E2);
                float A006 = AbstractC14670of.A00(A0E2, AbstractC13880nE.A00(A0E2, 1.5f), A0C);
                float A012 = AbstractC14670of.A01(A0E2, AbstractC13880nE.A00(A0E2, 1.0f), A0C);
                C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(C9CU.A00(null, num3, 0, A0K), num2, 0, A0K), num, EnumC77933eL.ABSOLUTE);
                RingSpec A05 = reel.A05(userSession);
                if (A05 == null) {
                    A05 = C3PP.A00(userSession, reel);
                }
                if (reel.A16(userSession)) {
                    enumC77923eK = EnumC77923eK.A03;
                } else {
                    enumC77923eK = EnumC77923eK.A02;
                }
                C77943eM c77943eM = new C77943eM(A15, A05, enumC77923eK, Float.valueOf(A006), Float.valueOf(A012));
                C51722Yv A007 = C9CU.A00(C9CU.A00(null, C05F.A0C, 0, A0K), num, 0, A0K);
                C2Z0 A0P2 = AbstractC167007dF.A0P(ArD);
                A0P2.A00(A03(A0P2));
                A0P2.A00(c77943eM);
                A03 = AbstractC76963ci.A05(A0P2, A0P, A007);
            }
            A0P.A00(A03);
            C51722Yv A152 = AbstractC25232BEp.A15(null, num3, enumC77683ds);
            Integer num6 = C05F.A0C;
            C51722Yv A0d2 = AbstractC25230BEn.A0d(A152, num6, 0.0f, 1);
            long A0B = AbstractC25229BEm.A0B();
            C51722Yv A008 = C9CV.A00(C9CU.A00(A0d2, num5, 0, A0B), num4, DRT.A00(this, 32), 4);
            SparseArray A009 = AbstractC77703du.A00(EnumC77673dr.A0T);
            Integer num7 = C05F.A0E;
            C51722Yv A0010 = C9CV.A00(A008, num7, A009, 4).A00(c51722Yv);
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                C25377BKu c25377BKu = this.A01;
                int intValue = BL2.A00(c25377BKu, c120985dq, userSession, c38321qM2, false).intValue();
                if (intValue == 3 || (intValue != 5 && intValue != 0 && intValue != 4)) {
                    A0H = AbstractC25225BEi.A0H(c120985dq.A06().A0U);
                } else {
                    String Ayl = c120985dq.Ayl(userSession);
                    if (Ayl != null) {
                        A0H = AbstractC25225BEi.A0H(Ayl);
                        if (c25377BKu.A0K) {
                            C85963sQ.A08(AbstractC77363dM.A00(A0P), A0H, false);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                long A0D = AbstractC25229BEm.A0D();
                Typeface typeface = Typeface.DEFAULT;
                Typeface A032 = AbstractC14710oj.A03(null, typeface, num6);
                int A02 = A0P.BoZ().A02(R.color.design_dark_default_color_on_background);
                long A0D2 = AbstractC77623dm.A0D(A0P, R.dimen.backup_codes_text_size);
                C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A0H, 0);
                AbstractC25233BEq.A1B(A0P, A0a, A02, A0D2);
                A0a.A0S(1);
                AbstractC25234BEr.A0o(A032, A0P, A0a, A0D);
                AbstractC25234BEr.A1F(A0a, num6, num3);
                A0a.A0M(1);
                A0a.A01.A00 = AbstractC25228BEl.A08(A0P, A0D);
                AbstractC25229BEm.A1E(A0a);
                A0a.A0D();
                AbstractC25233BEq.A1A(A0P, A0010, A0a);
                if (!AbstractC28342CeU.A01(userSession)) {
                    C51722Yv A0011 = C9CV.A00(C9CV.A00(AbstractC25234BEr.A0E(AbstractC25233BEq.A0T(null, AbstractC25228BEl.A0n(num3, enumC77683ds), num6, 0.0f, 1), AbstractC25225BEi.A0n(num5, 0, A0B), 0, A0B), num4, DRT.A00(this, 31), 4), num7, AbstractC77703du.A00(EnumC77673dr.A0S), 4).A00(c51722Yv);
                    String A0F = AbstractC77623dm.A0F(A0P, 2131963880);
                    Typeface A033 = AbstractC14710oj.A03(null, typeface, num6);
                    int A022 = A0P.BoZ().A02(R.color.design_dark_default_color_on_background);
                    long A093 = AbstractC77623dm.A09(A0P);
                    C77723dw A0a2 = AbstractC25231BEo.A0a(ArD, null, A0F, 0);
                    AbstractC25233BEq.A1B(A0P, A0a2, A022, A093);
                    A0a2.A0S(0);
                    AbstractC25234BEr.A0o(A033, A0P, A0a2, A0D);
                    AbstractC25234BEr.A1F(A0a2, num6, num3);
                    A0a2.A0M(1);
                    A0a2.A01.A00 = AbstractC25228BEl.A08(A0P, A0D);
                    AbstractC25229BEm.A1E(A0a2);
                    A0a2.A0D();
                    AbstractC25233BEq.A1A(A0P, A0011, A0a2);
                }
                return AbstractC76963ci.A05(A0P, c76223bS, A005);
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A04(View view, User user, C26583Bog c26583Bog, String str, String str2) {
        C65 c65;
        Object obj;
        C120985dq c120985dq = c26583Bog.A03;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = c26583Bog.A05;
            C55772hI.A00(userSession).A08 = c38321qM.A38();
            C55772hI.A00(userSession).A09 = AbstractC25226BEj.A1G(c38321qM);
            AbstractC25234BEr.A1L(c120985dq, c26583Bog.A07, userSession, c26583Bog.A08);
            if (c38321qM.A58() && AbstractC002300n.A0g(AbstractC25228BEl.A18(AbstractC25226BEj.A14(c38321qM)), user.getId(), false)) {
                c65 = C65.INFLUENCER;
            } else {
                c65 = C65.BRAND;
            }
            InterfaceC31137Dmc interfaceC31137Dmc = c26583Bog.A09;
            C37644Ghd c37644Ghd = c26583Bog.A04;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            View view2 = null;
            if (C14360o3.A0K(obj, "clips_author_info_profile_pic_component")) {
                view2 = view;
            }
            interfaceC31137Dmc.Dbc(view2, c120985dq, c37644Ghd, c65, user, null, null, null, null, null, null, str, str2, null, null, false, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
