package X;

import android.content.Context;

/* renamed from: X.02l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC007102l {
    public static final void A00(Context context, String str) {
        if (str != null && !str.equals(context.getSharedPreferences("acra_criticaldata_store", 0).getString("USER_ID", ""))) {
            context.getSharedPreferences("acra_criticaldata_store", 0).edit().putString("CLIENT_USER_ID", str).commit();
        }
        AbstractC41291ve.A03.set(str);
    }
}
