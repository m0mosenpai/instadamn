package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class QAH extends AbstractRunnableC129135sZ {
    public final /* synthetic */ C2L1 A00;

    public QAH(final C2L1 val$workManagerImpl) {
        this.A00 = val$workManagerImpl;
    }

    @Override // X.AbstractRunnableC129135sZ
    public final void A00() {
        String string;
        C2L1 c2l1 = this.A00;
        WorkDatabase workDatabase = c2l1.A04;
        workDatabase.beginTransaction();
        try {
            C2TF c2tf = (C2TF) workDatabase.A05();
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            C1YP c1yp = c2tf.A02;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                ArrayList A11 = AbstractC43593JPy.A11(query);
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    A11.add(string);
                }
                query.close();
                A00.A00();
                Iterator it = A11.iterator();
                while (it.hasNext()) {
                    A01(c2l1, AbstractC166987dD.A1B(it));
                }
                workDatabase.A01().COf(new C2YH("last_cancel_all_time_ms", AbstractC31173DnH.A0g()));
                workDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        } finally {
            workDatabase.endTransaction();
        }
    }
}
