package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.HashMap;

/* renamed from: X.Oa3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55052Oa3 {
    public static boolean A00;
    public static final C55052Oa3 A01 = new Object();

    public final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (new CXPNoticeStateRepository(userSession, C05F.A00).A00(EnumC46582Bw.A0K).A00 <= 0 && AbstractC46542Bs.A00(userSession).A04.getInt("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", 0) > 0 && C18U.A06(C06090Tz.A05, userSession, 2342161368632793197L)) {
            return true;
        }
        return false;
    }

    public static final void A00(C82G c82g, AbstractC59962oe abstractC59962oe, UserSession userSession, Integer num, String str) {
        String str2;
        boolean A1a = AbstractC167017dG.A1a(userSession, abstractC59962oe);
        if (A00) {
            C0K8.A0C("ShareToFacebookMigrationUpsellUtil", AnonymousClass001.A0g("launchMigrationUpsell(bloksAppId=", str, ") has pending"));
            return;
        }
        A00 = A1a;
        if (str == null || str.length() == 0) {
            return;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("entrypoint", c82g.A00);
        if (num != null) {
            str2 = num.toString();
        } else {
            str2 = null;
        }
        HashMap A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("qpl_instance_key", str2, A1L));
        C62862tP A03 = C62862tP.A03(abstractC59962oe, userSession, null);
        AbstractC192798gL A022 = C192108fB.A02(null, userSession, str, A02);
        A022.A00(new C32394EOv(abstractC59962oe, A03, 17));
        abstractC59962oe.registerLifecycleListener(new C56040OuC(abstractC59962oe, abstractC59962oe.scheduleAndGetLoaderId(A022)));
    }
}
