package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.RrL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61649RrL {
    public static final void A00(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof InterruptedException)) {
                    if (!(th instanceof LinkageError)) {
                        if (!(th instanceof CancellationException)) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                    throw th;
                }
                throw th;
            }
            throw th;
        }
        throw th;
    }
}
