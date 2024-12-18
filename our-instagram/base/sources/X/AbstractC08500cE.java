package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0cE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08500cE {
    public static final String A00 = AnonymousClass001.A0O("Null metadata in caller identity, API=", Build.VERSION.SDK_INT);

    public static void A02(Context context, Intent intent, String str) {
        String str2;
        try {
            intent.setExtrasClassLoader(context.getClassLoader());
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.setClassLoader(context.getClassLoader());
            try {
                str2 = AbstractC08120bY.A02(context, context.getPackageName(), 0).A03;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                str2 = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            String str3 = null;
            try {
                jSONObject.put("t", Long.toString(currentTimeMillis));
                jSONObject.put("r", Long.toString(elapsedRealtime));
                if (str != null) {
                    jSONObject.put("d", str);
                }
                if (str2 != null) {
                    jSONObject.put("v", str2);
                }
                str3 = Base64.encodeToString(jSONObject.toString().getBytes(ReactWebViewManager.HTML_ENCODING), 11);
            } catch (UnsupportedEncodingException | JSONException unused2) {
            }
            C08150bd c08150bd = new C08150bd();
            c08150bd.A0A = str3;
            c08150bd.A03 = new ComponentName(context, "com.facebook.invalid_class.f4c3b00c");
            PendingIntent A01 = c08150bd.A01(context, 0, 1140850688);
            if (A01 != null) {
                extras.putParcelable("_ci_", A01);
                intent.putExtras(extras);
                return;
            }
            throw new Exception("Failed to generate CallerInfo metadata.");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void A03(InterfaceC08100bW interfaceC08100bW, String str, Throwable th) {
        if (interfaceC08100bW != null) {
            interfaceC08100bW.EHA("CallerInfoHelper", str, th);
        }
    }

    public static C0LG A00(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW, int i) {
        long j;
        String str;
        if (intent == null) {
            str = "Null launching intent.";
        } else {
            String str2 = null;
            String str3 = null;
            if (!intent.hasExtra("_ci_")) {
                str = "Missing caller identity intent extra.";
            } else {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
                if (pendingIntent == null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.get("_ci_") == null) {
                        str = "Null caller identity intent extra.";
                    } else {
                        str = "Caller identity extra is not a PendingIntent.";
                    }
                } else {
                    String creatorPackage = pendingIntent.getCreatorPackage();
                    int creatorUid = pendingIntent.getCreatorUid();
                    if (creatorPackage == null) {
                        return null;
                    }
                    try {
                        C0B5 A01 = AbstractC08450c9.A01(context, creatorPackage);
                        try {
                            String str4 = (String) PendingIntent.class.getMethod("getTag", String.class).invoke(pendingIntent, "");
                            if (str4 != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(str4, 11), ReactWebViewManager.HTML_ENCODING));
                                    if (jSONObject.has("d")) {
                                        str3 = jSONObject.getString("d");
                                    }
                                    if (jSONObject.has("v")) {
                                        str2 = jSONObject.getString("v");
                                    }
                                    long j2 = -1;
                                    if (jSONObject.has("t")) {
                                        j = Long.parseLong(jSONObject.getString("t"));
                                    } else {
                                        j = -1;
                                    }
                                    if (jSONObject.has("r")) {
                                        j2 = Long.parseLong(jSONObject.getString("r"));
                                    }
                                    long j3 = i;
                                    if (System.currentTimeMillis() - j >= j3 && SystemClock.elapsedRealtime() - j2 >= j3) {
                                        A03(interfaceC08100bW, "Caller identity has expired.", null);
                                        return null;
                                    }
                                    return new C0LG(str2, str3, Collections.singletonList(creatorPackage), Collections.singletonList(A01), creatorUid);
                                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                                    A03(interfaceC08100bW, "Error parsing metadata from caller identity.", e);
                                    return null;
                                }
                            }
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            A03(interfaceC08100bW, "Error extracting metadata from caller identity.", e2);
                        }
                        A03(interfaceC08100bW, A00, null);
                        return null;
                    } catch (SecurityException e3) {
                        A03(interfaceC08100bW, "Failed to get signature.", e3);
                        return null;
                    }
                }
            }
        }
        A03(interfaceC08100bW, str, null);
        return null;
    }

    public static void A01(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW, String str) {
        try {
            A02(context, intent, str);
        } catch (C08660cU e) {
            interfaceC08100bW.EHA("CallerInfoHelper", "Error attaching caller info to Intent.", e);
        }
    }
}
