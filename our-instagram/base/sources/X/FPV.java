package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.contacts.ccu.impl.CCUPluginImpl;

/* loaded from: classes6.dex */
public final class FPV {
    public static FPV A01;
    public CCUPluginImpl A00;

    public FPV() {
        try {
            Object newInstance = Class.forName("com.instagram.contacts.ccu.impl.CCUPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.contacts.ccu.intf.CCUPlugin");
            this.A00 = (CCUPluginImpl) newInstance;
        } catch (Throwable th) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUPlugin");
            C14360o3.A0A(formatStrLocaleSafe);
            C0w9.A06("CCUPluginWrapper", formatStrLocaleSafe, th);
        }
    }

    public final void A00(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        CCUPluginImpl cCUPluginImpl = this.A00;
        if (cCUPluginImpl != null) {
            cCUPluginImpl.initScheduler(context, userSession);
        }
    }
}
