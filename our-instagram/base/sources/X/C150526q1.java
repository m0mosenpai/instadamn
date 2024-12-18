package X;

import android.content.Context;

/* renamed from: X.6q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150526q1 extends AbstractC150536q2 implements InterfaceC13050lr, InterfaceC13000lm {
    public final Context A00 = AbstractC12290kX.A00;
    public final AbstractC12990ll A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized C150526q1 A00(final AbstractC12990ll abstractC12990ll) {
        C150526q1 c150526q1;
        synchronized (C150526q1.class) {
            c150526q1 = (C150526q1) abstractC12990ll.A01(C150526q1.class, new InterfaceC16820sZ() { // from class: X.6q3
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return new C150526q1(AbstractC12990ll.this);
                }
            });
        }
        return c150526q1;
    }

    public C150526q1(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
    }
}
