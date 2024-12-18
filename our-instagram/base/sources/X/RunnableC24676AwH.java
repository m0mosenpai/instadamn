package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.AwH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24676AwH implements Runnable {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC24676AwH(Mailbox mailbox, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = mailbox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        AbstractC1345065z abstractC1345065z = K3W.A00;
        interfaceC16660sJ.invoke(new MailboxFeature(new C137266Jf(this.A00)));
    }
}
