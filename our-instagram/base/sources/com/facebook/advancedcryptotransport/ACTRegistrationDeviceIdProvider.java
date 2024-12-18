package com.facebook.advancedcryptotransport;

import X.C1334660q;
import X.C1UM;
import X.C1ZT;
import android.content.Context;

/* loaded from: classes3.dex */
public class ACTRegistrationDeviceIdProvider {
    public static volatile C1UM sSharedPrefs;

    public static synchronized void initialize(Context context) {
        synchronized (ACTRegistrationDeviceIdProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = C1334660q.A00(context);
            }
        }
    }

    public static String readRegisteredDeviceId(String str) {
        if (sSharedPrefs == null) {
            return null;
        }
        return sSharedPrefs.getString(str, null);
    }

    public static void removeRegisteredDeviceId(String str) {
        if (sSharedPrefs.contains(str)) {
            C1ZT AR9 = sSharedPrefs.AR9();
            AR9.A06(str);
            AR9.A03();
        }
    }

    public static void saveRegisteredDeviceId(String str, String str2) {
        C1ZT AR9 = sSharedPrefs.AR9();
        AR9.A09(str, str2);
        AR9.A03();
    }
}
