package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.J2c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43062J2c implements InterfaceC31012DkB {
    public final C120985dq A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.InterfaceC31012DkB
    public final void Cm1(Integer num, int i, int i2) {
        C38321qM c38321qM;
        List list;
        String str;
        C14360o3.A0B(num, 2);
        C120985dq c120985dq = this.A00;
        if (c120985dq.A0F() && (c38321qM = c120985dq.A02) != null && (list = c120985dq.A0R) != null) {
            UserSession userSession = this.A02;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, userSession), "instagram_ad_carousel_swipe");
            if (num.intValue() != 0) {
                str = "user_swipe";
            } else {
                str = "auto_advance";
            }
            A0f.AAP("source_of_swipe", str);
            Long A0V = AbstractC31171DnF.A0V(i);
            A0f.A9K("from_index", A0V);
            A0f.A9K(AbstractC111324zv.A00(3245), AbstractC31171DnF.A0V(i2));
            A0f.A9K("carousel_index", A0V);
            A0f.A9K("carousel_size", AbstractC31171DnF.A0V(list.size()));
            AbstractC37300Gc1.A0o(A0f, c120985dq.A06().A0j);
            C38321qM c38321qM2 = c120985dq.A02;
            String str2 = null;
            A0f.AAP("carousel_media_id", AbstractC37301Gc2.A0h(c38321qM2));
            C38321qM c38321qM3 = (C38321qM) AbstractC001800i.A0J(list);
            if (c38321qM3 != null) {
                str2 = c38321qM3.getId();
            }
            A0f.AAP("carousel_cover_media_id", str2);
            AbstractC37300Gc1.A0l(A0f, AbstractC128985sJ.A09(c38321qM));
            A0f.A9K("a_pk_long", Long.valueOf(AbstractC128985sJ.A00(userSession, c38321qM)));
            User A2E = c38321qM.A2E(userSession);
            C14360o3.A0A(A2E);
            A0f.AAP("a_pk", Long.valueOf(Long.parseLong(A2E.getId())).toString());
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC31012DkB
    public final void Cm7(AdFormatType adFormatType) {
        C38321qM c38321qM;
        String A0n;
        C120985dq c120985dq = this.A00;
        if (c120985dq.A0F() && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A02;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, userSession), "instagram_ad_thumbnail_swipe");
            AbstractC37303Gc4.A0i(A0f, c120985dq.A06());
            if (adFormatType != null) {
                int ordinal = adFormatType.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 6) {
                        A0n = "slide_scrubber";
                    }
                } else {
                    A0n = "hscroll";
                }
                A0f.AAP("format", A0n);
                AbstractC37300Gc1.A0o(A0f, c120985dq.A06().A0j);
                AbstractC37300Gc1.A0l(A0f, AbstractC128985sJ.A09(c38321qM));
                User A2E = c38321qM.A2E(userSession);
                C14360o3.A0A(A2E);
                A0f.AAP("a_pk", Long.valueOf(Long.parseLong(A2E.getId())).toString());
                A0f.AAP("carousel_media_id", AbstractC25231BEo.A0s(c120985dq.A02));
                A0f.Cht();
            }
            A0n = AbstractC167017dG.A0n(adFormatType, "Invalid format type: ", AbstractC166987dD.A1C());
            A0f.AAP("format", A0n);
            AbstractC37300Gc1.A0o(A0f, c120985dq.A06().A0j);
            AbstractC37300Gc1.A0l(A0f, AbstractC128985sJ.A09(c38321qM));
            User A2E2 = c38321qM.A2E(userSession);
            C14360o3.A0A(A2E2);
            A0f.AAP("a_pk", Long.valueOf(Long.parseLong(A2E2.getId())).toString());
            A0f.AAP("carousel_media_id", AbstractC25231BEo.A0s(c120985dq.A02));
            A0f.Cht();
        }
    }

    public C43062J2c(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167027dH.A13(c120985dq, userSession, interfaceC11380iw);
        this.A00 = c120985dq;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
