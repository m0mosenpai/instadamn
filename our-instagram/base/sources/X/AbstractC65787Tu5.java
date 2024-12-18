package X;

/* renamed from: X.Tu5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65787Tu5 {
    public static final boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return true;
            }
        } else if (obj2 == null) {
            return true;
        }
        if ((obj instanceof InterfaceC38381qS) && (obj2 instanceof InterfaceC38381qS)) {
            return C14360o3.A0K(((InterfaceC38381qS) obj).CAR(), ((InterfaceC38381qS) obj2).CAR());
        }
        return obj == obj2;
    }
}
