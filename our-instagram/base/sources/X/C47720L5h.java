package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.L5h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47720L5h {
    public final KYg A00(UserSession userSession, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (str3 == null) {
            str3 = AbstractC58442PvL.A02();
        }
        if ("SETTINGS".equals(str)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "user_click_appreciationonboarding_atomic");
            if (A0f.isSampled()) {
                JQ1.A0d(A0f, str3);
                C0Zx c0Zx = new C0Zx();
                AbstractC43592JPx.A1N(c0Zx, "creator_settings");
                c0Zx.A06("target_name", "gifts_on_reels");
                A0f.AAQ(c0Zx, "event_payload");
                AbstractC43593JPy.A1K(A0f, AbstractC06930Yk.A0E());
            }
        }
        KYg kYg = new KYg();
        kYg.setArguments(AbstractC167027dH.A09(MSV.A00(667), str2, AbstractC166987dD.A1L("appreciation_logging_data", new LoggingData(str3, AbstractC167007dF.A0h(str))), AbstractC166987dD.A1L("arg_start_onboarding", Boolean.valueOf(z)), AbstractC166987dD.A1L(MSV.A00(141), str)));
        return kYg;
    }
}
