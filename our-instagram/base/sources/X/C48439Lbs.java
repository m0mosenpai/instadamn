package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lbs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48439Lbs implements InterfaceC1345866i {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C48439Lbs(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
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
        MailboxCallback lun;
        switch (this.A00) {
            case 0:
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                long j = this.A01;
                C137766Ly c137766Ly = C137766Ly.A0L;
                C35856FsW c35856FsW = new C35856FsW(c1346766r, 7);
                z = false;
                ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str = "MailboxInstagramSecureMessage";
                str2 = "loadInstagramVisualMessageActionStatus";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(c35856FsW, A0D, "MailboxInstagramSecureMessage", "loadInstagramVisualMessageActionStatus");
                lun = new LUN(A00, 0, j, mailboxFeature, A0D);
                break;
            case 1:
                K3a k3a = (K3a) this.A02;
                long j2 = this.A01;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                C35856FsW c35856FsW2 = new C35856FsW(c1346766r, 2);
                z = false;
                ASj = k3a.mMailboxApiHandleMetaProvider.ASj(0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str = "MailboxTam";
                str2 = "fetchMessageDataForExternalForward";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(c35856FsW2, A0D, "MailboxTam", "fetchMessageDataForExternalForward");
                lun = new LVJ(A0D, k3a, A00, 21, j2);
                break;
            default:
                MailboxFeature mailboxFeature2 = (MailboxFeature) this.A02;
                long j3 = this.A01;
                C48169LTt c48169LTt = new C48169LTt(c1346766r);
                z = false;
                ASj = mailboxFeature2.mMailboxApiHandleMetaProvider.ASj(0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str = "MailboxTam";
                str2 = "runTamClientVisualMessageScreenshotted";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(c48169LTt, A0D, "MailboxTam", "runTamClientVisualMessageScreenshotted");
                lun = new LUN(A00, 2, j3, mailboxFeature2, A0D);
                break;
        }
        if (!ASj.ELJ(lun)) {
            A0D.cancel(z);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A0F, str, str2);
        }
        PlatformLogger.platformEventLog(5);
    }
}
