package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: X.Vsf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69638Vsf {
    public long A00 = 0;
    public SharedPreferences A01 = null;
    public X72 A02;
    public X73 A03;
    public X74 A04;
    public PreferenceScreen A05;
    public String A06;
    public final Context A07;

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            SharedPreferences sharedPreferences2 = this.A07.getSharedPreferences(this.A06, 0);
            this.A01 = sharedPreferences2;
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    public C69638Vsf(Context context) {
        this.A07 = context;
        this.A06 = AnonymousClass001.A0R(context.getPackageName(), "_preferences");
    }
}
