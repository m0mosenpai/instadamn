package X;

import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.AzU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24869AzU implements Runnable {
    public final /* synthetic */ C41871wb A00;
    public final /* synthetic */ C47142Eg A01;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;

    public RunnableC24869AzU(C41871wb c41871wb, C47142Eg c47142Eg, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A00 = c41871wb;
        this.A03 = interfaceC16820sZ;
        this.A02 = msysMailboxSessionManagerImpl;
        this.A04 = z;
        this.A01 = c47142Eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41871wb c41871wb = this.A00;
        if (!c41871wb.A05(C1334460n.class) && !c41871wb.A05(LG5.class)) {
            this.A03.invoke();
        } else if (c41871wb.A05(LG5.class)) {
            MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = this.A02;
            msysMailboxSessionManagerImpl.teardownMessageSyncService(msysMailboxSessionManagerImpl.userSession, this.A04, AbstractC166987dD.A0N(this.A01.A1A.A00()), new RunnableC24452AsX(this.A03));
        } else {
            MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl2 = this.A02;
            msysMailboxSessionManagerImpl2.teardownMailbox(msysMailboxSessionManagerImpl2.userSession, this.A04, AbstractC166987dD.A0N(this.A01.A1A.A00()), new RunnableC24453AsY(this.A03));
        }
    }
}
