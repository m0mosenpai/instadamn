package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes10.dex */
public final class SWU {
    public static SWU A03;
    public Context A00;
    public final int A01;
    public final C1UM A02;

    public static synchronized SWU A00(Context context) {
        SWU swu;
        synchronized (SWU.class) {
            swu = A03;
            if (swu == null) {
                swu = new SWU(context);
                A03 = swu;
            }
        }
        return swu;
    }

    public SWU(Context context) {
        C62463SCq c62463SCq;
        synchronized (C62463SCq.class) {
            c62463SCq = C62463SCq.A01;
            if (c62463SCq == null) {
                c62463SCq = new C62463SCq(context);
                C62463SCq.A01 = c62463SCq;
            }
        }
        this.A02 = c62463SCq.A00;
        this.A01 = BuildConstants.A01();
        C1UM c1um = this.A02;
        int i = c1um.getInt("native_version", -1);
        if (i == -1 || i != this.A01) {
            C1ZT AR9 = c1um.AR9();
            AR9.A04();
            AR9.A07("native_version", this.A01);
            AR9.A0B();
        }
        this.A00 = context.getApplicationContext();
    }
}
