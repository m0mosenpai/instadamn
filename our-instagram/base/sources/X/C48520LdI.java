package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.LdI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48520LdI implements InterfaceC13000lm, CallerContextable {
    public static final String __redex_internal_original_name = "FxIg4aStoryViewerAcUpsellLauncher";
    public final UserSession A00;

    public C48520LdI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C48520LdI.class);
    }
}
