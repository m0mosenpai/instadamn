package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public abstract class Y4X {
    public static final Throwable A00 = new YKL();

    public static RuntimeException A00(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw th;
    }

    public static Throwable A01(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = A00;
        if (th != th2) {
            return (Throwable) atomicReference.getAndSet(th2);
        }
        return th;
    }

    public static boolean A02(Throwable th, AtomicReference atomicReference) {
        Object obj;
        Throwable c64866TXr;
        do {
            obj = atomicReference.get();
            if (obj == A00) {
                return false;
            }
            if (obj == null) {
                c64866TXr = th;
            } else {
                c64866TXr = new C64866TXr(Arrays.asList((Throwable) obj, th));
            }
        } while (!C1EM.A00(obj, c64866TXr, atomicReference));
        return true;
    }
}
