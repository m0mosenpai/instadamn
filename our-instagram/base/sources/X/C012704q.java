package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.04q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012704q implements C0LR {
    public Context A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0L;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        ActivityManager activityManager = (ActivityManager) this.A00.getSystemService("activity");
        if (activityManager != null) {
            c024209q.A01(C0LK.A2E, activityManager.getMemoryClass());
            c024209q.A01(C0LK.A1r, activityManager.getLargeMemoryClass());
        }
    }
}
