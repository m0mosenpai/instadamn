package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.DuV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31603DuV implements InterfaceC37234Gaj {
    public InterfaceC16660sJ A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C31605DuX A03;
    public final Activity A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final C18920wW A07;
    public final C31539DtP A08;

    public C31603DuV(Activity activity, Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A05 = context;
        this.A04 = activity;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A06 = abstractC59962oe;
        this.A03 = new C31605DuX(context, userSession);
        this.A07 = AbstractC12220kQ.A01(abstractC59962oe, userSession);
        this.A08 = new C31539DtP(userSession, new C31604DuW(this), null);
        this.A00 = C31642Dv8.A00;
    }

    public final void A03(C32071E6x c32071E6x, InterfaceC37158GYv interfaceC37158GYv, C2EC c2ec) {
        List list;
        Context context = this.A05;
        UserSession userSession = this.A02;
        String C7I = c2ec.C7I();
        if (C7I != null) {
            List A1J = AbstractC166987dD.A1J(C7I);
            InterfaceC11380iw interfaceC11380iw = this.A06;
            C32902Edj c32902Edj = new C32902Edj(this, interfaceC37158GYv, c2ec);
            List Axh = c2ec.Axh();
            if (Axh != null && !Axh.isEmpty()) {
                list = AbstractC166987dD.A1J(Axh);
            } else {
                list = C16930sl.A00;
            }
            C35250Fgj.A00(context, c32071E6x, interfaceC11380iw, userSession, c32902Edj, A1J, list, false, c2ec.CVQ());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (X.AbstractC31171DnF.A1V(r11, r2) != false) goto L10;
     */
    @Override // X.InterfaceC37234Gaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AE5(X.C2EC r27) {
        /*
            r26 = this;
            r6 = 0
            r7 = r27
            java.util.List r0 = r7.BSH()
            java.lang.Object r14 = r0.get(r6)
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            r0 = r26
            com.instagram.common.session.UserSession r11 = r0.A02
            X.2oe r8 = r0.A01
            androidx.fragment.app.FragmentActivity r9 = r8.requireActivity()
            X.0iw r10 = r0.A06
            boolean r1 = r7.isPending()
            int r0 = r7.BT2()
            r3 = 1
            if (r1 != 0) goto L93
            if (r0 != r3) goto L93
        L26:
            r0 = 1
        L27:
            r25 = r0 ^ 1
            r5 = 2
            r0 = 3
            X.C14360o3.A0B(r14, r0)
            r0 = r7
            X.3kb r0 = (X.C81663kb) r0
            X.3iy r0 = r0.A01
            X.3kR r0 = r0.A0v
            com.instagram.model.direct.DirectThreadKey r13 = r7.BKb()
            boolean r19 = r7.CVQ()
            boolean r20 = r7.isPending()
            r7.BKb()
            boolean r22 = r7.CX1()
            java.lang.String r1 = r11.userId
            boolean r23 = r7.CfH(r1)
            int r4 = r7.C7g()
            java.lang.String r2 = r7.Asv()
            r1 = 29
            if (r4 != r1) goto L62
            boolean r1 = X.AbstractC31171DnF.A1V(r11, r2)
            r24 = 1
            if (r1 == 0) goto L64
        L62:
            r24 = 0
        L64:
            android.os.Parcelable$Creator r1 = com.instagram.direct.capabilities.Capabilities.CREATOR
            if (r0 == 0) goto L8c
            long[] r2 = new long[r5]
            long r4 = r0.A00
            r2[r6] = r4
            long r0 = r0.A01
            r2[r3] = r0
            com.instagram.direct.capabilities.Capabilities r12 = X.AbstractC2054797v.A01(r2)
        L76:
            int r17 = r7.C7g()
            java.lang.String r15 = r7.C7I()
            java.lang.String r16 = r7.C7q()
            int r18 = r7.BuY()
            r21 = r6
            X.C35140Feh.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L8c:
            X.0sl r0 = X.C16930sl.A00
            com.instagram.direct.capabilities.Capabilities r12 = X.AbstractC2054797v.A00(r0)
            goto L76
        L93:
            boolean r0 = X.C2E8.A00(r11)
            if (r0 == 0) goto La0
            boolean r0 = r7.isPending()
            if (r0 == 0) goto La0
            goto L26
        La0:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31603DuV.AE5(X.2EC):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1kW, X.1OW] */
    @Override // X.InterfaceC37234Gaj
    public final void ANk(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        UserSession userSession = this.A02;
        JTa A08 = AbstractC31277Doz.A08(userSession, C34911kW.class);
        C14360o3.A0B(A08, 1);
        ?? c1ow = new C1OW(A08);
        c1ow.A00 = directThreadKey;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOm(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        this.A03.A02(c3o9, C05F.A0Y);
    }

    @Override // X.InterfaceC37234Gaj
    public final void APj(C2EC c2ec) {
        String C7I = c2ec.C7I();
        if (C7I != null) {
            AbstractC31278Dp0.A0I(this.A02, C7I, false);
        }
        UserSession userSession = this.A02;
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(userSession).A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        String A00 = AbstractC111324zv.A00(4274);
        AbstractC167017dG.A1L(ARD, interfaceC19630xq, A00, 0);
        C37091o7.A00();
        Context context = this.A05;
        if (interfaceC19630xq.getInt(A00, 0) % 3 == 0) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0U = new C36720GGp(4);
            C189478aR A002 = A0y.A00();
            String A0n = AbstractC166997dE.A0n();
            EnumC39589Hdz enumC39589Hdz = EnumC39589Hdz.A0K;
            N4V n4v = new N4V();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString(AbstractC31670Dva.A00(), A0n);
            A0b.putSerializable("entrypoint", enumC39589Hdz);
            n4v.setArguments(A0b);
            A002.A03(context, n4v);
        }
        C2DS c2ds = (C2DS) this.A00.invoke(userSession);
        C2DU c2du = (C2DU) c2ds;
        C2DU.A00(c2ec, c2du).A0K(false);
        c2du.ELj();
        c2ds.FCS(c2ec.BKb());
    }

    @Override // X.InterfaceC37234Gaj
    public final void AVy(C3o9 c3o9, boolean z) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        if (F3W.A00(userSession, z)) {
            C35244Fgd.A02(this.A05, this.A06, userSession, "flag", "inbox", A01.A00);
        } else {
            F5G.A00(userSession, A01, true);
            C162337Ov.A0n(userSession, A01.A00, z);
        }
    }

    @Override // X.InterfaceC37234Gaj
    public final void CMQ(C3o9 c3o9, boolean z) {
        C35244Fgd c35244Fgd = C35244Fgd.A00;
        Context context = this.A05;
        UserSession userSession = this.A02;
        c35244Fgd.A04(context, new C32071E6x(0), userSession, (C2DS) this.A00.invoke(userSession), JRE.A01(c3o9), new C50170MDx(18, c3o9, this), z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CnI(C3o9 c3o9, Integer num, boolean z) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        if (z && AbstractC31177DnL.A1U(C06090Tz.A06, userSession, 2342153620511981759L)) {
            C35244Fgd.A02(this.A05, this.A06, userSession, "mark_as_unread", "inbox", A01.A00);
            return;
        }
        AbstractC31278Dp0.A0C(userSession, A01, true);
        String str = A01.A00;
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        AbstractC31171DnF.A1C(A07, "thread_mark_unread");
        AbstractC31171DnF.A1F(A07, str);
        AbstractC31180DnO.A1J(A07, z);
        if (num != null) {
            A07.A9K("position", AbstractC25229BEm.A0n(num));
        }
        A07.Cht();
    }

    @Override // X.InterfaceC37234Gaj
    public final void CoH(C32071E6x c32071E6x, C3o9 c3o9, Integer num, boolean z) {
        C14360o3.A0B(c3o9, 0);
        UserSession userSession = this.A02;
        BizUserInboxState A0E = AbstractC31179DnN.A0E(userSession);
        if (c32071E6x.A00 == 1 && A0E == BizUserInboxState.A04 && C18U.A06(C06090Tz.A05, userSession, 36312694357230808L)) {
            C35244Fgd.A00(this.A04, this.A05, userSession);
        } else {
            C35244Fgd.A00.A04(this.A05, c32071E6x, userSession, (C2DS) this.A00.invoke(userSession), JRE.A01(c3o9), new BUO(2, this, c32071E6x, num, c3o9, z), false);
        }
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqB(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        A02(c3o9, true);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqD(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A04(this.A06, userSession, str, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqE(C3o9 c3o9, int i) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A02(this.A06, userSession, str, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqM(C3o9 c3o9, int i) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A03(this.A06, userSession, str, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void E2y(C2EC c2ec) {
        DirectThreadKey BKb = c2ec.BKb();
        C14360o3.A0C(BKb, AbstractC111324zv.A00(242));
        new C35032Fc5(BKb).A02(this.A04, this.A06, this.A02, c2ec, C05F.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void E31(C3o9 c3o9, boolean z) {
        C14360o3.A0B(c3o9, 0);
        Activity activity = this.A04;
        String A15 = AbstractC31172DnG.A15(c3o9);
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0e(null, "Ok");
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Is Instamadillo cutover thread: ");
        A1C.append(z);
        A1C.append("\nIs legacy Armadillo thread: ");
        A1C.append(false);
        A1C.append("\nThreadId: ");
        A0H.A0r(AbstractC166997dE.A0x(A15, A1C));
        AbstractC166987dD.A1W(A0H);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EI0(C2EC c2ec) {
        String str;
        User user = (User) c2ec.BSH().get(0);
        UserSession userSession = this.A02;
        boolean A0P = C6X6.A0P(userSession, c2ec);
        FragmentActivity requireActivity = this.A01.requireActivity();
        InterfaceC11380iw interfaceC11380iw = this.A06;
        C14360o3.A0B(user, 3);
        int C7g = c2ec.C7g();
        boolean CX1 = c2ec.CX1();
        c2ec.BKb();
        String C7I = c2ec.C7I();
        String C7q = c2ec.C7q();
        String A03 = C7KH.A03(c2ec.BKb());
        if (A03 != null) {
            int BuY = c2ec.BuY();
            List BSH = c2ec.BSH();
            C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
            if (A0g != null) {
                str = A0g.A07;
            } else {
                str = null;
            }
            C35225FgI.A00(requireActivity, interfaceC11380iw, userSession, null, user, C7I, C7q, A03, str, BSH, C7g, BuY, CX1, false, A0P);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void EKc(C2EC c2ec) {
        User user = (User) c2ec.BSH().get(0);
        Context context = this.A05;
        UserSession userSession = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C18920wW c18920wW = this.A07;
        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
        InterfaceC11380iw interfaceC11380iw = this.A06;
        C31539DtP c31539DtP = this.A08;
        AbstractC167007dF.A1G(user, 3, c18920wW);
        C14360o3.A0B(c31539DtP, 8);
        DirectThreadKey BKb = c2ec.BKb();
        boolean CVQ = c2ec.CVQ();
        c2ec.BKb();
        C35141Fei.A00(context, requireActivity, A00, interfaceC11380iw, c18920wW, userSession, c31539DtP, BKb, user, c31539DtP, CVQ, false, c2ec.CX1());
    }

    @Override // X.InterfaceC37234Gaj
    public final void F99(C3o9 c3o9, boolean z) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        if (F3W.A00(userSession, z)) {
            C35244Fgd.A02(this.A05, this.A06, userSession, "flag", "inbox", A01.A00);
            return;
        }
        F5G.A00(userSession, A01, false);
        String str = A01.A00;
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        AbstractC31171DnF.A1C(A07, "thread_unflag");
        AbstractC31171DnF.A1F(A07, str);
        AbstractC31180DnO.A1J(A07, z);
        A07.Cht();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9K(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        A02(c3o9, false);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9M(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A04(this.A06, userSession, str, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9O(C3o9 c3o9) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A05(this.A06, userSession, str, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9R(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A06(this.A06, userSession, str, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r3.userId.equals(r2.Asv()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C31603DuV r8, X.C3o9 r9, boolean r10) {
        /*
            X.0sJ r0 = r8.A00
            com.instagram.common.session.UserSession r3 = r8.A02
            java.lang.Object r1 = r0.invoke(r3)
            X.2DS r1 = (X.C2DS) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.JRE.A01(r9)
            X.3kb r2 = r1.B3U(r0)
            if (r2 == 0) goto L45
            int r0 = r2.C7g()
            r1 = 29
            if (r0 != r1) goto L45
            X.6ck r4 = X.AbstractC147806l5.A00(r3)
            int r8 = r2.AdZ()
            java.lang.String r6 = r2.C7I()
            java.lang.String r7 = r2.C7q()
            int r0 = r2.C7g()
            if (r0 != r1) goto L3f
            java.lang.String r1 = r3.userId
            java.lang.String r0 = r2.Asv()
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L40
        L3f:
            r9 = 0
        L40:
            java.lang.Integer r5 = X.C05F.A00
            r4.A0N(r5, r6, r7, r8, r9, r10)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31603DuV.A00(X.DuV, X.3o9, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r3.userId.equals(r2.Asv()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(X.C3o9 r11) {
        /*
            r10 = this;
            X.0sJ r0 = r10.A00
            com.instagram.common.session.UserSession r3 = r10.A02
            java.lang.Object r1 = r0.invoke(r3)
            X.2DS r1 = (X.C2DS) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.JRE.A01(r11)
            X.3kb r2 = r1.B3U(r0)
            if (r2 == 0) goto L45
            int r0 = r2.C7g()
            r1 = 29
            if (r0 != r1) goto L45
            X.6ck r4 = X.AbstractC147806l5.A00(r3)
            int r8 = r2.AdZ()
            java.lang.String r6 = r2.C7I()
            java.lang.String r7 = r2.C7q()
            int r0 = r2.C7g()
            if (r0 != r1) goto L3f
            java.lang.String r1 = r3.userId
            java.lang.String r0 = r2.Asv()
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L40
        L3f:
            r9 = 0
        L40:
            java.lang.Integer r5 = X.C05F.A00
            r4.A0L(r5, r6, r7, r8, r9)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31603DuV.A01(X.3o9):void");
    }

    @Override // X.InterfaceC37234Gaj
    public final void A7B(InterfaceC37158GYv interfaceC37158GYv, C2EC c2ec, C3o9 c3o9, boolean z) {
        UserSession userSession = this.A02;
        boolean A0E = C2E9.A0E(userSession);
        if (!A0E && !C2E8.A00(userSession)) {
            A03(new C32071E6x(c2ec.B7A()), interfaceC37158GYv, c2ec);
            return;
        }
        C31233DoG c31233DoG = new C31233DoG(userSession, c2ec.BLY(), c2ec, AbstractC31273Dov.A00(this.A05, userSession));
        if (A0E) {
            AbstractC35214Fg7.A02(this.A01.requireContext(), new C36471G6v(this, interfaceC37158GYv, c2ec, 2), Boolean.valueOf(c31233DoG.A01.CVQ()), AbstractC31172DnG.A14(c31233DoG.C7e()), 1);
            return;
        }
        AbstractC35214Fg7.A03(this.A01, userSession, c31233DoG, new C36471G6v(this, interfaceC37158GYv, c2ec, 3), 1);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGA(C2EC c2ec) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A06;
        C35005Fbc c35005Fbc = new C35005Fbc(this.A04, this.A05, interfaceC11380iw, userSession);
        DirectThreadKey BKb = c2ec.BKb();
        C34508FIu c34508FIu = c35005Fbc.A05;
        C25621Ms A0c = AbstractC167017dG.A0c(c34508FIu.A00);
        A0c.A0B("direct_v2/remove_thread_reminder/");
        C1ON A0K = AbstractC31178DnM.A0K(A0c, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, BKb.A00);
        C31456Ds0.A00(A0K, BKb, c34508FIu, 22);
        C1GJ.A03(A0K);
    }

    @Override // X.InterfaceC37234Gaj
    public final void ElU(C2EC c2ec) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A06;
        new C35005Fbc(this.A04, this.A05, interfaceC11380iw, userSession).A01(c2ec.BKb(), C05F.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F7x(C2EC c2ec, boolean z) {
        UserSession userSession = this.A02;
        Number number = (Number) AbstractC31237DoK.A00(userSession).A04.getValue();
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36602342656971400L);
        Long valueOf = Long.valueOf(A01);
        if (z && number != null && number.intValue() >= A01) {
            C193328hC A0P = AbstractC31180DnO.A0P(this.A01);
            A0P.A0A(2131963971);
            AbstractC31177DnL.A0v(this.A05, A0P, valueOf, 2131963959);
            AbstractC31176DnK.A1W(A0P);
            String C7I = c2ec.C7I();
            InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
            if (A09.isSampled()) {
                AbstractC31181DnP.A0i(A09, "show_locked_chat_full", "inbox", C7I);
                return;
            }
            return;
        }
        InterfaceC83733oI A05 = JRE.A05(c2ec.BKb());
        if (A05 == null) {
            return;
        }
        AbstractC31278Dp0.A0A(userSession, AbstractC1345466e.A01(A05), "inbox", z);
    }

    private final void A02(C3o9 c3o9, boolean z) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str = A01.A00;
        if (str != null) {
            InterfaceC16660sJ interfaceC16660sJ = this.A00;
            UserSession userSession = this.A02;
            C81663kb A03 = C2DU.A03((C2DU) ((C2DS) interfaceC16660sJ.invoke(userSession)), A01);
            boolean z2 = true;
            if (A03 == null || !A03.CbK()) {
                z2 = false;
            }
            AbstractC31278Dp0.A07(this.A06, userSession, str, z, z2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOl(InterfaceC37158GYv interfaceC37158GYv, C3o9 c3o9, boolean z) {
        A01(c3o9);
        AbstractC34188F6m.A00(this.A05, this.A02, new G6Z(this, interfaceC37158GYv, c3o9, z), c3o9, C05F.A0j);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqH(C3o9 c3o9) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A02;
        String str = A01.A00;
        if (str != null) {
            AbstractC31278Dp0.A05(this.A06, userSession, str, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void E4M(C2EC c2ec) {
        String C7I = c2ec.C7I();
        if (C7I != null) {
            InterfaceC16660sJ interfaceC16660sJ = this.A00;
            UserSession userSession = this.A02;
            C2DS c2ds = (C2DS) interfaceC16660sJ.invoke(userSession);
            boolean CaK = C2DU.A00(c2ec, (C2DU) c2ds).CaK();
            if (!CaK) {
                int B7A = c2ec.B7A();
                C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
                boolean z = false;
                if (A0g != null && !A0g.A0L) {
                    z = true;
                }
                if (3 <= c2ds.BdL(B7A, z)) {
                    Context context = this.A05;
                    int i = 2131959848;
                    if (C2E7.A00(AbstractC166987dD.A10(userSession))) {
                        i = 2131958809;
                    }
                    C193328hC A0I = AbstractC31171DnF.A0I(context);
                    AbstractC31172DnG.A1C(context, A0I, 2131959849);
                    AbstractC31177DnL.A0v(context, A0I, 3L, i);
                    A0I.A0e(DialogInterfaceOnClickListenerC35411FjU.A00, AbstractC166997dE.A0p(context, 2131968948));
                    AbstractC166987dD.A1W(A0I);
                    return;
                }
            }
            AbstractC31278Dp0.A0G(userSession, C7I, c2ec.C7g(), CaK);
            c2ds.Ean(c2ec, !CaK);
            c2ds.FCS(c2ec.BKb());
        }
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGQ(C2EC c2ec, Integer num) {
        C193328hC A0I;
        DialogInterfaceOnClickListenerC35453FkA A00;
        int intValue;
        DirectThreadKey BKb = c2ec.BKb();
        A01(BKb);
        Context context = this.A05;
        UserSession userSession = this.A02;
        G6W g6w = new G6W(2, this, BKb);
        if (c2ec.BI1() != 8 && num != null && ((intValue = num.intValue()) == 0 || intValue == -1)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317908448384680L) && C18U.A06(c06090Tz, userSession, 36317908448515754L)) {
                int i = 2131972191;
                int i2 = 2131972189;
                if (C2E7.A03(AbstractC166987dD.A10(userSession))) {
                    i = 2131972192;
                    i2 = 2131972190;
                }
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131972193);
                A0I.A09(i);
                A0I.A0L(DialogInterfaceOnClickListenerC35453FkA.A00(g6w, 4), 2131965069);
                A0I.A0H(DialogInterfaceOnClickListenerC35453FkA.A00(g6w, 5), i2);
                A00 = DialogInterfaceOnClickListenerC35453FkA.A00(g6w, 6);
                A0I.A0D(A00);
                AbstractC31178DnM.A1R(A0I, true);
            }
        }
        String A0p = AbstractC166997dE.A0p(context, 2131972194);
        A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131960602);
        A0I.A0r(A0p);
        A0I.A0G(DialogInterfaceOnClickListenerC35453FkA.A00(g6w, 7));
        A00 = DialogInterfaceOnClickListenerC35453FkA.A00(g6w, 8);
        A0I.A0D(A00);
        AbstractC31178DnM.A1R(A0I, true);
    }
}
