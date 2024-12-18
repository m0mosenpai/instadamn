package com.facebook.instagram.wellbeing;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public class IGDWellBeingDatabaseSchemaDeployer {
    public static native int deployInMemorySchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNoVirtualTablesNative(SqliteHolder sqliteHolder);
}
