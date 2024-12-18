package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.MHm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50257MHm extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50257MHm(long j, int i) {
        super(1);
        this.A01 = j;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
        long j = this.A01;
        int i = this.A00;
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus");
        if (!A0C.ELJ(new C48178LUc(A00, i, 0, j, mailboxFeature, A0D))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus");
        }
        PlatformLogger.platformEventLog(5);
        return C0eB.A00;
    }
}
