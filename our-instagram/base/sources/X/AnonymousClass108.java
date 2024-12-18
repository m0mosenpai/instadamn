package X;

/* renamed from: X.108, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass108 {
    public static final C0UG A01(InterfaceC19390xP interfaceC19390xP) {
        C0UG c0ug;
        if (!(interfaceC19390xP instanceof C0UG) || (c0ug = (C0UG) interfaceC19390xP) == null) {
            return new AnonymousClass055(C05F.A00, AnonymousClass191.A00, interfaceC19390xP, -3);
        }
        return c0ug;
    }

    public static final Object A00(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        Object invoke;
        Object A00 = C1E8.A00(obj2, c12w);
        try {
            C20740zu c20740zu = new C20740zu(interfaceC23621Ds, c12w);
            if (!(interfaceC16620sF instanceof C1Dr)) {
                invoke = C1E2.A00(obj, c20740zu, interfaceC16620sF);
            } else {
                C15500q5.A06(interfaceC16620sF, 2);
                invoke = interfaceC16620sF.invoke(obj, c20740zu);
            }
            return invoke;
        } finally {
            C1E8.A01(A00, c12w);
        }
    }
}
