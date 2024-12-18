package X;

import android.database.Cursor;

/* renamed from: X.1ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37601ox {
    public static final int A00(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            int columnIndex2 = cursor.getColumnIndex(AnonymousClass001.A0E(str, '`', '`'));
            if (columnIndex2 < 0) {
                return -1;
            }
            return columnIndex2;
        }
        return columnIndex;
    }

    public static final int A01(Cursor cursor, String str) {
        String str2;
        int A00 = A00(cursor, str);
        if (A00 >= 0) {
            return A00;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C14360o3.A07(columnNames);
            str2 = AbstractC009903n.A07(", ", "", "", null, columnNames);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException(AnonymousClass001.A0u("column '", str, "' does not exist. Available columns: ", str2));
    }
}
