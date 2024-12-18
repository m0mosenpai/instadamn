package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37471ok implements InterfaceC37481ol {
    public static final String[] A01 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A02 = new String[0];
    public final SQLiteDatabase A00;

    @Override // X.InterfaceC37481ol
    public final C37551os AIj(String str) {
        C14360o3.A0B(str, 0);
        SQLiteStatement compileStatement = this.A00.compileStatement(str);
        C14360o3.A07(compileStatement);
        return new C37551os(compileStatement);
    }

    @Override // X.InterfaceC37481ol
    public final void ATG(String str) {
        C14360o3.A0B(str, 0);
        SQLiteDatabase sQLiteDatabase = this.A00;
        C0fW.A00(-173499278);
        sQLiteDatabase.execSQL(str);
        C0fW.A00(-2047116047);
    }

    @Override // X.InterfaceC37481ol
    public final Cursor E7N(InterfaceC37501on interfaceC37501on) {
        final C9EP c9ep = new C9EP(interfaceC37501on, 2);
        Cursor rawQueryWithFactory = this.A00.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.1op
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC16600sD interfaceC16600sD = InterfaceC16600sD.this;
                C14360o3.A0B(interfaceC16600sD, 0);
                return (Cursor) interfaceC16600sD.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC37501on.BzS(), A02, null);
        C14360o3.A07(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    @Override // X.InterfaceC37481ol
    public final Cursor E7O(String str) {
        C14360o3.A0B(str, 0);
        return E7N(new C37491om(str, null));
    }

    @Override // X.InterfaceC37481ol
    public final void ADS() {
        C0fW.A01(this.A00, 688438778);
    }

    @Override // X.InterfaceC37481ol
    public final int AOX(String str, String str2, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        C37551os AIj = AIj(obj);
        C37491om.A02.A00(AIj, objArr);
        return AIj.ATb();
    }

    @Override // X.InterfaceC37481ol
    public final void ASe() {
        C0fW.A03(this.A00, 1333384080);
    }

    @Override // X.InterfaceC37481ol
    public final void ATH(String str, Object[] objArr) {
        SQLiteDatabase sQLiteDatabase = this.A00;
        C0fW.A00(1890838778);
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
        C0fW.A00(1803905865);
    }

    @Override // X.InterfaceC37481ol
    public final long COa(ContentValues contentValues, String str, int i) {
        SQLiteDatabase sQLiteDatabase = this.A00;
        C0fW.A00(316735978);
        long insertWithOnConflict = sQLiteDatabase.insertWithOnConflict(str, null, contentValues, i);
        C0fW.A00(-1305873819);
        return insertWithOnConflict;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public C37471ok(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
    }
}
