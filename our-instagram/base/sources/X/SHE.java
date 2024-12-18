package X;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;

/* loaded from: classes10.dex */
public final class SHE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    public SHE(ActivityManager activityManager, Context context, DisplayMetrics displayMetrics, float f) {
        this.A03 = context;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.A00 = i;
        int A0A = AbstractC166987dD.A0A(activityManager.getMemoryClass() * 1024 * 1024, activityManager.isLowRamDevice() ? 0.33f : 0.4f);
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int A0A2 = AbstractC166987dD.A0A(f, f2);
        int A0A3 = AbstractC166987dD.A0A(f2, 2.0f);
        int i2 = A0A - i;
        if (A0A3 + A0A2 <= i2) {
            this.A02 = A0A3;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.A02 = AbstractC166987dD.A0A(2.0f, f3);
            A0A2 = AbstractC166987dD.A0A(f3, f);
        }
        this.A01 = A0A2;
        if (android.util.Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(this.A03, this.A02);
            Formatter.formatFileSize(this.A03, this.A01);
            Formatter.formatFileSize(this.A03, i);
            Formatter.formatFileSize(this.A03, A0A);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
