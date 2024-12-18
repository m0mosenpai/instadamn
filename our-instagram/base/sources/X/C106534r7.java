package X;

import android.app.ActivityThread;

/* renamed from: X.4r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106534r7 implements InterfaceC106514r5 {
    @Override // X.InterfaceC106514r5
    public final String getName() {
        return "ActivityThreadWatchdog";
    }

    @Override // X.InterfaceC106514r5
    public final void Cpp() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            synchronized (currentActivityThread) {
            }
        }
    }
}
