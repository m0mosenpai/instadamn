package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sgn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63288Sgn {
    public static final C63288Sgn A00 = new Object();

    public final boolean A02(Intent intent) {
        Object parcelableExtra;
        C14360o3.A0B(intent, 0);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("_ci_", PendingIntent.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("_ci_");
        }
        PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
        if (pendingIntent == null) {
            return false;
        }
        String creatorPackage = pendingIntent.getCreatorPackage();
        return C14360o3.A0K(creatorPackage, "com.whatsapp") || C14360o3.A0K(creatorPackage, AbstractC111324zv.A00(374));
    }

    public static final String A00() {
        boolean z;
        long j = 0;
        String str = null;
        String string = AbstractC19750y3.A01("com.instagram.android.WHATSAPP_OTP").getString("otp_data", null);
        if (string != null) {
            try {
                JSONObject A17 = AbstractC58318PtA.A17(string);
                String string2 = A17.getString("otp");
                long j2 = A17.getLong("ct");
                C14360o3.A0A(string2);
                z = true;
                C14360o3.A0B(string2, 1);
                str = string2;
                j = j2;
            } catch (JSONException unused) {
                z = false;
            }
            if (!z || AbstractC37300Gc1.A00(j) >= 3600000) {
                return null;
            }
        }
        return str;
    }

    public static final void A01() {
        InterfaceC19610xo ARD = AbstractC19750y3.A01("com.instagram.android.WHATSAPP_OTP").ARD();
        ARD.EEj("otp_data");
        ARD.apply();
    }
}
