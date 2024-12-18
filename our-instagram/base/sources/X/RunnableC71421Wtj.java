package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wtj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71421Wtj implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C89183yK A01;

    public RunnableC71421Wtj(C89183yK c89183yK, long j) {
        this.A01 = c89183yK;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis() - this.A00;
        C89183yK c89183yK = this.A01;
        SharedPreferences sharedPreferences = c89183yK.A00;
        Iterator A15 = AbstractC166997dE.A15(sharedPreferences.getAll());
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            String str = (String) entry.getKey();
            if (str.startsWith("__data__/")) {
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    sharedPreferences.edit().remove(str).apply();
                    c89183yK.A02.remove(str);
                } else {
                    try {
                        C70113W4l A00 = C70113W4l.A00(new JSONObject(str2));
                        if (currentTimeMillis > A00.A0C) {
                            c89183yK.A01.A01(A00);
                            sharedPreferences.edit().remove(str).apply();
                            c89183yK.A02.remove(str);
                        }
                    } catch (JSONException unused) {
                        sharedPreferences.edit().remove(str).apply();
                        c89183yK.A02.remove(str);
                    }
                }
            }
        }
    }
}
