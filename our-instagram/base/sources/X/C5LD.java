package X;

import android.os.Looper;

/* renamed from: X.5LD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LD implements C1GL {
    public static final C5LD A00 = new Object();

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            if (AbstractC15930qn.A02.A0R && !(!C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper()))) {
                throw new IllegalStateException(AnonymousClass001.A0R("ImmediateScheduler.schedule() called on main thread: task=", c11r.getName()));
            }
            c11r.onStart();
            c11r.run();
            c11r.onFinish();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
