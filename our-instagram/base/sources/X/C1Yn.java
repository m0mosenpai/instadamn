package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1Yn, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Yn {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, User user, InterfaceC37219GaU interfaceC37219GaU, String str, String str2, String str3, JSONObject jSONObject) {
        String str4;
        if (str2 == null) {
            str4 = AbstractC34332FCa.A00(str);
        } else {
            str4 = str2;
        }
        C35199Ffr c35199Ffr = new C35199Ffr(null, null, null, null, str, str4, user.B7L().name(), null, "DEFAULT", "DEFAULT", UUID.randomUUID().toString(), user.BJ8());
        C35263Fgx.A06(userSession, c35199Ffr, user.getId(), !user.CQf());
        AbstractC35098Fd9.A00(context, user.A03.C45(), userSession, new FanClubApi(userSession), c189478aR, c189448aO, user, new C36769GIs(context, fragmentActivity, userSession, user, c35199Ffr, interfaceC37219GaU, str, str2, str3, jSONObject), str3, 0, false, false, "profile".equals(str), "comment_deletion_bottom_sheet_upsell".equals(str2));
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        if ((i != 0 && i != 2) || fragmentActivity == null || AnonymousClass280.A01.A06(userSession).getBoolean("HAS_SEEN_SUPERVISION_UPSELL", false)) {
            return;
        }
        C913045j c913045j = C913045j.A00;
        C54s c54s = new C54s(c913045j);
        c54s.A0F("action_trigger", "block");
        C54s c54s2 = new C54s(c913045j);
        c54s2.A0C(c54s, "server_params");
        HashMap hashMap = new HashMap();
        hashMap.put("params", c54s2.toString());
        AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.bloks.www.ig.supervision.upsell.async", hashMap);
        A02.A00(new C32384EOk(userSession, fragmentActivity));
        C1GJ.A05(A02, 689362604, 3, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, true, true);
    }
}
