package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;

/* renamed from: X.1aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28901aT {
    public final int A00;

    public void A02(InterfaceC37481ol interfaceC37481ol) {
    }

    public void A03(InterfaceC37481ol interfaceC37481ol) {
    }

    public abstract void A04(InterfaceC37481ol interfaceC37481ol);

    public abstract void A06(InterfaceC37481ol interfaceC37481ol, int i, int i2);

    public static final void A01(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                int A00 = C14360o3.A00(str.charAt(i2), 32);
                boolean z2 = false;
                if (A00 <= 0) {
                    z2 = true;
                }
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                android.util.Log.w("SupportSQLite", AnonymousClass001.A0R("deleting the database file: ", str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    android.util.Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public void A05(InterfaceC37481ol interfaceC37481ol, int i, int i2) {
        throw new SQLiteException(AnonymousClass001.A02(i, i2, "Can't downgrade database from version ", " to "));
    }

    public AbstractC28901aT(int i) {
        this.A00 = i;
    }
}
