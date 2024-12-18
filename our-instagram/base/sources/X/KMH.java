package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;

/* loaded from: classes8.dex */
public final class KMH extends AbstractRunnableC14200nk {
    public final /* synthetic */ C32251gB A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ Long A02;

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis;
        Long l = this.A01;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        AbstractC207749He.A00();
        UserSession userSession = this.A00.A00;
        C14360o3.A0B(userSession, 0);
        C99X A00 = C99V.A00(userSession);
        long longValue = this.A02.longValue();
        ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = A00.A01.A02;
        KOF kof = (KOF) armadilloExpressEncryptedBackupDatabase.A01();
        C1YP c1yp = kof.A00;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = kof.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, longValue);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
                c1yp.endTransaction();
                abstractC29601bb.release(acquire);
                KOE koe = (KOE) armadilloExpressEncryptedBackupDatabase.A00();
                C1YP c1yp2 = koe.A00;
                c1yp2.assertNotSuspendingTransaction();
                AbstractC29601bb abstractC29601bb2 = koe.A02;
                InterfaceC37561ot acquire2 = abstractC29601bb2.acquire();
                acquire2.ADi(1, longValue);
                c1yp2.beginTransaction();
                acquire2.ATb();
                c1yp2.setTransactionSuccessful();
                c1yp2.endTransaction();
                abstractC29601bb2.release(acquire2);
                C2059699y c2059699y = (C2059699y) armadilloExpressEncryptedBackupDatabase.A02();
                c1yp = c2059699y.A00;
                c1yp.assertNotSuspendingTransaction();
                abstractC29601bb = c2059699y.A01;
                acquire = abstractC29601bb.acquire();
                acquire.ADi(1, longValue);
                c1yp.beginTransaction();
                acquire.ATb();
                c1yp.setTransactionSuccessful();
                abstractC29601bb.release(acquire);
                AbstractC207749He.A00();
                JVE.A01(userSession).A0A(longValue, currentTimeMillis);
            } finally {
                c1yp.endTransaction();
            }
        } catch (Throwable th) {
            abstractC29601bb.release(acquire);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMH(C32251gB c32251gB, Long l, Long l2) {
        super(345018030);
        this.A00 = c32251gB;
        this.A01 = l;
        this.A02 = l2;
    }
}
