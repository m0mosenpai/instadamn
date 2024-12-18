package com.instagram.common.ui.widget.touchinterceptorlayout;

import X.C14360o3;
import X.C56052hs;
import X.EnumC56332iQ;
import X.InterfaceC56002hn;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TouchInterceptorFrameLayout extends FrameLayout implements InterfaceC56002hn {
    public int A00;
    public EnumC56332iQ A01;
    public final C56052hs A02;
    public final List A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchInterceptorFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(layoutParams, 2);
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void detachViewFromParent(View view) {
        C14360o3.A0B(view, 0);
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A02.A01(motionEvent);
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener) {
        C14360o3.A0B(onTouchListener, 0);
        this.A02.A00(onTouchListener, onTouchListener);
    }

    public final void A00(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        C56052hs c56052hs = this.A02;
        c56052hs.A00 = onTouchListener;
        c56052hs.A03.setOnTouchListener(onTouchListener2);
    }

    @Override // X.InterfaceC56002hn
    public final ViewGroup ACp() {
        return this;
    }

    @Override // X.InterfaceC56002hn
    public final void COs(View.OnTouchListener onTouchListener) {
        C56052hs c56052hs = this.A02;
        c56052hs.A00 = onTouchListener;
        c56052hs.A03.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC56002hn
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.A02.A02(z)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // X.InterfaceC56002hn
    public void setKeepObservingAfterRequestDisallowTouchEvent(boolean z) {
        this.A02.A02 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        EnumC56332iQ enumC56332iQ = this.A01;
        if (enumC56332iQ != EnumC56332iQ.A05 && Build.VERSION.SDK_INT >= 29) {
            int ordinal = enumC56332iQ.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                    } else {
                        int i8 = (i4 - i2) / 2;
                        int i9 = this.A00;
                        i6 = i8 - (i9 / 2);
                        i7 = i8 + (i9 / 2);
                        i5 = 0;
                    }
                } else {
                    i5 = (int) ((i3 - i) * 0.02d);
                    int i10 = (i4 - i2) / 2;
                    int i11 = this.A00;
                    i6 = i10 - (i11 / 2);
                    i7 = i10 + (i11 / 2);
                }
            } else {
                i5 = (int) ((i3 - i) * 0.02d);
                int i12 = (i4 - i2) / 2;
                i6 = i12 - 100;
                i7 = i12 + 100;
            }
            List list = this.A03;
            ((Rect) list.get(0)).set(i + i5, i6, i3 - i5, i7);
            setSystemGestureExclusionRects(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = EnumC56332iQ.A05;
        List singletonList = Collections.singletonList(new Rect(0, 0, 0, 0));
        C14360o3.A07(singletonList);
        this.A03 = singletonList;
        this.A02 = new C56052hs(context, attributeSet, this);
    }

    public void setAndSaveInterceptTouchEvent(View.OnTouchListener onTouchListener, View.OnTouchListener onTouchListener2) {
        C14360o3.A0B(onTouchListener, 0);
        C14360o3.A0B(onTouchListener2, 1);
        this.A02.A00(onTouchListener, onTouchListener2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
