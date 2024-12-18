package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: classes8.dex */
public final class K3a extends MailboxFeature {
    public static AbstractC1345065z A00 = new C45299K3c(10);

    public final MailboxFutureImpl A00(String str, String str2) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
        AbstractC25231BEo.A1C(ASj, new LUT(this, A0D, str, str2, 1), A0D);
        return A0D;
    }

    public final void A01(long j) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
        int A002 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientThreadMarkUnread");
        if (!ASj.ELJ(new LVJ(A0D, this, A002, 16, j))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxTam", "runTamClientThreadMarkUnread");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A02(long j) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
        int A002 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamTransportHybridThreadMuteIndefinitely");
        if (!ASj.ELJ(new LVJ(A0D, this, A002, 17, j))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxTam", "runTamTransportHybridThreadMuteIndefinitely");
        }
        PlatformLogger.platformEventLog(5);
    }
}
