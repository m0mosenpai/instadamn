package X;

import android.content.Context;

/* renamed from: X.4hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101844hv {
    public static final void A00(C3r3 c3r3, C908843f c908843f, C75113Zb c75113Zb) {
        C14360o3.A0B(c908843f, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c3r3, 2);
        C43d c43d = c908843f.A00;
        if (c43d != null) {
            Context context = c908843f.A01.getContext();
            if (c3r3.A04) {
                C14360o3.A0A(context);
                c43d.CNq(new C50158MDl(c75113Zb, 11), (InterfaceC16660sJ) c3r3.A02.A00, (int) AbstractC13880nE.A04(context, c3r3.A01), (int) AbstractC13880nE.A04(context, c3r3.A00));
                c43d.setBufferEnabled(true);
                c75113Zb.A0L(c908843f.A02, null, false);
                return;
            }
            c43d.setBufferEnabled(false);
            c75113Zb.A0M(c908843f.A02, null, false);
        }
    }
}
