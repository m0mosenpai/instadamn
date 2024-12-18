package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CUm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27966CUm {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final C1QN A03;
    public final String A04;

    public final void A00(C38321qM c38321qM, String str, C36J c36j) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A02.getValue(), "ig_remind_me_about_this_ad");
        if (A0f.isSampled()) {
            A0f.AAP("action", str);
            A0f.AAP("m_pk", c38321qM.A0C.getPk());
            A0f.AAP("prior_module", this.A04);
            A0f.AAP("tracking_token", c38321qM.CAR());
            String A07 = AbstractC41071vF.A07(this.A01, c38321qM);
            Long l2 = null;
            if (A07 != null) {
                l = AbstractC166997dE.A0j(A07);
            } else {
                l = null;
            }
            A0f.A9K("ad_id", l);
            AbstractC25225BEi.A1N(A0f, String.valueOf(this.A03.A02.A00));
            A0f.AAP("media_id", c38321qM.getId());
            if (c36j != null) {
                l2 = Long.valueOf(C36J.A06(C36G.A09, c36j.A00));
            }
            A0f.A9K("dwell_time_seconds", l2);
            A0f.Cht();
        }
    }

    public final void A01(String str, String str2, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A02.getValue(), "ig_remind_me_about_this_ad");
        if (A0f.isSampled()) {
            A0f.AAP("action", str);
            A0f.AAP("m_pk", "");
            A0f.AAP("prior_module", this.A04);
            A0f.AAP("tracking_token", "");
            A0f.A9K("ad_id", Long.valueOf(j));
            AbstractC25225BEi.A1N(A0f, String.valueOf(this.A03.A02.A00));
            A0f.AAP("media_id", str2);
            A0f.Cht();
        }
    }

    public C27966CUm(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A00 = interfaceC11380iw;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new D8A(this, 43));
        C1QN c1qn = C1QM.A00;
        C14360o3.A07(c1qn);
        this.A03 = c1qn;
    }
}
