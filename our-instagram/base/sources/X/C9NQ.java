package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.9NQ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NQ {
    public static final DeviceConfig A00(C69724VuJ c69724VuJ) {
        return new DeviceConfig(c69724VuJ.A01, c69724VuJ.A02, c69724VuJ.A03, c69724VuJ.A04, c69724VuJ.A05, -2.221441469079183d, 2.221441469079183d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, c69724VuJ.A00, Boolean.valueOf(c69724VuJ.A0A), Boolean.valueOf(c69724VuJ.A09), "", AbstractC166997dE.A0b());
    }

    public static final boolean A01(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, context);
        if (C56B.A00(userSession) <= 15 && C04100Kb.A00(context) < 2016) {
            return false;
        }
        return true;
    }
}
