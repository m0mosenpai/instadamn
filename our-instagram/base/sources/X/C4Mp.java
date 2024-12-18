package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.4Mp, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Mp {
    public static C4Mp A01;
    public final SharedPreferences A00;

    public C4Mp(Context context) {
        this.A00 = context.getSharedPreferences("msys-preferences", 0);
    }
}
