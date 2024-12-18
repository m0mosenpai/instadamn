package X;

/* loaded from: classes10.dex */
public abstract class SQZ {
    public static void A00(String str) {
        java.util.Set set = S68.A00;
        if (!set.contains(str)) {
            android.util.Log.w("LOTTIE", str, null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        java.util.Set set = S68.A00;
        if (!set.contains(str)) {
            android.util.Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
