package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Doz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31277Doz {
    public static final JTa A02(UserSession userSession, L1W l1w, Class cls) {
        return A04(userSession, l1w, cls, null, null, false);
    }

    public static final JTa A03(UserSession userSession, L1W l1w, Class cls, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        C14360o3.A0B(userSession, 0);
        boolean A00 = C31276Doy.A00(userSession, C31276Doy.A01, cls);
        if (str4 == null) {
            str4 = AbstractC68470VSb.A00();
        }
        return new JTa(l1w, null, str4, str2, null, str, A00, z, z2, false, false);
    }

    public static final JTa A04(UserSession userSession, L1W l1w, Class cls, String str, String str2, boolean z) {
        String str3 = str2;
        C14360o3.A0B(userSession, 0);
        boolean A00 = C31276Doy.A00(userSession, C31276Doy.A01, cls);
        if (str2 == null) {
            str3 = AbstractC68470VSb.A00();
        }
        return new JTa(l1w, null, str3, str, null, "", A00, z, false, false, false);
    }

    public static final JTa A05(UserSession userSession, L1W l1w, Class cls, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        return new JTa(l1w, null, AbstractC68470VSb.A00(), str, null, "", C31276Doy.A00(userSession, C31276Doy.A01, cls), z, false, false, false);
    }

    public static final JTa A06(UserSession userSession, L1W l1w, Class cls, String str, boolean z, boolean z2) {
        return A03(userSession, l1w, cls, null, str, null, z, z2);
    }

    public static final JTa A07(UserSession userSession, Class cls) {
        C14360o3.A0B(userSession, 0);
        return new JTa(null, null, AbstractC68470VSb.A00(), null, null, "", C31276Doy.A00(userSession, C31276Doy.A01, cls), false, false, false, false);
    }

    public static final JTa A00(UserSession userSession, L1W l1w) {
        return new JTa(l1w, null, AbstractC68470VSb.A00(), null, null, "", C31276Doy.A00(userSession, C31276Doy.A01, C34531jr.class), false, false, false, false);
    }

    public static final JTa A01(UserSession userSession, L1W l1w, Boolean bool, Class cls, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        C14360o3.A0B(userSession, 0);
        boolean A00 = C31276Doy.A00(userSession, C31276Doy.A01, cls);
        if (str3 == null) {
            str4 = AbstractC68470VSb.A00();
        }
        return new JTa(l1w, bool, str4, str2, null, str, A00, z, z2, false, false);
    }

    public static final JTa A08(UserSession userSession, Class cls) {
        return A07(userSession, cls);
    }

    public static JTa A09(UserSession userSession, Class cls, int i) {
        JTa A08 = A08(userSession, cls);
        C14360o3.A0B(A08, i);
        return A08;
    }
}
