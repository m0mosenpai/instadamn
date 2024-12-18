package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OKj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54810OKj {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    public C54810OKj(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(String str, String str2, String str3, String str4) {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "ig_live_moderator_resign");
        MSY.A16(A0f, str3);
        AbstractC31171DnF.A1A(A0f, "confirm");
        if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0f, j);
        if (str4 == null) {
            str4 = "0";
        }
        AbstractC37300Gc1.A0l(A0f, str4);
        AbstractC37301Gc2.A15(A0f, this.A00);
        MSW.A1T(A0f, "moderator");
        if (str == null) {
            str = "";
        }
        A0f.AAP("method", str);
        A0f.Cht();
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, String str6) {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "ig_live_moderator_selection");
        if (str4 == null) {
            str4 = "0";
        }
        MSY.A16(A0f, str4);
        AbstractC31171DnF.A1A(A0f, str);
        if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0f, j);
        if (str5 == null) {
            str5 = "0";
        }
        AbstractC37300Gc1.A0l(A0f, str5);
        AbstractC37301Gc2.A15(A0f, this.A00);
        MSX.A1D(A0f);
        if (str6 == null) {
            str6 = "";
        }
        A0f.AAP("method", str6);
        A0f.A9K("target_user_id", Long.valueOf(AbstractC50522MSa.A0C(str2)));
        A0f.Cht();
    }
}
