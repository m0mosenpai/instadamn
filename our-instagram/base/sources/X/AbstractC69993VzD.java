package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VzD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69993VzD {
    public static final VgT A00(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return (VgT) userSession.A01(VgT.class, new C50168MDv(43, userSession, z));
    }

    public static final WEz A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC65855TvH enumC65855TvH, VG2 vg2, String str) {
        C14360o3.A0B(userSession, 0);
        JQ0.A1O(activity, interfaceC11380iw, str, enumC65855TvH, vg2);
        return new WEz(activity, interfaceC11380iw, userSession, enumC65855TvH, vg2, str, false);
    }
}
