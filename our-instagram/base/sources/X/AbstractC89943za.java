package X;

/* renamed from: X.3za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89943za {
    public static final void A00(InterfaceC23621Ds interfaceC23621Ds, C1E4 c1e4, boolean z) {
        Object A0A;
        C3HO c3ho;
        boolean A0a;
        Object A09 = c1e4.A09();
        Throwable A0B = c1e4.A0B(A09);
        if (A0B != null) {
            A0A = new C09540e5(A0B);
        } else {
            A0A = c1e4.A0A(A09);
        }
        if (z) {
            C14360o3.A0C(interfaceC23621Ds, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C1E3 c1e3 = (C1E3) interfaceC23621Ds;
            InterfaceC23621Ds interfaceC23621Ds2 = c1e3.A02;
            Object obj = c1e3.A01;
            C12W context = interfaceC23621Ds2.getContext();
            Object A00 = C1E8.A00(obj, context);
            if (A00 != C1E8.A01) {
                c3ho = AbstractC23651Dv.A02(A00, interfaceC23621Ds2, context);
            } else {
                c3ho = null;
            }
            try {
                interfaceC23621Ds2.resumeWith(A0A);
                if (c3ho != null) {
                    if (!A0a) {
                        return;
                    }
                }
                return;
            } finally {
                if (c3ho == null || c3ho.A0a()) {
                    C1E8.A01(A00, context);
                }
            }
        }
        interfaceC23621Ds.resumeWith(A0A);
    }
}
