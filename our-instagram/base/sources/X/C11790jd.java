package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.UUID;

/* renamed from: X.0jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11790jd {
    public static C11790jd A03;
    public static final C11770jb A04 = new Object();
    public C19U A00;
    public final SharedPreferences A01;
    public final Context A02;

    private final synchronized void A00(final AbstractC12990ll abstractC12990ll) {
        SharedPreferences sharedPreferences = this.A01;
        String string = sharedPreferences.getString("analytics_device_id", null);
        long j = sharedPreferences.getLong("analytic_device_timestamp", Long.MAX_VALUE);
        String string2 = sharedPreferences.getString("origin", null);
        if (string == null || j == Long.MAX_VALUE) {
            if (sharedPreferences.getBoolean("phone_id_synced", false)) {
                string = UUID.randomUUID().toString();
                j = System.currentTimeMillis();
                string2 = AbstractC63103Sd6.A00(this.A02.getPackageName());
                sharedPreferences.edit().putString("analytics_device_id", string).putBoolean("analytics_device_id_external", false).putString("origin", string2).putLong("analytic_device_timestamp", j).apply();
                if (abstractC12990ll != null) {
                    "phoneid_update".getClass();
                    final C19280xC A01 = C19280xC.A01("phoneid_update", null);
                    A01.A0C("custom_uuid", C16030qx.A02.A04(AbstractC12290kX.A00));
                    A01.A0C("new_id", string);
                    A01.A0B("new_ts", Long.valueOf(j));
                    A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "initial_create");
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.0jc
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC11060iN.A00(abstractC12990ll).EHW(A01);
                        }
                    });
                }
            }
        }
        this.A00 = new C19U(string, j, string2);
    }

    public final synchronized C19U A01(AbstractC12990ll abstractC12990ll) {
        if (this.A00 == null) {
            A00(abstractC12990ll);
        }
        return this.A00;
    }

    public final synchronized void A02(C19U c19u) {
        this.A00 = c19u;
        this.A01.edit().putString("analytics_device_id", c19u.A01).putBoolean("analytics_device_id_external", true).putLong("analytic_device_timestamp", c19u.A00).putString("origin", c19u.A02).apply();
    }

    public C11790jd(Context context) {
        this.A02 = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("analyticsprefs", 0);
        C14360o3.A07(sharedPreferences);
        this.A01 = sharedPreferences;
    }
}
