package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class QAJ extends AbstractRunnableC129135sZ {
    public final /* synthetic */ C2L1 A00;
    public final /* synthetic */ String A01;

    public QAJ(final C2L1 val$workManagerImpl, final String val$tag) {
        this.A00 = val$workManagerImpl;
        this.A01 = val$tag;
    }

    @Override // X.AbstractRunnableC129135sZ
    public final void A00() {
        String string;
        C2L1 c2l1 = this.A00;
        WorkDatabase workDatabase = c2l1.A04;
        workDatabase.beginTransaction();
        try {
            C2M2 A05 = workDatabase.A05();
            String str = this.A01;
            C2TF c2tf = (C2TF) A05;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
            if (str == null) {
                A00.ADj(1);
            } else {
                A00.ADp(1, str);
            }
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
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                C2VU.A00(workDatabase, c2l1.A07);
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
