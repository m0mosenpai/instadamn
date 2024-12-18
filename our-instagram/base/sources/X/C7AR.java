package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7AR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AR {
    public static final C7AR A00 = new Object();

    public final boolean A03(C83403nh c83403nh) {
        C9CK A0F;
        List list;
        Object obj;
        Boolean bool;
        String A01 = A01(c83403nh);
        if (A01 == null || (A0F = c83403nh.A0F()) == null || (list = (List) A0F.A00) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C9CG c9cg = (C9CG) obj;
                if (C14360o3.A0K(c9cg.A03, A01) && c9cg.A02 != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9CG c9cg2 = (C9CG) obj;
        if (c9cg2 == null || (bool = (Boolean) c9cg2.A00) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A04(C83403nh c83403nh) {
        C9CK A0F;
        List list;
        Object obj;
        Boolean bool;
        String A01 = A01(c83403nh);
        if (A01 == null || (A0F = c83403nh.A0F()) == null || (list = (List) A0F.A00) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C9CG c9cg = (C9CG) obj;
                if (C14360o3.A0K(c9cg.A03, A01) && c9cg.A02 != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9CG c9cg2 = (C9CG) obj;
        if (c9cg2 == null || (bool = (Boolean) c9cg2.A01) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final String A00(Context context, C83403nh c83403nh) {
        Object obj;
        C910143t c910143t;
        ExtendedImageUrl extendedImageUrl;
        List list;
        String A3D;
        C38321qM c38321qM = c83403nh.A0s;
        if (c38321qM == null || (A3D = c38321qM.A3D(context)) == null) {
            Object obj2 = c83403nh.A1T;
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                obj = AbstractC001800i.A0J(list);
            } else {
                obj = null;
            }
            if (!(obj instanceof C910143t) || (c910143t = (C910143t) obj) == null || (extendedImageUrl = c910143t.A0X) == null) {
                return null;
            }
            return extendedImageUrl.A0A;
        }
        return A3D;
    }

    public static final String A01(C83403nh c83403nh) {
        Object obj;
        C910143t c910143t;
        List list;
        C38321qM c38321qM = c83403nh.A0s;
        if (c38321qM != null) {
            if (c38321qM.BRp() != EnumC40111tc.A0Q) {
                return null;
            }
            return c38321qM.getId();
        }
        if (c83403nh.A10 != C2EY.A0z) {
            return null;
        }
        Object obj2 = c83403nh.A1T;
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            obj = AbstractC001800i.A0J(list);
        } else {
            obj = null;
        }
        if (!(obj instanceof C910143t) || (c910143t = (C910143t) obj) == null || c910143t.A1l || c910143t.A08 != 0 || c910143t.A0Z != null || c910143t.A1Q != null || c910143t.A1O != null) {
            return null;
        }
        return String.valueOf(c910143t.A0K);
    }

    public static final String A02(C83403nh c83403nh, String str) {
        List list;
        Object obj;
        C9CK A0F = c83403nh.A0F();
        if (A0F == null || (list = (List) A0F.A00) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C9CG) obj).A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9CG c9cg = (C9CG) obj;
        if (c9cg == null) {
            return null;
        }
        return c9cg.A02;
    }
}
