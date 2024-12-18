package X;

/* loaded from: classes11.dex */
public abstract class VML {
    public static final boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
        } else if (obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }
}
