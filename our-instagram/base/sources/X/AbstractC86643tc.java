package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86643tc {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (X.C2TN.A02(r21, r9) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01d3, code lost:
    
        if (r11 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r21, final X.InterfaceC76053bA r22, X.C86633tb r23, final X.C86003sX r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86643tc.A00(com.instagram.common.session.UserSession, X.3bA, X.3tb, X.3sX, java.lang.String):void");
    }

    public static final boolean A01(UserSession userSession, C86633tb c86633tb) {
        List A3w;
        List list;
        List A3w2;
        C14360o3.A0B(userSession, 1);
        C206209Bd c206209Bd = c86633tb.A00;
        C97434Zd c97434Zd = (C97434Zd) ((InterfaceC16820sZ) c206209Bd.A00).invoke();
        C38321qM c38321qM = c97434Zd.A00;
        if (!AbstractC75373a4.A08(userSession, c38321qM) && !AbstractC75373a4.A0A(userSession, c38321qM) && (((A3w = c38321qM.A3w(EnumC75383a5.A0K)) == null || A3w.isEmpty()) && ((list = (List) ((C9CG) ((InterfaceC16820sZ) c206209Bd.A01).invoke()).A01) == null || list.isEmpty()))) {
            if (AbstractC120715dH.A00(EnumC75383a5.A0x, c86633tb.A03) == null) {
                C84823qW A00 = AbstractC97594Zu.A00(c97434Zd);
                Wm1 A01 = AbstractC97594Zu.A01(c97434Zd);
                if ((A00 == null || A01 == null) && ((A3w2 = c38321qM.A3w(EnumC75383a5.A11)) == null || A3w2.isEmpty())) {
                    return false;
                }
            }
        }
        return true;
    }
}
