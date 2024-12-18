package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1YA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YA {
    public static C1YA A01;
    public C189478aR A00;

    public static void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C189478aR c189478aR, VG2 vg2) {
        User A2E;
        String string = bundle.getString("media_id");
        C38321qM A02 = C1DW.A00(userSession).A02(string);
        if (A02 == null) {
            A2E = null;
        } else {
            A2E = A02.A2E(userSession);
        }
        String string2 = bundle.getString("url");
        String string3 = bundle.getString("initial_url");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", string2);
            jSONObject.put("in_app_browser", jSONObject2);
        } catch (JSONException unused) {
        }
        C58877QEn c58877QEn = new C58877QEn(bundle.getBundle("tracking"));
        TF3 tf3 = new TF3(c58877QEn);
        if (vg2 == VG2.A0d) {
            string.getClass();
        } else {
            string = jSONObject.toString();
        }
        WEz A012 = AbstractC69993VzD.A01(fragmentActivity, tf3, userSession, EnumC65855TvH.A14, vg2, string);
        String string4 = bundle.getString("bottom_sheet_title");
        C14360o3.A0B(string4, 0);
        A012.A07 = string4;
        A012.A01 = A2E;
        A012.A03 = new C60996RdO(tf3, userSession, c58877QEn, string2, string3);
        A012.A0E = true;
        if (c189478aR == null) {
            A012.A06();
        } else {
            WEz.A00(c189478aR, A012);
        }
    }
}
