package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.UJz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66494UJz extends SwipeRefreshLayout {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean A0A() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.canScrollVertically(-1);
        }
        return super.A0A();
    }

    public void setProgressViewOffset(float f) {
        this.A01 = f;
        if (this.A03) {
            int i = super.A01;
            A08(Math.round(WF1.A01(f)) - i, Math.round(WF1.A01(f + 64.0f) - i));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.A06 = z;
        if (this.A03) {
            super.setRefreshing(z);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.A00);
                if (this.A04 || abs > this.A02) {
                    this.A04 = true;
                    return false;
                }
            }
        } else {
            this.A00 = motionEvent.getX();
            this.A04 = false;
        }
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        XC4 A00 = C69828VwE.A00(this);
        if (A00 != null) {
            A00.D35(motionEvent, this);
        }
        this.A05 = true;
        AbstractC65703TsZ.A1J(this, true);
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A03) {
            this.A03 = true;
            setProgressViewOffset(this.A01);
            setRefreshing(this.A06);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1471655419);
        if (motionEvent.getActionMasked() == 1 && this.A05) {
            XC4 A00 = C69828VwE.A00(this);
            if (A00 != null) {
                A00.D30(motionEvent, this);
            }
            this.A05 = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-2134075328, A05);
        return onTouchEvent;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        AbstractC65703TsZ.A1J(this, z);
    }
}
