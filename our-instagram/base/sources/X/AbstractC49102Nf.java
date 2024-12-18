package X;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49102Nf {
    public static final C49142Nl A00(final C2L0 c2l0, final C2L1 c2l1, final String str) {
        C14360o3.A0B(c2l1, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c2l0, 2);
        final C49142Nl c49142Nl = new C49142Nl();
        final C9G6 c9g6 = new C9G6(c2l0, c2l1, c49142Nl, str, 0);
        ((C2LB) c2l1.A06).A01.execute(new Runnable() { // from class: X.2OC
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                Throwable illegalStateException;
                C2L1 c2l12 = c2l1;
                String str3 = str;
                C49142Nl c49142Nl2 = c49142Nl;
                InterfaceC16820sZ interfaceC16820sZ = c9g6;
                C2L0 c2l02 = c2l0;
                C14360o3.A0B(c49142Nl2, 2);
                C14360o3.A0B(interfaceC16820sZ, 3);
                final WorkDatabase workDatabase = c2l12.A04;
                C2M2 A05 = workDatabase.A05();
                ArrayList CHr = A05.CHr(str3);
                if (CHr.size() > 1) {
                    str2 = "Can't apply UPDATE policy to the chains of work.";
                } else {
                    C2Zu c2Zu = (C2Zu) AbstractC001800i.A0J(CHr);
                    if (c2Zu != null) {
                        String str4 = c2Zu.A01;
                        C48412Ki CHq = A05.CHq(str4);
                        if (CHq == null) {
                            illegalStateException = new IllegalStateException(AnonymousClass001.A11("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"));
                            c49142Nl2.A00(new C2OB(illegalStateException));
                        }
                        if (CHq.A06 != 0) {
                            if (c2Zu.A00 == EnumC48482Kp.CANCELLED) {
                                A05.AOZ(str4);
                            } else {
                                C48412Ki c48412Ki = c2l02.A00;
                                EnumC48482Kp enumC48482Kp = c48412Ki.A0E;
                                String str5 = c48412Ki.A0I;
                                String str6 = c48412Ki.A0H;
                                C48532Kv c48532Kv = c48412Ki.A0C;
                                C48532Kv c48532Kv2 = c48412Ki.A0D;
                                long j = c48412Ki.A05;
                                long j2 = c48412Ki.A06;
                                long j3 = c48412Ki.A04;
                                C48562Ky c48562Ky = c48412Ki.A0B;
                                int i = c48412Ki.A02;
                                Integer num = c48412Ki.A0F;
                                long j4 = c48412Ki.A03;
                                long j5 = c48412Ki.A07;
                                long j6 = c48412Ki.A08;
                                long j7 = c48412Ki.A0A;
                                boolean z = c48412Ki.A0J;
                                Integer num2 = c48412Ki.A0G;
                                int i2 = c48412Ki.A01;
                                int i3 = c48412Ki.A0K;
                                long j8 = c48412Ki.A09;
                                int i4 = c48412Ki.A00;
                                int i5 = c48412Ki.A0L;
                                C14360o3.A0B(str4, 0);
                                C14360o3.A0B(str6, 3);
                                C14360o3.A0B(c48532Kv, 4);
                                C14360o3.A0B(c48532Kv2, 5);
                                C14360o3.A0B(c48562Ky, 9);
                                final C48412Ki c48412Ki2 = new C48412Ki(c48562Ky, c48532Kv, c48532Kv2, enumC48482Kp, num, num2, str4, str5, str6, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z);
                                try {
                                    C2MX c2mx = c2l12.A03;
                                    C14360o3.A07(c2mx);
                                    C14360o3.A07(c2l12.A02);
                                    final List list = c2l12.A07;
                                    C14360o3.A07(list);
                                    final java.util.Set set = c2l02.A01;
                                    final String str7 = c48412Ki2.A0M;
                                    final C48412Ki CHq2 = workDatabase.A05().CHq(str7);
                                    if (CHq2 != null) {
                                        if (!CHq2.A0E.A00()) {
                                            boolean z2 = false;
                                            if (CHq2.A06 != 0) {
                                                z2 = true;
                                            }
                                            boolean z3 = false;
                                            if (c48412Ki2.A06 != 0) {
                                                z3 = true;
                                            }
                                            if (!(z2 ^ z3)) {
                                                final boolean A052 = c2mx.A05(str7);
                                                if (!A052) {
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        ((InterfaceC48882Mg) it.next()).AGG(str7);
                                                    }
                                                }
                                                workDatabase.runInTransaction(new Runnable() { // from class: X.2aK
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        WorkDatabase workDatabase2 = WorkDatabase.this;
                                                        C48412Ki c48412Ki3 = CHq2;
                                                        C48412Ki c48412Ki4 = c48412Ki2;
                                                        String str8 = str7;
                                                        java.util.Set set2 = set;
                                                        boolean z4 = A052;
                                                        C2M2 A053 = workDatabase2.A05();
                                                        C2M5 A06 = workDatabase2.A06();
                                                        EnumC48482Kp enumC48482Kp2 = c48412Ki3.A0E;
                                                        int i6 = c48412Ki3.A02;
                                                        long j9 = c48412Ki3.A07;
                                                        int i7 = c48412Ki3.A0K + 1;
                                                        int i8 = c48412Ki3.A01;
                                                        long j10 = c48412Ki3.A09;
                                                        int i9 = c48412Ki3.A00;
                                                        String str9 = c48412Ki4.A0M;
                                                        String str10 = c48412Ki4.A0I;
                                                        String str11 = c48412Ki4.A0H;
                                                        C48532Kv c48532Kv3 = c48412Ki4.A0C;
                                                        C48532Kv c48532Kv4 = c48412Ki4.A0D;
                                                        long j11 = c48412Ki4.A05;
                                                        long j12 = c48412Ki4.A06;
                                                        long j13 = c48412Ki4.A04;
                                                        C48562Ky c48562Ky2 = c48412Ki4.A0B;
                                                        Integer num3 = c48412Ki4.A0F;
                                                        long j14 = c48412Ki4.A03;
                                                        long j15 = c48412Ki4.A08;
                                                        long j16 = c48412Ki4.A0A;
                                                        boolean z5 = c48412Ki4.A0J;
                                                        Integer num4 = c48412Ki4.A0G;
                                                        int i10 = c48412Ki4.A0L;
                                                        C14360o3.A0B(str11, 3);
                                                        C14360o3.A0B(c48532Kv3, 4);
                                                        C14360o3.A0B(c48532Kv4, 5);
                                                        C14360o3.A0B(c48562Ky2, 9);
                                                        C48412Ki c48412Ki5 = new C48412Ki(c48562Ky2, c48532Kv3, c48532Kv4, enumC48482Kp2, num3, num4, str9, str10, str11, i6, i8, i7, i9, i10, j11, j12, j13, j14, j9, j15, j16, j10, z5);
                                                        if (c48412Ki4.A00 == 1) {
                                                            c48412Ki5.A09 = c48412Ki4.A09;
                                                            c48412Ki5.A00++;
                                                        }
                                                        C2TF c2tf = (C2TF) A053;
                                                        C1YP c1yp = c2tf.A02;
                                                        c1yp.assertNotSuspendingTransaction();
                                                        c1yp.beginTransaction();
                                                        try {
                                                            c2tf.A00.A00(c48412Ki5);
                                                            c1yp.setTransactionSuccessful();
                                                            c1yp.endTransaction();
                                                            C52202aL c52202aL = (C52202aL) A06;
                                                            C1YP c1yp2 = c52202aL.A01;
                                                            c1yp2.assertNotSuspendingTransaction();
                                                            AbstractC29601bb abstractC29601bb = c52202aL.A02;
                                                            InterfaceC37561ot acquire = abstractC29601bb.acquire();
                                                            acquire.ADp(1, str8);
                                                            c1yp2.beginTransaction();
                                                            try {
                                                                acquire.ATb();
                                                                c1yp2.setTransactionSuccessful();
                                                                c1yp2.endTransaction();
                                                                abstractC29601bb.release(acquire);
                                                                A06.COi(str8, set2);
                                                                if (!z4) {
                                                                    A053.CnQ(-1L, str8);
                                                                    workDatabase2.A04().AOZ(str8);
                                                                }
                                                            } catch (Throwable th) {
                                                                c1yp2.endTransaction();
                                                                abstractC29601bb.release(acquire);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            c1yp.endTransaction();
                                                            throw th2;
                                                        }
                                                    }
                                                });
                                                if (!A052) {
                                                    C2VU.A00(workDatabase, list);
                                                }
                                            } else {
                                                C65033TcO c65033TcO = C65033TcO.A00;
                                                throw new UnsupportedOperationException(AnonymousClass001.A11("Can't update ", (String) c65033TcO.invoke(CHq2), " Worker to ", (String) c65033TcO.invoke(c48412Ki2), " Worker. Update operation must preserve worker's type."));
                                            }
                                        }
                                        c49142Nl2.A00(InterfaceC49162No.A01);
                                        return;
                                    }
                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Worker with ", str7, " doesn't exist"));
                                } catch (Throwable th) {
                                    c49142Nl2.A00(new C2OB(th));
                                    return;
                                }
                            }
                        } else {
                            str2 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.";
                        }
                    }
                    interfaceC16820sZ.invoke();
                    return;
                }
                illegalStateException = new UnsupportedOperationException(str2);
                c49142Nl2.A00(new C2OB(illegalStateException));
            }
        });
        return c49142Nl;
    }
}
