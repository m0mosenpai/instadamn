package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes10.dex */
public final class PxU {
    public final SharedPreferences.Editor A00;
    public final String A01;

    public PxU(Context context, String str) {
        this.A01 = str;
        this.A00 = AbstractC58318PtA.A0F(context.getApplicationContext(), "hpke_key_storage").edit();
    }
}
