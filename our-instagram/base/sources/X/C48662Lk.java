package X;

import android.app.Activity;

/* renamed from: X.2Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48662Lk {
    public final C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
    public final C48672Ll A01 = new C48672Ll(C12L.A00);

    public final void A00(Activity activity, C07X c07x) {
        if (!this.A00.A00.getBoolean("is_foldable_device", false)) {
            this.A01.A00(activity, c07x, new InterfaceC57292k4() { // from class: X.3EU
                @Override // X.InterfaceC57292k4
                public final void DVZ(C4PX c4px) {
                    C14360o3.A0B(c4px, 0);
                    if (C4PY.A00(c4px) != null) {
                        C48662Lk c48662Lk = C48662Lk.this;
                        InterfaceC19610xo ARD = c48662Lk.A00.A00.ARD();
                        ARD.E77("is_foldable_device", true);
                        ARD.apply();
                        AnonymousClass195 anonymousClass195 = c48662Lk.A01.A00;
                        if (anonymousClass195 != null) {
                            anonymousClass195.AGH(null);
                        }
                    }
                }
            }, false);
        }
    }
}
