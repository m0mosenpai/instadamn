package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployerMDMS_DEFERRED;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6E4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6E4 implements Database.SchemaDeployer {
    public static final C6E4 A00 = new C6E4();

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        C09170dP.A0C("instagramDatabaseSchemaDeployer-jniMDMS_DEFERREDnovt");
        return InstagramDatabaseSchemaDeployerMDMS_DEFERRED.deployInMemorySchemaNative(sqliteHolder);
    }
}
