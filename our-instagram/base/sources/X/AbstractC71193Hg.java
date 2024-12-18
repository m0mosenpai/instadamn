package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC71193Hg {
    public static final AtomicBoolean A00 = new AtomicBoolean();

    public static Bundle A00(C3II c3ii) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", c3ii.A00.getToken());
        C35027Fc0 c35027Fc0 = c3ii.A01;
        bundle.putString("feedback_title", c35027Fc0.A0A);
        bundle.putString("feedback_message", c35027Fc0.A08);
        bundle.putString("feedback_appeal_label", c35027Fc0.A00);
        bundle.putString("feedback_action", c35027Fc0.A05);
        bundle.putString("feedback_ignore_label", c35027Fc0.A07);
        bundle.putString("feedback_url", c35027Fc0.A06);
        return bundle;
    }

    public static void A01(Bundle bundle, AbstractC10360h2 abstractC10360h2) {
        if (!TextUtils.isEmpty(bundle.getString("feedback_message")) && abstractC10360h2 != null) {
            new Handler().post(new RunnableC71508WvD(bundle, abstractC10360h2));
        }
    }
}
