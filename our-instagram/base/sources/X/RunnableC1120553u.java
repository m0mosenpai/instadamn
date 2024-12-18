package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.53u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1120553u implements Runnable {
    public static final String A02 = C48442Kl.A01("EnqueueRunnable");
    public final C49142Nl A00;
    public final C1120453t A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.C1120453t r24) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1120553u.A00(X.53t):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        try {
            C1120453t c1120453t = this.A01;
            if (!C1120453t.A01(c1120453t, new HashSet())) {
                C2L1 c2l1 = c1120453t.A02;
                WorkDatabase workDatabase = c2l1.A04;
                workDatabase.beginTransaction();
                try {
                    C14360o3.A0B(c2l1.A02, 1);
                    ArrayList A1N = AbstractC16960so.A1N(c1120453t);
                    int i2 = 0;
                    while (!A1N.isEmpty()) {
                        C1120453t c1120453t2 = (C1120453t) AnonymousClass016.A14(A1N);
                        List list = c1120453t2.A07;
                        C14360o3.A07(list);
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it = list.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if ((!((C2L0) it.next()).A00.A0B.A03.isEmpty()) && (i = i + 1) < 0) {
                                    AbstractC16960so.A1T();
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                        i2 += i;
                        List list2 = c1120453t2.A06;
                        if (list2 != null) {
                            A1N.addAll(list2);
                        }
                    }
                    if (i2 != 0) {
                        C2TF c2tf = (C2TF) workDatabase.A05();
                        int i3 = 0;
                        TreeMap treeMap = C37581ov.A08;
                        C37581ov A00 = AbstractC37591ow.A00("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
                        C1YP c1yp = c2tf.A02;
                        c1yp.assertNotSuspendingTransaction();
                        Cursor query = c1yp.query(A00, (CancellationSignal) null);
                        try {
                            if (query.moveToFirst()) {
                                i3 = query.getInt(0);
                            }
                            query.close();
                            A00.A00();
                            if (i3 + i2 > 8) {
                                throw new IllegalArgumentException(AnonymousClass001.A0z("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", 8, i3, i2));
                            }
                        } catch (Throwable th) {
                            query.close();
                            A00.A00();
                            throw th;
                        }
                    }
                    boolean A002 = A00(c1120453t);
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (A002) {
                        AbstractC48952Mo.A00(c2l1.A01, RescheduleReceiver.class, true);
                        C2VU.A00(workDatabase, c2l1.A07);
                    }
                    this.A00.A00(InterfaceC49162No.A01);
                    return;
                } catch (Throwable th2) {
                    workDatabase.endTransaction();
                    throw th2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WorkContinuation has cycles (");
            sb.append(c1120453t);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        } catch (Throwable th3) {
            this.A00.A00(new C2OB(th3));
        }
    }

    public RunnableC1120553u(C49142Nl workContinuation, C1120453t result) {
        this.A01 = result;
        this.A00 = workContinuation;
    }
}
