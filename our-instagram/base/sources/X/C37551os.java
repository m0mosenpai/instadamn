package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37551os extends C37531oq implements InterfaceC37561ot {
    public final SQLiteStatement A00;

    @Override // X.InterfaceC37561ot
    public final long ATY() {
        SQLiteStatement sQLiteStatement = this.A00;
        C0fW.A00(745323083);
        long executeInsert = sQLiteStatement.executeInsert();
        C0fW.A00(-776476116);
        return executeInsert;
    }

    @Override // X.InterfaceC37561ot
    public final int ATb() {
        SQLiteStatement sQLiteStatement = this.A00;
        C0fW.A00(-959512267);
        int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
        C0fW.A00(1643129917);
        return executeUpdateDelete;
    }

    public C37551os(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.A00 = sQLiteStatement;
    }
}
