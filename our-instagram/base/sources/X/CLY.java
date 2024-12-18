package X;

/* loaded from: classes5.dex */
public abstract class CLY {
    public static final String A00(InterfaceC23621Ds interfaceC23621Ds) {
        Object c09540e5;
        if (interfaceC23621Ds instanceof C1E3) {
            return interfaceC23621Ds.toString();
        }
        try {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(interfaceC23621Ds);
            A1C.append('@');
            c09540e5 = AbstractC166997dE.A0x(Integer.toHexString(System.identityHashCode(interfaceC23621Ds)), A1C);
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (C09550e6.A00(c09540e5) != null) {
            c09540e5 = AnonymousClass001.A0T(interfaceC23621Ds.getClass().getName(), Integer.toHexString(System.identityHashCode(interfaceC23621Ds)), '@');
        }
        return (String) c09540e5;
    }
}
