package X;

/* renamed from: X.SeR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63167SeR {
    public boolean A00 = false;
    public final Object A01;

    public static void A00(C2GT c2gt, Object obj) {
        c2gt.A0B(new C63167SeR(obj));
    }

    public static void A01(C2GT c2gt, Object obj) {
        c2gt.A0A(new C63167SeR(obj));
    }

    public final Object A02() {
        if (this.A00) {
            return null;
        }
        this.A00 = true;
        return this.A01;
    }

    public C63167SeR(Object obj) {
        this.A01 = obj;
    }
}
