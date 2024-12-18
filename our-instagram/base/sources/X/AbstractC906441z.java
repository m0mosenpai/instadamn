package X;

import android.view.View;

/* renamed from: X.41z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC906441z {
    public static final void A00(C206189Bb c206189Bb, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, C3YD c3yd) {
        C14360o3.A0B(interfaceC86303t2, 1);
        C14360o3.A0B(c206189Bb, 2);
        if (c3yd != null) {
            if (!c206189Bb.A01) {
                c3yd.A0A();
                return;
            }
            J0F j0f = new J0F(c75113Zb);
            C9BW c9bw = (C9BW) c206189Bb.A00;
            AbstractC86373tA.A00((View.OnClickListener) ((InterfaceC16660sJ) c9bw.A00).invoke(interfaceC86303t2), interfaceC86303t2, (C3t9) c206189Bb.A03, j0f, c3yd);
            ((InterfaceC16820sZ) c9bw.A01).invoke();
        }
    }
}
