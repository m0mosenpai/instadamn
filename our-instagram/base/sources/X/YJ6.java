package X;

import android.database.Cursor;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class YJ6 implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C164447Xj A01;

    public YJ6(C37581ov c37581ov, C164447Xj c164447Xj) {
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
            int A012 = AbstractC37601ox.A01(A00, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A013 = AbstractC37601ox.A01(A00, "total_impressions");
            int A014 = AbstractC37601ox.A01(A00, "last_impression_timestamp");
            ArrayList A17 = AbstractC25225BEi.A17(A00.getCount());
            while (A00.moveToNext()) {
                A17.add(new XVX(A00.getLong(A013), A00.getString(A01), A00.getLong(A014), A00.getString(A012)));
            }
            return A17;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
