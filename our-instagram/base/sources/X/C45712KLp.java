package X;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import java.util.List;

/* renamed from: X.KLp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45712KLp extends AbstractRunnableC14200nk {
    public final /* synthetic */ C44125Jep A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45712KLp(C44125Jep c44125Jep, List list) {
        super(457641138, 3, false, false);
        this.A00 = c44125Jep;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C72108XOe A01 = this.A00.A05.A01();
            List list = this.A01;
            C1YP c1yp = A01.A01;
            c1yp.beginTransaction();
            try {
                C14360o3.A0B(list, 0);
                c1yp.assertNotSuspendingTransaction();
                AbstractC29601bb abstractC29601bb = A01.A02;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                try {
                    c1yp.beginTransaction();
                    try {
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        abstractC29601bb.release(acquire);
                        c1yp.assertNotSuspendingTransaction();
                        c1yp.beginTransaction();
                        try {
                            A01.A00.insert((Iterable) list);
                            c1yp.setTransactionSuccessful();
                            c1yp.endTransaction();
                            c1yp.setTransactionSuccessful();
                        } catch (Throwable th) {
                            c1yp.endTransaction();
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    abstractC29601bb.release(acquire);
                    throw th2;
                }
            } finally {
            }
        } catch (Exception e) {
            if (!(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteReadOnlyDatabaseException)) {
                throw e;
            }
            C0w9.A07("Error clearing Ranking Models", e);
        }
    }
}
