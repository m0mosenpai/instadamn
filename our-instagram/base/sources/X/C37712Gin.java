package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Gin, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37712Gin {
    public final UserSession A00;
    public final String A01;
    public final List A02;

    public static final boolean A02(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                if (new C11L("av01\\.0\\.[0-9]+m\\.10\\..*").A08(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A03(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                if (AbstractC002300n.A0h(lowerCase, "vp09.02", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A00(C37712Gin c37712Gin) {
        List A1Q = AbstractC16960so.A1Q(C31B.A2T, C31B.A1o, C31B.A20, C31B.A1P, C31B.A1R);
        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C31B) it.next()).A00, c37712Gin.A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(C37712Gin c37712Gin) {
        List A1Q = AbstractC16960so.A1Q(C31B.A1z, C31B.A13);
        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C31B) it.next()).A00, c37712Gin.A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37712Gin.A04():boolean");
    }

    public C37712Gin(UserSession userSession, String str, List list) {
        this.A00 = userSession;
        this.A02 = list;
        this.A01 = str;
    }
}
