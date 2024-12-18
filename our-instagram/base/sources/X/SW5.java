package X;

import android.content.SharedPreferences;

/* loaded from: classes10.dex */
public final class SW5 {
    public final long A00;
    public final /* synthetic */ C60688RMg A01;

    public SW5(C60688RMg c60688RMg, long j) {
        this.A01 = c60688RMg;
        C3U5.A04("monitoring");
        C3U5.A07(AbstractC167007dF.A1O((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        this.A00 = j;
    }

    public static final void A00(SW5 sw5) {
        C60688RMg c60688RMg = sw5.A01;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c60688RMg.A00.edit();
        edit.remove(String.valueOf("monitoring").concat(":count"));
        edit.remove(String.valueOf("monitoring").concat(":value"));
        edit.putLong(String.valueOf("monitoring").concat(":start"), currentTimeMillis);
        edit.commit();
    }
}
