package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LIu {
    public final void A02(UserSession userSession, int i, long j) {
        if (i <= 0) {
            A01(userSession).A02(j);
            return;
        }
        K3a A01 = A01(userSession);
        long millis = TimeUnit.SECONDS.toMillis(i);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A01, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A012 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamTransportHybridThreadMuteUntil");
        if (!A0C.ELJ(new C48180LUe(A0D, A01, A00, 0, j, millis))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A012, "MailboxTam", "runTamTransportHybridThreadMuteUntil");
        }
        PlatformLogger.platformEventLog(5);
        C14360o3.A0A(A0D);
    }

    public final void A03(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        K3a A01 = A01(userSession);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A01, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A012 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientThreadBannerDismiss");
        if (!A0C.ELJ(new LVJ(A0D, A01, A00, 14, j))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A012, "MailboxTam", "runTamClientThreadBannerDismiss");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A04(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        K3a A01 = A01(userSession);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A01, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A012 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientThreadBannerRecordImpression");
        if (!A0C.ELJ(new LVJ(A0D, A01, A00, 13, j))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A012, "MailboxTam", "runTamClientThreadBannerRecordImpression");
        }
        PlatformLogger.platformEventLog(5);
    }

    public static MailboxFutureImpl A00(UserSession userSession, String str, String str2) {
        return A01(userSession).A00(str, str2);
    }

    public static final K3a A01(UserSession userSession) {
        return ((LEB) AbstractC41851wZ.A00(userSession).A01(LEB.class, MHJ.A00(userSession, 17))).A00;
    }
}
