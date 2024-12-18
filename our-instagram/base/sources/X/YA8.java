package X;

import android.database.Cursor;

/* loaded from: classes12.dex */
public abstract class YA8 implements XLY {
    public Exception A00;
    public final Cursor A01;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
        this.A00 = new Exception();
    }

    @Override // X.XLY
    public final boolean moveToNext() {
        Cursor cursor = this.A01;
        if (!cursor.isClosed()) {
            return cursor.moveToNext();
        }
        String stackTraceString = android.util.Log.getStackTraceString(this.A00);
        C0K8.A0C("AbstractDAOItem", stackTraceString);
        throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(144), stackTraceString);
    }

    public YA8(Cursor cursor) {
        if (cursor != null) {
            this.A01 = cursor;
            return;
        }
        throw AbstractC166987dD.A12("cursor is null");
    }
}
