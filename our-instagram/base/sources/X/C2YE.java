package X;

/* renamed from: X.2YE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YE {
    public static final void A00(String str, Integer num, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        A01(str, num, str2);
    }

    public static final void A01(String str, Integer num, String str2) {
        EnumC50702Ur enumC50702Ur;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                enumC50702Ur = EnumC50702Ur.A04;
            } else {
                enumC50702Ur = EnumC50702Ur.A03;
            }
        } else {
            enumC50702Ur = EnumC50702Ur.A06;
        }
        C50662Um.A02(enumC50702Ur, str, str2, null, 0);
    }
}
