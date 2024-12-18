package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8S8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8S8 {
    public static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    public static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    public static final int RELATIVE_DIR_FLAGS = 3158064;
    public static final Interpolator sDragScrollInterpolator = new Interpolator() { // from class: X.8S9
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return f * f * f * f * f;
        }
    };
    public static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() { // from class: X.8SA
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i, int i2) {
        int i3 = i & ABS_HORIZONTAL_DIR_FLAGS;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (i3 ^ (-1));
        int i5 = i3 << 2;
        if (i2 != 0) {
            int i6 = i3 << 1;
            i4 |= (-789517) & i6;
            i5 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i4 | i5;
    }

    public boolean canDropOver(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        return true;
    }

    public int convertToAbsoluteDirection(int i, int i2) {
        int i3 = i & RELATIVE_DIR_FLAGS;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (i3 ^ (-1));
        int i5 = i3 >> 2;
        if (i2 != 0) {
            int i6 = i3 >> 1;
            i4 |= (-3158065) & i6;
            i5 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i4 | i5;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(C3OO c3oo) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, C3OO c3oo);

    public float getSwipeEscapeVelocity(float f) {
        return f;
    }

    public float getSwipeThreshold(C3OO c3oo) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f) {
        return f;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public abstract boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2);

    public abstract void onSwiped(C3OO c3oo, int i);

    private int getMaxDragScroll(RecyclerView recyclerView) {
        int i = this.mCachedMaxScrollSpeed;
        if (i == -1) {
            int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            this.mCachedMaxScrollSpeed = dimensionPixelSize;
            return dimensionPixelSize;
        }
        return i;
    }

    public static int makeMovementFlags(int i, int i2) {
        int i3 = (i2 | i) << 0;
        return (i << 16) | (i2 << 8) | i3;
    }

    public C3OO chooseDropTarget(C3OO c3oo, List list, int i, int i2) {
        int left;
        int bottom;
        int width = i + c3oo.itemView.getWidth();
        int height = i2 + c3oo.itemView.getHeight();
        int left2 = i - c3oo.itemView.getLeft();
        int top = i2 - c3oo.itemView.getTop();
        int size = list.size();
        C3OO c3oo2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C3OO c3oo3 = (C3OO) list.get(i4);
            if (left2 <= 0 ? !(left2 >= 0 || (left = c3oo3.itemView.getLeft() - i) <= 0 || c3oo3.itemView.getLeft() >= c3oo.itemView.getLeft()) : !((left = c3oo3.itemView.getRight() - width) >= 0 || c3oo3.itemView.getRight() <= c3oo.itemView.getRight())) {
                int abs = Math.abs(left);
                if (abs > i3) {
                    c3oo2 = c3oo3;
                    i3 = abs;
                }
            }
            if (top >= 0 ? !(top <= 0 || (bottom = c3oo3.itemView.getBottom() - height) >= 0 || c3oo3.itemView.getBottom() <= c3oo.itemView.getBottom()) : !((bottom = c3oo3.itemView.getTop() - i2) <= 0 || c3oo3.itemView.getTop() >= c3oo.itemView.getTop())) {
                int abs2 = Math.abs(bottom);
                if (abs2 > i3) {
                    c3oo2 = c3oo3;
                    i3 = abs2;
                }
            }
        }
        return c3oo2;
    }

    public void clearView(RecyclerView recyclerView, C3OO c3oo) {
        View view = c3oo.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            view.setElevation(((Number) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
        C3F1 c3f1 = recyclerView.A0C;
        if (c3f1 == null) {
            if (i == 8) {
                return 200L;
            }
            return 250L;
        }
        if (i == 8) {
            return c3f1.A08();
        }
        return c3f1.A09();
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        View view = c3oo.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, List list, int i, float f, float f2) {
        float f3;
        float f4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AND and = (AND) list.get(i2);
            float f5 = and.A06;
            float f6 = and.A08;
            if (f5 == f6) {
                f3 = and.A0C.itemView.getTranslationX();
            } else {
                f3 = f5 + (and.A00 * (f6 - f5));
            }
            and.A01 = f3;
            float f7 = and.A07;
            float f8 = and.A09;
            if (f7 == f8) {
                f4 = and.A0C.itemView.getTranslationY();
            } else {
                f4 = f7 + (and.A00 * (f8 - f7));
            }
            and.A02 = f4;
            int save = canvas.save();
            onChildDraw(canvas, recyclerView, and.A0C, and.A01, and.A02, and.A0A, false);
            canvas.restoreToCount(save);
        }
        if (c3oo != null) {
            int save2 = canvas.save();
            onChildDraw(canvas, recyclerView, c3oo, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMoved(RecyclerView recyclerView, C3OO c3oo, int i, C3OO c3oo2, int i2, int i3, int i4) {
        int A08;
        int A0B;
        int A0D;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe instanceof InterfaceC70683Fg) {
            View view = c3oo.itemView;
            View view2 = c3oo2.itemView;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((InterfaceC70683Fg) abstractC70663Fe);
            linearLayoutManager.A1D("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.A1n();
            LinearLayoutManager.A06(linearLayoutManager);
            int A0C = AbstractC70663Fe.A0C(view);
            int A0C2 = AbstractC70663Fe.A0C(view2);
            char c = 65535;
            if (A0C < A0C2) {
                c = 1;
            }
            if (linearLayoutManager.A09) {
                A08 = linearLayoutManager.A06.A03();
                AbstractC70763Fo abstractC70763Fo = linearLayoutManager.A06;
                if (c == 1) {
                    A0B = abstractC70763Fo.A0D(view2) + linearLayoutManager.A06.A0B(view);
                } else {
                    A0B = abstractC70763Fo.A08(view2);
                }
            } else {
                AbstractC70763Fo abstractC70763Fo2 = linearLayoutManager.A06;
                if (c == 65535) {
                    A0D = abstractC70763Fo2.A0D(view2);
                    linearLayoutManager.A1p(A0C2, A0D);
                    return;
                } else {
                    A08 = abstractC70763Fo2.A08(view2);
                    A0B = linearLayoutManager.A06.A0B(view);
                }
            }
            A0D = A08 - A0B;
            linearLayoutManager.A1p(A0C2, A0D);
            return;
        }
        if (abstractC70663Fe.A1X()) {
            View view3 = c3oo2.itemView;
            if (view3.getLeft() - AbstractC70663Fe.A0B(view3) <= recyclerView.getPaddingLeft()) {
                recyclerView.A0n(i2);
            }
            View view4 = c3oo2.itemView;
            if (view4.getRight() + AbstractC70663Fe.A0D(view4) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.A0n(i2);
            }
        }
        if (!abstractC70663Fe.A1Y()) {
            return;
        }
        if (abstractC70663Fe.A0W(c3oo2.itemView) <= recyclerView.getPaddingTop()) {
            recyclerView.A0n(i2);
        }
        if (abstractC70663Fe.A0V(c3oo2.itemView) < recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
            return;
        }
        recyclerView.A0n(i2);
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return convertToAbsoluteDirection(getMovementFlags(recyclerView, c3oo), recyclerView.getLayoutDirection());
    }

    public boolean hasDragFlag(RecyclerView recyclerView, C3OO c3oo) {
        if ((getAbsoluteMovementFlags(recyclerView, c3oo) & 16711680) == 0) {
            return false;
        }
        return true;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, C3OO c3oo) {
        if ((getAbsoluteMovementFlags(recyclerView, c3oo) & 65280) == 0) {
            return false;
        }
        return true;
    }

    public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        int maxDragScroll = getMaxDragScroll(recyclerView);
        float abs = Math.abs(i2);
        float f = 1.0f;
        int signum = (int) (((int) Math.signum(i2)) * maxDragScroll * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (abs * 1.0f) / i)));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (signum * sDragScrollInterpolator.getInterpolation(f));
        if (interpolation == 0) {
            if (i2 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, List list, int i, float f, float f2) {
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (c3oo != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            AND and = (AND) list.get(i3);
            if (and.A05 && !and.A03) {
                list.remove(i3);
            } else if (!and.A05) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void onSelectedChanged(C3OO c3oo, int i) {
    }

    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
    }
}
