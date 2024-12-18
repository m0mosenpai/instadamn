package X;

import android.view.View;

/* renamed from: X.0mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13350mL {
    public static final void A00(View view, final InterfaceC16660sJ interfaceC16660sJ, long j) {
        C14360o3.A0B(view, 0);
        final long A03 = C36J.A03(j);
        C0fQ.A00(new AbstractViewOnClickListenerC13340mK(A03) { // from class: X.0vi
            @Override // X.AbstractViewOnClickListenerC13340mK
            public final void A00(View view2) {
                C14360o3.A0B(view2, 0);
                InterfaceC16660sJ.this.invoke(view2);
            }
        }, view);
    }
}
