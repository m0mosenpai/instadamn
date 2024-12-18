package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class M5P implements Runnable {
    public final /* synthetic */ AnonymousClass983 A00;
    public final /* synthetic */ MsysThreadId A01;
    public final /* synthetic */ boolean A02;

    public M5P(AnonymousClass983 anonymousClass983, MsysThreadId msysThreadId, boolean z) {
        this.A00 = anonymousClass983;
        this.A01 = msysThreadId;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int A00;
        TraceInfo A01;
        int i;
        UserSession userSession = this.A00.A10;
        long j = this.A01.A00;
        boolean z = this.A02;
        K3a A012 = LIu.A01(userSession);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A012, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        if (z) {
            str = "runTamClientTypingIndicatorStart";
            A00 = AbstractC1346866s.A00(A0D);
            A01 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientTypingIndicatorStart");
            i = 8;
        } else {
            str = "runTamClientTypingIndicatorStop";
            A00 = AbstractC1346866s.A00(A0D);
            A01 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientTypingIndicatorStop");
            i = 9;
        }
        if (!A0C.ELJ(new LVJ(A0D, A012, A00, i, j))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxTam", str);
        }
        PlatformLogger.platformEventLog(5);
    }
}
