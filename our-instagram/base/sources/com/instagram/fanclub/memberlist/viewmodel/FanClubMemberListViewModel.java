package com.instagram.fanclub.memberlist.viewmodel;

import X.AbstractC07080Za;
import X.AbstractC141776au;
import X.AbstractC167007dF;
import X.AbstractC18560vj;
import X.AbstractC2051396d;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31827Dyl;
import X.AbstractC99684dl;
import X.AnonymousClass111;
import X.AnonymousClass191;
import X.BHS;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C08730cb;
import X.C0RV;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C141796aw;
import X.C14360o3;
import X.C16910sj;
import X.C17060sy;
import X.C24721Ip;
import X.C31199Dni;
import X.C32617EXr;
import X.C36296Fzq;
import X.C99694dm;
import X.E91;
import X.F1E;
import X.G7I;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.MBp;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;

/* loaded from: classes6.dex */
public final class FanClubMemberListViewModel extends AbstractC31827Dyl {
    public final UserSession A00;
    public final C36296Fzq A01;
    public final C99694dm A02;
    public final FanClubApi A03;
    public final C32617EXr A04;
    public final E91 A05;
    public final FanClubMemberListRepository A06;
    public final C17060sy A07;
    public final String A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C0UO A0H;
    public final boolean A0I;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 9
            boolean r0 = X.MAH.A01(r8, r3)
            if (r0 == 0) goto L82
            r5 = r8
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L6b
            if (r0 != r3) goto L88
            java.lang.Object r7 = r5.A01
            com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7 = (com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel) r7
            X.AbstractC09560e7.A00(r1)
        L28:
            X.E9U r1 = (X.E9U) r1
            if (r1 == 0) goto L55
            boolean r2 = r1.A02
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "PROFILE"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L58
            X.Fzq r5 = r7.A01
            java.lang.String r0 = X.AbstractC166997dE.A0n()
            r5.A00 = r0
            X.Erl r4 = X.EnumC33512Erl.PROFILE_SUBSCRIPTION
        L42:
            X.Ern r3 = X.EnumC33514Ern.A0P
            java.lang.String r1 = X.AbstractC31172DnG.A0z(r2)
            java.lang.String r0 = "is_list_empty"
            java.util.Map r8 = X.AbstractC167007dF.A0n(r0, r1)
            java.lang.String r6 = "subscribers_list_rendered"
            java.lang.String r7 = "tap"
            X.C36296Fzq.A02(r3, r4, r5, r6, r7, r8)
        L55:
            X.0eB r4 = X.C0eB.A00
            return r4
        L58:
            java.lang.String r0 = "SETTINGS"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L55
            X.Fzq r5 = r7.A01
            java.lang.String r0 = X.AbstractC166997dE.A0n()
            r5.A00 = r0
            X.Erl r4 = X.EnumC33512Erl.PROFESSIONAL_HOME_SUBSCRIPTIONS
            goto L42
        L6b:
            X.AbstractC09560e7.A00(r1)
            X.0UO r2 = r7.A0H
            r1 = 10
            X.M9S r0 = new X.M9S
            r0.<init>(r2, r1)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r1 = X.AbstractC209010m.A03(r5, r0)
            if (r1 != r4) goto L28
            return r4
        L82:
            X.MAH r5 = new X.MAH
            r5.<init>(r7, r8, r3)
            goto L16
        L88:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel.A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel, X.1Ds):java.lang.Object");
    }

    public static final boolean A01(FanClubMemberListViewModel fanClubMemberListViewModel) {
        return AbstractC167007dF.A1O(((CharSequence) fanClubMemberListViewModel.A0G.getValue()).length());
    }

    public /* synthetic */ FanClubMemberListViewModel(UserSession userSession, FanClubMemberListRepository fanClubMemberListRepository, String str) {
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        C36296Fzq A002 = F1E.A00(userSession);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C17060sy A003 = C08730cb.A00(userSession);
        AbstractC25234BEr.A0j(1, fanClubMemberListRepository, str, A00, A002);
        C14360o3.A0B(A003, 7);
        this.A06 = fanClubMemberListRepository;
        this.A00 = userSession;
        this.A08 = str;
        this.A02 = A00;
        this.A01 = A002;
        this.A03 = fanClubApi;
        this.A07 = A003;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A0D = A1A;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0B = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(0);
        this.A0E = A1H;
        C008002u A1A2 = AbstractC25235BEs.A1A(false);
        this.A0C = A1A2;
        C008002u A004 = C10E.A00(C16910sj.A00);
        this.A0F = A004;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A0G = A1H2;
        this.A0I = AbstractC2051396d.A01(userSession);
        Integer num = C05F.A00;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A09 = c24721Ip;
        this.A0A = AbstractC07080Za.A03(c24721Ip);
        InterfaceC19390xP A005 = C0RV.A00(new C31199Dni(16, new InterfaceC19390xP[]{A0o, A1H, A1A2, fanClubMemberListRepository.A02, fanClubMemberListRepository.A00, A1A, A004, A1H2}, this), 250L);
        this.A0H = AbstractC208910l.A01(G7I.A00, AbstractC141776au.A00(this), A005, C10I.A01);
        C141796aw A006 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new MBp(this, null, 12), A006);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), AnonymousClass111.A01(new MBp(this, null, 13), fanClubMemberListRepository.A01));
        this.A05 = new E91(null, BHS.A00(new Object[0], 2131976533), null);
        this.A04 = new C32617EXr(num);
    }
}
