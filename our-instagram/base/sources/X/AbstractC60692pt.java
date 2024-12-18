package X;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Deque;

/* renamed from: X.2pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60692pt implements Closeable {
    public static final InterfaceC60722pw A00;

    public static void A00(InterfaceC60722pw interfaceC60722pw, Throwable th, Deque deque) {
        Throwable th2 = th;
        while (!deque.isEmpty()) {
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    interfaceC60722pw.EpV(closeable, th2, th3);
                }
            }
        }
        if (th != null || th2 == null) {
            return;
        }
        Object obj = AbstractC63327Shb.A00;
        if (IOException.class.isInstance(th2)) {
            throw ((Throwable) IOException.class.cast(th2));
        }
        if (th2 instanceof RuntimeException) {
            throw th2;
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw th2;
    }

    static {
        InterfaceC60722pw interfaceC60722pw;
        try {
            final Method method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            interfaceC60722pw = new InterfaceC60722pw(method) { // from class: X.2pv
                public final Method A00;

                @Override // X.InterfaceC60722pw
                public final void EpV(Closeable closeable, Throwable thrown, Throwable suppressed) {
                    if (thrown != suppressed) {
                        try {
                            this.A00.invoke(thrown, suppressed);
                        } catch (Throwable unused) {
                            T8D.A00.EpV(closeable, thrown, suppressed);
                        }
                    }
                }

                {
                    this.A00 = method;
                }
            };
        } catch (Throwable unused) {
            interfaceC60722pw = T8D.A00;
        }
        A00 = interfaceC60722pw;
    }
}
