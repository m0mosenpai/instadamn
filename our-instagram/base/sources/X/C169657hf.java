package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169657hf extends RecyclerView implements InterfaceC170737jQ {
    public InterfaceC168047ez A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.A02) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.A03) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (this.A04) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (this.A05) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC168047ez interfaceC168047ez = this.A00;
        if (interfaceC168047ez != null) {
            ((C166607cW) interfaceC168047ez).A00.onTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        List list = this.A01;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C170507j3 c170507j3 = (C170507j3) this.A01.get(i);
                getChildCount();
                C2Z5.A0J(c170507j3.A00);
            }
        }
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A05 = z;
    }

    public void setTouchInterceptor(InterfaceC168047ez interfaceC168047ez) {
        this.A00 = interfaceC168047ez;
    }
}
