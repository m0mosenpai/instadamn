package X;

import android.content.Context;
import android.database.Cursor;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.9Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209219Nd {
    public static final String[] A00 = {"_data", DevServerEntity.COLUMN_DESCRIPTION};

    public static final String A00(Context context, android.net.Uri uri) {
        try {
            Cursor A01 = C0fI.A01(context.getContentResolver(), uri, null, null, new String[]{DevServerEntity.COLUMN_DESCRIPTION}, null, 1483597648);
            if (A01 != null) {
                if (A01.getCount() > 0) {
                    A01.moveToFirst();
                    int columnIndex = A01.getColumnIndex(DevServerEntity.COLUMN_DESCRIPTION);
                    if (columnIndex < 0) {
                        return null;
                    }
                    return A01.getString(columnIndex);
                }
                A01.close();
            }
        } catch (IllegalStateException | UnsupportedOperationException unused) {
        }
        return null;
    }
}
