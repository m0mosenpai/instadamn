package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

/* renamed from: X.ODl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54685ODl {
    public C4NL A00;
    public C64842wi A01;
    public boolean A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C64742wY A05;

    public C54685ODl(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54413O2t c54413O2t) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        C27961Xa A00 = AbstractC54912fq.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(QPTooltipAnchor.A0s, new C64712wV());
        C64742wY A05 = A00.A05(userSession, A1G);
        this.A05 = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0Y;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new P71(this, c54413O2t);
        A0S.A08 = new C70973Wlh(0, c54413O2t, this);
        A0S.A01(new P73(this, 2), A05);
        this.A01 = AbstractC31175DnJ.A0T(abstractC59962oe, userSession, A0S, A002, quickPromotionSlot);
    }
}
