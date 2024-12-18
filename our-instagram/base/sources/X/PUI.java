package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUI implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public PUI(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A02;
        c1yp.beginTransaction();
        try {
            C37581ov c37581ov = this.A00;
            O7S o7s = null;
            Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
            try {
                if (query.moveToFirst()) {
                    o7s = new O7S(query.getString(0), AbstractC50597MVi.A00(query.getString(1)));
                }
                c1yp.setTransactionSuccessful();
                return o7s;
            } finally {
                query.close();
                c37581ov.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
