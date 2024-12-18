package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.VvQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69785VvQ {
    public final AbstractC018607g A00;
    public final C61972ry A01;
    public final UserSession A02;

    public final void A00(C1P1 c1p1, String str) {
        C2JM c2jm = new C2JM();
        UserSession userSession = this.A02;
        boolean A1X = AbstractC43594JPz.A1X(c2jm, PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession.userId);
        c2jm.A04(AbstractC111324zv.A00(2020), str);
        if (str.equals("INBOX")) {
            c2jm.A02("should_create_if_not_existed", true);
        }
        C195928le A00 = C195928le.A00(userSession);
        C18C.A0E(A1X);
        C907442n c907442n = new C907442n(c2jm, UNH.class, "AdToolsHighlightsHubQuery", false);
        A00.ATV(new C63994SxR(2), new WW0(c1p1, 5), c907442n);
    }

    public final void A01(C1P1 c1p1, String str, String str2) {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/ads_manager/get_or_enroll_coupon/");
        A0c.A0H("fb_auth_token", str);
        if (str2 != null) {
            A0c.A9s("coupon_offer_id", str2);
        }
        A0c.A0R(PromoteEnrollCouponInfo.class, C69919Vxk.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        this.A01.schedule(A0N);
    }

    public final void A02(C1P1 c1p1, String str, String str2, String str3) {
        UserSession userSession = this.A02;
        String str4 = C70399WUb.A00(userSession).A03;
        AbstractC167007dF.A1F(userSession, 0, str4);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, "ads/ads_manager/pause_promotion_v2/", str);
        A0c.A9s("fb_auth_token", str3);
        A0c.A0H("flow_id", str4);
        A0c.A0H("boosted_id", str2);
        A0c.A0R(C67823Uyw.class, C69896VxN.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        this.A01.schedule(A0N);
    }

    public final void A03(C1P1 c1p1, String str, String str2, String str3) {
        UserSession userSession = this.A02;
        String str4 = C70399WUb.A00(userSession).A03;
        AbstractC167017dG.A1N(userSession, str);
        C14360o3.A0B(str4, 4);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, "ads/ads_manager/resume_promotion_v2/", str);
        A0c.A9s("fb_auth_token", str3);
        A0c.A0H("flow_id", str4);
        A0c.A0H("boosted_id", str2);
        A0c.A0R(C67823Uyw.class, C69896VxN.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        this.A01.schedule(A0N);
    }

    public C69785VvQ(Context context, C07X c07x, UserSession userSession) {
        this.A02 = userSession;
        C08790ch A00 = AbstractC018607g.A00(c07x);
        this.A00 = A00;
        this.A01 = new C61972ry(context, A00);
    }
}
