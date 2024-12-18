package instagram.features.clips.viewer.ui;

import X.AbstractC13880nE;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.refresh.IgSwipeRefreshLayout;
import java.util.Stack;

/* loaded from: classes11.dex */
public final class ClipsSwipeRefreshLayout extends IgSwipeRefreshLayout {
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsSwipeRefreshLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewGroup viewGroup;
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            Stack stack = new Stack();
            stack.push(this);
            while (true) {
                z = false;
                z = false;
                z = false;
                if (stack.isEmpty()) {
                    break;
                }
                View view = (View) stack.pop();
                C14360o3.A0A(view);
                if (AbstractC13880nE.A0z(view, rawX, rawY)) {
                    if (view.canScrollVertically(-1)) {
                        z = true;
                        break;
                    }
                    if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                        break;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        stack.push(viewGroup.getChildAt(i));
                    }
                }
            }
            this.A00 = z;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean A0A() {
        if (!this.A00 && !super.A0A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
