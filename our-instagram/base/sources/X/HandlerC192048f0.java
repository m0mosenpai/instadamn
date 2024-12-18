package X;

import android.os.Handler;

/* renamed from: X.8f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class HandlerC192048f0 extends Handler implements InterfaceC192058f1 {
    @Override // X.InterfaceC192058f1
    public final boolean CZZ() {
        if (Thread.currentThread() != super.getLooper().getThread()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC192058f1
    public final boolean E4t(Runnable runnable, String str) {
        return super.post(runnable);
    }
}
