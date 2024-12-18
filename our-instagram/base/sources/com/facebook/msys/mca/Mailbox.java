package com.facebook.msys.mca;

import X.AbstractC135836Cl;
import X.AbstractRunnableC94874Os;
import X.AnonymousClass663;
import X.C0K8;
import X.C137306Jk;
import X.C45300K3d;
import X.C6Eh;
import X.InterfaceC41521w1;
import X.InterfaceExecutorC135866Co;
import X.K4N;
import X.K4O;
import X.K4P;
import X.K4Q;
import X.LVM;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class Mailbox {
    public static final Mailbox $redex_init_class = null;
    public Database mDatabase;
    public final NativeHolder mNativeHolder;
    public final SlimMailbox mSlimMailbox;
    public final Set mStoredProcedureChangedListeners = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C6Eh mDbCommitCallback = new C6Eh() { // from class: X.5pb
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            java.util.Set emptySet;
            Object obj;
            if (map != null) {
                Mailbox mailbox = Mailbox.$redex_init_class;
                if (map.containsKey("MCINotificationKeyChangedStoredProcedures") && (obj = map.get("MCINotificationKeyChangedStoredProcedures")) != null) {
                    emptySet = (java.util.Set) obj;
                } else {
                    emptySet = Collections.emptySet();
                }
                Iterator it = Mailbox.this.mStoredProcedureChangedListeners.iterator();
                while (it.hasNext()) {
                    ((InterfaceC41521w1) it.next()).DpC(emptySet);
                }
            }
        }
    };
    public final C6Eh mDbCommitV2Callback = new C6Eh() { // from class: X.5pc
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            if (map != null) {
                Mailbox mailbox = Mailbox.$redex_init_class;
                if (map.containsKey("MCINotificationKeyChangedStoredProcedures")) {
                    map.get("MCINotificationKeyChangedStoredProcedures");
                }
                Iterator it = Mailbox.this.mStoredProcedureChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    };
    public InterfaceExecutorC135866Co mSynchronousMailboxApiHandleProvider = null;

    public static native boolean deleteDatabaseFilesNative(String str, String str2, int i);

    private native void enableTaskProcessingForNonCriticalTasksNative();

    private native int getAppStateNative();

    private native int getStateNative();

    private native SyncHandler getSyncHandlerNative();

    private native NativeHolder initNativeHolder(MailboxConfig mailboxConfig);

    private native void invalidateNative_TestOnly();

    private native boolean isValidNative();

    /* JADX INFO: Access modifiers changed from: private */
    public native void logoutAndDeleteNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void logoutAndEncryptNative(NotificationScope notificationScope);

    private native void pauseSendSyncRequestsNative(NotificationScope notificationScope);

    private native void resumeSendSyncRequestsNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void scheduleTaskProcessingIfNeededNative();

    /* JADX INFO: Access modifiers changed from: private */
    public native void setStateNative(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownAndDeleteNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownAndEncryptNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void startAllDelayedSyncGroupsNative();

    private native void startDelayedSyncGroupsNative(List list);

    public synchronized AccountSession getAccountSession() {
        return this.mSlimMailbox.mAccountSession;
    }

    public synchronized SlimMailbox getSlimMailbox() {
        return this.mSlimMailbox;
    }

    public native void trimMemory();

    public native void updateAppStateToBackground();

    public native void updateAppStateToForeground();

    private void disableStoredProcedureChangedListeners() {
        this.mStoredProcedureChangedListeners.clear();
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", null);
        getAccountSession().getSessionedNotificationCenter().removeObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", null);
    }

    private NotificationScope getFutureNotificationScope(MailboxFutureImpl mailboxFutureImpl, String str, int i) {
        NotificationScope ED9 = getSlimMailbox().getNotificationCenterCallbackManager().ED9(new LVM(this, mailboxFutureImpl), "MCAMailboxDidShutdownNotification", 1);
        mailboxFutureImpl.setNotification("MCAMailboxDidShutdownNotification", ED9);
        return ED9;
    }

    public void addStoredProcedureChangedListener(InterfaceC41521w1 interfaceC41521w1) {
        if (!this.mStoredProcedureChangedListeners.add(interfaceC41521w1)) {
            C0K8.A0Q("Mailbox", "StoredProcedureChangedListener %s was already registered, when going to add it", interfaceC41521w1);
        }
    }

    public AnonymousClass663 logoutAndDelete() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        InterfaceExecutorC135866Co interfaceExecutorC135866Co = this.mSynchronousMailboxApiHandleProvider;
        if (interfaceExecutorC135866Co == null) {
            interfaceExecutorC135866Co = ((AbstractC135836Cl) new C45300K3d(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = interfaceExecutorC135866Co;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        Execution.executePossiblySync(new K4P(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.AYR
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Mailbox.this.m71lambda$logoutAndDelete$0$comfacebookmsysmcaMailbox(null);
            }
        });
        return mailboxFutureImpl;
    }

    public AnonymousClass663 logoutAndEncrypt() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        InterfaceExecutorC135866Co interfaceExecutorC135866Co = this.mSynchronousMailboxApiHandleProvider;
        if (interfaceExecutorC135866Co == null) {
            interfaceExecutorC135866Co = ((AbstractC135836Cl) new C45300K3d(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = interfaceExecutorC135866Co;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        Execution.executePossiblySync(new K4Q(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.AYU
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Mailbox.this.m72lambda$logoutAndEncrypt$1$comfacebookmsysmcaMailbox(null);
            }
        });
        return mailboxFutureImpl;
    }

    public AnonymousClass663 shutdown() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        InterfaceExecutorC135866Co interfaceExecutorC135866Co = this.mSynchronousMailboxApiHandleProvider;
        if (interfaceExecutorC135866Co == null) {
            interfaceExecutorC135866Co = ((AbstractC135836Cl) new C45300K3d(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = interfaceExecutorC135866Co;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        final NotificationScope futureNotificationScope = getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1);
        Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.9at
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("shutdown");
            }

            @Override // java.lang.Runnable
            public final void run() {
                Mailbox.this.shutdownNative(futureNotificationScope);
            }
        }, getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.AYV
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Mailbox.this.m73lambda$shutdown$2$comfacebookmsysmcaMailbox(null);
            }
        });
        return mailboxFutureImpl;
    }

    public AnonymousClass663 shutdownAndDelete() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        InterfaceExecutorC135866Co interfaceExecutorC135866Co = this.mSynchronousMailboxApiHandleProvider;
        if (interfaceExecutorC135866Co == null) {
            interfaceExecutorC135866Co = ((AbstractC135836Cl) new C45300K3d(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = interfaceExecutorC135866Co;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        Execution.executePossiblySync(new K4N(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.AYT
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Mailbox.this.m74lambda$shutdownAndDelete$3$comfacebookmsysmcaMailbox(null);
            }
        });
        return mailboxFutureImpl;
    }

    public AnonymousClass663 shutdownAndEncrypt() {
        Thread thread = MailboxFutureImpl.UI_THREAD;
        InterfaceExecutorC135866Co interfaceExecutorC135866Co = this.mSynchronousMailboxApiHandleProvider;
        if (interfaceExecutorC135866Co == null) {
            interfaceExecutorC135866Co = ((AbstractC135836Cl) new C45300K3d(this)).A00;
            this.mSynchronousMailboxApiHandleProvider = interfaceExecutorC135866Co;
        }
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        Execution.executePossiblySync(new K4O(this, getFutureNotificationScope(mailboxFutureImpl, "MCAMailboxDidShutdownNotification", 1)), getAccountSession(), 1);
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.AYS
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Mailbox.this.m75lambda$shutdownAndEncrypt$4$comfacebookmsysmcaMailbox(null);
            }
        });
        return mailboxFutureImpl;
    }

    static {
        C137306Jk.A00();
    }

    public Mailbox(SlimMailbox slimMailbox, boolean z, MailboxConfig mailboxConfig) {
        this.mSlimMailbox = slimMailbox;
        this.mNativeHolder = initNativeHolder(mailboxConfig);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitCallback, "MCIDatabaseCommitNotificationV1", 1, null);
        getAccountSession().getSessionedNotificationCenter().addObserver(this.mDbCommitV2Callback, "MCIDatabaseCommitNotificationV2", 6, null);
    }

    public SyncHandler getSyncHandler() {
        return getSyncHandlerNative();
    }

    public boolean isValid() {
        return isValidNative();
    }

    /* renamed from: lambda$logoutAndDelete$0$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m71lambda$logoutAndDelete$0$comfacebookmsysmcaMailbox(Void r1) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$logoutAndEncrypt$1$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m72lambda$logoutAndEncrypt$1$comfacebookmsysmcaMailbox(Void r1) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdown$2$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m73lambda$shutdown$2$comfacebookmsysmcaMailbox(Void r1) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndDelete$3$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m74lambda$shutdownAndDelete$3$comfacebookmsysmcaMailbox(Void r1) {
        disableStoredProcedureChangedListeners();
    }

    /* renamed from: lambda$shutdownAndEncrypt$4$com-facebook-msys-mca-Mailbox, reason: not valid java name */
    public /* synthetic */ void m75lambda$shutdownAndEncrypt$4$comfacebookmsysmcaMailbox(Void r1) {
        disableStoredProcedureChangedListeners();
    }
}
