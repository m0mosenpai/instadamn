package X;

/* renamed from: X.3HN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3HN {
    public static final Object A00(C07S c07s, C07T c07t, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object A00;
        if (c07s != C07S.INITIALIZED) {
            if (c07t.A07() != C07S.DESTROYED && (A00 = AnonymousClass194.A00(interfaceC23621Ds, new C9DM(c07t, c07s, interfaceC16620sF, null, 4))) == C1JX.A02) {
                return A00;
            }
            return C0eB.A00;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object A02(C07X c07x, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        return A01(C07S.STARTED, c07x, interfaceC23621Ds, interfaceC16620sF);
    }

    public static final Object A01(C07S c07s, C07X c07x, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object A00 = A00(c07s, c07x.getLifecycle(), interfaceC23621Ds, interfaceC16620sF);
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }
}
