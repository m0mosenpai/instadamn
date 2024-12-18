package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B14 implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C142456c7 A01;

    public B14(C37581ov c37581ov, C142456c7 c142456c7) {
        this.A01 = c142456c7;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A07;
        C37581ov c37581ov = this.A00;
        Long l = null;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            if (A00.moveToFirst() && !A00.isNull(0)) {
                l = Long.valueOf(A00.getLong(0));
            }
            return l;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
