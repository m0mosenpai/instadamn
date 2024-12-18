package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3yK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89183yK {
    public static final long A04 = TimeUnit.DAYS.toMillis(7);
    public final SharedPreferences A00;
    public final C89173yJ A01;
    public final Map A02 = new HashMap();
    public final Executor A03;

    public C89183yK(SharedPreferences sharedPreferences, C89173yJ c89173yJ, Executor executor) {
        this.A03 = executor;
        this.A00 = sharedPreferences;
        this.A01 = c89173yJ;
    }
}
