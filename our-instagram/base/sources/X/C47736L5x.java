package X;

import java.lang.ref.WeakReference;

/* renamed from: X.L5x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47736L5x {
    public final WeakReference A00;

    public final void A00(Integer num) {
        C14360o3.A0B(num, 0);
        L4P l4p = (L4P) this.A00.get();
        if (l4p != null) {
            String A00 = CCA.A00(num);
            InterfaceC16660sJ interfaceC16660sJ = l4p.A01;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(A00);
            } else {
                l4p.A00 = A00;
            }
        }
    }

    public C47736L5x(L4P l4p) {
        this.A00 = AbstractC25225BEi.A16(l4p);
    }
}
