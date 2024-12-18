package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.PvV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58447PvV {
    public static boolean A01(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.e"));
    }

    public static void A00(Intent intent, String str) {
        String str2;
        Bundle A0b = AbstractC166987dD.A0b();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A0b.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A0b.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A0b.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A0b.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A0b.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A0b.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A0b.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(C58446PvU.A02(extras, "gcm.n.e")) || C58446PvU.A02(extras, "gcm.n.icon") != null) {
                    str2 = "display";
                    A0b.putString("_nmc", str2);
                }
            }
            str2 = "data";
            A0b.putString("_nmc", str2);
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(A0b);
            String.valueOf(str);
            String.valueOf(valueOf);
        }
        C63342Shx A00 = C63342Shx.A00();
        C63342Shx.A01(A00);
        A00.A02.A03(InterfaceC65282ThF.class);
        android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}
