package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

/* renamed from: X.5sZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC129135sZ implements Runnable {
    public final C49142Nl A00 = new C49142Nl();

    public void A00() {
        String string;
        C129125sY c129125sY = (C129125sY) this;
        C2L1 c2l1 = c129125sY.A00;
        WorkDatabase workDatabase = c2l1.A04;
        workDatabase.beginTransaction();
        try {
            C2M2 A05 = workDatabase.A05();
            String str = c129125sY.A01;
            C2TF c2tf = (C2TF) A05;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                A00.ADj(1);
            } else {
                A00.ADp(1, str);
            }
            C1YP c1yp = c2tf.A02;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    arrayList.add(string);
                }
                query.close();
                A00.A00();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c129125sY.A01(c2l1, (String) it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (c129125sY.A02) {
                    C2VU.A00(workDatabase, c2l1.A07);
                }
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

    public final void A01(C2L1 workManagerImpl, String workSpecId) {
        RunnableC52072a7 A00;
        WorkDatabase workDatabase = workManagerImpl.A04;
        C2M2 A05 = workDatabase.A05();
        C2M4 A002 = workDatabase.A00();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            EnumC48482Kp Bzz = A05.Bzz(str);
            if (Bzz != EnumC48482Kp.SUCCEEDED && Bzz != EnumC48482Kp.FAILED) {
                C2TF c2tf = (C2TF) A05;
                C1YP c1yp = c2tf.A02;
                c1yp.assertNotSuspendingTransaction();
                AbstractC29601bb abstractC29601bb = c2tf.A07;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                if (str == null) {
                    acquire.ADj(1);
                } else {
                    acquire.ADp(1, str);
                }
                c1yp.beginTransaction();
                try {
                    acquire.ATb();
                    c1yp.setTransactionSuccessful();
                } finally {
                    c1yp.endTransaction();
                    abstractC29601bb.release(acquire);
                }
            }
            linkedList.addAll(A002.Awm(str));
        }
        C2MX c2mx = workManagerImpl.A03;
        synchronized (c2mx.A09) {
            C48442Kl.A00();
            c2mx.A07.add(workSpecId);
            A00 = C2MX.A00(c2mx, workSpecId);
        }
        C2MX.A01(A00, 1);
        Iterator it = workManagerImpl.A07.iterator();
        while (it.hasNext()) {
            ((InterfaceC48882Mg) it.next()).AGG(workSpecId);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A00();
            this.A00.A00(InterfaceC49162No.A01);
        } catch (Throwable th) {
            this.A00.A00(new C2OB(th));
        }
    }
}
