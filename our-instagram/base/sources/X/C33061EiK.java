package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EiK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33061EiK extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        UserSession userSession = c70d.A09;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36312350760240182L);
        AbstractC59962oe abstractC59962oe = c70d.A07;
        if (A06) {
            AbstractC34827FWi.A01(abstractC59962oe.getActivity(), userSession, null, false);
        } else {
            AbstractC34827FWi.A00(abstractC59962oe, userSession, "profile", "discover_people", false);
        }
    }
}
