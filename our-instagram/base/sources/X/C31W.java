package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.31W, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C31W {
    public static final C31W A01 = new C31W() { // from class: X.31X
    };
    public final boolean A00;

    public static final boolean A00(C31W c31w, Object obj, List list) {
        if (obj != null) {
            char[] A02 = c31w.A02(obj);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue < A02.length && A02[intValue] == '1') {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public List A01(Object obj) {
        List A3b;
        if (this instanceof C31Y) {
            C3XG c3xg = (C3XG) obj;
            C14360o3.A0B(c3xg, 0);
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 != null && (A3b = A02.A3b()) != null) {
                return A3b;
            }
        }
        return C16930sl.A00;
    }

    public char[] A02(Object obj) {
        List list;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        if (this instanceof C31Y) {
            C3XG c3xg = (C3XG) obj;
            C14360o3.A0B(c3xg, 0);
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 == null || (AiW = A02.A0C.AiW()) == null || (list = AiW.Ag9()) == null) {
                list = C16930sl.A00;
            }
            return C5IK.A00(list);
        }
        return new char[0];
    }

    public C31W(boolean z) {
        this.A00 = z;
    }
}
