package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: X.M7r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50054M7r implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public CallableC50054M7r(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A02;
        C37581ov c37581ov = this.A00;
        String str = null;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            if (A00.moveToFirst() && !A00.isNull(0)) {
                str = A00.getString(0);
            }
            return str;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
