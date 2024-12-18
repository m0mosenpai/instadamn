package X;

/* renamed from: X.F3r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34115F3r {
    public static final String A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 112) {
            if (hashCode != 3714) {
                if (hashCode == 3496474 && str.equals("reel")) {
                    return "clips";
                }
                return null;
            }
            if (str.equals("tv")) {
                return "tv";
            }
            return null;
        }
        if (str.equals("p")) {
            return "media";
        }
        return null;
    }
}
