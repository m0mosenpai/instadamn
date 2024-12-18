package com.instagram.creation.capture;

import X.C0f9;
import X.C14360o3;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class RotateLayout extends ViewGroup {
    public int A00;
    public View A01;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.A00;
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 != 270) {
                        return;
                    }
                }
            }
            View view = this.A01;
            C14360o3.A0A(view);
            view.layout(0, 0, i6, i5);
            return;
        }
        View view2 = this.A01;
        C14360o3.A0A(view2);
        view2.layout(0, 0, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r1 = r5.A00
            r4 = 0
            if (r1 == 0) goto L81
            r0 = 90
            if (r1 == r0) goto L69
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L81
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L69
            r3 = 0
        L12:
            r5.setMeasuredDimension(r4, r3)
            int r1 = r5.A00
            r2 = 0
            if (r1 == 0) goto L60
            r0 = 90
            if (r1 == r0) goto L4e
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L44
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L37
            android.view.View r1 = r5.A01
            X.C14360o3.A0A(r1)
            float r0 = (float) r4
            r1.setTranslationX(r0)
        L2f:
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            r0.setTranslationY(r2)
        L37:
            android.view.View r1 = r5.A01
            X.C14360o3.A0A(r1)
            int r0 = r5.A00
            float r0 = (float) r0
            float r0 = -r0
            r1.setRotation(r0)
            return
        L44:
            android.view.View r1 = r5.A01
            X.C14360o3.A0A(r1)
            float r0 = (float) r4
            r1.setTranslationX(r0)
            goto L56
        L4e:
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            r0.setTranslationX(r2)
        L56:
            android.view.View r1 = r5.A01
            X.C14360o3.A0A(r1)
            float r0 = (float) r3
            r1.setTranslationY(r0)
            goto L37
        L60:
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            r0.setTranslationX(r2)
            goto L2f
        L69:
            android.view.View r0 = r5.A01
            r5.measureChild(r0, r7, r6)
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            int r4 = r0.getMeasuredHeight()
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            int r3 = r0.getMeasuredWidth()
            goto L12
        L81:
            android.view.View r0 = r5.A01
            r5.measureChild(r0, r6, r7)
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            int r4 = r0.getMeasuredWidth()
            android.view.View r0 = r5.A01
            X.C14360o3.A0A(r0)
            int r3 = r0.getMeasuredHeight()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.RotateLayout.onMeasure(int, int):void");
    }

    public final void setOrientation(int i) {
        int i2 = i % 360;
        if (this.A00 != i2) {
            this.A00 = i2;
            requestLayout();
        }
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.color.transparent);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1651369656);
        View childAt = getChildAt(0);
        this.A01 = childAt;
        C14360o3.A0A(childAt);
        childAt.setPivotX(0.0f);
        View view = this.A01;
        C14360o3.A0A(view);
        view.setPivotY(0.0f);
        C0f9.A0D(-561552152, A06);
    }
}
