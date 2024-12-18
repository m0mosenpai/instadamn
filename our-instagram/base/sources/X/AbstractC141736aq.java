package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141736aq {
    public static final void A01(UserSession userSession, C41551w4 c41551w4, int i) {
        C41181vS A08 = c41551w4.A08(userSession);
        if (!A02(c41551w4) && AbstractC130925vf.A0k(A08, c41551w4) && i > 1) {
            ArrayList arrayList = new ArrayList();
            C38321qM c38321qM = A08.A0b;
            c38321qM.getClass();
            double min = Math.min(AbstractC130925vf.A00(c38321qM) - 1.0d, c38321qM.A0l() / i);
            double d = 0.0d;
            int i2 = 0;
            do {
                arrayList.add(Double.valueOf(d));
                d += min;
                i2++;
            } while (i2 < i);
            c41551w4.A0H.A17 = arrayList;
            A08.A0M = arrayList;
        }
    }

    public static final long A00(C41551w4 c41551w4, long j) {
        List list = c41551w4.A0H.A17;
        if (list != null && !list.isEmpty()) {
            int A01 = c41551w4.A01();
            if (A01 < list.size()) {
                long doubleValue = (long) (((Number) list.get(A01)).doubleValue() * 1000.0d);
                if (A01 != list.size() - 1) {
                    j = (long) (((Number) list.get(A01 + 1)).doubleValue() * 1000.0d);
                }
                return j - doubleValue;
            }
            throw new IllegalStateException("Out of bounds video to carousel index");
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.C41551w4 r1) {
        /*
            com.instagram.model.reels.Reel r0 = r1.A0H
            java.util.List r0 = r0.A17
            if (r0 == 0) goto Ld
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC141736aq.A02(X.1w4):boolean");
    }

    public static final boolean A03(C41551w4 c41551w4) {
        List list = c41551w4.A0H.A17;
        if (list == null || list.isEmpty() || list.size() - 1 != c41551w4.A01()) {
            return false;
        }
        return true;
    }
}
