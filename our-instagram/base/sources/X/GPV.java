package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GPV implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C31727DwY A01;
    public final /* synthetic */ C7XU A02;

    public GPV(Context context, C31727DwY c31727DwY, C7XU c7xu) {
        this.A02 = c7xu;
        this.A00 = context;
        this.A01 = c31727DwY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7XU c7xu = this.A02;
        if (c7xu != null) {
            c7xu.DAy();
        }
        Context context = this.A00;
        if (context != null) {
            this.A01.A07(context);
        }
    }
}
