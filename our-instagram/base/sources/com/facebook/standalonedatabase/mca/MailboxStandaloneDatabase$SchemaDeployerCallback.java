package com.facebook.standalonedatabase.mca;

import X.C09170dP;
import X.C14360o3;
import com.facebook.instagram.wellbeing.IGDWellBeingDatabaseSchemaDeployer;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public abstract class MailboxStandaloneDatabase$SchemaDeployerCallback {
    private int callbackJNI(SqliteHolder sqliteHolder) {
        C14360o3.A0B(sqliteHolder, 0);
        C09170dP.A0C("IGDWellBeingDatabaseSchemaDeployer-jni");
        return IGDWellBeingDatabaseSchemaDeployer.deployPersistentSchemaNative(sqliteHolder);
    }
}
