package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;

/* renamed from: X.29z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C461529z {
    public static final C461529z A00 = new Object();
    public static final java.util.Set A01 = new HashSet();

    public static final long A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        ArrayList A04 = C123815iv.A00.A04(userSession);
        int size = A04.size() - 1;
        if (A04.isEmpty()) {
            return 0L;
        }
        return ((Number) A04.get(size)).longValue();
    }

    public static final ArrayList A04(boolean z, boolean z2) {
        int[] A0C = A0C(true, z, z2);
        ArrayList arrayList = new ArrayList(7);
        int i = 0;
        do {
            arrayList.add(Double.valueOf(A0C[i]));
            i++;
        } while (i < 7);
        return AbstractC001800i.A0U(arrayList);
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        HashMap hashMap = new HashMap();
        C913045j c913045j = C913045j.A00;
        C54s c54s = new C54s(c913045j);
        c54s.A0E("timezone_offset_seconds_from_gmt", C23831Eq.A00());
        C54s c54s2 = new C54s(c913045j);
        c54s2.A0C(c54s, "server_params");
        hashMap.put("params", c54s2.toString());
        C72743Nv A02 = W6d.A02(new IgBloksScreenConfig(userSession), C66277U6x.A01("com.bloks.www.yp.familycenter.time_limit_extension_request", hashMap));
        if (fragmentActivity != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            c140966Yy.A0C = "extension_request_fragment";
            c140966Yy.A0D(A02);
            c140966Yy.A0A = "fully_blocking_fragment_backstack";
            c140966Yy.A04();
            C14360o3.A0B(A02, 0);
            A01.add(A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.booleanValue() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.17P r0 = r0.A03
            X.16s r0 = r0.C45()
            r4 = 1
            if (r0 == 0) goto L22
            java.lang.Boolean r0 = r0.CSI()
            if (r0 == 0) goto L22
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L23
        L22:
            r3 = 0
        L23:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342168682962105606(0x20810e0200003506, double:4.070396737599893E-152)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L33
            if (r3 != 0) goto L33
            return r4
        L33:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461529z.A07(com.instagram.common.session.UserSession):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.booleanValue() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.17P r0 = r0.A03
            X.16s r0 = r0.C45()
            r4 = 1
            if (r0 == 0) goto L22
            java.lang.Boolean r0 = r0.CSI()
            if (r0 == 0) goto L22
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L23
        L22:
            r3 = 0
        L23:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342168682962105606(0x20810e0200003506, double:4.070396737599893E-152)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L33
            if (r3 == 0) goto L33
            return r4
        L33:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461529z.A08(com.instagram.common.session.UserSession):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.booleanValue() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A09(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.17P r0 = r0.A03
            X.16s r0 = r0.C45()
            r4 = 1
            if (r0 == 0) goto L22
            java.lang.Boolean r0 = r0.CbU()
            if (r0 == 0) goto L22
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L23
        L22:
            r3 = 0
        L23:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342168682962105606(0x20810e0200003506, double:4.070396737599893E-152)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L33
            if (r3 == 0) goto L33
            return r4
        L33:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461529z.A09(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A0A(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 2342168682962105606L);
    }

    public static final boolean A0B(UserSession userSession) {
        Boolean Ce0;
        C14360o3.A0B(userSession, 0);
        InterfaceC223716s C45 = C08730cb.A00(userSession).A00().A03.C45();
        if (C45 == null || C45.Ce0() == null || (Ce0 = C45.Ce0()) == null || !Ce0.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final int[] A0C(boolean z, boolean z2, boolean z3) {
        long j;
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        TimeZone timeZone = TimeZone.getDefault();
        Calendar calendar = Calendar.getInstance(timeZone);
        int offset = timeZone.getOffset(calendar.getTimeInMillis());
        if (z3) {
            j = TimeZone.getTimeZone("America/Los_Angeles").getOffset(calendar.getTimeInMillis()) - offset;
        } else {
            j = offset;
        }
        long j2 = j / 1000;
        try {
            if (z2) {
                C2A3 c2a3 = (C2A3) C2A1.A01.A00.get();
                if (c2a3 != null) {
                    synchronized (c2a3) {
                        timeInAppControllerWrapper = c2a3.A00;
                    }
                    if (timeInAppControllerWrapper != null) {
                        iArr2 = timeInAppControllerWrapper.getDailyTimeInAppUtc(0L, j2);
                    } else {
                        iArr2 = new int[0];
                    }
                } else {
                    iArr2 = new int[0];
                }
            } else {
                iArr2 = C2A1.A01.A03(0L);
            }
        } catch (Throwable unused) {
            C0w9.A03("TimeInApp", "Failed to fetch DailyTimeInApp");
        }
        if (z) {
            int i = 1;
            while (true) {
                int length = iArr2.length;
                if (i > length || i > 7) {
                    break;
                }
                iArr[7 - i] = iArr2[length - i];
                i++;
            }
        }
        return iArr;
    }

    public static final long A00() {
        try {
            int[] A03 = C2A1.A01.A03(A01());
            C14360o3.A07(A03);
            if (A03.length != 0) {
                return A03[r1 - 1];
            }
            return 0L;
        } catch (Throwable unused) {
            C0w9.A03("TimeInApp", "Failed to fetch daily usage");
            return 0L;
        }
    }

    public static final String A03() {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        try {
            C2A3 c2a3 = (C2A3) C2A1.A01.A00.get();
            if (c2a3 != null) {
                synchronized (c2a3) {
                    timeInAppControllerWrapper = c2a3.A00;
                }
                if (timeInAppControllerWrapper != null) {
                    return timeInAppControllerWrapper.getCurrentState();
                }
                return "no_state";
            }
            return "unknown_state";
        } catch (Throwable unused) {
            return "exception";
        }
    }

    public static final void A05() {
        for (Fragment fragment : A01) {
            if (fragment.isVisible()) {
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    activity.finish();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public static final long A01() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 1000;
    }
}
