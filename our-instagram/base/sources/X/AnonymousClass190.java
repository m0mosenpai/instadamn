package X;

/* renamed from: X.190, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass190 {
    public static C12V A00(C12V c12v, InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 1);
        if (!C14360o3.A0K(c12v.getKey(), interfaceC212412b)) {
            return null;
        }
        return c12v;
    }

    public static C12W A01(C12V c12v, InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 1);
        boolean A0K = C14360o3.A0K(c12v.getKey(), interfaceC212412b);
        Object obj = c12v;
        if (A0K) {
            obj = AnonymousClass191.A00;
        }
        return (C12W) obj;
    }

    public static C12W A02(C12V c12v, C12W c12w) {
        C14360o3.A0B(c12w, 1);
        if (c12w != AnonymousClass191.A00) {
            return (C12W) c12w.fold(c12v, AnonymousClass192.A00);
        }
        return c12v;
    }
}
