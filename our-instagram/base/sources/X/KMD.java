package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KMD extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C28911aU A01;
    public final /* synthetic */ InterfaceC83713oG A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMD(UserSession userSession, C28911aU c28911aU, InterfaceC83713oG interfaceC83713oG) {
        super(2005773668, 4, false, false);
        this.A01 = c28911aU;
        this.A00 = userSession;
        this.A02 = interfaceC83713oG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00;
        C29271b4 c29271b4 = new C29271b4(null, null, null, null, AbstractC31277Doz.A01(userSession, null, null, C29271b4.class, null, null, null, false, false), null, null, AbstractC140956Yx.A01(AbstractC140946Yw.A01(this.A02)), null, null, false, false, false, null, null, null, null, Long.valueOf(AbstractC31177DnL.A05()), null, "empty", NetInfoModule.CONNECTION_TYPE_NONE, null, null, null, null, null, false);
        if (AbstractC159387Cy.A01(userSession, c29271b4).A01()) {
            new C47779L8e(userSession).A00(null, null, c29271b4);
        }
    }
}
