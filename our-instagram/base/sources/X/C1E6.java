package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.1E6, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1E6 {
    public static final C20730zt A01 = new C20730zt("UNDEFINED");
    public static final C20730zt A00 = new C20730zt("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final void A00(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C3HO c3ho;
        if (interfaceC23621Ds instanceof C1E3) {
            C1E3 c1e3 = (C1E3) interfaceC23621Ds;
            Object obj2 = obj;
            Throwable A002 = C09550e6.A00(obj);
            if (A002 != null) {
                obj2 = new C1JW(false, A002);
            }
            C12T c12t = c1e3.A03;
            InterfaceC23621Ds interfaceC23621Ds2 = c1e3.A02;
            if (c12t.A02(interfaceC23621Ds2.getContext())) {
                c1e3.A00 = obj2;
                ((C1E4) c1e3).A00 = 1;
                c12t.A05(c1e3, interfaceC23621Ds2.getContext());
                return;
            }
            AnonymousClass130 A003 = C2SU.A00();
            long j = A003.A00;
            if (j >= 4294967296L) {
                c1e3.A00 = obj2;
                ((C1E4) c1e3).A00 = 1;
                A003.A08(c1e3);
                return;
            }
            A003.A00 = j + 4294967296L;
            try {
                AnonymousClass195 anonymousClass195 = (AnonymousClass195) interfaceC23621Ds2.getContext().get(AnonymousClass195.A00);
                if (anonymousClass195 != null && !anonymousClass195.isActive()) {
                    CancellationException AlP = anonymousClass195.AlP();
                    c1e3.A0D(obj2, AlP);
                    c1e3.resumeWith(new C09540e5(AlP));
                } else {
                    Object obj3 = c1e3.A01;
                    C12W context = interfaceC23621Ds2.getContext();
                    Object A004 = C1E8.A00(obj3, context);
                    if (A004 != C1E8.A01) {
                        c3ho = AbstractC23651Dv.A02(A004, interfaceC23621Ds2, context);
                    } else {
                        c3ho = null;
                    }
                    try {
                        interfaceC23621Ds2.resumeWith(obj);
                        if (c3ho == null || c3ho.A0a()) {
                            C1E8.A01(A004, context);
                        }
                    } catch (Throwable th) {
                        if (c3ho == null || c3ho.A0a()) {
                            C1E8.A01(A004, context);
                        }
                        throw th;
                    }
                }
                do {
                } while (A003.A0A());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC23621Ds.resumeWith(obj);
    }
}
