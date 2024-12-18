package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58632mM {
    public static final C58632mM A00 = new Object();

    public static final C6VI A00(C3LX c3lx, String str) {
        C6VO c6vo;
        Context context = AbstractC12290kX.A00;
        synchronized (C55649Ona.class) {
            if (C55649Ona.A02 == null) {
                C55649Ona.A02 = new C55649Ona(context.getApplicationContext());
            }
            c6vo = C55649Ona.A02;
        }
        return new C6VI(new C51508Mou(AbstractC12290kX.A00, c3lx, InterfaceC58742mX.A00, c6vo, str));
    }

    public final C6VI A01(C3LX c3lx, InterfaceC58742mX interfaceC58742mX, InterfaceC50418MNu interfaceC50418MNu) {
        C6VI c6vi = new C6VI(new C6VF(AbstractC12290kX.A00, c3lx, interfaceC58742mX));
        if (interfaceC50418MNu != null) {
            c6vi.A00 = interfaceC50418MNu;
        }
        return c6vi;
    }

    public final File A02(C3LX c3lx, InterfaceC50418MNu interfaceC50418MNu, AtomicReference atomicReference) {
        InterfaceC58742mX interfaceC58742mX = InterfaceC58742mX.A00;
        C6VI c6vi = (C6VI) atomicReference.get();
        if (c6vi == null) {
            c6vi = A01(c3lx, interfaceC58742mX, interfaceC50418MNu);
            if (!C1EM.A00(null, c6vi, atomicReference)) {
                c6vi = (C6VI) atomicReference.get();
            }
        }
        return (File) c6vi.A00();
    }
}
