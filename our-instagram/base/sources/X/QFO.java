package X;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes10.dex */
public final class QFO extends UM5 implements Closeable {
    public final Cursor A00;

    @Override // X.UM5
    public final /* bridge */ /* synthetic */ Object A00() {
        Cursor cursor = this.A00;
        if (cursor.isBeforeFirst()) {
            cursor.moveToNext();
        }
        while (!cursor.isAfterLast() && cursor.getInt(cursor.getColumnIndexOrThrow("deleted")) != 0) {
            cursor.moveToNext();
        }
        if (cursor.isAfterLast()) {
            super.A00 = C05F.A0C;
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("contact_id");
        String valueOf = String.valueOf(cursor.getLong(columnIndexOrThrow));
        SZB szb = new SZB(valueOf);
        while (true) {
            if (!cursor.isAfterLast() && cursor.getInt(cursor.getColumnIndexOrThrow("deleted")) != 0) {
                cursor.moveToNext();
            } else {
                if (cursor.isAfterLast() || !String.valueOf(cursor.getLong(columnIndexOrThrow)).equals(valueOf)) {
                    return szb;
                }
                String A0p = AbstractC58319PtB.A0p(cursor, "mimetype");
                if ("vnd.android.cursor.item/phone_v2".equals(A0p)) {
                    String A0p2 = AbstractC58319PtB.A0p(cursor, "data1");
                    cursor.getInt(cursor.getColumnIndexOrThrow("data2"));
                    if (A0p2 != null && !A0p2.isEmpty()) {
                        java.util.Set set = szb.A07;
                        if (!set.contains(A0p2)) {
                            set.add(A0p2);
                            szb.A06.add(new Object());
                        }
                    }
                } else if ("vnd.android.cursor.item/email_v2".equals(A0p)) {
                    String A0p3 = AbstractC58319PtB.A0p(cursor, "data1");
                    if (A0p3 != null && !A0p3.isEmpty()) {
                        szb.A05.add(A0p3);
                    }
                } else if ("vnd.android.cursor.item/name".equals(A0p)) {
                    szb.A01 = AbstractC58319PtB.A0p(cursor, "data1");
                    szb.A02 = AbstractC58319PtB.A0p(cursor, "data2");
                    szb.A03 = AbstractC58319PtB.A0p(cursor, "data3");
                }
                if (!cursor.moveToNext()) {
                    return szb;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public QFO(Cursor cursor) {
        this.A00 = cursor;
    }
}
