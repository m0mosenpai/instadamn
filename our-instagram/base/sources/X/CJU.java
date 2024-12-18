package X;

/* loaded from: classes5.dex */
public abstract class CJU {
    public static final AbstractC33632Eti A00(C32196ECr c32196ECr) {
        C14360o3.A0B(c32196ECr, 0);
        if (c32196ECr instanceof EfU) {
            return new C0J((EfU) c32196ECr);
        }
        if (c32196ECr instanceof EfV) {
            return new C0I((EfV) c32196ECr);
        }
        throw AbstractC166987dD.A14("Two fac response type not supported. Only accepting LoginResponse and FacebookSignUpResponse");
    }
}
