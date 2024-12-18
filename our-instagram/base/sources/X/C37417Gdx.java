package X;

import android.app.Activity;
import android.content.Context;
import android.util.LruCache;

/* renamed from: X.Gdx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37417Gdx implements BCY {
    public final /* synthetic */ C37414Gdu A00;
    public final /* synthetic */ String A01;

    public C37417Gdx(C37414Gdu c37414Gdu, String str) {
        this.A00 = c37414Gdu;
        this.A01 = str;
    }

    @Override // X.BCY
    public final void DaE(Throwable th) {
        LruCache lruCache;
        C37414Gdu c37414Gdu = this.A00;
        c37414Gdu.A03.DqZ(c37414Gdu.A01);
        Context context = c37414Gdu.A02;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((activity.isFinishing() || activity.isDestroyed()) && (lruCache = ((AbstractC43664JSw) c37414Gdu.A00(this.A01).A04).A00) != null) {
                lruCache.evictAll();
            }
        }
    }

    @Override // X.BCY
    public final void DaF() {
        LruCache lruCache;
        C37414Gdu c37414Gdu = this.A00;
        c37414Gdu.A03.DqZ(c37414Gdu.A01);
        Context context = c37414Gdu.A02;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((activity.isFinishing() || activity.isDestroyed()) && (lruCache = ((AbstractC43664JSw) c37414Gdu.A00(this.A01).A04).A00) != null) {
                lruCache.evictAll();
            }
        }
    }
}
