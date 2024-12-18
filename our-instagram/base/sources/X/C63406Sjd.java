package X;

/* renamed from: X.Sjd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63406Sjd {
    public final EnumC68120VCd A00;
    public final Object A01;
    public final Throwable A02;

    public static C63406Sjd A06(Throwable th) {
        return A05(null, th);
    }

    public static C63406Sjd A00(C1N8 c1n8, C63406Sjd c63406Sjd) {
        return A02(c63406Sjd, c1n8.apply(c63406Sjd.A01));
    }

    public static C63406Sjd A01(C1N8 c1n8, C63406Sjd c63406Sjd) {
        Object obj;
        Object obj2 = c63406Sjd.A01;
        if (obj2 != null) {
            obj = c1n8.apply(obj2);
        } else {
            obj = null;
        }
        return A02(c63406Sjd, obj);
    }

    public static C63406Sjd A02(C63406Sjd c63406Sjd, Object obj) {
        return new C63406Sjd(c63406Sjd.A00, obj, c63406Sjd.A02);
    }

    public static C63406Sjd A03(Object obj) {
        return new C63406Sjd(EnumC68120VCd.LOADING, obj, null);
    }

    public static C63406Sjd A04(Object obj) {
        return new C63406Sjd(EnumC68120VCd.SUCCESS, obj, null);
    }

    public static C63406Sjd A05(Object obj, Throwable th) {
        return new C63406Sjd(EnumC68120VCd.ERROR, obj, th);
    }

    public static Object A08(C63406Sjd c63406Sjd) {
        Object obj = c63406Sjd.A01;
        obj.getClass();
        return obj;
    }

    public static void A09(C07X c07x, C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        c2gt.A06(c07x, new C63625SqX(c2gt, interfaceC58362lv, 21));
    }

    public static void A0A(C07X c07x, C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        c2gt.A06(c07x, new C63625SqX(c2gt, interfaceC58362lv, 22));
    }

    public static void A0B(C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        c2gt.A09(new C63625SqX(c2gt, interfaceC58362lv, 19));
    }

    public static boolean A0G(C63406Sjd c63406Sjd) {
        if (c63406Sjd != null && c63406Sjd.A00 == EnumC68120VCd.ERROR) {
            return true;
        }
        return false;
    }

    public static boolean A0H(C63406Sjd c63406Sjd) {
        if (c63406Sjd != null && c63406Sjd.A00 == EnumC68120VCd.LOADING) {
            return true;
        }
        return false;
    }

    public static boolean A0I(C63406Sjd c63406Sjd) {
        if (c63406Sjd != null && c63406Sjd.A00 == EnumC68120VCd.LOADING && c63406Sjd.A01 == null) {
            return true;
        }
        return false;
    }

    public static boolean A0J(C63406Sjd c63406Sjd) {
        if (c63406Sjd != null && c63406Sjd.A00 == EnumC68120VCd.SUCCESS) {
            return true;
        }
        return false;
    }

    public C63406Sjd(EnumC68120VCd enumC68120VCd, Object obj, Throwable th) {
        this.A00 = enumC68120VCd;
        this.A01 = obj;
        this.A02 = th;
    }

    public static Object A07(C2GT c2gt) {
        Object obj = ((C63406Sjd) c2gt.A02()).A01;
        obj.getClass();
        return obj;
    }

    public static void A0C(C2GT c2gt, Object obj) {
        c2gt.A0B(A04(obj));
    }

    public static void A0D(C2GT c2gt, Object obj) {
        c2gt.A0B(A03(obj));
    }

    public static void A0E(C2GT c2gt, Object obj, Throwable th) {
        c2gt.A0B(A05(obj, th));
    }

    public static boolean A0F(C2GT c2gt) {
        return A0J((C63406Sjd) c2gt.A02());
    }
}
