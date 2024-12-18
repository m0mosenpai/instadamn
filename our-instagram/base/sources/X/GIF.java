package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GIF implements InterfaceC37185GZw {
    public C6WQ A00;

    @Override // X.InterfaceC37185GZw
    public final Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        String message;
        String decode;
        HashMap hashMap;
        try {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            String scheme = A03.getScheme();
            if (("ig".equalsIgnoreCase(scheme) || "instagram".equalsIgnoreCase(scheme)) && "react_native".equals(A03.getHost())) {
                String queryParameter = A03.getQueryParameter("route");
                if (!TextUtils.isEmpty(queryParameter)) {
                    String queryParameter2 = A03.getQueryParameter(DialogModule.KEY_TITLE);
                    String queryParameter3 = A03.getQueryParameter("params");
                    String queryParameter4 = A03.getQueryParameter("is_buat_required");
                    try {
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            decode = URLDecoder.decode(queryParameter2, "utf-8");
                        } else {
                            decode = "";
                        }
                        if (TextUtils.isEmpty(queryParameter3)) {
                            queryParameter3 = "{}";
                        }
                        String decode2 = URLDecoder.decode(queryParameter3, "utf-8");
                        if (!TextUtils.isEmpty(decode2)) {
                            JSONObject jSONObject = new JSONObject(decode2);
                            hashMap = AbstractC166987dD.A1G();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(keys);
                                hashMap.put(A1B, jSONObject.get(A1B).toString());
                            }
                        } else {
                            hashMap = null;
                        }
                        Bundle A0b = AbstractC166987dD.A0b();
                        if (hashMap != null && !hashMap.isEmpty()) {
                            Iterator A14 = AbstractC166997dE.A14(hashMap);
                            while (A14.hasNext()) {
                                AbstractC31179DnN.A0o(A0b, A14);
                            }
                        }
                        Bundle A0b2 = AbstractC166987dD.A0b();
                        A0b2.putString("bundle_param_route", queryParameter);
                        A0b2.putString("bundle_param_title", decode);
                        A0b2.putBundle("bundle_param_props", A0b);
                        if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(queryParameter4)) {
                            A0b2.putBoolean("bundle_param_buat_required", true);
                        }
                        return A0b2;
                    } catch (IOException | SecurityException | JSONException e) {
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            C0w9.A03("ReactNativeRouteHandler", e.getMessage());
                            return null;
                        }
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException | SecurityException e2) {
            if (e2.getMessage() == null) {
                message = "";
            } else {
                message = e2.getMessage();
            }
            C0w9.A03("ReactNativeRouteHandler", message);
            return null;
        }
    }

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    public static void A02(FragmentActivity fragmentActivity, GIF gif) {
        C6WQ c6wq = gif.A00;
        if (c6wq != null) {
            AbstractC31176DnK.A10(c6wq);
        }
        fragmentActivity.finish();
    }

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        if (abstractC18680vv instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC18680vv;
            if (bundle.getBoolean("bundle_param_buat_required", false)) {
                W6f.A01(fragmentActivity, new C35920Fte(bundle, fragmentActivity, userSession, this), userSession, "ReactNativeRouteHandler");
                return;
            } else {
                A01(bundle, fragmentActivity, userSession, this);
                return;
            }
        }
        A02(fragmentActivity, this);
    }

    public static void A00(Bundle bundle, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str) {
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(abstractC12990ll).A01(str);
        String string = bundle.getString("bundle_param_title");
        if (!TextUtils.isEmpty(string)) {
            A01.A07 = string;
        }
        Bundle bundle2 = bundle.getBundle("bundle_param_props");
        if (bundle2 != null && !bundle2.isEmpty()) {
            A01.A00(bundle2);
        }
        AbstractC31174DnI.A1L(A01.EqV(fragmentActivity));
        ((BaseFragmentActivity) fragmentActivity).A0a();
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.EtL, java.lang.Object] */
    public static void A01(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, GIF gif) {
        java.util.Set set;
        int i;
        String string;
        C35196Ffo A00 = C35196Ffo.A00();
        synchronized (A00) {
            if (A00.A00 == null && AbstractC12290kX.A00 != null) {
                C17320tT A01 = AbstractC19750y3.A01("RNWhiteListedRouteStore_Prefs");
                java.util.Set stringSet = A01.getStringSet("RNWhiteListedRouteStore_RL", null);
                long j = A01.getLong("RNWhiteListedRouteStore_TS", 0L);
                int i2 = A01.getInt("RNWhiteListedRouteStore_RC", -1);
                if (stringSet != null && j > 0 && i2 >= 0) {
                    ?? obj = new Object();
                    obj.A02 = stringSet;
                    obj.A00 = i2;
                    obj.A01 = j;
                    A00.A00 = obj;
                }
            }
            C33609EtL c33609EtL = A00.A00;
            if (c33609EtL != null && (set = c33609EtL.A02) != null && !set.isEmpty() && (i = c33609EtL.A00) < 15 && Math.abs(System.currentTimeMillis() - c33609EtL.A01) < C35196Ffo.A01) {
                c33609EtL.A00 = i + 1;
                C35196Ffo.A01(A00);
                java.util.Set set2 = c33609EtL.A02;
                if (set2 == null) {
                    set2 = AbstractC166987dD.A1H();
                    c33609EtL.A02 = set2;
                }
                List unmodifiableList = Collections.unmodifiableList(AbstractC166987dD.A1F(Collections.unmodifiableSet(set2)));
                if (unmodifiableList != null && !unmodifiableList.isEmpty() && (((string = bundle.getString("bundle_param_route")) != null && string.equals(AbstractC111324zv.A00(596))) || (!TextUtils.isEmpty(string) && unmodifiableList.contains(string)))) {
                    A00(bundle, fragmentActivity, userSession, string);
                    C6WQ c6wq = gif.A00;
                    if (c6wq != null) {
                        AbstractC31176DnK.A10(c6wq);
                        return;
                    }
                    return;
                }
            }
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0B("notifications/whitelisted_react_native_routes_from_notif/");
            C1ON A0S = AbstractC31172DnG.A0S(A0N, EDK.class, C34854FXn.class);
            A0S.A00 = new C32541EUr(10, bundle, gif, userSession, fragmentActivity);
            C6WQ c6wq2 = new C6WQ(fragmentActivity);
            gif.A00 = c6wq2;
            AbstractC31176DnK.A13(fragmentActivity, c6wq2);
            gif.A00.setCancelable(true);
            gif.A00.setCanceledOnTouchOutside(false);
            gif.A00.setOnCancelListener(new DialogInterfaceOnCancelListenerC55247OfL(10, fragmentActivity, gif));
            C0fJ.A00(gif.A00);
            C1GJ.A00(fragmentActivity, AbstractC018607g.A00(fragmentActivity), A0S);
        }
    }
}
