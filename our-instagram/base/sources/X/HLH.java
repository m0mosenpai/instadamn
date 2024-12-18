package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLH extends AbstractC42537IsG {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A01;
        String id;
        Long l;
        String id2;
        String A0H;
        Long A0j;
        String str;
        String id3;
        C120985dq c120985dq = (C120985dq) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c120985dq);
        C40971v4 A07 = c120985dq.A07();
        if (A07 != null && this.A01) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A06, userSession, 36315112423820296L)) {
                AbstractC167017dG.A1O(userSession, A07);
                InterfaceC02590Ai A012 = AbstractC42537IsG.A01(interfaceC60442pS, new C12210kP(userSession));
                if (A012.isSampled()) {
                    AbstractC37303Gc4.A0f(A012, A07.A0K);
                    AbstractC37300Gc1.A0o(A012, A07.A0j);
                    AbstractC37300Gc1.A0g(A012, AbstractC25231BEo.A0j(0, A07.A0S));
                    A012.AAP(AbstractC111324zv.A00(436), A07.A0f);
                    A012.Cht();
                }
            }
        }
        if (!c120985dq.CdW() && this.A03) {
            A01 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, AbstractC31177DnL.A0P(this.A00)), "instagram_organic_impression_second_channel");
            if (A01.isSampled()) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM == null || (id3 = c38321qM.getId()) == null) {
                    id3 = c120985dq.getId();
                }
                AbstractC37300Gc1.A0l(A01, id3);
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    A0j = AbstractC37302Gc3.A0U(c38321qM2);
                } else {
                    A0j = null;
                }
                str = "m_t";
            } else {
                return;
            }
        } else {
            if (!c120985dq.CdW() || !this.A01) {
                return;
            }
            UserSession userSession2 = this.A00;
            A01 = AbstractC42537IsG.A01(interfaceC60442pS, AbstractC31177DnL.A0P(userSession2));
            if (!A01.isSampled()) {
                return;
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 == null || (id = c38321qM3.getId()) == null) {
                id = c120985dq.getId();
            }
            AbstractC37300Gc1.A0l(A01, id);
            C38321qM c38321qM4 = c120985dq.A02;
            if (c38321qM4 != null) {
                l = AbstractC37302Gc3.A0U(c38321qM4);
            } else {
                l = null;
            }
            A01.A9K("m_t", l);
            AbstractC37300Gc1.A0o(A01, c120985dq.BzL(userSession2));
            C38321qM c38321qM5 = c120985dq.A02;
            Long l2 = null;
            if (c38321qM5 != null) {
                l2 = AbstractC37302Gc3.A0V(AbstractC41071vF.A07(userSession2, c38321qM5));
            }
            AbstractC37300Gc1.A0g(A01, l2);
            C38321qM c38321qM6 = c120985dq.A02;
            if (c38321qM6 != null && (id2 = c38321qM6.getId()) != null && (A0H = AbstractC41071vF.A0H(userSession2, id2)) != null && (A0j = AbstractC166997dE.A0j(A0H)) != null) {
                str = "host_profile_id";
            }
            A01.Cht();
        }
        A01.A9K(str, A0j);
        A01.Cht();
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A02;
        String id;
        Long l;
        String id2;
        String A0H;
        Long A0j;
        String str;
        String id3;
        C120985dq c120985dq = (C120985dq) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c120985dq);
        C40971v4 A07 = c120985dq.A07();
        if (A07 != null && this.A01) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A06, userSession, 36315112423820296L)) {
                AbstractC167017dG.A1O(userSession, A07);
                InterfaceC02590Ai A022 = AbstractC42537IsG.A02(interfaceC60442pS, new C12210kP(userSession));
                if (A022.isSampled()) {
                    AbstractC37303Gc4.A0f(A022, A07.A0K);
                    AbstractC37300Gc1.A0o(A022, A07.A0j);
                    AbstractC37300Gc1.A0g(A022, AbstractC25231BEo.A0j(0, A07.A0S));
                    A022.AAP(AbstractC111324zv.A00(436), A07.A0f);
                    A022.Cht();
                }
            }
        }
        if (!c120985dq.CdW() && this.A04) {
            A02 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, AbstractC31177DnL.A0P(this.A00)), "instagram_organic_sub_impression_second_channel");
            if (A02.isSampled()) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM == null || (id3 = c38321qM.getId()) == null) {
                    id3 = c120985dq.getId();
                }
                AbstractC37300Gc1.A0l(A02, id3);
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    A0j = AbstractC37302Gc3.A0U(c38321qM2);
                } else {
                    A0j = null;
                }
                str = "m_t";
            } else {
                return;
            }
        } else {
            if (!c120985dq.CdW() || !this.A02) {
                return;
            }
            UserSession userSession2 = this.A00;
            A02 = AbstractC42537IsG.A02(interfaceC60442pS, AbstractC31177DnL.A0P(userSession2));
            if (!A02.isSampled()) {
                return;
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 == null || (id = c38321qM3.getId()) == null) {
                id = c120985dq.getId();
            }
            AbstractC37300Gc1.A0l(A02, id);
            C38321qM c38321qM4 = c120985dq.A02;
            if (c38321qM4 != null) {
                l = AbstractC37302Gc3.A0U(c38321qM4);
            } else {
                l = null;
            }
            A02.A9K("m_t", l);
            AbstractC37300Gc1.A0o(A02, c120985dq.BzL(userSession2));
            C38321qM c38321qM5 = c120985dq.A02;
            Long l2 = null;
            if (c38321qM5 != null) {
                l2 = AbstractC37302Gc3.A0V(AbstractC41071vF.A07(userSession2, c38321qM5));
            }
            AbstractC37300Gc1.A0g(A02, l2);
            C38321qM c38321qM6 = c120985dq.A02;
            if (c38321qM6 != null && (id2 = c38321qM6.getId()) != null && (A0H = AbstractC41071vF.A0H(userSession2, id2)) != null && (A0j = AbstractC166997dE.A0j(A0H)) != null) {
                str = "host_profile_id";
            }
            A02.Cht();
        }
        A02.A9K(str, A0j);
        A02.Cht();
    }

    public HLH(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
