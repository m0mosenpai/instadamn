package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.MHw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50267MHw extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50267MHw(long j, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = z;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.msys.mca.MailboxFeature, X.66g] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            return C42221xC.A07(new C48445Lby((C133255zr) obj, this.A01, this.A02), AbstractC137146It.A00("setSupportsE2EESpamdStorage"));
        }
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        ?? mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
        long j = this.A01;
        boolean z = this.A02;
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus");
        if (!A0C.ELJ(new LUM(mailboxFeature, A0D, A00, j, z))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus");
        }
        PlatformLogger.platformEventLog(5);
        return C0eB.A00;
    }
}
