package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.86K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86K extends C2GS {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    @Override // X.C2GT
    public final void A06(C07X c07x, final InterfaceC58362lv interfaceC58362lv) {
        C14360o3.A0B(c07x, 0);
        C14360o3.A0B(interfaceC58362lv, 1);
        super.A06(c07x, new InterfaceC58362lv() { // from class: X.8Ft
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                if (this.A00.compareAndSet(true, false)) {
                    interfaceC58362lv.onChanged(obj);
                }
            }
        });
    }

    @Override // X.C2GT
    public final void A0B(Object obj) {
        this.A00.set(true);
        super.A0B(obj);
    }
}
