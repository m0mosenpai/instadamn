package com.facebook.msys.mci;

import X.AbstractC09780fb;
import X.AnonymousClass001;
import X.C1EJ;
import X.C4Mh;
import X.C4Ml;
import X.C53882dS;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthDataStorage {
    public static volatile boolean sInitialized;
    public static volatile C4Ml sObjectSerializer;
    public static volatile SharedPreferences sSharedPreferences;

    public static native void nativeInitialize();

    public static Object getFromRawKey(String str) {
        if (sInitialized) {
            String string = sSharedPreferences.getString(str, null);
            try {
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        if (!string2.equals("null")) {
                            if (string2.equals("double")) {
                                String string3 = jSONObject.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                try {
                                    return Double.valueOf(Double.parseDouble(string3));
                                } catch (NumberFormatException unused) {
                                    throw new JSONException(AnonymousClass001.A0R("Could not parse double ", string3));
                                }
                            }
                            if (string2.equals("float")) {
                                String string4 = jSONObject.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                try {
                                    return Float.valueOf(Float.parseFloat(string4));
                                } catch (NumberFormatException unused2) {
                                    throw new JSONException(AnonymousClass001.A0R("Could not parse float ", string4));
                                }
                            }
                            if (string2.equals("int")) {
                                String string5 = jSONObject.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                try {
                                    return Integer.valueOf(Integer.parseInt(string5));
                                } catch (NumberFormatException unused3) {
                                    throw new JSONException(AnonymousClass001.A0R("Could not parse int ", string5));
                                }
                            }
                            if (string2.equals("long")) {
                                String string6 = jSONObject.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                try {
                                    return Long.valueOf(Long.parseLong(string6));
                                } catch (NumberFormatException unused4) {
                                    throw new JSONException(AnonymousClass001.A0R("Could not parse long ", string6));
                                }
                            }
                            if (string2.equals(IgNetworkingModule.REQUEST_BODY_KEY_STRING)) {
                                return jSONObject.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            }
                            throw new JSONException(AnonymousClass001.A0R("Unsupported type of object: ", string2));
                        }
                    } catch (JSONException e) {
                        throw new Exception(e);
                    }
                }
                return null;
            } catch (C4Mh e2) {
                android.util.Log.e("AuthDataStorage", AnonymousClass001.A0R("Error deserializing object for key ", str), e2);
                return null;
            }
        }
        throw new RuntimeException("Settings have not been initialized yet. Call initialize() first");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4Ml, java.lang.Object] */
    public static synchronized boolean initialize(Context context) {
        boolean z;
        int i;
        synchronized (AuthDataStorage.class) {
            AbstractC09780fb.A01("AuthDataStorage.initialize", 1546370689);
            try {
                z = false;
                if (sInitialized) {
                    i = -76257947;
                } else {
                    sSharedPreferences = context.getSharedPreferences("msys-auth-data", 0);
                    sObjectSerializer = new Object();
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = -1710046115;
                }
                AbstractC09780fb.A00(i);
            } catch (Throwable th) {
                AbstractC09780fb.A00(-1016893822);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForAuthDataStorage() {
        synchronized (C1EJ.class) {
        }
        return false;
    }

    public static void resetFromFacebookUserId(String str) {
        if (sInitialized) {
            Map<String, ?> all = sSharedPreferences.getAll();
            SharedPreferences.Editor edit = sSharedPreferences.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (entry.getKey().startsWith(str)) {
                    edit.remove(entry.getKey());
                }
            }
            edit.commit();
            return;
        }
        throw new RuntimeException("Settings have not been initialized yet. Call initialize() first");
    }

    public static void setWithRawKey(String str, Object obj) {
        if (sInitialized) {
            try {
                SharedPreferences.Editor edit = sSharedPreferences.edit();
                JSONObject jSONObject = new JSONObject();
                try {
                    if (obj == null) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "null");
                    } else if (obj instanceof Double) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "double");
                        jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, obj.toString());
                    } else if (obj instanceof Float) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "float");
                        jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, obj.toString());
                    } else if (obj instanceof Integer) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "int");
                        jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, obj.toString());
                    } else if (obj instanceof Long) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "long");
                        jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, obj.toString());
                    } else if (obj instanceof String) {
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, IgNetworkingModule.REQUEST_BODY_KEY_STRING);
                        jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, obj.toString());
                    } else {
                        throw new Exception(AnonymousClass001.A0R("Unsupported type of object: ", obj.getClass().getName()));
                    }
                    edit.putString(str, jSONObject.toString()).commit();
                    return;
                } catch (JSONException e) {
                    throw new Exception(e);
                }
            } catch (C4Mh e2) {
                android.util.Log.e("AuthDataStorage", AnonymousClass001.A0R("Error serializing object for key ", str), e2);
                return;
            }
        }
        throw new RuntimeException("Settings have not been initialized yet. Call initialize() first");
    }

    static {
        C53882dS.A00();
    }
}
