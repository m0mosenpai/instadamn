package X;

import android.content.Context;

/* renamed from: X.S0z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62178S0z {
    public static boolean A00(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC58319PtB.A0V(context.getApplicationContext(), C74103Uo.A00, "oxygen_fbns_config").getBoolean("fbns_secure_auth", false);
    }
}
