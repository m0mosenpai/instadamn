package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.util.Size;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.WeakHashMap;

/* renamed from: X.0nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13890nF {
    public static final WeakHashMap A00 = new WeakHashMap();

    public static final int A00(Context context) {
        C14360o3.A0B(context, 0);
        return A02(context).getHeight();
    }

    public static final int A01(Context context) {
        C14360o3.A0B(context, 0);
        return A02(context).getWidth();
    }

    public static final Size A02(Context context) {
        int i;
        int i2;
        Configuration configuration = context.getResources().getConfiguration();
        WeakHashMap weakHashMap = A00;
        Size size = (Size) weakHashMap.get(configuration);
        if (size == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object systemService = context.getSystemService("window");
                if (systemService != null) {
                    WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
                    C14360o3.A07(currentWindowMetrics);
                    i = currentWindowMetrics.getBounds().width();
                    i2 = currentWindowMetrics.getBounds().height();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                Point A0E = AbstractC13880nE.A0E(context);
                i = A0E.x;
                i2 = A0E.y;
            }
            Size size2 = new Size(i, i2);
            weakHashMap.put(configuration, size2);
            return size2;
        }
        return size;
    }
}
