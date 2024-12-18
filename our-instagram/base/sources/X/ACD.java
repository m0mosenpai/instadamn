package X;

import android.content.Context;
import com.facebook.instagram.msys.InstagramTableToProcedureNameMapRegisterer;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mca.MailboxDatabaseConfig;
import com.facebook.msys.mca.MailboxMessengerMediaSendManagerConfig;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mca.MessageSyncServiceConfig;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.DatabaseFileManager;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.msys.mcs.DasmConfigCreator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class ACD {
    public MessageSyncService A01;
    public final C135806Ci A03;
    public AtomicBoolean A02 = AbstractC166997dE.A17();
    public MailboxCallback A00 = null;

    public final void A00(final MailboxCallback mailboxCallback) {
        Execution.initialize(this.A03.A00.A01.A0C, null);
        Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.9as
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback;
                AbstractC136036Di A00 = AbstractC136036Di.A00(null);
                final ACD acd = ACD.this;
                C135806Ci c135806Ci = acd.A03;
                C6CN c6cn = c135806Ci.A00;
                C1334860s c1334860s = c6cn.A01;
                Context context = c1334860s.A01;
                SlimMailbox A02 = AbstractC137296Ji.A02(c135806Ci);
                String A0R = AnonymousClass001.A0R(c6cn.A09, ".ephemeral");
                if (AbstractC166987dD.A11(A0R).isFile()) {
                    DatabaseFileManager.deleteDatabaseFilesForPathNative(A0R);
                }
                AbstractC137296Ji.A03(c135806Ci, A00, A02);
                AnonymousClass610 anonymousClass610 = c135806Ci.A05;
                if (anonymousClass610.get() != null) {
                    ((InstagramTableToProcedureNameMapRegisterer) anonymousClass610.get()).registerMappings();
                }
                NetworkSession A002 = MsysInfraNoSqliteObjectHolder.A00();
                A002.getClass();
                AccountSession accountSession = c6cn.A02;
                final DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback2 = (DatabaseHealthMonitorFatalErrorCallback) c135806Ci.A04.get();
                if (databaseHealthMonitorFatalErrorCallback2 == null) {
                    databaseHealthMonitorFatalErrorCallback = null;
                } else {
                    databaseHealthMonitorFatalErrorCallback = new DatabaseHealthMonitorFatalErrorCallback() { // from class: X.9aq
                        @Override // com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback
                        public final synchronized void onError(Throwable th) {
                            ACD acd2 = ACD.this;
                            acd2.A01 = null;
                            acd2.A00 = null;
                            acd2.A02.set(false);
                            databaseHealthMonitorFatalErrorCallback2.onError(th);
                        }
                    };
                }
                final MailboxCallback mailboxCallback2 = mailboxCallback;
                final Database.OpenCallback A003 = c135806Ci.A00();
                MailboxDatabaseCallback mailboxDatabaseCallback = new MailboxDatabaseCallback() { // from class: X.9ao
                    @Override // com.facebook.msys.mca.MailboxDatabaseCallback
                    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
                        Database.OpenCallback openCallback = A003;
                        if (openCallback != null) {
                            openCallback.onConfig(sqliteHolder, i, databaseConnectionSettings);
                            return true;
                        }
                        return true;
                    }

                    @Override // com.facebook.msys.mca.MailboxDatabaseCallback
                    public final void onOpenWithMessageSyncService(boolean z, MessageSyncService messageSyncService, Throwable th) {
                        ACD acd2 = ACD.this;
                        acd2.A02.set(true);
                        if (th != null) {
                            acd2.A01 = null;
                            acd2.A00 = null;
                            acd2.A02.set(false);
                        }
                        Database.OpenCallback openCallback = A003;
                        if (openCallback != null) {
                            openCallback.onOpen(z, th);
                        }
                        if (th == null) {
                            mailboxCallback2.onCompletion(messageSyncService);
                        }
                        MailboxCallback mailboxCallback3 = acd2.A00;
                        if (mailboxCallback3 != null) {
                            mailboxCallback3.onCompletion(null);
                        }
                    }
                };
                String A01 = c135806Ci.A01();
                String A004 = C131985xY.A00(context);
                MailboxDatabaseConfig A005 = AbstractC137296Ji.A00(c135806Ci, A00, null, mailboxDatabaseCallback, databaseHealthMonitorFatalErrorCallback);
                Object obj = c135806Ci.A03.get();
                obj.getClass();
                MailboxMessengerMediaSendManagerConfig A012 = AbstractC137296Ji.A01(c135806Ci);
                String str = c1334860s.A0E;
                List list = (List) c135806Ci.A0I.get();
                Object obj2 = c135806Ci.A0J.get();
                obj2.getClass();
                int A0H = AbstractC166987dD.A0H(obj2);
                C61B c61b = c6cn.A05;
                acd.A01 = new MessageSyncService(accountSession, new MessageSyncServiceConfig(A01, A004, accountSession, A02, A005, A002, (DasmConfigCreator) obj, A012, str, list, A0H, true, false, c61b.A05, c61b.A06, c61b.A07, 500L, true, 500L, c61b.A01, c61b.A02, 500L, c61b.A03, c61b.A04));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("LazyMessageSyncService.createMessageSyncService");
            }
        }, null, 1);
    }

    public final void A01(MailboxCallback mailboxCallback, int i) {
        if (this.A01 == null) {
            C0K8.A0N("LazyMessageSyncService", "Message sync service is null, no shutdown has occurred for %s", AbstractC166987dD.A18(AbstractC111324zv.A00(3763)), this.A03.A00.A04);
            this.A01 = null;
            this.A00 = null;
            this.A02.set(false);
            return;
        }
        if (this.A02.get()) {
            Execution.executeAsync(new C201798w9(this, mailboxCallback), this.A03.A00.A02, 1);
        } else {
            this.A00 = new JRT(i, 8, this, mailboxCallback);
        }
    }

    public ACD(C135806Ci c135806Ci) {
        this.A03 = c135806Ci;
    }
}
