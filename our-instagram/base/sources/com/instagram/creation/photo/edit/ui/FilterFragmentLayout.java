package com.instagram.creation.photo.edit.ui;

import X.C14360o3;
import X.C8Z9;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class FilterFragmentLayout extends ConstraintLayout {
    public C8Z9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterFragmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    public final C8Z9 getCameraStickyToastController() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r3 <= (r1 + r5.getHeight())) goto L18;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.8Z9 r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L3c
            boolean r0 = r0.A05()
            if (r0 != r6) goto L3c
            X.8Z9 r0 = r7.A00
            if (r0 == 0) goto L41
            android.view.View r5 = r0.A00
            r1 = 0
            if (r5 == 0) goto L41
            if (r8 == 0) goto L41
            float r0 = r8.getRawX()
            int r4 = (int) r0
            float r0 = r8.getRawY()
            int r3 = (int) r0
            r0 = 2
            int[] r0 = new int[r0]
            r5.getLocationOnScreen(r0)
            r2 = r0[r1]
            r1 = r0[r6]
            if (r4 < r2) goto L41
            int r0 = r5.getWidth()
            int r2 = r2 + r0
            if (r4 > r2) goto L41
            if (r3 < r1) goto L41
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            if (r3 > r1) goto L41
        L3c:
            boolean r0 = super.onInterceptTouchEvent(r8)
            return r0
        L41:
            X.8Z9 r0 = r7.A00
            if (r0 == 0) goto L3c
            r0.A04(r6)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.ui.FilterFragmentLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCameraStickyToastController(C8Z9 c8z9) {
        this.A00 = c8z9;
    }

    public /* synthetic */ FilterFragmentLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
