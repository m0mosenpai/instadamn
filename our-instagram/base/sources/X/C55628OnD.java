package X;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.OnD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55628OnD implements CallerContextable {
    public static InterfaceC41501vz A00 = null;
    public static final C55628OnD A02 = new Object();
    public static final String __redex_internal_original_name = "FeedShareToFbRowViewBinder";
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);

    public static final void A01(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, OFL ofl, ENZ enz, String str, boolean z) {
        if (c38321qM != null) {
            C32500ETa c32500ETa = new C32500ETa(context, userSession, c38321qM, ofl, enz, str, 1, z);
            ShareLaterMedia shareLaterMedia = new ShareLaterMedia(c38321qM);
            shareLaterMedia.A07 = true;
            c38321qM.A4H(EnumC76753cN.A06);
            C1ON A002 = AbstractC54145Nwh.A00(userSession, shareLaterMedia, str, "likes_sheet");
            A002.A00 = c32500ETa;
            abstractC59962oe.schedule(A002);
        }
    }

    public static final void A02(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C211849aB c211849aB, C54622OAx c54622OAx, OFL ofl, ENZ enz) {
        boolean z;
        C38321qM c38321qM = c54622OAx.A02;
        String A0p = AbstractC25231BEo.A0p();
        Integer num = c211849aB.A00;
        if (num != null) {
            z = true;
            if (num.intValue() == 0) {
                C196208mB.A03.A01(userSession, null, "after_new_fbc", true, true);
                OQ9.A00(userSession).A01(userSession, "after_new_fbc", true);
                C196068lw.A00(userSession).A01(A01, new P1U(context, abstractC59962oe, userSession, c38321qM, c54622OAx, ofl, enz, A0p, z), "likes_sheet");
            }
        }
        z = false;
        C196068lw.A00(userSession).A01(A01, new P1U(context, abstractC59962oe, userSession, c38321qM, c54622OAx, ofl, enz, A0p, z), "likes_sheet");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Zx, X.MnJ] */
    public static final void A03(EnumC201098ur enumC201098ur, UserSession userSession, C54622OAx c54622OAx, String str) {
        MU0 mu0;
        C82G c82g = C82G.A0Y;
        C82H c82h = C82H.A0t;
        C82I A0H = MSW.A0H();
        A0H.A06("suppress_reason", str);
        C38321qM c38321qM = c54622OAx.A02;
        A0H.A06("ig_media_id", c38321qM.getId());
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        if (enumC201098ur == EnumC201098ur.VIEW) {
            mu0 = MU0.VIEW;
        } else if (enumC201098ur != EnumC201098ur.ACCEPT) {
            return;
        } else {
            mu0 = MU0.SHARE_CLICK;
        }
        MU1 mu1 = MU1.FEED;
        ?? c0Zx = new C0Zx();
        c0Zx.A06("media_id", c38321qM.getId());
        AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession);
    }

    public static final void A00(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, OFL ofl, ENZ enz, String str, boolean z) {
        if (!AbstractC166987dD.A10(userSession).CQw()) {
            C196068lw.A00(userSession).A01(A01, new P1T(context, abstractC59962oe, userSession, c38321qM, ofl, enz, str, z), "likes_sheet");
        } else {
            A01(context, abstractC59962oe, userSession, c38321qM, ofl, enz, str, z);
        }
    }

    public static final void A04(IgdsButton igdsButton, boolean z) {
        igdsButton.setLoading(z);
        igdsButton.setEnabled(!z);
        Context A0L = AbstractC166997dE.A0L(igdsButton);
        AccessibilityManager A09 = AbstractC50523MSb.A09(A0L);
        if (AbstractC56862jK.A02(A09, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(A0L.getResources().getString(2131965663));
            A09.sendAccessibilityEvent(obtain);
        }
    }
}
