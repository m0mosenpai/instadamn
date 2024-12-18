package X;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes10.dex */
public final class QFP extends UM5 implements Closeable {
    public final int A00;
    public final int A01;
    public final Cursor A02;

    @Override // X.UM5
    public final /* bridge */ /* synthetic */ Object A00() {
        Cursor cursor = this.A02;
        if (cursor.isBeforeFirst()) {
            cursor.moveToNext();
        }
        if (cursor.isAfterLast()) {
            super.A00 = C05F.A0C;
            return null;
        }
        C69053Vgu c69053Vgu = new C69053Vgu(cursor.getLong(this.A01), cursor.getString(this.A00));
        cursor.moveToNext();
        return c69053Vgu;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
    }

    public QFP(Cursor cursor) {
        this.A02 = cursor;
        this.A01 = cursor.getColumnIndex("local_contact_id");
        this.A00 = cursor.getColumnIndex("contact_hash");
    }
}
