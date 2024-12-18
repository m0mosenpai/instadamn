package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72143Ln {
    public static String A00;
    public static String A01;

    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String str = A01;
        if (str != null) {
            C1ON A04 = AbstractC2044893h.A04(userSession, str);
            A04.A00 = new C39002HFe(userSession);
            abstractC59962oe.schedule(A04);
            A01 = null;
        }
        String str2 = A00;
        if (str2 != null) {
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A06();
            c25621Ms.A0L("fundraiser/%s/shared_to_feed_media/", str2);
            c25621Ms.A9s("fundraiser_id", str2);
            c25621Ms.A0P(null, ECE.class, FYQ.class, false);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new ESU(userSession);
            abstractC59962oe.schedule(A0N);
            A00 = null;
        }
    }
}
