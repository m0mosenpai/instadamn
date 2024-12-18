package com.instagram.ui.recyclerpager;

import X.AbstractC13620mo;
import X.AbstractC70663Fe;
import X.C0f9;
import X.C70623Ez;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class HorizontalRecyclerPager extends RecyclerView {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public HorizontalRecyclerPager(Context context) {
        super(context, null);
        this.A02 = 0;
        this.A01 = 0;
        this.A04 = false;
        this.A05 = false;
        A00();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A1E(int i, int i2) {
        if (this.A04) {
            return super.A1E(i, i2);
        }
        this.A02 = i;
        return true;
    }

    public final void A1H() {
        int right;
        boolean z = this.A03;
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        abstractC70663Fe.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        View A0d = linearLayoutManager.A0d(linearLayoutManager.A1c());
        if (A0d != null) {
            if (z) {
                right = ((A0d.getLeft() - AbstractC70663Fe.A0B(A0d)) - getWidth()) + this.A01;
            } else {
                right = (A0d.getRight() + AbstractC70663Fe.A0D(A0d)) - this.A01;
            }
            A0t(right, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Fe, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AutoMeasureLinearLayoutManager] */
    private void A00() {
        Context context = getContext();
        this.A03 = AbstractC13620mo.A02(context);
        ?? linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A00 = true;
        linearLayoutManager.A00 = false;
        setLayoutManager(linearLayoutManager);
        this.A0S = true;
        setItemAnimator(new C70623Ez());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int A05 = C0f9.A05(1078189374);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A04) {
            i = -96762475;
        } else {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    AbstractC70663Fe abstractC70663Fe = this.A0D;
                    abstractC70663Fe.getClass();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
                    int A1a = linearLayoutManager.A1a();
                    if (this.A05) {
                        A1a += 2;
                    }
                    View A0d = linearLayoutManager.A0d(A1a);
                    if (A0d != null) {
                        int right = A0d.getRight() + AbstractC70663Fe.A0D(A0d);
                        int left = A0d.getLeft() - AbstractC70663Fe.A0B(A0d);
                        getMeasuredWidth();
                        A0d.getMeasuredWidth();
                        int i4 = this.A01;
                        int i5 = this.A02;
                        if (i5 > 0 || (i5 == 0 && Math.abs(right) < Math.abs(left))) {
                            if (this.A05 && this.A03) {
                                i2 = (int) ((right - i4) * 0.98d);
                            } else if (this.A03) {
                                i2 = (right - getWidth()) + this.A00 + this.A01;
                            } else {
                                i2 = (right + this.A00) - i4;
                            }
                            A0t(i2, 0);
                        } else {
                            if (this.A05 && !this.A03) {
                                i3 = (int) (((getWidth() - left) - this.A01) * (-0.98d));
                            } else if (this.A03) {
                                i3 = ((left - getWidth()) - this.A00) + this.A01;
                            } else {
                                i3 = (left - this.A00) - i4;
                            }
                            A0t(i3, 0);
                            if (getScrollState() == 1) {
                                A0k();
                            }
                        }
                    }
                }
            } else {
                this.A02 = 0;
            }
            i = -1142866302;
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    public void setExtraScroll(int i) {
        this.A00 = i;
    }

    public void setHorizontalPeekOffset(int i) {
        this.A01 = i;
    }

    public void setSnappingDisabled(boolean z) {
        this.A04 = z;
    }

    public void setUseQuadCardSnapping(boolean z) {
        this.A05 = z;
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        this.A01 = 0;
        this.A04 = false;
        this.A05 = false;
        A00();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = 0;
        this.A01 = 0;
        this.A04 = false;
        this.A05 = false;
        A00();
    }
}
