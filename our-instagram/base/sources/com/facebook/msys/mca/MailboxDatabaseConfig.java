package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes3.dex */
public class MailboxDatabaseConfig {
    public static final MailboxDatabaseConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public MailboxDatabaseConfig(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, boolean z9, boolean z10, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator) {
        this.mNativeHolder = initNativeHolder(str, str2, map, databaseHealthMonitorFatalErrorCallback, mailboxDatabaseCallback, true, z2, false, false, z5, false, false, false, 0, -1, false, true, schemaDeployer, schemaDeployer2, schemaDeployer3, schemaDeployer4, virtualTableModuleRegistrator);
    }

    private native NativeHolder initNativeHolder(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, boolean z9, boolean z10, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator);

    static {
        C137306Jk.A00();
    }
}
