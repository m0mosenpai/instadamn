package X;

import com.google.common.io.Closeables;
import java.io.Closeable;
import java.util.logging.Level;

/* loaded from: classes10.dex */
public final class T8D implements InterfaceC60722pw {
    public static final T8D A00 = new Object();

    @Override // X.InterfaceC60722pw
    public final void EpV(Closeable closeable, Throwable thrown, Throwable suppressed) {
        Closeables.logger.log(Level.WARNING, AbstractC167017dG.A0n(closeable, "Suppressing exception thrown when closing ", AbstractC166987dD.A1C()), suppressed);
    }
}
