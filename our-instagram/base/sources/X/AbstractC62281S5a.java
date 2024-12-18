package X;

/* renamed from: X.S5a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62281S5a {
    public static void A00(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }
}
