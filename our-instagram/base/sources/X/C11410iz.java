package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11410iz {
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C0Q6.A00);
    public final SharedPreferences A00;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        this.A00.edit().putString("logging_host", str).apply();
    }

    public final String A00() {
        String string = this.A00.getString("ffdb_token", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public C11410iz(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("analyticsprefs", 0);
        C14360o3.A07(sharedPreferences);
        this.A00 = sharedPreferences;
    }
}
