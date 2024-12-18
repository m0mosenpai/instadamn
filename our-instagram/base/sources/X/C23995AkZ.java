package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.AkZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23995AkZ implements C5OV {
    public final Context A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        C14360o3.A07(sharedPreferences);
        if (sharedPreferences.getInt("APPIRATER_USE_COUNT", 0) > 1) {
            return true;
        }
        return false;
    }

    public C23995AkZ(Context context) {
        this.A00 = context;
    }
}
