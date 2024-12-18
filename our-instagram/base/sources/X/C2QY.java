package X;

/* renamed from: X.2QY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2QY {
    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        Object obj2;
        C1E3 c1e3;
        C12W context = interfaceC23621Ds.getContext();
        C2QZ.A01(context);
        InterfaceC23621Ds A02 = C1E2.A02(interfaceC23621Ds);
        if ((A02 instanceof C1E3) && (c1e3 = (C1E3) A02) != null) {
            C12T c12t = c1e3.A03;
            if (c12t.A02(context)) {
                obj2 = C0eB.A00;
                c1e3.A00 = obj2;
                ((C1E4) c1e3).A00 = 1;
                c12t.A04(c1e3, context);
            } else {
                C3IW c3iw = new C3IW();
                C12W plus = context.plus(c3iw);
                obj2 = C0eB.A00;
                c1e3.A00 = obj2;
                ((C1E4) c1e3).A00 = 1;
                c12t.A04(c1e3, plus);
                if (c3iw.A00) {
                    AnonymousClass130 A00 = C2SU.A00();
                    C01U c01u = A00.A01;
                    if (c01u != null && !c01u.isEmpty()) {
                        long j = A00.A00;
                        if (j >= 4294967296L) {
                            c1e3.A00 = obj2;
                            ((C1E4) c1e3).A00 = 1;
                            A00.A08(c1e3);
                        } else {
                            A00.A00 = j + 4294967296L;
                            try {
                                c1e3.run();
                                do {
                                } while (A00.A0A());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = obj2;
                }
            }
            obj = C1JX.A02;
        } else {
            obj = C0eB.A00;
            obj2 = obj;
        }
        if (obj == C1JX.A02) {
            return obj;
        }
        return obj2;
    }
}
