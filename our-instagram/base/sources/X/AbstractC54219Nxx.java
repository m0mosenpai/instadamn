package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;

/* renamed from: X.Nxx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54219Nxx {
    public static final void A00(UserSession userSession, C201848wH c201848wH, C54804OJy c54804OJy) {
        String str;
        Object obj;
        C14360o3.A0B(c54804OJy, 1);
        if (c201848wH != null) {
            Iterator<E> it = MSX.A0D(c201848wH, C201868wJ.class, "client_params", 7, 1311672120).iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((C2JS) obj).A07("key"), "snooze_on_dismiss_enabled")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2JS c2js = (C2JS) obj;
            if (c2js != null) {
                str = c2js.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            }
            if (C14360o3.A0K(str, RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                c54804OJy.A05 = new PG9(userSession, c201848wH, c54804OJy.A05, c54804OJy);
            }
        }
    }
}
