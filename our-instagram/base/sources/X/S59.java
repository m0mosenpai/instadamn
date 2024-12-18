package X;

import android.database.Cursor;

/* loaded from: classes10.dex */
public abstract class S59 {
    public static final String A00(Cursor cursor) {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        String[] columnNames = cursor.getColumnNames();
        if (cursor.moveToFirst()) {
            C14360o3.A0A(columnNames);
            for (String str2 : columnNames) {
                A1C.append(str2);
                A1C.append(":");
                int columnIndex = cursor.getColumnIndex(str2);
                try {
                    try {
                        try {
                            str = cursor.getString(columnIndex);
                        } catch (Exception unused) {
                            str = "";
                        }
                    } catch (Exception unused2) {
                        str = String.valueOf(cursor.getLong(columnIndex));
                    }
                } catch (Exception unused3) {
                    str = String.valueOf(cursor.getInt(columnIndex));
                }
                A1C.append(str);
                A1C.append(";");
            }
        }
        cursor.moveToFirst();
        return AbstractC166987dD.A19(A1C);
    }
}
