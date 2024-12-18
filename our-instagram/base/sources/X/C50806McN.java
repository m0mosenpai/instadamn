package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.McN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50806McN extends FrameLayout {
    public C66206U4c A00;
    public final int A01;

    public C50806McN(Context context, int i) {
        super(context, null);
        this.A01 = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        View view = this;
        while (viewGroup2 != null && !(viewGroup2 instanceof C66206U4c)) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            if (viewGroup2.getParent() instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewGroup2.getParent();
            } else {
                viewGroup = null;
            }
            view = viewGroup2;
            viewGroup2 = viewGroup;
        }
        if ((view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && viewGroup2 != null) {
            C66206U4c c66206U4c = (C66206U4c) viewGroup2;
            this.A00 = c66206U4c;
            int i3 = this.A01;
            if (i3 > Integer.MIN_VALUE) {
                ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view);
                A0G.topMargin = i3;
                view.setLayoutParams(A0G);
                c66206U4c.requestLayout();
            }
        } else {
            C0K8.A0C("SparkAvatarView", "could not apply negative top margin as layoutParams not of type marginLayoutParams");
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
