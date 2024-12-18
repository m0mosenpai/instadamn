package X;

/* renamed from: X.1UZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1UZ {
    public static final Object A00(Object obj, InterfaceC16620sF interfaceC16620sF, C1UX c1ux) {
        Object c1jw;
        Object A0D;
        try {
            if (!(interfaceC16620sF instanceof C1Dr)) {
                c1jw = C1E2.A00(obj, c1ux, interfaceC16620sF);
            } else {
                C15500q5.A06(interfaceC16620sF, 2);
                c1jw = interfaceC16620sF.invoke(obj, c1ux);
            }
        } catch (Throwable th) {
            c1jw = new C1JW(false, th);
        }
        C1JX c1jx = C1JX.A02;
        if (c1jw != c1jx && (A0D = c1ux.A0D(c1jw)) != AnonymousClass199.A04) {
            if (A0D instanceof C1JW) {
                throw ((C1JW) A0D).A00;
            }
            return AnonymousClass199.A00(A0D);
        }
        return c1jx;
    }
}
