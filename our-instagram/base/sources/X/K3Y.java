package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class K3Y extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.66C
    };

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, C46101Kb1 c46101Kb1, String str, List list, List list2, boolean z) {
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(this);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        int A002 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "loadMessagesByOTIDs");
        if (mailboxCallback != null) {
            A0D.Ecq(mailboxCallback);
        }
        if (!A0H.ELJ(new C48195LUt(this, A0D, c46101Kb1, str, list, list2, A002, z))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "loadMessagesByOTIDs");
        }
        PlatformLogger.platformEventLog(5);
        return A0D;
    }
}
