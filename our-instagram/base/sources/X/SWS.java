package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class SWS {
    public static volatile SWS A03;
    public boolean A00;
    public final SHF A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    public static SWS A00(Context context) {
        if (A03 == null) {
            synchronized (SWS.class) {
                if (A03 == null) {
                    A03 = new SWS(context.getApplicationContext());
                }
            }
        }
        return A03;
    }

    public SWS(Context context) {
        this.A01 = new SHF(new C63864Suw(this), new C63886SvK(new C63885SvJ(context, this)));
    }
}
