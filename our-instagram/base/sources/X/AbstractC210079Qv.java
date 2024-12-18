package X;

import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC210079Qv {
    public static final boolean A06(C47Z c47z) {
        java.util.Set<AGS> set = c47z.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AGS ags : set) {
            if (ags.A00 == EnumC222909sV.A07 && C14360o3.A0K(ags.A0J, ProductType.STORY.A00) && AbstractC166997dE.A1Z(ags.A03, false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A00(C47Z c47z) {
        List list = c47z.A4g;
        if ((list == null || list.isEmpty()) && !AbstractC166987dD.A1b(c47z.A4b) && !c47z.A57 && !AbstractC50707Ma2.A00(c47z)) {
            ArrayList A0I = c47z.A0I();
            if (A0I == null || A0I.isEmpty()) {
                List list2 = c47z.A4P;
                if (list2 == null || list2.isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean A01(C47Z c47z) {
        java.util.Set<AGS> set = c47z.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AGS ags : set) {
            if (ags.A00 == EnumC222909sV.A04 && C14360o3.A0K(ags.A0K, EnumC223189sx.A04.A00)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(C47Z c47z) {
        java.util.Set<AGS> set = c47z.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AGS ags : set) {
            if (ags.A00 == EnumC222909sV.A04 && C14360o3.A0K(ags.A0K, EnumC223189sx.A05.A00)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A03(C47Z c47z) {
        boolean z;
        C915547l c915547l = c47z.A1T;
        synchronized (c915547l) {
            z = !c915547l.A0D.isEmpty();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.C47Z r3) {
        /*
            java.util.Set r0 = r3.A4t
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.AGS r0 = (X.AGS) r0
            java.lang.String r1 = r0.A0J
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            java.lang.String r0 = r0.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6
            r0 = 1
            if (r2 != 0) goto L23
        L22:
            r0 = 0
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC210079Qv.A04(X.47Z):boolean");
    }

    public static final boolean A05(C47Z c47z) {
        java.util.Set<AGS> set = c47z.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (AGS ags : set) {
            if (ags.A00 == EnumC222909sV.A07 && C14360o3.A0K(ags.A0J, ProductType.STORY.A00) && AbstractC166997dE.A1Z(ags.A03, true) && C14360o3.A0I(ags.A08, -1.0f)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A07(C47Z c47z) {
        if (!c47z.A5r) {
            for (Object obj : c47z.A4t) {
                String str = ((AGS) obj).A0K;
                if (str != null && EnumC223189sx.A01.get(str) != null) {
                    if (obj == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A08(C47Z c47z) {
        if (c47z.A1G == EnumC40111tc.A0Q && (!c47z.A4t.isEmpty())) {
            return true;
        }
        return false;
    }
}
