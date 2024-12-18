package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LCI {
    public static final MailboxFutureImpl A00(C1345666g c1345666g, UserSession userSession, MsysThreadSubtype msysThreadSubtype, String str, List list, InterfaceC16660sJ interfaceC16660sJ) {
        boolean z;
        JVL jvl;
        boolean A1R = AbstractC167007dF.A1R(0, c1345666g, userSession);
        boolean A1Q = AbstractC167007dF.A1Q(list.size(), 2);
        int i = msysThreadSubtype.A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MsysPendingRecipient msysPendingRecipient = (MsysPendingRecipient) it.next();
            A0q.add(AbstractC06930Yk.A06(AbstractC166987dD.A1L("MCAMailboxInstagramSecureMessageParticipantEimuKey", Long.valueOf(msysPendingRecipient.A01)), AbstractC166987dD.A1L("MCAMailboxInstagramSecureMessageParticipantIgIdKey", msysPendingRecipient.A07), AbstractC166987dD.A1L("MCAMailboxInstagramSecureMessageParticipantFollowStatusKey", 0), AbstractC166987dD.A1L("MCAMailboxInstagramSecureMessageParticipantVerificationStatusKey", Integer.valueOf(msysPendingRecipient.A0H ? 1 : 0)), AbstractC166987dD.A1L("MCAMailboxInstagramSecureMessageParticipantNameKey", msysPendingRecipient.A09)));
        }
        if (i == A1R || (i == 4 ? !AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(userSession).A0F) : i == 5 || i == 3)) {
            z = false;
        } else {
            z = true;
        }
        if (interfaceC16660sJ != null) {
            jvl = new JVL(7, interfaceC16660sJ);
        } else {
            jvl = null;
        }
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1345666g, 2);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramSecureMessage", "createOptimisticThread");
        LoggingOption loggingOption = new LoggingOption(null, A01, null, null, null, null, false, null);
        A0D.addResultCallback(new C127605pk(new LoggingOption[]{loggingOption}));
        if (jvl != null) {
            A0D.Ecq(jvl);
        }
        if (!A0C.ELJ(new LV0(c1345666g, A0D, loggingOption, str, A0q, A00, i, A1Q, z))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "createOptimisticThread");
        }
        PlatformLogger.platformEventLog(5);
        return A0D;
    }

    public static final ListenableFuture A01(C1345666g c1345666g, UserSession userSession, InterfaceC2056098k interfaceC2056098k) {
        AbstractC167027dH.A12(c1345666g, userSession, interfaceC2056098k);
        if (interfaceC2056098k instanceof MsysThreadId) {
            return new C25191Kx(interfaceC2056098k);
        }
        if (interfaceC2056098k instanceof C23974Ak9) {
            C23974Ak9 c23974Ak9 = (C23974Ak9) interfaceC2056098k;
            return AbstractRunnableC133325zz.A02(new C44289Jhf(new C50256MHl(7), 6), AbstractC133285zv.A00(A00(c1345666g, userSession, c23974Ak9.A01, null, c23974Ak9.A02, null)), C1M8.A01);
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(3682));
    }
}
