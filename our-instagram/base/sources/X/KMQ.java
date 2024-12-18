package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* loaded from: classes8.dex */
public final class KMQ extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C9AW A01;
    public final /* synthetic */ C9AU A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMQ(UserSession userSession, C9AW c9aw, C9AU c9au, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, String str) {
        super(542353022, 3, false, false);
        this.A03 = msysMailboxSessionManagerImpl;
        this.A02 = c9au;
        this.A01 = c9aw;
        this.A00 = userSession;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.logMemLoginEvent(this.A02, this.A01, "Attempting msys mailbox init after MEM login");
        UserSession userSession = this.A00;
        String str = this.A04;
        C1334460n.A01(userSession, str).A02(str);
    }
}
