package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JbQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43915JbQ {
    public ViewTreeObserver.OnDrawListener A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public boolean A03;
    public final C43916JbR A04;
    public final boolean A05;

    public C43915JbQ(C43916JbR c43916JbR, boolean z) {
        C14360o3.A0B(c43916JbR, 2);
        this.A05 = z;
        this.A04 = c43916JbR;
    }

    public final void A00() {
        ViewTreeObserver viewTreeObserver;
        this.A03 = false;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A01;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            ViewTreeObserver.OnDrawListener onDrawListener = this.A00;
            if (onDrawListener != null) {
                viewTreeObserver.removeOnDrawListener(onDrawListener);
            }
        }
    }
}
