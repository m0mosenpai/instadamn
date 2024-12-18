package X;

import android.content.res.Configuration;
import android.util.DisplayMetrics;

/* renamed from: X.TPy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64693TPy implements Runnable {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ DisplayMetrics A01;
    public final /* synthetic */ Q22 A02;

    public RunnableC64693TPy(Configuration configuration, DisplayMetrics displayMetrics, Q22 q22) {
        this.A02 = q22;
        this.A00 = configuration;
        this.A01 = displayMetrics;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Q22 q22 = this.A02;
            if (!q22.A00) {
                q22.A01.updateConfiguration(this.A00, this.A01);
                q22.A00 = true;
            }
        } catch (Throwable unused) {
        }
    }
}
