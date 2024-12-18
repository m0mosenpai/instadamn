package X;

/* loaded from: classes10.dex */
public abstract class S2X {
    public static void A00(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw AbstractC166987dD.A15(AnonymousClass001.A0g("null value in entry: ", obj.toString(), "=null"));
            }
        }
        throw AbstractC166987dD.A15("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
    }
}
