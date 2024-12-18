package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes6.dex */
public abstract class FTV {
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1P1 r17, com.instagram.common.session.UserSession r18, X.C1GL r19, com.instagram.model.business.BusinessInfo r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTV.A00(X.1P1, com.instagram.common.session.UserSession, X.1GL, com.instagram.model.business.BusinessInfo):void");
    }

    public static final void A01(C1P1 c1p1, UserSession userSession, boolean z) {
        String str;
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("accounts/update_business_info/");
        A0C.A0R(C2045893s.class, C2046093u.class);
        A0C.A0R = true;
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0C, "is_profile_audio_call_enabled", str);
        if (c1p1 != null) {
            A0T.A00 = c1p1;
        }
        C1GJ.A03(A0T);
    }
}
