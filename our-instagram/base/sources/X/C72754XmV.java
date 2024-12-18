package X;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.XmV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72754XmV {
    public LightweightQuickPerformanceLogger A00;
    public String A01;
    public double[] A02;

    public C72754XmV(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str) {
        Display defaultDisplay;
        this.A00 = lightweightQuickPerformanceLogger;
        this.A01 = str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && defaultDisplay.getSupportedRefreshRates() != null) {
            int length = defaultDisplay.getSupportedRefreshRates().length;
            double[] dArr = new double[length];
            for (int i = 0; i < length; i++) {
                dArr[i] = r5[i];
            }
            this.A02 = dArr;
        }
    }
}
