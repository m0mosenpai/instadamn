package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes8.dex */
public final class LVO implements NotificationCenterInternal.NotificationCallbackInternal, C6Eh {
    public final int A00;
    public final Object A01;

    public LVO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        LJd lJd;
        Runnable runnable;
        C69613Av c69613Av;
        switch (this.A00) {
            case 0:
                lJd = (LJd) this.A01;
                lJd.A06 = true;
                if (lJd.A0J.get()) {
                    return;
                }
                LJd.A02(lJd, "EncryptedBackupsCompleted");
                runnable = lJd.A05;
                if (runnable == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
            case 1:
                lJd = (LJd) this.A01;
                lJd.A08 = true;
                if (lJd.A0J.get() || map == null || !map.containsKey(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY) || map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY) == null) {
                    return;
                }
                int parseInt = Integer.parseInt(String.valueOf(map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY)));
                lJd.A00 = parseInt;
                if (parseInt == 0) {
                    lJd.A06 = true;
                }
                LJd.A02(lJd, "MemOfflineCompleted");
                LJd.A00(lJd, null, Integer.valueOf(lJd.A00), "MessagesCount", null);
                runnable = lJd.A05;
                if (runnable == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
            case 2:
                if (!C14360o3.A0K(str, "MEMOfflineHandlingCompletionNotification") || (c69613Av = AbstractC43593JPy.A0c((JR2) this.A01).A08) == null) {
                    return;
                }
                c69613Av.A03();
                return;
            case 3:
                C1351969u c1351969u = ((C49201LpI) this.A01).A00;
                if (c1351969u == null) {
                    C14360o3.A0F(DexStore.DEPS_FILENAME);
                    throw C00O.createAndThrow();
                }
                AbstractC46868KoB.A00(c1351969u.A01);
                return;
            case 4:
                C49593Lvm c49593Lvm = (C49593Lvm) this.A01;
                c49593Lvm.A0B = true;
                UserSession userSession = c49593Lvm.A03;
                if (userSession == null || userSession.hasEnded() || c49593Lvm.A0Q.get()) {
                    return;
                }
                C49593Lvm.A05(c49593Lvm, "EncryptedBackupsCompleted");
                if (c49593Lvm.A0A) {
                    return;
                }
                InterfaceC03960Jm interfaceC03960Jm = c49593Lvm.A05;
                if (interfaceC03960Jm != null) {
                    C49593Lvm.A02(c49593Lvm, interfaceC03960Jm, "SyncCompletion");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 5:
                Execution.executeAsync(new K4U((C49593Lvm) this.A01, map), null, 1);
                return;
            case 6:
                C49593Lvm c49593Lvm2 = (C49593Lvm) this.A01;
                c49593Lvm2.A0D = true;
                UserSession userSession2 = c49593Lvm2.A03;
                if (userSession2 == null || userSession2.hasEnded() || c49593Lvm2.A0Q.get()) {
                    return;
                }
                C49593Lvm.A05(c49593Lvm2, "MemOfflineCompleted");
                if (map == null || !map.containsKey("MEMOfflineHandlingCompletionNotificationUserIDKey") || map.get("MEMOfflineHandlingCompletionNotificationUserIDKey") == null || !map.containsKey(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY) || map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY) == null) {
                    return;
                }
                long parseLong = Long.parseLong(String.valueOf(map.get("MEMOfflineHandlingCompletionNotificationUserIDKey")));
                UserSession userSession3 = c49593Lvm2.A03;
                if (userSession3 != null) {
                    Long BTC = AbstractC166997dE.A0Y(userSession3).BTC();
                    if (BTC == null || parseLong != BTC.longValue()) {
                        return;
                    }
                    int parseInt2 = Integer.parseInt(String.valueOf(map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY)));
                    c49593Lvm2.A00 = parseInt2;
                    C2FQ c2fq = c49593Lvm2.A04;
                    if (c2fq != null) {
                        c2fq.A06("message_count", String.valueOf(parseInt2));
                    }
                    C2FQ c2fq2 = c49593Lvm2.A04;
                    if (c2fq2 != null) {
                        c2fq2.A03(c49593Lvm2.A00);
                    }
                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = c49593Lvm2.A06;
                    if (iGFOAMessagingReadyLogger != null) {
                        iGFOAMessagingReadyLogger.onOfflineCompletion(c49593Lvm2.A00);
                    }
                    int i = c49593Lvm2.A00;
                    if (i == 0) {
                        c49593Lvm2.A0B = true;
                    }
                    C49593Lvm.A04(c49593Lvm2, null, Integer.valueOf(i), "MessagesCount", null);
                    boolean z = c49593Lvm2.A0A;
                    InterfaceC03960Jm interfaceC03960Jm2 = c49593Lvm2.A05;
                    if (z) {
                        if (interfaceC03960Jm2 != null) {
                            C49593Lvm.A03(c49593Lvm2, interfaceC03960Jm2, "SyncCompletion");
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    if (interfaceC03960Jm2 != null) {
                        C49593Lvm.A02(c49593Lvm2, interfaceC03960Jm2, "SyncCompletion");
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 7:
                java.util.Set set = ((C48523LdL) this.A01).A02;
                set.clear();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((CompletableFuture) it.next()).complete(AbstractC166997dE.A0b());
                }
                return;
            default:
                ((C48523LdL) this.A01).A02.add(new CompletableFuture());
                return;
        }
        LJd.A01(lJd, runnable, "SyncCompletion");
    }
}
