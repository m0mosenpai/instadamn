package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.LaF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48339LaF implements C6D2 {
    public final /* synthetic */ MsysThreadId A00;

    public /* synthetic */ C48339LaF(MsysThreadId msysThreadId) {
        this.A00 = msysThreadId;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        final MsysThreadId msysThreadId = this.A00;
        final C1345666g c1345666g = (C1345666g) obj;
        C137766Ly c137766Ly = C137766Ly.A0L;
        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lbq
            @Override // X.InterfaceC1345866i
            public final void EpD(C1346766r c1346766r) {
                C1345666g c1345666g2 = C1345666g.this;
                MsysThreadId msysThreadId2 = msysThreadId;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                long j = msysThreadId2.A00;
                C35856FsW c35856FsW = new C35856FsW(c1346766r, 3);
                InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                int A00 = AbstractC1346866s.A00(A0D);
                TraceInfo A0F = AbstractC43592JPx.A0F(c35856FsW, A0D, "MailboxInstagramSecureMessage", "loadInstagramSecureThreadModel");
                if (!ASj.ELJ(new LVJ(c1345666g2, A0D, A00, 4, j))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A00);
                    AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "loadInstagramSecureThreadModel");
                }
                PlatformLogger.platformEventLog(5);
            }
        }, AbstractC137146It.A00("load_secure_threadmodel"));
    }
}
