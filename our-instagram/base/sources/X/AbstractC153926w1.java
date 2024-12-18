package X;

import com.instagram.common.session.UserSession;
import com.instagram.trials.impl.TrialsPreferencesImpl;

/* renamed from: X.6w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153926w1 {
    public static final TrialsPreferencesImpl A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return new TrialsPreferencesImpl(userSession);
    }

    public static final C153936w2 A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str, 2);
        return new C153936w2(interfaceC11380iw, userSession, str);
    }
}
