package com.facebook.msys.mca;

import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public class MailboxDatabaseCallback {
    public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
        return true;
    }

    public void onInit(SqliteHolder sqliteHolder) {
    }

    public void onOpenWithMailbox(boolean z, Mailbox mailbox, Throwable th) {
    }

    public void onOpenWithMessageSyncService(boolean z, MessageSyncService messageSyncService, Throwable th) {
    }
}
