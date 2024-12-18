package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.TwS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65921TwS implements InterfaceC37216GaR, XEO, XLU, InterfaceC71958XCk, XBC, XLQ, XLR, XLT {
    public String A00;
    public final UserSession A01;
    public final XAn A02;
    public final C123835ix A03;
    public final InterfaceC190488c6 A04;
    public final XB8 A05;
    public final XB9 A06;
    public final String A07;
    public final C38E A08;
    public final SearchContext A09;
    public final XB4 A0A;
    public final InterfaceC72022XFk A0B;
    public final XB7 A0C;
    public final XDv A0D;
    public final C66151U1s A0E;
    public final C43812JYz A0F;
    public final C66152U1t A0G;
    public final String A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    @Override // X.InterfaceC37216GaR
    public final Integer AvK(String str) {
        return null;
    }

    @Override // X.InterfaceC71958XCk
    public final void D3E() {
    }

    @Override // X.InterfaceC37216GaR
    public final void DAw(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        U2T A00 = AbstractC65975TxT.A00(this.A01);
        User CDj = c47p.CDj();
        C14360o3.A0B(CDj, 0);
        C34520FJg c34520FJg = A00.A02;
        if (c34520FJg != null) {
            c34520FJg.A01.remove(CDj);
        }
        C34520FJg c34520FJg2 = A00.A02;
        if (c34520FJg2 != null && c34520FJg2.A01.isEmpty()) {
            A00.A02 = null;
        }
        U2I u2i = A00.A03;
        if (u2i != null) {
            u2i.A00();
        }
        String str2 = this.A00;
        if (str2 != null && str != null) {
            this.A03.A01(c47p.getId(), str2, str, c47p.getAlgorithm(), c47p.ByJ(), i);
        }
    }

    @Override // X.XLU
    public final void DFE(Tx0 tx0, C65741TtG c65741TtG) {
    }

    @Override // X.InterfaceC37216GaR
    public final void DHq(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        String str2 = this.A00;
        if (str2 != null && str != null) {
            this.A03.A02(c47p.getId(), str2, str, c47p.getAlgorithm(), c47p.ByJ(), i);
        }
        U2I u2i = AbstractC65975TxT.A00(this.A01).A03;
        if (u2i != null) {
            u2i.A00();
        }
    }

    @Override // X.XLQ
    public final void DK6(C68090V9z c68090V9z, Tx0 tx0) {
        HashtagImpl hashtagImpl = c68090V9z.A00;
        A01(null, c68090V9z, tx0, C05F.A0C, null);
        UserSession userSession = this.A01;
        AbstractC152536tg.A00(userSession, hashtagImpl.A0C, null, 1);
        this.A0E.A07(hashtagImpl, this.A05.E6U(), tx0.A06, tx0.A00);
        A00();
        AbstractC66131U0x.A00(userSession).A00(hashtagImpl);
        String str = hashtagImpl.A0D;
        if (str != null) {
            A04(U0K.A05, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (r6.equals("SUGGESTED") == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[ADDED_TO_REGION] */
    @Override // X.XLR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOO(X.C66130U0o r22, X.Tx0 r23) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65921TwS.DOO(X.U0o, X.Tx0):void");
    }

    @Override // X.InterfaceC37216GaR
    public final void Ddq(C34644FOb c34644FOb, String str, int i) {
    }

    @Override // X.InterfaceC37216GaR
    public final void Dxe(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        this.A0E.A0A(c47p.CDj(), this.A05.E6U(), null, i);
        String str2 = this.A00;
        if (str2 != null && str != null) {
            this.A03.A03(c47p.getId(), str2, str, c47p.getAlgorithm(), c47p.ByJ(), i);
        }
    }

    @Override // X.XLU
    public final void Dxi(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        C14360o3.A0B(c65741TtG, 0);
        AbstractC167017dG.A1P(tx0, interfaceC11380iw);
        A01(interfaceC11380iw, c65741TtG, tx0, C05F.A0C, null);
        this.A0E.A0A(c65741TtG.A06(), this.A05.E6U(), tx0.A06, tx0.A00);
        if (!tx0.A0H) {
            UserSession userSession = this.A01;
            AbstractC65792TuA.A00(userSession).A01(c65741TtG.A06());
            AbstractC152536tg.A00(userSession, c65741TtG.A01(), null, 0);
        }
        A00();
        A04(U0K.A08, c65741TtG.A06().getUsername());
        AnonymousClass746.A00(this.A01).A02(this.A07);
    }

    @Override // X.XLU
    public final void Dxr(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        String id;
        C222015v c222015v;
        C25621Ms A0M;
        if (tx0.A0H) {
            UserSession userSession = this.A01;
            C63702ur c63702ur = new C63702ur(interfaceC11380iw, userSession);
            String A01 = c65741TtG.A01();
            int i = tx0.A00;
            C6PG c6pg = new C6PG("su_in_search_null_state", A01, interfaceC11380iw.getModuleName());
            c6pg.A00 = i;
            c63702ur.A08(new C6PH(c6pg));
            if ((c65741TtG.A06().B7L() == FollowStatus.A05 || c65741TtG.A06().B7L() == FollowStatus.A07) && (!c65741TtG.A06().A2I())) {
                U2T A00 = AbstractC65975TxT.A00(userSession);
                User A06 = c65741TtG.A06();
                if (A00.A06) {
                    if (A00.A00 >= A00.A04) {
                        A00.A02 = null;
                        U2I u2i = A00.A03;
                        if (u2i != null) {
                            u2i.A00();
                        }
                    } else {
                        C31456Ds0 c31456Ds0 = new C31456Ds0(50, A06, A00);
                        if (!A00.A07 && A06.A0M() == C05F.A01) {
                            UserSession userSession2 = A00.A05;
                            String id2 = A06.getId();
                            C14360o3.A0B(userSession2, 0);
                            String A062 = AbstractC13670mt.A06(AbstractC111324zv.A00(4483), id2);
                            c222015v = null;
                            A0M = AbstractC31177DnL.A0M(userSession2);
                            A0M.A0B(A062);
                            A0M.A9s("target_user_id", id2);
                            A0M.A9s("surface", "search_typeahead");
                            A0M.A9s(AbstractC111324zv.A00(1007), "true");
                            A0M.A0D(AbstractC111324zv.A00(2946), 0);
                        } else {
                            UserSession userSession3 = A00.A05;
                            String id3 = A06.getId();
                            C14360o3.A0B(userSession3, 0);
                            c222015v = null;
                            A0M = AbstractC31177DnL.A0M(userSession3);
                            A0M.A0B("discover/chaining/");
                            A0M.A9s("target_id", id3);
                            A0M.A9s("surface", "search_typeahead");
                        }
                        A0M.A0P(c222015v, C168027ex.class, C168037ey.class, false);
                        C1ON A0N = A0M.A0N();
                        A0N.A00 = c31456Ds0;
                        A00.A01 = A0N;
                        C1GJ.A04(A0N, 359266386);
                    }
                }
                id = c65741TtG.A06().getId();
            } else {
                U2T A002 = AbstractC65975TxT.A00(userSession);
                C1ON c1on = A002.A01;
                if (c1on != null) {
                    c1on.cancel();
                }
                A002.A02 = null;
                U2I u2i2 = A002.A03;
                if (u2i2 != null) {
                    u2i2.A00();
                }
                id = null;
            }
            this.A00 = id;
            return;
        }
        C70108W4f A003 = VWT.A00(c65741TtG);
        String str = tx0.A09;
        A003.A07 = str;
        A003.A01 = tx0.A05;
        C66166U2h A012 = A003.A01();
        this.A04.CjR(A012, this.A06.E6f(), C05F.A0C, this.A05.E6U(), tx0.A06, VWX.A00(str), c65741TtG.A03, tx0.A00);
    }

    public C65921TwS(UserSession userSession, XAn xAn, C123835ix c123835ix, C38E c38e, SearchContext searchContext, InterfaceC190488c6 interfaceC190488c6, XB4 xb4, InterfaceC72022XFk interfaceC72022XFk, XB7 xb7, XB8 xb8, XB9 xb9, XDv xDv, C66151U1s c66151U1s, C43812JYz c43812JYz, C66152U1t c66152U1t, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC25234BEr.A1P(userSession, str, xb8);
        AbstractC167017dG.A1T(interfaceC72022XFk, c66151U1s);
        C14360o3.A0B(xAn, 9);
        AbstractC25229BEm.A1M(interfaceC190488c6, 11, xb9);
        C14360o3.A0B(xb4, 14);
        this.A01 = userSession;
        this.A07 = str;
        this.A0H = str2;
        this.A05 = xb8;
        this.A0B = interfaceC72022XFk;
        this.A0E = c66151U1s;
        this.A0G = c66152U1t;
        this.A0F = c43812JYz;
        this.A02 = xAn;
        this.A08 = c38e;
        this.A04 = interfaceC190488c6;
        this.A03 = c123835ix;
        this.A06 = xb9;
        this.A0A = xb4;
        this.A0C = xb7;
        this.A0N = z;
        this.A0O = z2;
        this.A0D = xDv;
        this.A09 = searchContext;
        this.A0I = interfaceC16820sZ;
        this.A0J = interfaceC16820sZ2;
        this.A0K = z3;
        this.A0L = z4;
        this.A0M = z5;
    }

    private final void A00() {
        U2U A00 = AbstractC65920TwR.A00(this.A01);
        U2X u2x = U2X.A03;
        long j = u2x.A00;
        if (j != 0) {
            A00.A00.flowEndSuccess(j);
            u2x.A00 = 0L;
        }
    }

    private final void A01(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0, Integer num, String str) {
        String str2 = str;
        if (tx0.A0H) {
            if (interfaceC11380iw != null) {
                C63702ur c63702ur = new C63702ur(interfaceC11380iw, this.A01);
                String A01 = abstractC65924TwV.A01();
                int i = tx0.A00;
                C14360o3.A0B(A01, 0);
                C6PG c6pg = new C6PG("su_in_search_null_state", A01, interfaceC11380iw.getModuleName());
                c6pg.A00 = i;
                c63702ur.A0B(new C6PH(c6pg));
                return;
            }
            return;
        }
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        String str3 = tx0.A09;
        A00.A07 = str3;
        if (str == null) {
            str2 = tx0.A05;
        }
        A00.A01 = str2;
        C66166U2h A012 = A00.A01();
        String A0j = AbstractC167017dG.A0j();
        String E6U = this.A05.E6U();
        C72B A002 = AnonymousClass729.A00(this.A01);
        String str4 = this.A07;
        String str5 = tx0.A06;
        A002.A00 = new SearchContext(str4, str5, E6U, null, null, A0j, null, null);
        this.A04.Cla(A012, this.A06.E6f(), num, E6U, str5, VWX.A00(str3), abstractC65924TwV.A03, A0j, tx0.A00);
    }

    private final void A02(AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        this.A04.Clb(tx0.A06, abstractC65924TwV.A01(), abstractC65924TwV.A02(), abstractC65924TwV.A04(), tx0.A08, tx0.A00);
    }

    private final void A03(AbstractC65924TwV abstractC65924TwV, Tx0 tx0, Integer num, String str) {
        String str2 = str;
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        String str3 = tx0.A09;
        A00.A07 = str3;
        if (str == null) {
            str2 = tx0.A05;
        }
        A00.A01 = str2;
        A00.A04 = "INVITE_UPSELL";
        C66166U2h A01 = A00.A01();
        String A0j = AbstractC167017dG.A0j();
        String E6U = this.A05.E6U();
        C72B A002 = AnonymousClass729.A00(this.A01);
        String str4 = this.A07;
        String str5 = tx0.A06;
        A002.A00 = new SearchContext(str4, str5, E6U, null, null, A0j, null, null);
        this.A04.Cla(A01, this.A06.E6f(), num, E6U, str5, VWX.A00(str3), abstractC65924TwV.A03, A0j, tx0.A00);
    }

    private final void A04(U0K u0k, String str) {
        String str2;
        AnonymousClass747 A00 = AnonymousClass746.A00(this.A01);
        String E6U = this.A05.E6U();
        int ordinal = u0k.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                str2 = "place";
            } else {
                str2 = "hashtag";
            }
        } else {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        String str3 = this.A07;
        C14360o3.A0B(E6U, 0);
        if (E6U.length() != 0) {
            A00.A00 = new C152546th(str2, str, E6U, str3, A00.A02.now());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(androidx.fragment.app.Fragment r18, X.InterfaceC11380iw r19, java.lang.Object r20) {
        /*
            r17 = this;
            r9 = r19
            r4 = r20
            r2 = 0
            r1 = 1
            boolean r6 = r4 instanceof X.VA6
            r12 = 0
            if (r6 == 0) goto Ld8
            r0 = r4
            X.VA6 r0 = (X.VA6) r0
            java.lang.String r3 = r0.A05
        L10:
            int r0 = r3.hashCode()
            r11 = r17
            r7 = r18
            switch(r0) {
                case -1514078657: goto L1c;
                case -1219602631: goto L20;
                case 482408823: goto L6e;
                case 1570316561: goto L85;
                case 2093168605: goto Lc3;
                default: goto L1b;
            }
        L1b:
            return
        L1c:
            java.lang.String r0 = "search_nullstate_ci_row_upsell"
            goto Lc5
        L20:
            java.lang.String r0 = "search_invites_upsell"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            X.VA6 r4 = (X.VA6) r4
            X.V9y r5 = r4.A00
            X.Tx0 r0 = r4.A04()
            java.lang.Integer r3 = X.C05F.A0C
            r11.A03(r5, r0, r3, r12)
            boolean r0 = r7 instanceof X.C65918TwP
            if (r0 == 0) goto L43
            r0 = r7
            X.TwP r0 = (X.C65918TwP) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A06
            if (r0 == 0) goto L43
            r0.A04()
        L43:
            if (r6 == 0) goto L61
            java.lang.Integer r0 = r4.A01
            if (r0 != r3) goto L61
            X.Erj r8 = X.EnumC33510Erj.SEARCH_TYPEAHEAD
        L4b:
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto Le0
            com.instagram.common.session.UserSession r10 = r11.A01
            boolean r0 = X.C54P.A01(r0, r10)
            if (r0 == 0) goto L64
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.CJA.A00(r0, r8, r10, r1, r2)
            return
        L61:
            X.Erj r8 = X.EnumC33510Erj.SEARCH_ACCOUNT_TAB
            goto L4b
        L64:
            boolean r0 = r7 instanceof X.C1GL
            if (r0 == 0) goto L1b
            X.Epw r11 = X.EnumC33425Epw.A0J
            X.AbstractC31510Dsu.A0T(r7, r8, r9, r10, r11, r12)
            return
        L6e:
            r0 = 550(0x226, float:7.71E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            com.instagram.common.session.UserSession r2 = r11.A01
            r1 = r7
            X.2oe r1 = (X.AbstractC59962oe) r1
            X.EqG r0 = X.EnumC33444EqG.A0L
            X.FBD.A00(r7, r1, r2, r0)
            goto Lb3
        L85:
            r0 = 3273(0xcc9, float:4.586E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            com.instagram.common.session.UserSession r1 = r11.A01
            boolean r0 = X.AbstractC35067Fce.A02()
            if (r0 == 0) goto Lb3
            X.6Yy r2 = new X.6Yy
            r2.<init>(r3, r1)
            X.1nx r0 = X.AbstractC35067Fce.A00()
            X.Etb r1 = r0.A00()
            java.lang.String r0 = "serp_users_dp_upsell"
            X.EK6 r0 = r1.A01(r0, r12)
            X.AbstractC31175DnJ.A0s(r12, r0, r2)
        Lb3:
            X.VA6 r4 = (X.VA6) r4
            X.V9y r13 = r4.A00
            X.Tx0 r14 = r4.A04()
            java.lang.Integer r15 = X.C05F.A0C
            r16 = r12
            r11.A01(r12, r13, r14, r15, r16)
            return
        Lc3:
            java.lang.String r0 = "search_nullstate_ci_megaphone_upsell"
        Lc5:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            com.instagram.common.session.UserSession r1 = r11.A01
            if (r19 != 0) goto Ld2
            r9 = r7
            X.2oe r9 = (X.AbstractC59962oe) r9
        Ld2:
            X.EqG r0 = X.EnumC33444EqG.A0K
            X.FBD.A00(r7, r9, r1, r0)
            return
        Ld8:
            boolean r0 = r4 instanceof X.VA0
            if (r0 == 0) goto L1b
            java.lang.String r3 = "search_nullstate_ci_megaphone_upsell"
            goto L10
        Le0:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65921TwS.A05(androidx.fragment.app.Fragment, X.0iw, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(androidx.fragment.app.Fragment r19, X.InterfaceC11380iw r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65921TwS.A06(androidx.fragment.app.Fragment, X.0iw, java.lang.Object):void");
    }

    public final void A07(InterfaceC11380iw interfaceC11380iw) {
        UserSession userSession = this.A01;
        C147036jf c147036jf = new C147036jf(interfaceC11380iw, userSession);
        c147036jf.A00();
        c147036jf.A01(false, null, null);
        AbstractC50522MSa.A1T(AbstractC23021Ah.A00(userSession).A01, "search_nullstate_ci_upsell_impression_count", 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7G("search_nullstate_ci_upsell_impression_timestamp", currentTimeMillis);
        ARD.apply();
    }

    @Override // X.XEO
    public final Integer CAI(JIN jin) {
        C43812JYz c43812JYz = this.A0F;
        if (c43812JYz != null) {
            return c43812JYz.A02.CAJ(jin.BVb());
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEO
    public final void Cy9(HYY hyy, Tx0 tx0) {
        A01(null, hyy, tx0, C05F.A0C, null);
        UserSession userSession = this.A01;
        AbstractC152536tg.A00(userSession, hyy.A01(), null, 7);
        C66151U1s c66151U1s = this.A0E;
        JIN A06 = hyy.A06();
        if (A06 != null) {
            c66151U1s.A03(C8JW.A0W, A06);
            U2R A00 = U1X.A00(userSession);
            JIN A062 = hyy.A06();
            if (A062 != null) {
                A00.A00(A062);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.XEO
    public final void D1M(MusicAttributionConfig musicAttributionConfig) {
        this.A0E.A09(musicAttributionConfig);
    }

    @Override // X.XLU
    public final void D3d(Reel reel, C3Ow c3Ow, Tx0 tx0, C65741TtG c65741TtG, boolean z) {
        String str;
        if (z) {
            str = "live_ring";
        } else {
            str = "story_ring";
        }
        SearchContext searchContext = null;
        A01(null, c65741TtG, tx0, C05F.A0C, str);
        C66151U1s c66151U1s = this.A0E;
        C70589WdR c70589WdR = new C70589WdR(2, tx0, this);
        Wm5 wm5 = new Wm5(this, 3);
        C38E c38e = this.A08;
        C3G2 c3g2 = C3G2.A1l;
        SearchContext searchContext2 = this.A09;
        C14360o3.A0B(c38e, 5);
        if (z) {
            if (reel.A0H == null) {
                UserSession userSession = c66151U1s.A04;
                String id = reel.getId();
                C14360o3.A07(id);
                C1ON A05 = AbstractC55182Odn.A05(userSession, id, true);
                A05.A00 = new C67853UzY(c70589WdR, userSession, c3g2, wm5, c38e, c3Ow, c66151U1s);
                C1GJ.A03(A05);
                return;
            }
        } else {
            searchContext = searchContext2;
        }
        C66151U1s.A01(c70589WdR, reel, c3g2, wm5, c38e, c3Ow, searchContext, c66151U1s);
    }

    @Override // X.XLU
    public final void DWI() {
        this.A0I.invoke();
    }

    @Override // X.XLT
    public final void DYm(HYX hyx, Tx0 tx0) {
        A01(null, hyx, tx0, C05F.A0C, null);
        UserSession userSession = this.A01;
        AbstractC152536tg.A00(userSession, hyx.A01(), null, 2);
        this.A0E.A08(hyx.A00, this.A05.E6U(), tx0.A06, tx0.A00);
        A00();
        U0z A00 = U0w.A00(userSession);
        C69794Vvd c69794Vvd = hyx.A00;
        C14360o3.A0B(c69794Vvd, 0);
        A00.A00.A04(c69794Vvd);
        A04(U0K.A07, hyx.A00.A01());
    }

    @Override // X.XEO
    public final void DYu(JIN jin, C69449VnY c69449VnY) {
        C43812JYz c43812JYz = this.A0F;
        if (c43812JYz != null) {
            c43812JYz.A01(jin, c69449VnY.A03);
        }
    }

    @Override // X.InterfaceC37216GaR
    public final void Dhu(C47P c47p, String str, int i) {
        String str2 = this.A00;
        if (str2 != null && str != null) {
            this.A03.A04(c47p.getId(), str2, str, c47p.getAlgorithm(), c47p.ByJ(), i, 0L);
        }
    }

    @Override // X.InterfaceC71958XCk
    public final void Djl(Integer num) {
        U0K u0k;
        if (num == C05F.A00) {
            C66151U1s c66151U1s = this.A0E;
            String E6d = this.A0B.E6d();
            Integer E6f = this.A06.E6f();
            if (E6f != null) {
                switch (E6f.intValue()) {
                    case 0:
                    case 1:
                        u0k = U0K.A04;
                        break;
                    case 2:
                        u0k = U0K.A05;
                        break;
                    case 3:
                        u0k = U0K.A08;
                        break;
                    case 6:
                        u0k = U0K.A07;
                        break;
                    case 9:
                        u0k = U0K.A03;
                        break;
                    case 14:
                        u0k = U0K.A06;
                        break;
                }
                C09530e4 c09530e4 = new C09530e4("argument_search_session_id", c66151U1s.A07);
                C09530e4 c09530e42 = new C09530e4("shopping_session_id", null);
                C09530e4 c09530e43 = new C09530e4("rank_token", E6d);
                C09530e4 c09530e44 = new C09530e4("edit_searches_type", u0k);
                InterfaceC11380iw interfaceC11380iw = c66151U1s.A02;
                Bundle A00 = AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("argument_parent_module_name", interfaceC11380iw.getModuleName()));
                C140966Yy A0P = AbstractC31173DnH.A0P(c66151U1s.A01, c66151U1s.A04);
                A0P.A09 = interfaceC11380iw;
                U04.A00();
                A0P.A0B(A00, new C67898V1g());
                A0P.A04();
                return;
            }
            u0k = null;
            C09530e4 c09530e45 = new C09530e4("argument_search_session_id", c66151U1s.A07);
            C09530e4 c09530e422 = new C09530e4("shopping_session_id", null);
            C09530e4 c09530e432 = new C09530e4("rank_token", E6d);
            C09530e4 c09530e442 = new C09530e4("edit_searches_type", u0k);
            InterfaceC11380iw interfaceC11380iw2 = c66151U1s.A02;
            Bundle A002 = AbstractC61636Rr0.A00(c09530e45, c09530e422, c09530e432, c09530e442, new C09530e4("argument_parent_module_name", interfaceC11380iw2.getModuleName()));
            C140966Yy A0P2 = AbstractC31173DnH.A0P(c66151U1s.A01, c66151U1s.A04);
            A0P2.A09 = interfaceC11380iw2;
            U04.A00();
            A0P2.A0B(A002, new C67898V1g());
            A0P2.A04();
            return;
        }
        if (num == C05F.A0N) {
            C66151U1s c66151U1s2 = this.A0E;
            C66277U6x A01 = C66277U6x.A01("com.instagram.explore.zeitgeist.Zeitgeist", AbstractC06930Yk.A06(new C09530e4("timezone_offset", String.valueOf(C23831Eq.A00())), new C09530e4("entrypoint_for_logging", "search_nullstate")));
            FragmentActivity fragmentActivity = c66151U1s2.A01;
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(c66151U1s2.A04);
            igBloksScreenConfig.A0U = fragmentActivity.getResources().getString(2131962828);
            igBloksScreenConfig.A0l = true;
            igBloksScreenConfig.A0P = C05F.A01;
            A01.A04(fragmentActivity, igBloksScreenConfig);
            return;
        }
        if (num != C05F.A1F) {
            return;
        }
        this.A0E.A02();
    }

    @Override // X.XEO
    public final void onStopButtonClicked() {
        C43812JYz c43812JYz = this.A0F;
        if (c43812JYz != null) {
            c43812JYz.A00();
        }
    }

    @Override // X.XEO
    public final void CyA(HYY hyy, Tx0 tx0) {
        A02(hyy, tx0);
        C66152U1t c66152U1t = this.A0G;
        JIN A06 = hyy.A06();
        if (A06 != null) {
            c66152U1t.A04(A06, tx0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XBC
    public final void DAv(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        boolean A1a = AbstractC167017dG.A1a(abstractC65924TwV, tx0);
        A02(abstractC65924TwV, tx0);
        int i = abstractC65924TwV.A01;
        if (i != 0) {
            if (i != A1a) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 7) {
                            C66152U1t c66152U1t = this.A0G;
                            TrackDataImpl trackDataImpl = ((HYY) abstractC65924TwV).A01;
                            if (trackDataImpl != null) {
                                c66152U1t.A04(new C37964Gn6(trackDataImpl), tx0);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw new IllegalStateException("Invalid entry type");
                    }
                    this.A0G.A02(((C66130U0o) abstractC65924TwV).A01, tx0);
                    return;
                }
                this.A0G.A03(((HYX) abstractC65924TwV).A00, tx0, null);
                return;
            }
            this.A0G.A01(((C68090V9z) abstractC65924TwV).A00, tx0, null);
            return;
        }
        this.A0G.A00(interfaceC11380iw, tx0, null, ((C65741TtG) abstractC65924TwV).A06());
    }
}
