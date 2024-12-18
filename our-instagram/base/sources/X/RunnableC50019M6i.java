package X;

import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.M6i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50019M6i implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C9AW A01;
    public final /* synthetic */ C9AU A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ String A04;

    public RunnableC50019M6i(UserSession userSession, C9AW c9aw, C9AU c9au, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, String str) {
        this.A00 = userSession;
        this.A03 = msysMailboxSessionManagerImpl;
        this.A02 = c9au;
        this.A01 = c9aw;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ACTRegistrationDeviceIdProvider.initialize(AbstractC12290kX.A00);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        ((C48521LdJ) userSession.A01(C48521LdJ.class, MHS.A00(userSession, 28))).A00(new MIO(this.A01, this.A03, userSession, this.A02, this.A04, 14));
    }
}
