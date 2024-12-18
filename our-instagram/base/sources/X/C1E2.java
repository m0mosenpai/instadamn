package X;

/* renamed from: X.1E2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1E2 {
    public static final Object A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object x2f;
        C14360o3.A0B(interfaceC16620sF, 0);
        C12W context = interfaceC23621Ds.getContext();
        if (context == AnonymousClass191.A00) {
            x2f = new C29632D3n(interfaceC23621Ds);
        } else {
            x2f = new X2F(interfaceC23621Ds, context);
        }
        C15500q5.A06(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, x2f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC23621Ds A01(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        if (interfaceC16620sF instanceof C1Dr) {
            return ((C1Dr) interfaceC16620sF).create(obj, interfaceC23621Ds);
        }
        C12W context = interfaceC23621Ds.getContext();
        if (context == AnonymousClass191.A00) {
            return new C29633D3o(obj, interfaceC23621Ds, interfaceC16620sF);
        }
        return new C29631D3m(obj, interfaceC23621Ds, context, interfaceC16620sF);
    }

    public static final InterfaceC23621Ds A02(InterfaceC23621Ds interfaceC23621Ds) {
        C1Dq c1Dq;
        C14360o3.A0B(interfaceC23621Ds, 0);
        if ((interfaceC23621Ds instanceof C1Dq) && (c1Dq = (C1Dq) interfaceC23621Ds) != null) {
            return c1Dq.intercepted();
        }
        return interfaceC23621Ds;
    }
}
