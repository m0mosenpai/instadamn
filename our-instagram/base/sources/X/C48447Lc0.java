package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.Lc0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48447Lc0 implements InterfaceC1345866i {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C48447Lc0(C1345666g c1345666g, List list, int i, long j) {
        this.A00 = i;
        this.A02 = c1345666g;
        this.A01 = j;
        this.A03 = list;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        boolean z;
        InterfaceExecutorC135866Co ASj;
        MailboxFutureImpl A0D;
        String str;
        String str2;
        int A00;
        TraceInfo A0F;
        C48179LUd c48179LUd;
        int i = this.A00;
        C1345666g c1345666g = (C1345666g) this.A02;
        if (i != 0) {
            long j = this.A01;
            List list = (List) this.A03;
            C35856FsW c35856FsW = new C35856FsW(c1346766r, 8);
            z = false;
            ASj = c1345666g.mMailboxApiHandleMetaProvider.ASj(0);
            A0D = AbstractC43592JPx.A0D(ASj);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramSecureParticipantsAdd";
            A00 = AbstractC1346866s.A00(A0D);
            A0F = AbstractC43592JPx.A0F(c35856FsW, A0D, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsAdd");
            c48179LUd = new C48179LUd(c1345666g, A0D, list, A00, 0, j);
        } else {
            long j2 = this.A01;
            List list2 = (List) this.A03;
            C48169LTt c48169LTt = new C48169LTt(c1346766r);
            z = false;
            ASj = c1345666g.mMailboxApiHandleMetaProvider.ASj(0);
            A0D = AbstractC43592JPx.A0D(ASj);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramSecureParticipantsRemove";
            A00 = AbstractC1346866s.A00(A0D);
            A0F = AbstractC43592JPx.A0F(c48169LTt, A0D, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsRemove");
            c48179LUd = new C48179LUd(c1345666g, A0D, list2, A00, 1, j2);
        }
        if (!ASj.ELJ(c48179LUd)) {
            A0D.cancel(z);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A0F, str, str2);
        }
        PlatformLogger.platformEventLog(5);
    }
}
