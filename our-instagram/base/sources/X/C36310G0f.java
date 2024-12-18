package X;

import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;

/* renamed from: X.G0f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36310G0f implements InterfaceC43071ya {
    public final C18920wW A00;
    public final UserSession A01;

    public C36310G0f(C18920wW c18920wW, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c18920wW;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Long l;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = (IgxfbNetEgoCTABannerParams) c59062n7.A03;
            UserSession userSession = this.A01;
            C18920wW c18920wW = this.A00;
            C14360o3.A0A(igxfbNetEgoCTABannerParams);
            C14360o3.A0B(igxfbNetEgoCTABannerParams, 2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_pymr_fb_banner_impression");
            if (A0f.isSampled()) {
                String str = userSession.userId;
                C14360o3.A0B(str, 0);
                A0f.A9K("entity_id", AbstractC003100w.A0k(10, str));
                String str2 = igxfbNetEgoCTABannerParams.A02;
                Long l2 = null;
                if (str2 != null) {
                    l = AbstractC003100w.A0k(10, str2);
                } else {
                    l = null;
                }
                A0f.A9K("netego_type", l);
                String str3 = igxfbNetEgoCTABannerParams.A01;
                if (str3 != null) {
                    l2 = AbstractC003100w.A0k(10, str3);
                }
                A0f.A9K("media_id", l2);
                A0f.Cht();
            }
        }
    }
}
