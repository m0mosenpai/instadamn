package com.facebook.instagram.msys;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes8.dex */
public class InstagramDatabaseSchemaDeployerMDMS {
    public static native int deployInMemorySchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNoVirtualTablesNative(SqliteHolder sqliteHolder);

    public static native int registerVirtualTableModuleFunctionsNative(SqliteHolder sqliteHolder);
}
