package X;

/* renamed from: X.75M, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75M {
    /* JADX WARN: Type inference failed for: r2v3, types: [X.2GT, X.2li] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    public static final C58252li A00(C2GT c2gt) {
        C58252li c58252li;
        ?? obj = new Object();
        obj.A00 = true;
        if (c2gt.A08 != C2GT.A0A) {
            obj.A00 = false;
            ?? c2gt2 = new C2GT(c2gt.A02());
            c2gt2.A00 = new C58336PtW();
            c58252li = c2gt2;
        } else {
            c58252li = new C58252li();
        }
        c58252li.A0E(c2gt, new C75N(new C9F3(19, c58252li, (Object) obj)));
        return c58252li;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.2GT, X.2li] */
    public static final C58252li A01(C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ) {
        C58252li c58252li;
        C14360o3.A0B(c2gt, 0);
        if (c2gt.A08 != C2GT.A0A) {
            ?? c2gt2 = new C2GT(interfaceC16660sJ.invoke(c2gt.A02()));
            c2gt2.A00 = new C58336PtW();
            c58252li = c2gt2;
        } else {
            c58252li = new C58252li();
        }
        c58252li.A0E(c2gt, new C75N(new C9F3(20, interfaceC16660sJ, c58252li)));
        return c58252li;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.2GT, X.2li] */
    public static final C58252li A02(C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ) {
        C58252li c58252li;
        C2GT c2gt2;
        Object obj = new Object();
        Object obj2 = c2gt.A08;
        Object obj3 = C2GT.A0A;
        if (obj2 != obj3 && (c2gt2 = (C2GT) interfaceC16660sJ.invoke(c2gt.A02())) != null && c2gt2.A08 != obj3) {
            ?? c2gt3 = new C2GT(c2gt2.A02());
            c2gt3.A00 = new C58336PtW();
            c58252li = c2gt3;
        } else {
            c58252li = new C58252li();
        }
        c58252li.A0E(c2gt, new C75N(new DHZ(15, obj, interfaceC16660sJ, c58252li)));
        return c58252li;
    }
}
