package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import java.util.Iterator;

/* renamed from: X.3EP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3EP {
    public static final Cursor A00(C1YP c1yp, InterfaceC37501on interfaceC37501on, boolean z) {
        int i;
        C14360o3.A0B(c1yp, 0);
        C14360o3.A0B(interfaceC37501on, 1);
        Cursor query = c1yp.query(interfaceC37501on, (CancellationSignal) null);
        if (z && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (i < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(query.getColumnNames(), query.getCount());
                    while (query.moveToNext()) {
                        Object[] objArr = new Object[query.getColumnCount()];
                        int columnCount = query.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = query.getType(i2);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i2] = query.getBlob(i2);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i2] = query.getString(i2);
                                        }
                                    } else {
                                        objArr[i2] = Double.valueOf(query.getDouble(i2));
                                    }
                                } else {
                                    objArr[i2] = Long.valueOf(query.getLong(i2));
                                }
                            } else {
                                objArr[i2] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    query.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return query;
    }

    public static final void A01(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        C01L A1I = C0eM.A1I();
        Cursor E7O = interfaceC37481ol.E7O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (E7O.moveToNext()) {
            try {
                A1I.add(E7O.getString(0));
            } finally {
            }
        }
        E7O.close();
        Iterator<E> it = C0eM.A1J(A1I).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C14360o3.A05(str);
            if (AbstractC002300n.A0h(str, "room_fts_content_sync_", false)) {
                interfaceC37481ol.ATG(AnonymousClass001.A0R("DROP TRIGGER IF EXISTS ", str));
            }
        }
    }
}
