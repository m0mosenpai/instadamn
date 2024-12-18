package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0NN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NN {
    public static C0NN A01;
    public final SharedPreferences A00;

    public static C0NN A00(Context context) {
        C0NN c0nn;
        if (A01 == null) {
            synchronized (C0NN.class) {
                if (A01 == null) {
                    if (context instanceof Application) {
                        c0nn = new C0NN((Application) context);
                    } else {
                        c0nn = new C0NN((Application) context.getApplicationContext());
                    }
                    A01 = c0nn;
                }
            }
        }
        return A01;
    }

    public final String A01(String str, String str2) {
        try {
            return this.A00.getString(str, str2);
        } catch (Exception e) {
            C0K8.A0C("lacrima", "Failed to read from SharedPreferences");
            C0PC.A00().DEh("PrefSimpleStore", e, null);
            return str2;
        }
    }

    public final void A02(String str, String str2) {
        this.A00.edit().putString(str, str2).apply();
    }

    public C0NN(Application application) {
        this.A00 = application.getSharedPreferences("lacrima", 0);
    }
}
