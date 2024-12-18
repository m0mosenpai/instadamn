package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class YJ5 implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C164447Xj A01;

    public YJ5(C37581ov c37581ov, C164447Xj c164447Xj) {
        this.A01 = c164447Xj;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A00;
        C37581ov c37581ov = this.A00;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            int A01 = AbstractC37601ox.A01(A00, "intervention_type");
            int A012 = AbstractC37601ox.A01(A00, "total_impressions");
            int A013 = AbstractC37601ox.A01(A00, "last_impression_timestamp");
            ArrayList A17 = AbstractC25225BEi.A17(A00.getCount());
            while (A00.moveToNext()) {
                A17.add(new XVW(A00.getString(A01), A00.getLong(A012), A00.getLong(A013)));
            }
            return A17;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
