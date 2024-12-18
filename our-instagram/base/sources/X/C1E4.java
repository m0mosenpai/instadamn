package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.1E4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1E4 extends C1E5 {
    public int A00;

    public abstract Object A09();

    public Object A0A(Object obj) {
        return obj;
    }

    public abstract InterfaceC23621Ds A0C();

    public abstract void A0D(Object obj, Throwable th);

    public final void A08(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            C2Ql.A01(th, th2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        CLX.A00(A0C().getContext(), new Error(sb.toString(), th));
    }

    public Throwable A0B(Object obj) {
        C1JW c1jw;
        if (!(obj instanceof C1JW) || (c1jw = (C1JW) obj) == null) {
            return null;
        }
        return c1jw.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object c09540e5;
        C3HO c3ho;
        AnonymousClass195 anonymousClass195;
        try {
            InterfaceC23621Ds A0C = A0C();
            C14360o3.A0C(A0C, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1E3 c1e3 = (C1E3) A0C;
            InterfaceC23621Ds interfaceC23621Ds = c1e3.A02;
            Object obj = c1e3.A01;
            C12W context = interfaceC23621Ds.getContext();
            Object A00 = C1E8.A00(obj, context);
            if (A00 != C1E8.A01) {
                c3ho = AbstractC23651Dv.A02(A00, interfaceC23621Ds, context);
            } else {
                c3ho = null;
            }
            try {
                C12W context2 = interfaceC23621Ds.getContext();
                Object A09 = A09();
                Throwable A0B = A0B(A09);
                if (A0B == null) {
                    int i = this.A00;
                    if ((i == 1 || i == 2) && (anonymousClass195 = (AnonymousClass195) context2.get(AnonymousClass195.A00)) != null && !anonymousClass195.isActive()) {
                        CancellationException AlP = anonymousClass195.AlP();
                        A0D(A09, AlP);
                        interfaceC23621Ds.resumeWith(new C09540e5(AlP));
                    } else {
                        interfaceC23621Ds.resumeWith(A0A(A09));
                    }
                } else {
                    interfaceC23621Ds.resumeWith(new C09540e5(A0B));
                }
                A08(null, C09550e6.A00(C0eB.A00));
            } finally {
                if (c3ho == null || c3ho.A0a()) {
                    C1E8.A01(A00, context);
                }
            }
        } catch (Throwable th) {
            try {
                c09540e5 = C0eB.A00;
            } catch (Throwable th2) {
                c09540e5 = new C09540e5(th2);
            }
            A08(th, C09550e6.A00(c09540e5));
        }
    }
}
