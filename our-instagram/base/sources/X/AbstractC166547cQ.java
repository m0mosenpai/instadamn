package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166547cQ {
    public static final long A00 = TimeUnit.SECONDS.toMillis(10);
    public static final Map A01 = new ConcurrentHashMap();

    public static final C1ON A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("restrict_action/get_restricted_users/");
        c25621Ms.A0P(null, C168027ex.class, C168037ey.class, false);
        return c25621Ms.A0N();
    }

    public static final C1ON A01(UserSession userSession, String str, String str2) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("restrict_action/unrestrict/");
        c25621Ms.A9s("target_user_id", str);
        c25621Ms.A0R(C168027ex.class, C168037ey.class);
        c25621Ms.A9s("container_module", str2);
        return c25621Ms.A0N();
    }

    public static final void A02(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC37205GaG interfaceC37205GaG, C166217bp c166217bp, String str, String str2, String str3, List list) {
        String str4 = str3;
        C14360o3.A0B(abstractC018607g, 1);
        C14360o3.A0B(c166217bp, 3);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", userSession.userId, "restrict_many", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        C14360o3.A07(formatStrLocaleSafe);
        Map map = A01;
        Number number = (Number) map.get(formatStrLocaleSafe);
        if (number != null) {
            if (number.longValue() + A00 <= System.currentTimeMillis()) {
                map.remove(formatStrLocaleSafe);
            } else {
                return;
            }
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("restrict_action/restrict_many/");
        c25621Ms.A9s("user_ids", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        c25621Ms.A0P(null, C168027ex.class, C168037ey.class, false);
        c25621Ms.A9s("container_module", str);
        if (str3 == null) {
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("surface", "profile_of_commenter");
                    jSONObject.put("comment_id", str2);
                } catch (JSONException e) {
                    C0w9.A03("Restrict API", AnonymousClass001.A0R("Error adding adding comment params to JSON Object: ", e.getMessage()));
                }
                str4 = jSONObject.toString();
                C14360o3.A07(str4);
            }
            c25621Ms.A0R = true;
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new EUV(userSession, new C33314Eo9(c166217bp), interfaceC37205GaG, formatStrLocaleSafe);
            C1GJ.A00(context, abstractC018607g, A0N);
        }
        c25621Ms.AA6("entrypoint", str4);
        c25621Ms.A0R = true;
        C1ON A0N2 = c25621Ms.A0N();
        A0N2.A00 = new EUV(userSession, new C33314Eo9(c166217bp), interfaceC37205GaG, formatStrLocaleSafe);
        C1GJ.A00(context, abstractC018607g, A0N2);
    }
}
