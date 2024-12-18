package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes4.dex */
public final class AYY implements Database.SchemaDeployer {
    public static final AYY A00 = new AYY();

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        C09170dP.A0C("instagramDatabaseSchemaDeployer-jninovt");
        return InstagramDatabaseSchemaDeployer.deployPersistentSchemaNoVirtualTablesNative(sqliteHolder);
    }
}
