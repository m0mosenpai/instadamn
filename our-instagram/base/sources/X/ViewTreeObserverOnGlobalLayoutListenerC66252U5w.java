package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.U5w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC66252U5w implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        Rect rect = new Rect();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(rect);
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            i = point.y - view.getRootWindowInsets().getStableInsetBottom();
        } else {
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - rect.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<XCz> list = this.A03;
                synchronized (list) {
                    for (XCz xCz : list) {
                        if (xCz != null) {
                            xCz.DnI(i2);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i2 > i3) {
            List<XCz> list2 = this.A03;
            synchronized (list2) {
                for (XCz xCz2 : list2) {
                    if (xCz2 != null) {
                        xCz2.DnH(i2);
                    }
                }
            }
            return;
        }
        if (i2 < i3) {
            this.A00 = false;
            List<XCz> list3 = this.A03;
            synchronized (list3) {
                for (XCz xCz3 : list3) {
                    if (xCz3 != null) {
                        xCz3.DnG();
                    }
                }
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC66252U5w(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float A00 = 100.0f * AbstractC65702TsY.A00(view.getContext());
        if (A00 >= 0.0f) {
            f = A00 + 0.5f;
        } else {
            f = A00 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
