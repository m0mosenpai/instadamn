package com.instagram.ui.gesture;

import X.C14360o3;
import X.C65847Tv8;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class GestureManagerFrameLayout extends FrameLayout {
    public C65847Tv8 A00;
    public boolean A01;
    public boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.A01 = false;
            this.A02 = false;
        }
        if (super.dispatchTouchEvent(motionEvent) || this.A02) {
            z = true;
        }
        C65847Tv8 c65847Tv8 = this.A00;
        if (c65847Tv8 != null) {
            Iterator it = c65847Tv8.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("isEnabled");
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r0.DMc(r6) == true) goto L15;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            X.Tv8 r4 = r5.A00
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L28
            boolean r0 = r4.A01
            if (r0 == 0) goto L28
            int r0 = r6.getActionMasked()
            if (r0 != 0) goto L17
            r0 = 0
            r4.A00 = r0
        L17:
            com.instagram.ui.gesture.GestureManagerFrameLayout r0 = r4.A02
            boolean r0 = r0.A01
            if (r0 != 0) goto L28
            X.6oF r0 = r4.A00
            if (r0 == 0) goto L2b
            boolean r0 = r0.DMc(r6)
            if (r0 != r1) goto L28
        L27:
            r3 = 1
        L28:
            r5.A02 = r3
            return r3
        L2b:
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            X.6oF r1 = (X.InterfaceC149626oF) r1
            boolean r0 = r1.DMc(r6)
            if (r0 == 0) goto L31
            r4.A00 = r1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.gesture.GestureManagerFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setGestureManager(C65847Tv8 c65847Tv8) {
        C14360o3.A0B(c65847Tv8, 0);
        this.A00 = c65847Tv8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A01 = z;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0.Du7(r7) == true) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 794679445(0x2f5dd895, float:2.0176778E-10)
            int r5 = X.C0f9.A05(r0)
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.Tv8 r4 = r6.A00
            r3 = 1
            if (r4 == 0) goto L45
            boolean r0 = r4.A01
            if (r0 == 0) goto L45
            r7.getActionMasked()
            X.6oF r0 = r4.A00
            if (r0 == 0) goto L2a
            boolean r0 = r0.Du7(r7)
            if (r0 != r3) goto L45
        L21:
            r6.A02 = r3
            r0 = 523358011(0x1f31cf3b, float:3.7652625E-20)
            X.C0f9.A0C(r0, r5)
            return r3
        L2a:
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r1 = r2.next()
            X.6oF r1 = (X.InterfaceC149626oF) r1
            boolean r0 = r1.Du7(r7)
            if (r0 == 0) goto L30
            r4.A00 = r1
            goto L21
        L45:
            r3 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.gesture.GestureManagerFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
