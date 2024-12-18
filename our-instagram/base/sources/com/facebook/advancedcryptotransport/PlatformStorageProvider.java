package com.facebook.advancedcryptotransport;

import X.C0K8;
import X.C1334660q;
import X.C1UM;
import X.C1UP;
import X.C1ZT;
import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public class PlatformStorageProvider {
    public static volatile C1UM sSharedPrefs;

    public static synchronized void initialize(Context context) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = C1334660q.A00(context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1UM] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static synchronized Object platformStorageGetValue(String str) {
        synchronized (PlatformStorageProvider.class) {
            ?? r4 = 0;
            r4 = 0;
            if (sSharedPrefs != null && sSharedPrefs.contains(str)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    r4 = Integer.valueOf(sSharedPrefs.getInt(str, 0));
                                } catch (RuntimeException unused) {
                                    double d = 0.0d;
                                    C1UP c1up = (C1UP) sSharedPrefs;
                                    C1UP.A03(c1up);
                                    synchronized (c1up.A03) {
                                        try {
                                            Double d2 = (Double) c1up.A05.get(str);
                                            if (d2 != null) {
                                                d = d2.doubleValue();
                                            }
                                            r4 = Double.valueOf(d);
                                        } catch (ClassCastException e) {
                                            throw C1UP.A00(c1up, e, str);
                                        }
                                    }
                                }
                            } catch (RuntimeException unused2) {
                            }
                        } catch (RuntimeException unused3) {
                            r4 = sSharedPrefs.getString(str, r4);
                        }
                    } catch (RuntimeException unused4) {
                        r4 = Long.valueOf(sSharedPrefs.getLong(str, 0L));
                    }
                } catch (RuntimeException unused5) {
                    r4 = Boolean.valueOf(sSharedPrefs.getBoolean(str, false));
                }
                return r4;
            }
            if (sSharedPrefs == null) {
                C0K8.A0Q("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageGetValue is called. key=%s", str);
            }
            return null;
        }
    }

    public static synchronized void platformStorageRemoveValue(String str) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs != null && sSharedPrefs.contains(str)) {
                C1ZT AR9 = sSharedPrefs.AR9();
                AR9.A06(str);
                AR9.A03();
            } else if (sSharedPrefs == null) {
                C0K8.A0Q("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageRemoveValue is called. key=%s", str);
            }
        }
    }

    public static synchronized void platformStorageSaveValue(String str, Object obj) {
        C1ZT AR9;
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                C0K8.A0Q("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageSaveValue is called, key=%s", str);
            } else {
                if (obj instanceof Integer) {
                    AR9 = sSharedPrefs.AR9();
                    AR9.A07(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    AR9 = sSharedPrefs.AR9();
                    AR9.A0A(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    AR9 = sSharedPrefs.AR9();
                    C1ZT.A01(AR9);
                    Map map = AR9.A00;
                    str.getClass();
                    map.put(str, (Double) obj);
                } else if (obj instanceof Long) {
                    AR9 = sSharedPrefs.AR9();
                    AR9.A08(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    AR9 = sSharedPrefs.AR9();
                    AR9.A09(str, (String) obj);
                }
                AR9.A03();
            }
        }
    }
}
