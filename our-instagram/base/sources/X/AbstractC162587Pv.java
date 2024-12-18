package X;

import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162587Pv {
    public static final java.util.Set A00 = new HashSet(Arrays.asList(C2EY.A1g, C2EY.A0K, C2EY.A1Z, C2EY.A1d, C2EY.A0G, C2EY.A18, C2EY.A1k, C2EY.A1A, C2EY.A0k, C2EY.A0p));

    public static boolean A01(C160787Im c160787Im, String str) {
        User user;
        boolean z;
        if (c160787Im == null || (user = c160787Im.A0K) == null || !user.getId().equals(str)) {
            return false;
        }
        C83403nh c83403nh = c160787Im.A0e;
        boolean A002 = A00(c83403nh.C8i(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        if ((!A03(c83403nh) || !A04(c83403nh)) && (A02(c83403nh) || c83403nh.A0G() != AnonymousClass541.A0J)) {
            z = false;
        } else {
            z = true;
        }
        if (!A002 || !z || !(!c83403nh.A1O())) {
            return false;
        }
        DirectMessageComments directMessageComments = c83403nh.A0q;
        return (directMessageComments == null || directMessageComments.A00 <= 0) && c160787Im.A03() == C7P3.A0S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A05(C83403nh c83403nh, C83403nh c83403nh2, boolean z) {
        boolean z2 = false;
        if (c83403nh != null && AbstractC162597Pw.A00(c83403nh, c83403nh2) && A00(c83403nh.C8i(), c83403nh2.C8i()) && (!c83403nh2.A2F || !z)) {
            AnonymousClass541 A0G = c83403nh2.A0G();
            AnonymousClass541 anonymousClass541 = AnonymousClass541.A0J;
            if (A0G == anonymousClass541) {
                if (c83403nh2.A01 > 0 && z) {
                    return false;
                }
                if (A03(c83403nh2)) {
                    if (z || !A04(c83403nh2) || A02(c83403nh) || A03(c83403nh) || c83403nh.A2P != c83403nh2.A2P) {
                        return false;
                    }
                } else {
                    if (A02(c83403nh2) || A02(c83403nh) || c83403nh.A2P != c83403nh2.A2P) {
                        return false;
                    }
                    boolean A03 = A03(c83403nh);
                    if (z) {
                        z2 = true;
                        if (((!A03 || !A04(c83403nh)) && A03(c83403nh)) || c83403nh.A0G() != anonymousClass541) {
                            return false;
                        }
                    } else {
                        if (A03 || c83403nh.A2F || c83403nh.A0G() != anonymousClass541) {
                            return false;
                        }
                        if (c83403nh.A0H() != null && !c83403nh.A0H().isEmpty() && ((C910143t) c83403nh.A0H().get(0)).A02 == 5) {
                            return false;
                        }
                    }
                }
                z2 = true;
                if (c83403nh.A01 > 0) {
                    return false;
                }
            }
        }
        return z2;
    }

    public static boolean A06(C83403nh c83403nh, C83403nh c83403nh2, boolean z, boolean z2, boolean z3) {
        if (A05(c83403nh2, c83403nh, true) && (!c83403nh2.A1O())) {
            DirectMessageComments directMessageComments = c83403nh2.A0q;
            return ((directMessageComments != null && directMessageComments.A00 > 0) || z3 || z || z2) ? false : true;
        }
        return false;
    }

    public static boolean A00(long j, long j2) {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (Math.abs(timeUnit.toSeconds(j) - timeUnit.toSeconds(j2)) >= 60) {
            return false;
        }
        return true;
    }

    public static boolean A02(C83403nh c83403nh) {
        if (!A00.contains(c83403nh.A10) && c83403nh.A13 == null && !c83403nh.A1Y() && !c83403nh.CSo() && !c83403nh.A1X() && !c83403nh.A1Z()) {
            return false;
        }
        return true;
    }

    public static boolean A03(C83403nh c83403nh) {
        C2EY c2ey = c83403nh.A10;
        if (c2ey != C2EY.A1V && c2ey != C2EY.A1e && c83403nh.A0P() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 == X.C7O9.QUESTION_RESPONSE) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(X.C83403nh r3) {
        /*
            X.2EY r1 = r3.A10
            if (r1 == 0) goto L46
            X.75S r0 = X.C75S.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 22
            if (r1 == r0) goto L27
            r0 = 45
            if (r1 != r0) goto L46
            X.L93 r0 = r3.A0p
            r0.getClass()
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            boolean r0 = r3.A1Z()
        L23:
            if (r0 != 0) goto L46
        L25:
            r0 = 1
        L26:
            return r0
        L27:
            java.lang.Object r2 = r3.A1T
            X.7QR r2 = (X.C7QR) r2
            if (r2 == 0) goto L46
            X.7O9 r1 = r2.A01
            r1.getClass()
            X.7O9 r0 = X.C7O9.REPLY
            if (r1 == r0) goto L3f
            X.7O9 r1 = r2.A01
            r1.getClass()
            X.7O9 r0 = X.C7O9.QUESTION_RESPONSE
            if (r1 != r0) goto L46
        L3f:
            java.lang.String r0 = r2.A0A
            boolean r0 = X.AbstractC13670mt.A0E(r0)
            goto L23
        L46:
            X.442 r1 = r3.A0P()
            r0 = 0
            if (r1 == 0) goto L26
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162587Pv.A04(X.3nh):boolean");
    }
}
