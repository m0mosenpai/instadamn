package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.1DW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DW {
    public static final C1DX A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C1DX) userSession.A01(C1DX.class, new C207019Eg(userSession, 12));
    }

    public final C38321qM A02(UserSession userSession, String str, String str2) {
        if (userSession != null && str2 != null) {
            for (Map.Entry entry : A00(userSession).A01.entrySet()) {
                entry.getKey();
                C38321qM c38321qM = (C38321qM) entry.getValue();
                if (C14360o3.A0K(c38321qM.A2u(), str2)) {
                    return c38321qM;
                }
            }
            C0w9.A03(str, AnonymousClass001.A0R("MediaCache does not include the media for normalized media id = ", str2));
        }
        return null;
    }

    @Deprecated(message = "We originally introduced this in Feed to assist with decoupling View-layer code\n        from Media. The pattern was to call this function in UI callbacks where the Media was\n        needed. This introduced functional reliability bugs in cases where the Media was evicted\n        from the cache. Feed UI callbacks should now use MVVM Actions (i.e. calls from the View to\n        the ViewModel). More generally, do not \" fail silently\" or show a bug to the user if the\n        Media has been evicted from the cache (you'll likely want to hold your own reference to the\n        Media if possible)")
    public final C38321qM A01(UserSession userSession, String str, String str2) {
        if (userSession != null && str2 != null) {
            C38321qM A02 = A00(userSession).A02(str2);
            if (A02 == null) {
                C0w9.A03(str, AnonymousClass001.A0R("MediaCache does not include the media for media id = ", str2));
            }
            return A02;
        }
        return null;
    }
}
