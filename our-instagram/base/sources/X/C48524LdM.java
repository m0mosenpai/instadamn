package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.LdM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48524LdM implements InterfaceC13050lr {
    public final MSGNotificationEngineValueProvider A00;
    public final UserSession A01;
    public final K38 A02;
    public final C47659L2s A03;
    public MSGNotificationEngineIntegrator integrator;

    public /* synthetic */ C48524LdM(UserSession userSession) {
        MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = new MSGNotificationEngineValueProvider();
        K38 k38 = new K38(userSession);
        C47659L2s c47659L2s = new C47659L2s(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = mSGNotificationEngineValueProvider;
        this.A02 = k38;
        this.A03 = c47659L2s;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.integrator = null;
        }
    }
}
