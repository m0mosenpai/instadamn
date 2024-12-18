package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.134, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass134 {
    public static final AnonymousClass136 A00;
    public static volatile Choreographer choreographer;

    static {
        Object c09540e5;
        try {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            C14360o3.A0C(invoke, "null cannot be cast to non-null type android.os.Handler");
            c09540e5 = new AnonymousClass135((Handler) invoke, null, false);
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        A00 = (AnonymousClass136) (c09540e5 instanceof C09540e5 ? null : c09540e5);
    }

    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        Choreographer choreographer2 = choreographer;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        if (choreographer2 != null) {
            c24891Jo.A0I();
            choreographer2.postFrameCallback(new ChoreographerFrameCallbackC28590CjV(c24891Jo));
        } else {
            c24891Jo.A0I();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Choreographer choreographer3 = choreographer;
                if (choreographer3 == null) {
                    choreographer3 = Choreographer.getInstance();
                    C14360o3.A0A(choreographer3);
                    choreographer = choreographer3;
                }
                choreographer3.postFrameCallback(new ChoreographerFrameCallbackC28590CjV(c24891Jo));
            } else {
                C12T c12t = C12P.A00;
                AnonymousClass131.A00.A05(new D1Q(c24891Jo), c24891Jo.A01);
            }
        }
        return c24891Jo.A0E();
    }
}
