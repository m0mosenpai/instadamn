package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.11V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11V implements InterfaceC65626Tpm {
    public static final C11V A00 = new Object();
    public static final AtomicReference A01 = new AtomicReference(null);
    public static final AtomicBoolean A02 = new AtomicBoolean(false);

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public final void A00() {
        AtomicBoolean atomicBoolean = A02;
        if (!atomicBoolean.get()) {
            synchronized (this) {
                if (!atomicBoolean.get()) {
                    C65705Tsd.A08.A05.A09(A00);
                    atomicBoolean.set(true);
                }
            }
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        try {
            C12Y c12y = (C12Y) A01.get();
            if (c12y != null && c12y.A05) {
                C0K8.A01(4, "IgScreenTimeSyncListener", "App backgrounded");
                C12Y.A02(c12y, false, true);
                C12Y.A01(c12y, "BACKGROUND");
            }
        } catch (Exception e) {
            C0K8.A0F("ScreenTimeProcessLifecycleObserver", "onPause", e);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        try {
            C12Y c12y = (C12Y) A01.get();
            if (c12y != null && c12y.A05) {
                C0K8.A01(4, "IgScreenTimeSyncListener", "App forgrounded");
                C12Y.A02(c12y, true, true);
                C12Y.A01(c12y, "FOREGROUND");
                C12Y.A00(c12y);
            }
        } catch (Exception e) {
            C0K8.A0F("ScreenTimeProcessLifecycleObserver", "onResume", e);
        }
    }
}
