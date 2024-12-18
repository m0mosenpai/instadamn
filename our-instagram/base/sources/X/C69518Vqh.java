package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.Vqh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69518Vqh {
    public final /* synthetic */ Context A00;

    public final void A00(String str, String str2) {
        C14360o3.A0B(str2, 1);
        SharedPreferences sharedPreferences = this.A00.getSharedPreferences("act_dns_cache", 0);
        C14360o3.A07(sharedPreferences);
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public C69518Vqh(Context context) {
        this.A00 = context;
    }
}
