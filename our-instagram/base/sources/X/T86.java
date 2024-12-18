package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes10.dex */
public final class T86 implements InterfaceC216113n {
    public static T86 A01;
    public final Q26 A00;

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00.getWritableDatabase();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Q26, android.database.sqlite.SQLiteOpenHelper] */
    public T86(Context context) {
        this.A00 = new SQLiteOpenHelper(context, "OnDemandResources.db", (SQLiteDatabase.CursorFactory) null, 12);
    }
}
