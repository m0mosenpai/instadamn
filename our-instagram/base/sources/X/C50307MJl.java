package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.MJl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50307MJl extends C0YY implements InterfaceC16660sJ {
    public static final C50307MJl A00 = new C50307MJl();

    public C50307MJl() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MailboxFeature mailboxFeature = (MailboxFeature) obj;
        C14360o3.A0B(mailboxFeature, 0);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        int A002 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "purgeDeletedMessages");
        if (!A0H.ELJ(new JRT(A002, 1, mailboxFeature, A0D))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "purgeDeletedMessages");
        }
        PlatformLogger.platformEventLog(5);
        return A0D;
    }
}
