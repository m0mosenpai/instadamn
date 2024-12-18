package X;

import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mcs.SyncHandler;

/* loaded from: classes8.dex */
public final class K4M extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ AccountSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4M(Mailbox mailbox, AccountSession accountSession) {
        super("getSyncHandlerToNotifyEnterAppBackground");
        this.A00 = mailbox;
        this.A01 = accountSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppState appState;
        Mailbox mailbox = this.A00;
        mailbox.updateAppStateToBackground();
        SyncHandler syncHandler = mailbox.getSyncHandler();
        AccountSession accountSession = this.A01;
        if (syncHandler != null) {
            Execution.executeAsync(new K4F(syncHandler), accountSession, 2);
        } else {
            android.util.Log.e("MsysAppStateHandler", "SyncHandler is null when attempting to notify Msys of app background.");
        }
        synchronized (MsysInfraNoSqliteObjectHolder.class) {
            appState = MsysInfraNoSqliteObjectHolder.A03.A01;
        }
        if (appState != null) {
            appState.notifyAppEnterBackground(C136066Dl.A00());
        } else {
            android.util.Log.e("MsysAppStateHandler", "appState or notificationCenter is null when attempting to notify Msys of app background.");
        }
    }
}
