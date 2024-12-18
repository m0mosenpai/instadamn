package X;

/* renamed from: X.1Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23651Dv {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ps, java.lang.Object] */
    public static final C12W A00(C12W c12w, C12W c12w2, boolean z) {
        C23661Dw c23661Dw = C23661Dw.A00;
        boolean booleanValue = ((Boolean) c12w.fold(false, c23661Dw)).booleanValue();
        boolean booleanValue2 = ((Boolean) c12w2.fold(false, c23661Dw)).booleanValue();
        if (booleanValue || booleanValue2) {
            ?? obj = new Object();
            obj.A00 = c12w2;
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            c12w = (C12W) c12w.fold(anonymousClass191, new DS9(24, obj, z));
            if (booleanValue2) {
                obj.A00 = ((C12W) obj.A00).fold(anonymousClass191, C57764Pjr.A00);
            }
            c12w2 = (C12W) obj.A00;
        }
        return c12w.plus(c12w2);
    }

    public static final C3HO A02(Object obj, InterfaceC23621Ds interfaceC23621Ds, C12W c12w) {
        C3HO c3ho = null;
        if ((interfaceC23621Ds instanceof InterfaceC23631Dt) && c12w.get(C3HP.A00) != null) {
            InterfaceC23631Dt interfaceC23631Dt = (InterfaceC23631Dt) interfaceC23621Ds;
            while (true) {
                if ((interfaceC23631Dt instanceof C50172Sg) || (interfaceC23631Dt = interfaceC23631Dt.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC23631Dt instanceof C3HO) {
                    C3HO c3ho2 = (C3HO) interfaceC23631Dt;
                    c3ho = c3ho2;
                    if (c3ho2 != null) {
                        c3ho2.threadLocalIsSet = true;
                        c3ho2.A00.set(new C09530e4(c12w, obj));
                    }
                }
            }
        }
        return c3ho;
    }

    public static final C12W A01(C12W c12w, C19L c19l) {
        C12W A00 = A00(c19l.Arv(), c12w, true);
        C12T c12t = C12P.A00;
        if (A00 != c12t && A00.get(C12X.A00) == null) {
            return A00.plus(c12t);
        }
        return A00;
    }
}
