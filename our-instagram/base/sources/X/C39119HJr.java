package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;

/* renamed from: X.HJr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39119HJr extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String ctaBarType;
        C38321qM A0G = AbstractC37301Gc2.A0G((C120985dq) obj);
        if (A0G != null) {
            UserSession userSession = this.A00;
            ClipsShoppingCTABarIntf A00 = AbstractC37667Gi0.A00(A0G);
            if (A00 != null && (ctaBarType = A00.getCtaBarType()) != null) {
                InterfaceC60442pS interfaceC60442pS = this.A01;
                String str = this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_reels_cta_impression");
                String id = A0G.getId();
                if (id != null) {
                    AbstractC37300Gc1.A0l(A0f, id);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC37301Gc2.A1C(c0Zx, "prior_module", interfaceC60442pS.getModuleName(), "shopping_reels_cta");
                    AbstractC37301Gc2.A13(A0f, c0Zx, "shopping_session_id", str);
                    A0f.AAP("cta_bar_type", ctaBarType);
                    A0f.Cht();
                    C25531Mh A02 = C25531Mh.A02(AbstractC12220kQ.A01(interfaceC60442pS, userSession));
                    if (AbstractC25226BEj.A1Z(A02)) {
                        if (str == null) {
                            str = "";
                        }
                        A02.A0R("shopping_session_id", str);
                        A02.A0R("navigation_chain", AbstractC25225BEi.A14());
                        AbstractC37303Gc4.A10(A02, interfaceC60442pS, A0G, "instagram_shopping_reels_cta_impression");
                        A02.A0R("cta_bar_type", ctaBarType);
                        A02.Cht();
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        String ctaBarType;
        C38321qM A0G = AbstractC37301Gc2.A0G((C120985dq) obj);
        if (A0G != null) {
            UserSession userSession = this.A00;
            ClipsShoppingCTABarIntf A00 = AbstractC37667Gi0.A00(A0G);
            if (A00 != null && (ctaBarType = A00.getCtaBarType()) != null) {
                InterfaceC60442pS interfaceC60442pS = this.A01;
                String str = this.A02;
                C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_reels_cta_sub_impression"), 323);
                if (AbstractC25226BEj.A1Z(c25531Mh)) {
                    String id = A0G.getId();
                    if (id != null) {
                        c25531Mh.A0l(id);
                        C0Zx c0Zx = new C0Zx();
                        AbstractC37301Gc2.A1C(c0Zx, "prior_module", interfaceC60442pS.getModuleName(), "shopping_reels_cta");
                        c0Zx.A06("shopping_session_id", str);
                        c25531Mh.A0N(c0Zx, "navigation_info");
                        c25531Mh.A0R("cta_bar_type", ctaBarType);
                        c25531Mh.Cht();
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
    }

    public C39119HJr(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A02 = str;
    }
}
