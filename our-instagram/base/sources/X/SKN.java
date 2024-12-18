package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SKN {
    public final X7M A00;

    public SKN(X7M x7m) {
        this.A00 = x7m;
    }

    public final void A00(List list) {
        String str;
        if (!list.isEmpty()) {
            Q29 q29 = (Q29) this.A00;
            SQLiteDatabase writableDatabase = q29.getWritableDatabase();
            C0fW.A01(writableDatabase, 1401505260);
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C69053Vgu c69053Vgu = (C69053Vgu) it.next();
                    int intValue = c69053Vgu.A00.intValue();
                    if (intValue != 0 && intValue != 1) {
                        if (intValue == 2) {
                            SQLiteDatabase writableDatabase2 = q29.getWritableDatabase();
                            if (writableDatabase2 != null) {
                                synchronized (q29.A00) {
                                    try {
                                        try {
                                            writableDatabase2.delete("contacts_upload_snapshot", AnonymousClass001.A0g("local_contact_id", "= ", String.valueOf(c69053Vgu.A01)), null);
                                        } catch (SQLiteException unused) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            if (3 - intValue != 0) {
                                str = "ADD";
                            } else {
                                str = "UNKNOWN";
                            }
                            throw AbstractC167007dF.A0c("Unknown change type ", str);
                        }
                    } else {
                        SQLiteDatabase writableDatabase3 = q29.getWritableDatabase();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_contact_id", Long.valueOf(c69053Vgu.A01));
                        contentValues.put("contact_hash", c69053Vgu.A02);
                        if (writableDatabase3 != null) {
                            synchronized (q29.A00) {
                                try {
                                    try {
                                        C0fW.A00(-176569947);
                                        writableDatabase3.replaceOrThrow("contacts_upload_snapshot", null, contentValues);
                                        C0fW.A00(568650322);
                                    } catch (SQLiteException unused2) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
                C0fW.A03(writableDatabase, -1464550526);
            } catch (Throwable th3) {
                C0fW.A03(writableDatabase, 1639582680);
                throw th3;
            }
        }
    }
}
