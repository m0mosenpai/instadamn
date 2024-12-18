package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: classes8.dex */
public final class MI4 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.699] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            MailboxFeature mailboxFeature = (MailboxFeature) obj;
            C14360o3.A0B(mailboxFeature, 0);
            C2ED c2ed = (C2ED) this.A03;
            String obj2 = c2ed.C7O().toString();
            Long valueOf = Long.valueOf(this.A02);
            Long valueOf2 = Long.valueOf(this.A01);
            JRS A00 = JRS.A00(c2ed, 25);
            InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
            int A002 = AbstractC1346866s.A00(A0D);
            TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramReverb", "deleteSeenShhMessages");
            if (!ASj.ELJ(new C48189LUn(A0D, valueOf, mailboxFeature, valueOf2, obj2, A002, 2))) {
                A0D.cancel(false);
                AbstractC1346866s.A02(A002);
                AbstractC1346866s.A03(A0F, "MailboxInstagramReverb", "deleteSeenShhMessages");
            }
            PlatformLogger.platformEventLog(5);
            return C0eB.A00;
        }
        C137576Ld c137576Ld = (C137576Ld) obj;
        C14360o3.A0B(c137576Ld, 0);
        DRU dru = new DRU(new X67(20, C6L6.A00(AbstractC16960so.A1Q(AbstractC25225BEi.A0S(this.A02), AbstractC25225BEi.A0S(this.A01)), 0L, 9187343241974906880L), this.A03), 25);
        ?? obj3 = new Object();
        obj3.A00 = dru;
        c137576Ld.A01 = obj3;
        return obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI4(Object obj, long j, int i, long j2) {
        super(1);
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = obj;
    }
}
