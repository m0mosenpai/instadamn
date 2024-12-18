package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.AzV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24870AzV implements Runnable {
    public final /* synthetic */ C41871wb A00;
    public final /* synthetic */ C47142Eg A01;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;

    public RunnableC24870AzV(C41871wb c41871wb, C47142Eg c47142Eg, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A02 = msysMailboxSessionManagerImpl;
        this.A01 = c47142Eg;
        this.A00 = c41871wb;
        this.A03 = interfaceC16820sZ;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = this.A02;
        UserSession userSession = msysMailboxSessionManagerImpl.userSession;
        C47142Eg c47142Eg = this.A01;
        msysMailboxSessionManagerImpl.teardownMessageProcessor(userSession, AbstractC166987dD.A0N(c47142Eg.A1B.A00()), new RunnableC24869AzU(this.A00, c47142Eg, msysMailboxSessionManagerImpl, this.A03, this.A04));
    }
}
