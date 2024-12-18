package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.69j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1351069j extends AtomicReference implements InterfaceC41801wU {
    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C1350969i c1350969i;
        if (get() != null && (c1350969i = (C1350969i) getAndSet(null)) != null) {
            try {
                c1350969i.A00.cancel();
            } catch (Exception e) {
                AbstractC62281S5a.A00(e);
                AbstractC142886co.A02(e);
            }
        }
    }
}
