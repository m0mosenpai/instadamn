package X;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WUn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70410WUn implements C1V7 {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    @Override // X.C1V7
    public final /* bridge */ /* synthetic */ Object get() {
        this.A00.getMemoryClass();
        return new Object();
    }

    public C70410WUn(ActivityManager activityManager) {
        this.A00 = activityManager;
    }
}
