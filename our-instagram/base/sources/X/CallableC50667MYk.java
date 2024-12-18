package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: X.MYk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC50667MYk implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public CallableC50667MYk(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A02;
        c1yp.beginTransaction();
        try {
            C37581ov c37581ov = this.A00;
            C5JK c5jk = null;
            Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
            try {
                if (query.moveToFirst()) {
                    c5jk = AbstractC50598MVj.A00(query.getString(0));
                }
                c1yp.setTransactionSuccessful();
                return c5jk;
            } finally {
                query.close();
                c37581ov.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
