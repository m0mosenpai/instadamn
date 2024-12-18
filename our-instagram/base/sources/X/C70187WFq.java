package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WFq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70187WFq {
    public static final C70187WFq A00 = new Object();

    public static final void A00(Context context, AbstractC018607g abstractC018607g, XCQ xcq, UserSession userSession) {
        C14360o3.A0B(abstractC018607g, 1);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(MSV.A00(906));
        A0c.A0R(C67803Uyc.class, C69891VxI.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = new C66081TzI(xcq, 24);
        C1GJ.A00(context, abstractC018607g, A0N);
    }

    public static final void A01(Context context, AbstractC018607g abstractC018607g, XCQ xcq, UserSession userSession) {
        AbstractC167007dF.A1D(context, 0, userSession);
        A03(context, abstractC018607g, new C70662Wei(context, abstractC018607g, xcq, userSession, false), userSession);
    }

    public static final void A02(Context context, AbstractC018607g abstractC018607g, XCQ xcq, UserSession userSession, boolean z) {
        if (!z) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317998641846029L) || C18U.A06(c06090Tz, userSession, 36317998641977102L)) {
                xcq.E65("");
                return;
            }
        }
        C68725Vb4 A002 = AbstractC68468VRy.A00(userSession);
        String str = A002.A00;
        if (str != null) {
            A00.A04(context, abstractC018607g, new C70664Wek(context, abstractC018607g, A002, new C70660Weg(xcq, 2), userSession, str), userSession, str);
        } else {
            A00(context, abstractC018607g, new C70657Wed(2, A002, xcq), userSession);
        }
    }

    public static final void A03(Context context, AbstractC018607g abstractC018607g, XCR xcr, UserSession userSession) {
        C14360o3.A0B(abstractC018607g, 1);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/promote/fetch_experiment_config/");
        A0c.A0R(C67822Uyv.class, C69893VxK.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = new C66081TzI(xcr, 23);
        C1GJ.A00(context, abstractC018607g, A0N);
    }

    public final void A04(Context context, AbstractC018607g abstractC018607g, XCS xcs, UserSession userSession, String str) {
        C14360o3.A0B(abstractC018607g, 1);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/promote/validate_business_user_access_token/");
        A0c.A9s("business_user_access_token", str);
        A0c.A0R(C67804Uyd.class, C69892VxJ.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = new C66081TzI(xcs, 25);
        C1GJ.A00(context, abstractC018607g, A0N);
    }
}
