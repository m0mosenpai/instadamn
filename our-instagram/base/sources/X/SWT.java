package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.List;

/* loaded from: classes10.dex */
public final class SWT {
    public static Integer A03;
    public ViewTreeObserverOnPreDrawListenerC63517Sok A00;
    public final View A01;
    public final List A02 = AbstractC166987dD.A1E();

    public static int A00(SWT swt, int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            i4 = 0;
            int i5 = i - i3;
            if (i5 <= 0) {
                View view = swt.A01;
                if (!view.isLayoutRequested() && i2 == -2) {
                    android.util.Log.isLoggable("ViewTarget", 4);
                    Context context = view.getContext();
                    Integer num = A03;
                    if (num == null) {
                        Object systemService = context.getSystemService("window");
                        Rs8.A00(systemService);
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getSize(point);
                        num = Integer.valueOf(Math.max(point.x, point.y));
                        A03 = num;
                    }
                    return num.intValue();
                }
            } else {
                return i5;
            }
        }
        return i4;
    }

    public SWT(View view) {
        this.A01 = view;
    }
}
