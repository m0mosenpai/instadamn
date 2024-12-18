package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CcI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28218CcI {
    public static final C28218CcI A00 = new Object();

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, CWE cwe) {
        C8V c8v;
        InterfaceC02590Ai A0f;
        String str;
        long j;
        Long valueOf;
        String str2;
        Long A0j;
        String str3;
        long j2;
        Long A0j2;
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        if (cwe.A06) {
            c8v = C8V.REELS;
        } else if (!cwe.A05) {
            return;
        } else {
            c8v = C8V.FEED;
        }
        if (cwe instanceof C2I) {
            C38321qM c38321qM = cwe.A03;
            int i = cwe.A00;
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cross_app_feedback_impression");
            if (A0f.isSampled()) {
                if (AbstractC166297by.A00(userSession, c38321qM)) {
                    str3 = "IG_PRODUCER_COMMENTS_ROW";
                } else {
                    str3 = "IG_VIEWER_COMMENTS_ROW";
                }
                A0f.AAP("feedback_surface", str3);
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j2 = AbstractC166997dE.A0j(A2u)) != null) {
                    j2 = A0j2.longValue();
                } else {
                    j2 = 0;
                }
                AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, j2));
                valueOf = Long.valueOf(i);
                str2 = AbstractC111324zv.A00(407);
            } else {
                return;
            }
        } else {
            if (!(cwe instanceof C2J)) {
                return;
            }
            C38321qM c38321qM2 = cwe.A03;
            int i2 = cwe.A02;
            int i3 = cwe.A01;
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cross_app_feedback_impression");
            if (!A0f.isSampled()) {
                return;
            }
            if (AbstractC166297by.A00(userSession, c38321qM2)) {
                str = "IG_PRODUCER_PLAYS_AND_LIKES_ROW";
            } else {
                str = "IG_VIEWER_PLAYS_AND_LIKES_ROW";
            }
            A0f.AAP("feedback_surface", str);
            String A2u2 = c38321qM2.A2u();
            if (A2u2 != null && (A0j = AbstractC166997dE.A0j(A2u2)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, j));
            A0f.A9K("fb_reaction_count", Long.valueOf(i2));
            valueOf = Long.valueOf(i3);
            str2 = "fb_play_count";
        }
        A0f.A9K(str2, valueOf);
        A0f.Cht();
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, CWE cwe) {
        C8V c8v;
        InterfaceC02590Ai A0f;
        String str;
        long j;
        Long valueOf;
        String str2;
        Long A0j;
        String str3;
        long j2;
        Long A0j2;
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        if (cwe.A06) {
            c8v = C8V.REELS;
        } else if (!cwe.A05) {
            return;
        } else {
            c8v = C8V.FEED;
        }
        if (cwe instanceof C2I) {
            C38321qM c38321qM = cwe.A03;
            int i = cwe.A00;
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cross_app_feedback_tap");
            if (A0f.isSampled()) {
                if (AbstractC166297by.A00(userSession, c38321qM)) {
                    str3 = "IG_PRODUCER_COMMENTS_ROW";
                } else {
                    str3 = "IG_VIEWER_COMMENTS_ROW";
                }
                A0f.AAP("feedback_surface", str3);
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j2 = AbstractC166997dE.A0j(A2u)) != null) {
                    j2 = A0j2.longValue();
                } else {
                    j2 = 0;
                }
                AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, j2));
                valueOf = Long.valueOf(i);
                str2 = AbstractC111324zv.A00(407);
            } else {
                return;
            }
        } else {
            if (!(cwe instanceof C2J)) {
                return;
            }
            C38321qM c38321qM2 = cwe.A03;
            int i2 = cwe.A02;
            int i3 = cwe.A01;
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cross_app_feedback_tap");
            if (!A0f.isSampled()) {
                return;
            }
            if (AbstractC166297by.A00(userSession, c38321qM2)) {
                str = "IG_PRODUCER_PLAYS_AND_LIKES_ROW";
            } else {
                str = "IG_VIEWER_PLAYS_AND_LIKES_ROW";
            }
            A0f.AAP("feedback_surface", str);
            String A2u2 = c38321qM2.A2u();
            if (A2u2 != null && (A0j = AbstractC166997dE.A0j(A2u2)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, j));
            A0f.A9K("fb_reaction_count", Long.valueOf(i2));
            valueOf = Long.valueOf(i3);
            str2 = "fb_play_count";
        }
        A0f.A9K(str2, valueOf);
        A0f.Cht();
    }
}
