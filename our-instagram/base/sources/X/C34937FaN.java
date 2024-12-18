package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.FaN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34937FaN {
    public C1FE A00;
    public final Context A01;

    public static final synchronized C1FE A00(C34937FaN c34937FaN) {
        C1FE c1fe;
        synchronized (c34937FaN) {
            c1fe = c34937FaN.A00;
            if (c1fe == null) {
                Context applicationContext = c34937FaN.A01.getApplicationContext();
                Map map = C1FE.A09;
                c1fe = new C1FF(applicationContext, "onetap_prefs").A00();
                c34937FaN.A00 = c1fe;
            }
        }
        return c1fe;
    }

    public C34937FaN(Context context) {
        this.A01 = context;
    }
}
