package com.facebook.endtoend;

import X.AbstractC02650Ap;
import X.AnonymousClass001;
import X.C0B4;
import android.util.Log;
import com.facebook.react.modules.intent.IntentModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class EndToEnd {
    public static boolean A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static volatile JSONObject A06 = new JSONObject();
    public static volatile boolean A07;
    public static volatile boolean A08;
    public static volatile Map A09;

    public static String A00(String str, boolean z, boolean z2) {
        if (!z2 && !isRunningEndToEndTest()) {
            return null;
        }
        String property = System.getProperty(str);
        if (property == null || property.equals("")) {
            String property2 = System.getProperty(AnonymousClass001.A0R("fb.e2e.", str));
            if (property2 != null && !property2.equals("")) {
                return property2;
            }
            if (z) {
                try {
                    property = AbstractC02650Ap.A03(str);
                    if (property.equals("")) {
                        String A032 = AbstractC02650Ap.A03(AnonymousClass001.A0R("fb.e2e.", str));
                        if (!A032.equals("")) {
                            return A032;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }
        return property;
    }

    static {
        try {
            C0B4.A00();
        } catch (IllegalStateException unused) {
        }
    }

    public static Map A01() {
        JSONObject jSONObject;
        if (A09 == null) {
            A09 = new HashMap();
            try {
                String A002 = A00("sharedprefs", false, false);
                if (A002 != null && A002.length() > 0) {
                    jSONObject = new JSONObject(A002);
                } else if (A06.has("sharedprefs")) {
                    jSONObject = A06.getJSONObject("sharedprefs");
                } else {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A09.put(next, jSONObject.getJSONObject(next));
                }
                if (!A09.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Use E2E shared preferences overrides: ");
                    sb.append(A09);
                    Log.w("EndToEnd-Test", sb.toString());
                }
            } catch (JSONException e) {
                throw new RuntimeException("Malformed json for shared preferences", e);
            }
        }
        return A09;
    }

    public static synchronized boolean A03() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A02) {
                boolean A062 = A06("fb.running_e2e_locally");
                A03 = A062;
                if (A062) {
                    Log.w("EndToEnd-Test", "Is running E2E test locally");
                }
                A02 = true;
            }
            z = A03;
        }
        return z;
    }

    public static synchronized boolean A04() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A00) {
                boolean equals = "true".equals(AbstractC02650Ap.A03("fb.running_mobilelab"));
                A04 = equals;
                if (equals) {
                    Log.w("Mobilelab", "Is running Mobilelab test");
                }
                A00 = true;
            }
            z = A04;
        }
        return z;
    }

    public static synchronized boolean A05() {
        boolean z;
        synchronized (EndToEnd.class) {
            if (!A01) {
                boolean equals = "true".equals(AbstractC02650Ap.A03("fb.running_sapienz"));
                A05 = equals;
                if (equals) {
                    Log.w("Sapienz", "Is running Sapienz test");
                }
                A01 = true;
            }
            z = A05;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (A06("persist.fb.running_e2e") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isRunningEndToEndTest() {
        /*
            boolean r0 = com.facebook.endtoend.EndToEnd.A07
            if (r0 != 0) goto L28
            java.lang.String r0 = "fb.running_e2e"
            boolean r0 = A06(r0)
            r2 = 1
            if (r0 != 0) goto L18
            java.lang.String r0 = "persist.fb.running_e2e"
            boolean r1 = A06(r0)
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            com.facebook.endtoend.EndToEnd.A08 = r0
            boolean r0 = com.facebook.endtoend.EndToEnd.A08
            if (r0 == 0) goto L26
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            android.util.Log.w(r1, r0)
        L26:
            com.facebook.endtoend.EndToEnd.A07 = r2
        L28:
            boolean r0 = com.facebook.endtoend.EndToEnd.A08
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.endtoend.EndToEnd.isRunningEndToEndTest():boolean");
    }

    public static boolean A02() {
        JSONObject jSONObject;
        if (isRunningEndToEndTest()) {
            Map A012 = A01();
            if (A012 != null) {
                jSONObject = (JSONObject) A012.get("/settings/http/transparent_http_proxy");
            } else {
                jSONObject = null;
            }
            String str = "";
            if (jSONObject != null) {
                str = jSONObject.optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "");
            }
            if (!str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(String str) {
        if (!"true".equals(AbstractC02650Ap.A03(str)) && !"true".equals(System.getProperty(str))) {
            return false;
        }
        return true;
    }
}
