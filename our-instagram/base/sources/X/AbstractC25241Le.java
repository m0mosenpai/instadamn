package X;

/* renamed from: X.1Le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25241Le {
    public static volatile C25211Lb A00;

    public static void A00(C6FG c6fg, String str, String str2, Throwable th) {
        A01(c6fg, str, str2, th, 0, false);
    }

    public static void A02(String str, String str2) {
        A00(null, str, str2, null);
    }

    public static void A01(C6FG c6fg, String str, String str2, Throwable th, int i, boolean z) {
        if (A00 == null) {
            C50662Um.A00().EHF(EnumC50702Ur.A03, str, str2, th, null, i);
        } else {
            A00.A00(c6fg, str2, th, z);
        }
    }

    public static void A03(String str, Throwable th) {
        A00(null, str, "", th);
    }
}
