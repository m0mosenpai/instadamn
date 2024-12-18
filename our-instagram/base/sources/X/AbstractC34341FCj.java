package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.FCj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34341FCj {
    public static void A00(AnonymousClass182 anonymousClass182, C34591FMa c34591FMa) {
        anonymousClass182.A0d();
        String str = c34591FMa.A01;
        if (str != null) {
            anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, str);
        }
        anonymousClass182.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c34591FMa.A00);
        anonymousClass182.A0T("preferred", c34591FMa.A03);
        anonymousClass182.A0T("displayed", c34591FMa.A02);
        anonymousClass182.A0a();
    }
}
