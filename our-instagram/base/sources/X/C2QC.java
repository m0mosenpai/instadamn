package X;

/* renamed from: X.2QC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2QC {
    public static boolean A00 = true;

    public static void A00(C95794Sn c95794Sn, String str, String str2, Object... objArr) {
        if (A00) {
            AbstractC459729h.A01(str, AnonymousClass001.A0r("playerId[", "]: ", str2, c95794Sn.A0q), objArr);
        }
    }

    public static void A02(C95794Sn c95794Sn, String str, Object... objArr) {
        A00(c95794Sn, "HeroService", str, objArr);
    }

    public static void A03(String str, Object... objArr) {
        if (A00) {
            AbstractC459729h.A01("HeroService", str, objArr);
        }
    }

    public static void A01(C95794Sn c95794Sn, String str, Throwable th, Object... objArr) {
        android.util.Log.e("HeroService", String.format(AnonymousClass001.A0r("playerId[", "]: ", str, c95794Sn.A0q), objArr), th);
    }
}
