package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: X.Wqn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71258Wqn implements Runnable {
    public final /* synthetic */ C70461WWy A00;

    public RunnableC71258Wqn(C70461WWy c70461WWy) {
        this.A00 = c70461WWy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int scrollY;
        float y;
        int height;
        C70461WWy c70461WWy = this.A00;
        if (c70461WWy.A01 != null) {
            ViewGroup viewGroup = c70461WWy.A04;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
            if (viewGroup2 != null) {
                boolean z = c70461WWy.A05;
                if (z) {
                    scrollY = viewGroup.getScrollX();
                } else {
                    scrollY = viewGroup.getScrollY();
                }
                for (int i = c70461WWy.A01.A00; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (z) {
                        y = childAt.getX();
                        height = childAt.getWidth();
                    } else {
                        y = childAt.getY();
                        height = childAt.getHeight();
                    }
                    if (y + height > scrollY || i == viewGroup2.getChildCount() - 1) {
                        c70461WWy.A02 = new WeakReference(childAt);
                        Rect rect = new Rect();
                        childAt.getHitRect(rect);
                        c70461WWy.A00 = rect;
                        return;
                    }
                }
            }
        }
    }
}
