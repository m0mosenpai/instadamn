package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.05D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05D implements C0LR {
    public Context A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0H;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        ActivityManager activityManager = (ActivityManager) this.A00.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            c024209q.A02(C0LK.A2B, Long.valueOf(memoryInfo.threshold));
            c024209q.A02(C0LK.A1J, Long.valueOf(memoryInfo.availMem));
            c024209q.A02(C0LK.A3N, Long.valueOf(memoryInfo.totalMem));
            c024209q.A00(C0LK.A0O, memoryInfo.lowMemory);
        }
    }
}
