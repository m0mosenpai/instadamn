package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6E5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6E5 implements Database.VirtualTableModuleRegistrator {
    public static final C6E5 A00 = new C6E5();

    @Override // com.facebook.msys.mci.Database.VirtualTableModuleRegistrator
    public final int register(SqliteHolder sqliteHolder) {
        C09170dP.A0C("instagramDatabaseSchemaDeployer-jni");
        return InstagramDatabaseSchemaDeployer.registerVirtualTableModuleFunctionsNative(sqliteHolder);
    }
}
