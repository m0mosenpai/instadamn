package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6KP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KP implements InterfaceC41801wU {
    public static final /* synthetic */ C6KP[] A00;
    public static final C6KP A01;

    public static boolean A02(InterfaceC41801wU interfaceC41801wU, InterfaceC41801wU interfaceC41801wU2) {
        Throwable illegalStateException;
        if (interfaceC41801wU2 == null) {
            illegalStateException = new NullPointerException("next is null");
        } else if (interfaceC41801wU != null) {
            interfaceC41801wU2.dispose();
            illegalStateException = new IllegalStateException("Disposable already set!");
        } else {
            return true;
        }
        AbstractC142886co.A02(illegalStateException);
        return false;
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
    }

    static {
        C6KP c6kp = new C6KP();
        A01 = c6kp;
        A00 = new C6KP[]{c6kp};
    }

    public static boolean A03(InterfaceC41801wU interfaceC41801wU, AtomicReference atomicReference) {
        AbstractC42141x4.A01(interfaceC41801wU, "d is null");
        if (!C1EM.A00(null, interfaceC41801wU, atomicReference)) {
            interfaceC41801wU.dispose();
            if (atomicReference.get() != A01) {
                AbstractC142886co.A02(new IllegalStateException("Disposable already set!"));
                return false;
            }
            return false;
        }
        return true;
    }

    public static C6KP valueOf(String str) {
        return (C6KP) Enum.valueOf(C6KP.class, str);
    }

    public static C6KP[] values() {
        return (C6KP[]) A00.clone();
    }

    public static void A00(InterfaceC41801wU interfaceC41801wU, AtomicReference atomicReference) {
        Object obj;
        do {
            obj = atomicReference.get();
            if (obj == A01) {
                if (interfaceC41801wU != null) {
                    interfaceC41801wU.dispose();
                    return;
                }
                return;
            }
        } while (!C1EM.A00(obj, interfaceC41801wU, atomicReference));
    }

    public static void A01(AtomicReference atomicReference) {
        InterfaceC41801wU interfaceC41801wU;
        Object obj = atomicReference.get();
        C6KP c6kp = A01;
        if (obj != c6kp && (interfaceC41801wU = (InterfaceC41801wU) atomicReference.getAndSet(c6kp)) != c6kp && interfaceC41801wU != null) {
            interfaceC41801wU.dispose();
        }
    }
}
