package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84633qC {
    public static final boolean A02(int i, long j) {
        boolean z = false;
        if (604800000 <= System.currentTimeMillis() - j) {
            z = true;
        }
        C06090Tz A00 = C06090Tz.A00(C06090Tz.A04);
        A00.A03 = true;
        C14360o3.A0A(A00);
        int A01 = (int) C1AD.A01(A00, 18597307176196406L);
        boolean z2 = false;
        if (i < A01) {
            z2 = true;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    public static final boolean A00() {
        if (AbstractC54472f1.A04(18315832199561978L, false)) {
            if (AbstractC54472f1.A04(18315832199627515L, false) || AbstractC54472f1.A04(18315832199693052L, false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A01(int i, long j) {
        C06090Tz c06090Tz = C06090Tz.A04;
        C06090Tz A00 = C06090Tz.A00(c06090Tz);
        A00.A03 = true;
        C14360o3.A0A(A00);
        int A01 = (int) C1AD.A01(A00, 18597307176196406L);
        long currentTimeMillis = System.currentTimeMillis();
        C06090Tz A002 = C06090Tz.A00(c06090Tz);
        A002.A03 = true;
        C14360o3.A0A(A002);
        long A012 = C1AD.A01(A002, 18583408665496555L);
        boolean z = false;
        if (A012 <= currentTimeMillis - j) {
            z = true;
        }
        if (i < A01 && z) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (AbstractC54472f1.A04(18315832199365368L, false)) {
            CallerContext callerContext = C105894q0.A00;
            if (AbstractC49092Nc.A00(userSession).A01(C105894q0.A00, "fx_company_identity_switcher_linking_cache") != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (AbstractC54472f1.A04(18315832199430905L, false)) {
            CallerContext callerContext = C105894q0.A00;
            C2Ne A00 = AbstractC49092Nc.A00(userSession);
            if (!A00.A00.A03(C105894q0.A00, "fx_company_identity_switcher_linking_cache", "INSTAGRAM").isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
