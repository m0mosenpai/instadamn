package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployerMDMS;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6E3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6E3 implements Database.SchemaDeployer {
    public static final C6E3 A00 = new C6E3();

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        C09170dP.A0C("instagramDatabaseSchemaDeployer-jniMDMSnovt");
        return InstagramDatabaseSchemaDeployerMDMS.deployInMemorySchemaNative(sqliteHolder);
    }
}
