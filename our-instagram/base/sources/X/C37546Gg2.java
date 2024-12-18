package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gg2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37546Gg2 implements InterfaceC65232xL, JHZ {
    public C41699IdS A00;
    public InterfaceC31048Dkm A01;
    public boolean A02;
    public boolean A03;
    public Long A04;
    public final ClipsViewerConfig A05;
    public final BKG A06;
    public final C66362zD A07;
    public final InterfaceC66382zF A08;
    public final UserSession A09;
    public final AbstractC37552Gg8 A0A;
    public final BKH A0B;
    public final C1337362e A0C;
    public final List A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final InterfaceC66382zF A0H;
    public final C37550Gg6 A0I;
    public final MVE A0J;
    public final C37548Gg4 A0K;
    public final C37549Gg5 A0L;
    public final C65835Tus A0M;
    public final C37547Gg3 A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final void A08(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        if (AbstractC37647Ghg.A00(c120985dq) || c120985dq.A0H() || c120985dq.A01 == EnumC129395t1.A05) {
            this.A0A.A0U(c120985dq, true);
        }
    }

    public final void A09(C120985dq c120985dq, String str, int i, boolean z) {
        EnumC39550HdM enumC39550HdM;
        UserSession userSession;
        UpcomingEvent A2B;
        C14360o3.A0B(c120985dq, 0);
        if (AbstractC37647Ghg.A00(c120985dq) || c120985dq.A0H() || c120985dq.A01 == EnumC129395t1.A05) {
            AbstractC37552Gg8 abstractC37552Gg8 = this.A0A;
            abstractC37552Gg8.A0c(c120985dq, i);
            abstractC37552Gg8.EWM(c120985dq, true);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A2B = c38321qM.A2B((userSession = this.A09))) != null) {
                enumC39550HdM = AbstractC37652Ghl.A00(c120985dq, userSession, A2B, true);
            } else {
                enumC39550HdM = null;
            }
            abstractC37552Gg8.EcV(c120985dq, enumC39550HdM);
            if (C18U.A06(C06090Tz.A05, this.A09, 36318479680870595L)) {
                abstractC37552Gg8.EWe(c120985dq, z);
                abstractC37552Gg8.ETD(c120985dq, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1.A0F(r0).A01 == X.EnumC129395t1.A08) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(java.util.List r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1F(r4)
            r0 = 0
            r3.A0B(r0)
            if (r5 == 0) goto L27
            X.Gg8 r1 = r3.A0A
            int r0 = r1.A0B()
            if (r0 <= 0) goto L34
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A05
            boolean r0 = r0.A1Y
            if (r0 == 0) goto L2d
            r0 = 0
        L1d:
            X.5dq r0 = r1.A0F(r0)
            X.5t1 r1 = r0.A01
            X.5t1 r0 = X.EnumC129395t1.A08
            if (r1 != r0) goto L34
        L27:
            X.Gg8 r0 = r3.A0A
            r0.A0W(r2)
            return
        L2d:
            int r0 = r1.A0B()
            int r0 = r0 + (-1)
            goto L1d
        L34:
            X.5dq r0 = X.C128085qc.A00()
            r2.add(r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37546Gg2.A0D(java.util.List, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r6.A0A.A0J().containsAll(r7) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.util.List r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            if (r12 == 0) goto L93
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r7.iterator()
        Le:
            boolean r0 = r2.hasNext()
            r4 = 1
            if (r0 == 0) goto L24
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5dq r0 = (X.C120985dq) r0
            java.util.List r0 = r0.A08
            if (r0 == 0) goto Le
            r5.add(r1)
            goto Le
        L24:
            boolean r0 = X.AbstractC166987dD.A1b(r5)
            if (r0 != 0) goto L93
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A05
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            boolean r0 = r2.A00()
            if (r0 == 0) goto L3b
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L3b
            return
        L3b:
            if (r8 == 0) goto L85
            if (r9 == 0) goto L4a
            boolean r0 = r6.A03
            if (r0 != 0) goto L4a
            X.Gg8 r0 = r6.A0A
            r0.A0O()
            r6.A03 = r4
        L4a:
            if (r10 == 0) goto L60
            X.5t1 r5 = X.EnumC129395t1.A0M
            r0 = 0
            X.GiK r1 = new X.GiK
            r1.<init>(r5, r0)
            X.5dq r0 = new X.5dq
            r0.<init>(r1)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r6.A0D(r0, r11)
        L60:
            r1 = 0
        L61:
            if (r11 == 0) goto L83
            if (r1 != 0) goto L83
        L65:
            r6.A0D(r7, r4)
            if (r11 != 0) goto L93
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0C
            if (r2 != r0) goto L93
            X.5t1 r2 = X.EnumC129395t1.A04
            r0 = 0
            X.GiK r1 = new X.GiK
            r1.<init>(r2, r0)
            X.5dq r0 = new X.5dq
            r0.<init>(r1)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r6.A0D(r0, r3)
            return
        L83:
            r4 = 0
            goto L65
        L85:
            X.Gg8 r0 = r6.A0A
            java.util.List r0 = r0.A0J()
            boolean r0 = r0.containsAll(r7)
            r1 = 1
            if (r0 != 0) goto L61
            goto L60
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37546Gg2.A0E(java.util.List, boolean, boolean, boolean, boolean, boolean):void");
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C75113Zb c75113Zb = this.A0A.C09(C120985dq.A0d.A04(c38321qM)).A0E;
        if (c75113Zb != null) {
            return c75113Zb;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JHZ
    public final void DNJ(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        boolean A06 = A06();
        if (!A06) {
            C62a A04 = A04(c120985dq, this);
            this.A0B.A05.D2j(i, 1, null);
            this.A02 = true;
            C11T.A02(new RunnableC37842Gkw(this, A04, i));
            return;
        }
        AbstractC60912qF.A01(this.A09, this.A04, null, new C30171DRb(i, 13, c120985dq, this), A06);
    }

    public static int A00(C37546Gg2 c37546Gg2) {
        return c37546Gg2.A0A.A0B();
    }

    public static C75113Zb A02(C120985dq c120985dq, C37546Gg2 c37546Gg2) {
        return c37546Gg2.A0A.C09(c120985dq).A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (X.C14360o3.A0K(r1, "creators_in_reels") != false) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0046. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C62a A04(X.C120985dq r6, X.C37546Gg2 r7) {
        /*
            X.BKG r0 = r7.A06
            r4 = r6
            boolean r0 = r0.A00(r6)
            if (r0 == 0) goto L1d
            X.Gg8 r0 = r7.A0A
            X.MSf r3 = r0.A0E()
            X.Ghd r5 = r0.C09(r6)
            com.instagram.common.session.UserSession r6 = r7.A09
            boolean r7 = r7.A0O
            X.62b r2 = new X.62b
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L1d:
            boolean r0 = r7.A0P
            if (r0 == 0) goto L40
            X.0wb r3 = X.C18950wb.A01
            r2 = 817904311(0x30c03ab7, float:1.3986526E-9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Non-Litho Item Definition has been initialized for itemType = "
            r1.append(r0)
            X.5t1 r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0f5 r0 = r3.AEp(r0, r2)
            r0.report()
        L40:
            X.5t1 r0 = r6.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L9f;
                case 1: goto L97;
                case 2: goto L97;
                case 3: goto L97;
                case 4: goto L7f;
                case 5: goto L7f;
                case 6: goto L79;
                case 7: goto L8f;
                case 8: goto L7f;
                case 9: goto L5b;
                case 10: goto L7f;
                case 11: goto L7f;
                case 12: goto L6b;
                case 13: goto L73;
                case 14: goto L7f;
                case 15: goto L7f;
                case 16: goto L8f;
                case 17: goto L55;
                case 18: goto L4f;
                case 19: goto L87;
                case 20: goto L73;
                default: goto L49;
            }
        L49:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L4f:
            X.C4z r2 = new X.C4z
            r2.<init>(r6)
            return r2
        L55:
            X.C50 r2 = new X.C50
            r2.<init>(r6)
            return r2
        L5b:
            X.Gz2 r0 = r6.A02()
            if (r0 == 0) goto L71
            java.lang.String r1 = r0.A0B
        L63:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L73
        L6b:
            X.Hbm r2 = new X.Hbm
            r2.<init>(r6)
            return r2
        L71:
            r1 = 0
            goto L63
        L73:
            X.Gre r2 = new X.Gre
            r2.<init>(r6)
            return r2
        L79:
            X.Hbn r2 = new X.Hbn
            r2.<init>(r6)
            return r2
        L7f:
            java.lang.String r1 = "Ghost should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L87:
            java.lang.String r1 = "Blend EOF should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L8f:
            java.lang.String r1 = "Unavailable should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L97:
            java.lang.String r1 = "Ads should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L9f:
            java.lang.String r1 = "Organic should only be litho"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37546Gg2.A04(X.5dq, X.Gg2):X.62a");
    }

    private final boolean A06() {
        long j;
        boolean A1X = AbstractC167007dF.A1X(this.A05.A0J, ClipsViewerSource.A0g);
        UserSession userSession = this.A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A1X) {
            j = 36329638003622355L;
        } else {
            j = 36329638003687892L;
        }
        return AbstractC31177DnL.A1U(c06090Tz, userSession, j);
    }

    public final C2UU A07() {
        C2UU c2uu;
        C2Z5 c2z5 = this.A0B.A00;
        if (c2z5 != null && (c2uu = c2z5.A0Q) != null) {
            return c2uu;
        }
        throw AbstractC166987dD.A14("should never be null");
    }

    public final void A0A(C62832tM c62832tM, String str) {
        if (c62832tM != null && str != null) {
            List A0J = this.A0A.A0J();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0J) {
                EnumC129395t1 enumC129395t1 = ((C120985dq) obj).A01;
                if (enumC129395t1 == EnumC129395t1.A0G || enumC129395t1 == EnumC129395t1.A02 || enumC129395t1 == EnumC129395t1.A0A || enumC129395t1 == EnumC129395t1.A09) {
                    A1E.add(obj);
                }
            }
            c62832tM.A08(str, A1E, false, false);
        }
    }

    public final void A0B(Integer num) {
        if (!this.A0A.A0Z()) {
            C11T.A02(new RunnableC37751GjQ(this, num));
        }
    }

    public final void A0C(Integer num) {
        if (num == null) {
            A0D(C16930sl.A00, true);
            return;
        }
        this.A0A.A0c(C128085qc.A00(), num.intValue());
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        AbstractC37552Gg8 abstractC37552Gg8;
        int A0D;
        if (c38321qM != null && (A0D = (abstractC37552Gg8 = this.A0A).A0D(c38321qM)) != -1) {
            C120985dq A0F = abstractC37552Gg8.A0F(A0D);
            this.A02 = true;
            this.A07.A07(this.A08, A04(A0F, this), A0D);
            this.A0B.A05.D2j(A0D, 1, null);
        }
    }

    public static int A01(InterfaceC16820sZ interfaceC16820sZ) {
        return ((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0B();
    }

    public static AbstractC37552Gg8 A03(InterfaceC16820sZ interfaceC16820sZ) {
        return ((C37546Gg2) interfaceC16820sZ.invoke()).A0A;
    }

    public static final void A05(C37546Gg2 c37546Gg2) {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List A0J = c37546Gg2.A0A.A0J();
        ArrayList A0q = AbstractC167017dG.A0q(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            A0q.add(A04((C120985dq) it.next(), c37546Gg2));
        }
        A0E.A01(A0q);
        c37546Gg2.A02 = true;
        c37546Gg2.A07.A06(A0E, c37546Gg2.A08);
    }

    @Override // X.JHZ
    public final void onDataSetChanged() {
        boolean A06 = A06();
        if (!A06) {
            A05(this);
            return;
        }
        Long l = this.A04;
        if (l == null) {
            l = AbstractC31173DnH.A0g();
            this.A04 = l;
        }
        AbstractC60912qF.A01(this.A09, l, new J8W(this, 47), new DRR(this, 22), A06);
    }

    public C37546Gg2(Activity activity, Context context, C07X c07x, C62862tP c62862tP, InterfaceC43434JGy interfaceC43434JGy, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C64052vQ c64052vQ, C149566o8 c149566o8, C676533f c676533f, C37526Gfi c37526Gfi, AbstractC37552Gg8 abstractC37552Gg8, C25348BJr c25348BJr, C25359BKc c25359BKc, C41217IMg c41217IMg, C26914BuH c26914BuH, BKD bkd, BKA bka, BKE bke, C31414DrJ c31414DrJ, C31410DrF c31410DrF, C31413DrI c31413DrI, BKF bkf, CLQ clq, C37543Gfz c37543Gfz, C31411DrG c31411DrG, BKB bkb, C41704IdY c41704IdY, C37522Gfe c37522Gfe, BK8 bk8, C37524Gfg c37524Gfg, C37523Gff c37523Gff, C37671Gi4 c37671Gi4, InterfaceC31152Dmw interfaceC31152Dmw, InterfaceC31152Dmw interfaceC31152Dmw2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC167017dG.A1T(userSession, c37522Gfe);
        C14360o3.A0B(clipsViewerConfig, 7);
        AbstractC25234BEr.A0l(8, c25359BKc, c41704IdY, bka, bkb);
        AbstractC25234BEr.A1Q(clq, bkd, c37543Gfz);
        C14360o3.A0B(c31411DrG, 15);
        C14360o3.A0B(bke, 16);
        C14360o3.A0B(c31413DrI, 17);
        C14360o3.A0B(c31414DrJ, 18);
        C14360o3.A0B(bkf, 20);
        C14360o3.A0B(abstractC37552Gg8, 23);
        C14360o3.A0B(c37526Gfi, 30);
        this.A09 = userSession;
        this.A05 = clipsViewerConfig;
        this.A0A = abstractC37552Gg8;
        this.A0D = AbstractC166987dD.A1E();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0G = C18U.A06(c06090Tz, userSession, 36312861864756555L);
        this.A0P = C18U.A06(c06090Tz, userSession, 36312861865346384L);
        this.A0F = C18U.A06(c06090Tz, userSession, 36312861862069548L);
        this.A0O = C18U.A06(c06090Tz, userSession, 36312861862200622L);
        C65835Tus c65835Tus = new C65835Tus(activity, context, userSession, z);
        this.A0M = c65835Tus;
        C1337362e c1337362e = new C1337362e(activity, context, c62862tP, interfaceC43434JGy, clipsViewerConfig, abstractC37552Gg8, abstractC37552Gg8, userSession, c64052vQ, c149566o8, c676533f, c37526Gfi, abstractC37552Gg8, c65835Tus, c25348BJr, c25359BKc, c41217IMg, c26914BuH, bkd, bka, bke, c31414DrJ, c31410DrF, c31413DrI, bkf, clq, c37543Gfz, c31411DrG, bkb, c41704IdY, c37522Gfe, c37671Gi4, interfaceC31152Dmw, interfaceC31152Dmw2, z2);
        this.A0C = c1337362e;
        C37547Gg3 c37547Gg3 = new C37547Gg3(abstractC37552Gg8, c37522Gfe, c25348BJr, c37523Gff);
        this.A0N = c37547Gg3;
        C37548Gg4 c37548Gg4 = new C37548Gg4(activity, abstractC37552Gg8, c37522Gfe, userSession, c25348BJr);
        this.A0K = c37548Gg4;
        C37549Gg5 c37549Gg5 = new C37549Gg5(activity, abstractC37552Gg8, c37522Gfe, userSession, c25348BJr, c37524Gfg);
        this.A0L = c37549Gg5;
        MVE mve = new MVE(activity, abstractC37552Gg8, userSession, c25348BJr);
        this.A0J = mve;
        C37550Gg6 c37550Gg6 = new C37550Gg6(abstractC37552Gg8, c25348BJr);
        this.A0I = c37550Gg6;
        BKG bkg = new BKG();
        this.A06 = bkg;
        this.A08 = new JWZ(this, 4);
        JWZ jwz = new JWZ(this, 3);
        this.A0H = jwz;
        BKH bkh = new BKH(activity, context, c07x, clipsViewerConfig, bkg, jwz, userSession, abstractC37552Gg8, c37550Gg6, mve, c37548Gg4, c37549Gg5, c65835Tus, c1337362e, c37547Gg3, c25359BKc, bk8, new J8W(this, 46), interfaceC16660sJ);
        this.A0B = bkh;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01 = bkh.A02;
        A00.A01(c1337362e);
        if (C18U.A06(c06090Tz, userSession, 36312861862135085L)) {
            A00.A09 = true;
        }
        if (C18U.A06(c06090Tz, userSession, 36327262886967745L)) {
            A00.A0A = true;
        }
        C66362zD A002 = A00.A00();
        MTQ mtq = new MTQ(context, c37522Gfe, userSession, new C37551Gg7(context, c37522Gfe, userSession), C120985dq.class);
        Iterator A0I = abstractC37552Gg8.A0I();
        while (A0I.hasNext()) {
            Object next = A0I.next();
            if (next instanceof C120985dq) {
                mtq.A03(abstractC37552Gg8, next);
            }
        }
        abstractC37552Gg8.EWn(null, mtq);
        this.A07 = A002;
        this.A0E = AbstractC166987dD.A1E();
        AbstractC37552Gg8 abstractC37552Gg82 = this.A0A;
        c25348BJr.A00 = new C37554GgA(abstractC37552Gg82, this);
        abstractC37552Gg82.A02.add(this);
    }
}
