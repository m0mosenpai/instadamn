package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: X.M7o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50051M7o implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public CallableC50051M7o(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C1YP c1yp = this.A01.A02;
        c1yp.beginTransaction();
        try {
            C37581ov c37581ov = this.A00;
            boolean z2 = false;
            Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
            try {
                if (query.moveToFirst()) {
                    if (query.getInt(0) != 0) {
                        z2 = true;
                    }
                    z = Boolean.valueOf(z2);
                } else {
                    z = false;
                }
                c1yp.setTransactionSuccessful();
                return z;
            } finally {
                query.close();
                c37581ov.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
