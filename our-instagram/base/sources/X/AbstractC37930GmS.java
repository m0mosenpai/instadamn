package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.GmS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37930GmS {
    public static void A00(AnonymousClass182 anonymousClass182, AbstractC65924TwV abstractC65924TwV) {
        anonymousClass182.A0R(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, abstractC65924TwV.A02);
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, abstractC65924TwV.A01);
    }

    public static void A01(C16L c16l, AbstractC65924TwV abstractC65924TwV, String str) {
        if (OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME.equals(str)) {
            abstractC65924TwV.A02 = c16l.A0y();
        } else {
            if (!PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(str)) {
                return;
            }
            abstractC65924TwV.A01 = c16l.A1D();
        }
    }
}
