package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Bmk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26463Bmk extends AbstractC51572Yf {
    public final C120985dq A00;
    public final UserSession A01;
    public final InterfaceC31137Dmc A02;
    public final InterfaceC31048Dkm A03;
    public final InterfaceC60442pS A04;
    public final C75113Zb A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        String str2;
        long j;
        long A01;
        long j2;
        long A0N;
        long j3;
        Double d;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29904DGs.A01(this, 44));
        C75113Zb c75113Zb = this.A05;
        boolean A1a = AbstractC166987dD.A1a(c75113Zb.A3Z.A00);
        C51762Yz A012 = AbstractC77273dD.A01(c76223bS, c75113Zb, DRE.A00, 70, false);
        C51762Yz A013 = AbstractC77273dD.A01(c76223bS, c75113Zb, DRF.A00, 66, false);
        C51762Yz A014 = AbstractC77273dD.A01(c76223bS, c75113Zb, DRG.A00, 69, false);
        C51762Yz A015 = AbstractC77273dD.A01(c76223bS, c75113Zb, DRD.A00, 71, false);
        long BYI = this.A02.BYI();
        C29893DGh.A00(c76223bS, new C29559D0l(1, A00, this), this, new Object[]{this.A03}, 49);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(AbstractC25233BEq.A0Q(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3)), 48.0d), C05F.A06, 0, AbstractC25230BEn.A0L());
        int A09 = AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background);
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(A002, num, AbstractC25225BEi.A0i(A09));
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        C51722Yv A003 = C9CV.A00(null, num, EnumC77683ds.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, "AutoScroll Debug", 0);
        A0a.A0Q(-16777216);
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        AbstractC25230BEn.A1K(A0a, c2xh, 0, Float.floatToRawIntBits(18.0f) | 9221683186994511872L);
        A0a.A0T(typeface);
        AbstractC25234BEr.A19(A0a, c2xh, num, A0D);
        A0a.A0b(false);
        A0a.A0N(0);
        A0a.A0E();
        AbstractC25233BEq.A1D(A003, A0a, false);
        A1E.add(A0a.A0A());
        String A1D = AnonymousClass001.A1D("Is Eligible For AutoScroll?: ", AbstractC25229BEm.A1W(A00));
        long A0J = AbstractC25231BEo.A0J();
        C77723dw A0g = AbstractC25233BEq.A0g(c2xe, A1D, -16777216);
        AbstractC25230BEn.A1K(A0g, c2xh, 0, A0J);
        A0g.A0T(typeface);
        AbstractC25234BEr.A19(A0g, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g, A1E);
        C77723dw A0g2 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A1D("Show AutoScroll Countdown?: ", A1a), -16777216);
        AbstractC25230BEn.A1K(A0g2, c2xh, 0, A0J);
        A0g2.A0T(typeface);
        AbstractC25234BEr.A19(A0g2, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g2, A1E);
        C09530e4 c09530e4 = (C09530e4) A015.A03;
        if (c09530e4 != null) {
            str = (String) c09530e4.A00;
        } else {
            str = null;
        }
        C77723dw A0g3 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Cancel Reason: ", str), -16777216);
        AbstractC25230BEn.A1K(A0g3, c2xh, 0, A0J);
        A0g3.A0T(typeface);
        AbstractC25234BEr.A19(A0g3, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g3, A1E);
        if (c09530e4 != null) {
            str2 = (String) c09530e4.A01;
        } else {
            str2 = null;
        }
        C77723dw A0g4 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Cancel Behavior: ", str2), -16777216);
        AbstractC25230BEn.A1K(A0g4, c2xh, 0, A0J);
        A0g4.A0T(typeface);
        AbstractC25234BEr.A19(A0g4, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g4, A1E);
        C77723dw A0g5 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0I("Loops Left: ", ' ', AbstractC166987dD.A0H(A012.A03)), -16777216);
        AbstractC25230BEn.A1K(A0g5, c2xh, 0, A0J);
        A0g5.A0T(typeface);
        AbstractC25234BEr.A19(A0g5, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g5, A1E);
        C120985dq c120985dq = this.A00;
        UserSession userSession = this.A01;
        C75363a3 A0A = c120985dq.A0A(userSession, null);
        if (A0A != null && (d = A0A.A0C) != null) {
            j = C36J.A03(C36H.A02(C36G.A09, d.doubleValue()));
        } else {
            j = 1000;
        }
        boolean CdW = c120985dq.CdW();
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (CdW) {
            if (C18U.A06(A0j, userSession, 36323474726137126L)) {
                A01 = C18U.A01(A0j, userSession, 36604949702775995L);
            } else {
                A01 = C18U.A01(A0j, userSession, 36604949701989559L);
            }
        } else if (C18U.A06(A0j, userSession, 36322577078233423L)) {
            A01 = C18U.A01(A0j, userSession, 36604052054873113L);
        } else {
            A01 = C18U.A01(A0j, userSession, 36604052053824532L);
        }
        if (c120985dq.CdW()) {
            j2 = 36604949701924022L;
        } else {
            j2 = 36604052053890069L;
        }
        long A016 = C18U.A01(A0j, userSession, j2);
        C36G c36g = C36G.A09;
        long A03 = C36J.A03(C36H.A04(c36g, A016));
        if (A01 * j < A03) {
            A01 = (long) Math.ceil(A03 / j);
        }
        C77723dw A0g6 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0K("Required Loops: ", ' ', A01), -16777216);
        AbstractC25230BEn.A1K(A0g6, c2xh, 0, A0J);
        A0g6.A0T(typeface);
        AbstractC25234BEr.A19(A0g6, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g6, A1E);
        C77723dw A0g7 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0K("Sequential Autoscrolls: ", ' ', BYI), -16777216);
        AbstractC25230BEn.A1K(A0g7, c2xh, 0, A0J);
        A0g7.A0T(typeface);
        AbstractC25234BEr.A19(A0g7, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g7, A1E);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && c38321qM.A5x()) {
            A0N = AbstractC166987dD.A0N(A013.A03);
        } else {
            A0N = AbstractC166987dD.A0N(A014.A03);
        }
        C77723dw A0g8 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0K("Remaining Time: ", ' ', A0N), -16777216);
        AbstractC25230BEn.A1K(A0g8, c2xh, 0, A0J);
        A0g8.A0T(typeface);
        AbstractC25234BEr.A19(A0g8, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g8, A1E);
        if (c120985dq.CdW()) {
            j3 = 36604949702382777L;
        } else {
            j3 = 36604052053758995L;
        }
        C77723dw A0g9 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0Q("Countdown Value: ", C36J.A03(C36H.A04(c36g, C18U.A01(A0j, userSession, j3)))), -16777216);
        AbstractC25230BEn.A1K(A0g9, c2xh, 0, A0J);
        A0g9.A0T(typeface);
        AbstractC25234BEr.A19(A0g9, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g9, A1E);
        C77723dw A0g10 = AbstractC25233BEq.A0g(c2xe, AnonymousClass001.A0R("Container Module: ", this.A04.getModuleName()), -16777216);
        AbstractC25230BEn.A1K(A0g10, c2xh, 0, A0J);
        A0g10.A0T(typeface);
        AbstractC25234BEr.A19(A0g10, c2xh, num, A0D);
        AbstractC25234BEr.A1K(A0g10, A1E);
        C2WF c2wf = new C2WF(null, null, null, A1E, false);
        A16.A01(c2wf.A0a(), c76223bS.ArD());
        return c2wf;
    }

    public C26463Bmk(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31048Dkm interfaceC31048Dkm) {
        AbstractC167017dG.A1P(interfaceC31048Dkm, userSession);
        C14360o3.A0B(interfaceC31137Dmc, 6);
        this.A03 = interfaceC31048Dkm;
        this.A01 = userSession;
        this.A05 = c75113Zb;
        this.A04 = interfaceC60442pS;
        this.A00 = c120985dq;
        this.A02 = interfaceC31137Dmc;
    }
}
