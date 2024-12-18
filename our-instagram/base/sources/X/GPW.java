package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GPW implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C35129FeW A01;
    public final /* synthetic */ C2OG A02;

    public GPW(Context context, C35129FeW c35129FeW, C2OG c2og) {
        this.A02 = c2og;
        this.A01 = c35129FeW;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2OG c2og = this.A02;
        C2OG.A02(this.A00, this.A01, c2og);
    }
}
