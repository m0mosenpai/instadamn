package X;

import android.app.ActivityManager;

/* renamed from: X.05P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05P implements C0LR {
    public InterfaceC08830cm A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0s;
    }

    @Override // X.C0LR
    public final boolean CKv(Integer num) {
        if (num != C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ((RunnableC05150Ph) this.A00.get()).A01(runningAppProcessInfo);
        c024209q.A01(C0LK.A29, runningAppProcessInfo.importance);
        c024209q.A01(C0LK.A2A, runningAppProcessInfo.lastTrimLevel);
    }
}
