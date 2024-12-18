package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.2a7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC52072a7 implements Runnable {
    public static final String A0I = C48442Kl.A01("WorkerWrapper");
    public Context A00;
    public C2L2 A01;
    public C1114150f A04;
    public WorkDatabase A05;
    public C2MZ A06;
    public C2M4 A07;
    public C48412Ki A08;
    public C2M2 A09;
    public C2LC A0B;
    public String A0C;
    public List A0D;
    public C2L5 A0E;
    public final String A0G;
    public AbstractC1114350h A02 = new C1114250g();
    public C49182Nr A0A = new Object();
    public final C49182Nr A0F = new Object();
    public volatile int A0H = -256;
    public AbstractC48352Kc A03 = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2Nr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.2Nr] */
    public RunnableC52072a7(Context context, C2L2 c2l2, C1114150f c1114150f, WorkDatabase workDatabase, C2MZ c2mz, C48412Ki c48412Ki, C2LC c2lc, List list) {
        this.A00 = context;
        this.A0B = c2lc;
        this.A06 = c2mz;
        this.A08 = c48412Ki;
        this.A0G = c48412Ki.A0M;
        this.A04 = c1114150f;
        this.A01 = c2l2;
        this.A0E = c2l2.A00;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A05();
        this.A07 = this.A05.A00();
        this.A0D = list;
    }

    private void A00(final boolean needsReschedule) {
        WorkDatabase workDatabase = this.A05;
        workDatabase.beginTransaction();
        try {
            C2TF c2tf = (C2TF) workDatabase.A05();
            boolean z = false;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            C1YP c1yp = c2tf.A02;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                if (query.moveToFirst()) {
                    if (query.getInt(0) != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    AbstractC48952Mo.A00(this.A00, RescheduleReceiver.class, false);
                }
                if (needsReschedule) {
                    C2M2 c2m2 = this.A09;
                    EnumC48482Kp enumC48482Kp = EnumC48482Kp.ENQUEUED;
                    String str = this.A0G;
                    c2m2.Eei(enumC48482Kp, str);
                    c2m2.Eeq(str, this.A0H);
                    c2m2.CnQ(-1L, str);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                this.A0A.A07(Boolean.valueOf(needsReschedule));
            } finally {
                query.close();
                A00.A00();
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public static boolean A01(RunnableC52072a7 runnableC52072a7) {
        if (runnableC52072a7.A0H == -256) {
            return false;
        }
        C48442Kl.A00();
        if (runnableC52072a7.A09.Bzz(runnableC52072a7.A0G) == null) {
            runnableC52072a7.A00(false);
            return true;
        }
        runnableC52072a7.A00(!r0.A00());
        return true;
    }

    public final void A03() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.beginTransaction();
        try {
            String str = this.A0G;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                C2M2 c2m2 = this.A09;
                if (c2m2.Bzz(str2) != EnumC48482Kp.CANCELLED) {
                    c2m2.Eei(EnumC48482Kp.FAILED, str2);
                }
                linkedList.addAll(this.A07.Awm(str2));
            }
            C48532Kv c48532Kv = ((C1114250g) this.A02).A00;
            C2M2 c2m22 = this.A09;
            c2m22.EK4(str, this.A08.A00);
            c2m22.EaM(c48532Kv, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            A00(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        StringBuilder sb;
        String str2;
        C48532Kv A00;
        byte[] blob;
        boolean z;
        boolean z2;
        List<String> list = this.A0D;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str3 = this.A0G;
        sb2.append(str3);
        sb2.append(", tags={ ");
        boolean z3 = true;
        for (String str4 : list) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str4);
        }
        sb2.append(" } ]");
        this.A0C = sb2.toString();
        if (!A01(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.beginTransaction();
            try {
                C48412Ki c48412Ki = this.A08;
                EnumC48482Kp enumC48482Kp = c48412Ki.A0E;
                EnumC48482Kp enumC48482Kp2 = EnumC48482Kp.ENQUEUED;
                if (enumC48482Kp != enumC48482Kp2) {
                    if (this.A09.Bzz(str3) == EnumC48482Kp.RUNNING) {
                        C48442Kl.A00();
                        z2 = true;
                    } else {
                        C48442Kl.A00();
                        z2 = false;
                    }
                    A00(z2);
                    workDatabase.setTransactionSuccessful();
                    C48442Kl.A00();
                } else if ((c48412Ki.A06 != 0 || c48412Ki.A02 > 0) && System.currentTimeMillis() < c48412Ki.A00()) {
                    C48442Kl.A00();
                    String.format("Delaying execution for %s because it is being executed before schedule.", c48412Ki.A0I);
                    A00(true);
                    workDatabase.setTransactionSuccessful();
                } else {
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (c48412Ki.A06 != 0) {
                        A00 = c48412Ki.A0C;
                    } else {
                        String str5 = c48412Ki.A0H;
                        C14360o3.A0B(str5, 0);
                        try {
                            Object newInstance = Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            C14360o3.A0C(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                            AbstractC48512Kt abstractC48512Kt = (AbstractC48512Kt) newInstance;
                            if (abstractC48512Kt != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c48412Ki.A0C);
                                C2TF c2tf = (C2TF) this.A09;
                                TreeMap treeMap = C37581ov.A08;
                                C37581ov A002 = AbstractC37591ow.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A002.ADp(1, str3);
                                C1YP c1yp = c2tf.A02;
                                c1yp.assertNotSuspendingTransaction();
                                Cursor query = c1yp.query(A002, (CancellationSignal) null);
                                try {
                                    ArrayList arrayList2 = new ArrayList(query.getCount());
                                    while (query.moveToNext()) {
                                        if (query.isNull(0)) {
                                            blob = null;
                                        } else {
                                            blob = query.getBlob(0);
                                        }
                                        arrayList2.add(C48532Kv.A00(blob));
                                    }
                                    query.close();
                                    A002.A00();
                                    arrayList.addAll(arrayList2);
                                    A00 = abstractC48512Kt.A00(arrayList);
                                } catch (Throwable th) {
                                    query.close();
                                    A002.A00();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            C48442Kl.A00();
                            android.util.Log.e(AbstractC62297S5s.A00, AnonymousClass001.A0R("Trouble instantiating ", str5), e);
                        }
                        C48442Kl.A00();
                        str = A0I;
                        sb = new StringBuilder();
                        sb.append("Could not create Input Merger ");
                        str2 = c48412Ki.A0H;
                        sb.append(str2);
                        android.util.Log.e(str, sb.toString());
                        A03();
                        return;
                    }
                    UUID fromString = UUID.fromString(str3);
                    C1114150f c1114150f = this.A04;
                    int i = c48412Ki.A02;
                    int i2 = c48412Ki.A0K;
                    C2L2 c2l2 = this.A01;
                    Executor executor = c2l2.A05;
                    C2LC c2lc = this.A0B;
                    C2L7 c2l7 = c2l2.A03;
                    C1114750l c1114750l = new C1114750l(workDatabase, c2lc);
                    C1114950n c1114950n = new C1114950n(workDatabase, this.A06, c2lc);
                    ?? obj = new Object();
                    obj.A09 = fromString;
                    obj.A02 = A00;
                    obj.A08 = new HashSet(list);
                    obj.A06 = c1114150f;
                    obj.A01 = i;
                    obj.A00 = i2;
                    obj.A0A = executor;
                    obj.A07 = c2lc;
                    obj.A05 = c2l7;
                    obj.A04 = c1114750l;
                    obj.A03 = c1114950n;
                    AbstractC48352Kc abstractC48352Kc = this.A03;
                    if (abstractC48352Kc == null) {
                        Context context = this.A00;
                        str2 = c48412Ki.A0I;
                        abstractC48352Kc = c2l7.A00(context, obj, str2);
                        this.A03 = abstractC48352Kc;
                        if (abstractC48352Kc == null) {
                            C48442Kl.A00();
                            str = A0I;
                            sb = new StringBuilder();
                            sb.append("Could not create Worker ");
                            sb.append(str2);
                            android.util.Log.e(str, sb.toString());
                            A03();
                            return;
                        }
                    }
                    if (abstractC48352Kc.mUsed) {
                        C48442Kl.A00();
                        str = A0I;
                        sb = new StringBuilder();
                        sb.append("Received an already-used Worker ");
                        sb.append(c48412Ki.A0I);
                        str2 = "; Worker Factory should return new instances";
                        sb.append(str2);
                        android.util.Log.e(str, sb.toString());
                        A03();
                        return;
                    }
                    boolean z4 = true;
                    abstractC48352Kc.mUsed = true;
                    workDatabase.beginTransaction();
                    C2M2 c2m2 = this.A09;
                    if (c2m2.Bzz(str3) == enumC48482Kp2) {
                        c2m2.Eei(EnumC48482Kp.RUNNING, str3);
                        C2TF c2tf2 = (C2TF) c2m2;
                        C1YP c1yp2 = c2tf2.A02;
                        c1yp2.assertNotSuspendingTransaction();
                        AbstractC29601bb abstractC29601bb = c2tf2.A04;
                        InterfaceC37561ot acquire = abstractC29601bb.acquire();
                        acquire.ADp(1, str3);
                        c1yp2.beginTransaction();
                        try {
                            acquire.ATb();
                            c1yp2.setTransactionSuccessful();
                            c1yp2.endTransaction();
                            abstractC29601bb.release(acquire);
                            c2m2.Eeq(str3, -256);
                            z = true;
                        } catch (Throwable th2) {
                            c1yp2.endTransaction();
                            abstractC29601bb.release(acquire);
                            throw th2;
                        }
                    } else {
                        z = false;
                    }
                    workDatabase.setTransactionSuccessful();
                    if (z) {
                        if (!A01(this)) {
                            RunnableC1115150q runnableC1115150q = new RunnableC1115150q(this.A00, obj.A03, this.A03, c48412Ki, c2lc);
                            C2LB c2lb = (C2LB) c2lc;
                            Executor executor2 = c2lb.A02;
                            executor2.execute(runnableC1115150q);
                            final C49182Nr c49182Nr = runnableC1115150q.A04;
                            C49182Nr c49182Nr2 = this.A0F;
                            c49182Nr2.addListener(new Runnable() { // from class: X.50r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RunnableC52072a7 runnableC52072a7 = RunnableC52072a7.this;
                                    ListenableFuture listenableFuture = c49182Nr;
                                    if (runnableC52072a7.A0F.isCancelled()) {
                                        listenableFuture.cancel(true);
                                    }
                                }
                            }, new Object());
                            c49182Nr.addListener(new Runnable() { // from class: X.50t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RunnableC52072a7 runnableC52072a7 = RunnableC52072a7.this;
                                    C49182Nr c49182Nr3 = runnableC52072a7.A0F;
                                    if (!c49182Nr3.isCancelled()) {
                                        try {
                                            c49182Nr.get();
                                            C48442Kl.A00();
                                            c49182Nr3.A06(runnableC52072a7.A03.startWork());
                                        } catch (Throwable th3) {
                                            c49182Nr3.A08(th3);
                                        }
                                    }
                                }
                            }, executor2);
                            final String str6 = this.A0C;
                            c49182Nr2.addListener(new Runnable() { // from class: X.50u
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        try {
                                            try {
                                                RunnableC52072a7 runnableC52072a7 = RunnableC52072a7.this;
                                                AbstractC1114350h abstractC1114350h = (AbstractC1114350h) runnableC52072a7.A0F.get();
                                                if (abstractC1114350h == null) {
                                                    C48442Kl.A00();
                                                    android.util.Log.e(RunnableC52072a7.A0I, AnonymousClass001.A0R(runnableC52072a7.A08.A0I, " returned a null result. Treating it as a failure."));
                                                } else {
                                                    C48442Kl.A00();
                                                    runnableC52072a7.A02 = abstractC1114350h;
                                                }
                                            } catch (CancellationException unused) {
                                                C48442Kl.A00();
                                            }
                                        } catch (InterruptedException | ExecutionException e2) {
                                            C48442Kl.A00();
                                            android.util.Log.e(RunnableC52072a7.A0I, AnonymousClass001.A0R(str6, " failed because it threw an exception/error"), e2);
                                        }
                                    } finally {
                                        RunnableC52072a7.this.A02();
                                    }
                                }
                            }, c2lb.A01);
                            return;
                        }
                        return;
                    }
                    if (c2m2.Bzz(str3) == EnumC48482Kp.RUNNING) {
                        C48442Kl.A00();
                    } else {
                        C48442Kl.A00();
                        z4 = false;
                    }
                    A00(z4);
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public final void A02() {
        boolean z;
        C48412Ki c48412Ki;
        C1YP c1yp;
        AbstractC29601bb abstractC29601bb;
        InterfaceC37561ot acquire;
        if (!A01(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.beginTransaction();
            try {
                C2M2 c2m2 = this.A09;
                String str = this.A0G;
                EnumC48482Kp Bzz = c2m2.Bzz(str);
                workDatabase.A04().AOZ(str);
                if (Bzz == null) {
                    z = false;
                } else {
                    try {
                        if (Bzz == EnumC48482Kp.RUNNING) {
                            AbstractC1114350h abstractC1114350h = this.A02;
                            if (abstractC1114350h instanceof C51A) {
                                C48442Kl.A00();
                                c48412Ki = this.A08;
                                try {
                                    if (c48412Ki.A06 == 0) {
                                        workDatabase.beginTransaction();
                                        try {
                                            c2m2.Eei(EnumC48482Kp.SUCCEEDED, str);
                                            c2m2.EaM(((C51A) this.A02).A00, str);
                                            long currentTimeMillis = System.currentTimeMillis();
                                            C2M4 c2m4 = this.A07;
                                            Iterator it = c2m4.Awm(str).iterator();
                                            while (it.hasNext()) {
                                                String str2 = (String) it.next();
                                                if (c2m2.Bzz(str2) == EnumC48482Kp.BLOCKED) {
                                                    C1114450i c1114450i = (C1114450i) c2m4;
                                                    boolean z2 = true;
                                                    TreeMap treeMap = C37581ov.A08;
                                                    C37581ov A00 = AbstractC37591ow.A00("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                                    if (str2 == null) {
                                                        A00.ADj(1);
                                                    } else {
                                                        A00.ADp(1, str2);
                                                    }
                                                    C1YP c1yp2 = c1114450i.A01;
                                                    c1yp2.assertNotSuspendingTransaction();
                                                    boolean z3 = false;
                                                    Cursor query = c1yp2.query(A00, (CancellationSignal) null);
                                                    try {
                                                        if (query.moveToFirst()) {
                                                            if (query.getInt(0) == 0) {
                                                                z2 = false;
                                                            }
                                                            z3 = z2;
                                                        }
                                                        if (z3) {
                                                            C48442Kl.A00();
                                                            c2m2.Eei(EnumC48482Kp.ENQUEUED, str2);
                                                            c2m2.EWu(str2, currentTimeMillis);
                                                        }
                                                    } finally {
                                                        query.close();
                                                        A00.A00();
                                                    }
                                                }
                                            }
                                            workDatabase.setTransactionSuccessful();
                                            workDatabase.endTransaction();
                                            A00(false);
                                            workDatabase.setTransactionSuccessful();
                                        } catch (Throwable th) {
                                            workDatabase.endTransaction();
                                            A00(false);
                                            throw th;
                                        }
                                    }
                                    acquire.ATb();
                                    c1yp.setTransactionSuccessful();
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                    c2m2.EK4(str, c48412Ki.A00);
                                    c1yp.assertNotSuspendingTransaction();
                                    abstractC29601bb = r9.A03;
                                    acquire = abstractC29601bb.acquire();
                                    acquire.ADp(1, str);
                                    c1yp.beginTransaction();
                                    acquire.ATb();
                                    c1yp.setTransactionSuccessful();
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                } catch (Throwable th2) {
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                    throw th2;
                                }
                                workDatabase.beginTransaction();
                                z = false;
                                c2m2.EWu(str, System.currentTimeMillis());
                                c2m2.Eei(EnumC48482Kp.ENQUEUED, str);
                                C2TF c2tf = (C2TF) c2m2;
                                c1yp = c2tf.A02;
                                c1yp.assertNotSuspendingTransaction();
                                abstractC29601bb = c2tf.A06;
                                acquire = abstractC29601bb.acquire();
                                acquire.ADp(1, str);
                                c1yp.beginTransaction();
                            } else {
                                boolean z4 = abstractC1114350h instanceof QA1;
                                C48442Kl.A00();
                                if (!z4) {
                                    c48412Ki = this.A08;
                                    if (c48412Ki.A06 == 0) {
                                        A03();
                                        workDatabase.setTransactionSuccessful();
                                    }
                                    workDatabase.beginTransaction();
                                    z = false;
                                    c2m2.EWu(str, System.currentTimeMillis());
                                    c2m2.Eei(EnumC48482Kp.ENQUEUED, str);
                                    C2TF c2tf2 = (C2TF) c2m2;
                                    c1yp = c2tf2.A02;
                                    c1yp.assertNotSuspendingTransaction();
                                    abstractC29601bb = c2tf2.A06;
                                    acquire = abstractC29601bb.acquire();
                                    acquire.ADp(1, str);
                                    c1yp.beginTransaction();
                                    acquire.ATb();
                                    c1yp.setTransactionSuccessful();
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                    c2m2.EK4(str, c48412Ki.A00);
                                    c1yp.assertNotSuspendingTransaction();
                                    abstractC29601bb = c2tf2.A03;
                                    acquire = abstractC29601bb.acquire();
                                    acquire.ADp(1, str);
                                    c1yp.beginTransaction();
                                    acquire.ATb();
                                    c1yp.setTransactionSuccessful();
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                }
                                workDatabase.beginTransaction();
                                z = true;
                                c2m2.Eei(EnumC48482Kp.ENQUEUED, str);
                                c2m2.EWu(str, System.currentTimeMillis());
                                c2m2.EK4(str, this.A08.A00);
                            }
                        } else {
                            if (!Bzz.A00()) {
                                this.A0H = -512;
                                workDatabase.beginTransaction();
                                z = true;
                                c2m2.Eei(EnumC48482Kp.ENQUEUED, str);
                                c2m2.EWu(str, System.currentTimeMillis());
                                c2m2.EK4(str, this.A08.A00);
                            }
                            workDatabase.setTransactionSuccessful();
                        }
                        c2m2.CnQ(-1L, str);
                        workDatabase.setTransactionSuccessful();
                        workDatabase.endTransaction();
                    } catch (Throwable th3) {
                        workDatabase.endTransaction();
                        A00(false);
                        throw th3;
                    }
                }
                A00(z);
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
    }
}
