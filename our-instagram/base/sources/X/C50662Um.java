package X;

/* renamed from: X.2Um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50662Um {
    public static volatile InterfaceC25221Lc A00;

    public static final void A01(EnumC50702Ur enumC50702Ur, String str, String str2) {
        C14360o3.A0B(str2, 2);
        A02(enumC50702Ur, str, str2, null, 0);
    }

    public static final void A02(EnumC50702Ur enumC50702Ur, String str, String str2, Throwable th, int i) {
        C14360o3.A0B(enumC50702Ur, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        A00().EHF(enumC50702Ur, str, str2, th, null, i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1Lc] */
    public static final InterfaceC25221Lc A00() {
        if (A00 == null) {
            synchronized (C50662Um.class) {
                if (A00 == null) {
                    A00 = new Object();
                }
            }
        }
        InterfaceC25221Lc interfaceC25221Lc = A00;
        if (interfaceC25221Lc != null) {
            return interfaceC25221Lc;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(String str, String str2) {
        A02(EnumC50702Ur.A03, str, str2, null, 0);
    }
}
