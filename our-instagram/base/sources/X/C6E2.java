package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6E2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6E2 implements Database.SchemaDeployer {
    public static final C6E2 A00 = new C6E2();

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        C09170dP.A0C("instagramDatabaseSchemaDeployer-jninovt");
        return InstagramDatabaseSchemaDeployer.deployInMemorySchemaNative(sqliteHolder);
    }
}
