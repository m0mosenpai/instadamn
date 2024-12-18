package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Iterator;

/* renamed from: X.2ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55392ge {
    public static final int A00(QuickPromotionSurface quickPromotionSurface, QuickPromotionSurface[] quickPromotionSurfaceArr) {
        Object obj;
        C14360o3.A0B(quickPromotionSurfaceArr, 0);
        Iterator it = new C17u(0, 3).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (quickPromotionSurfaceArr[((Number) obj).intValue()] == quickPromotionSurface) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }
}
