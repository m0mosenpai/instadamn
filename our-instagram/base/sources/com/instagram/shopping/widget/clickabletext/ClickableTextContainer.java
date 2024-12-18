package com.instagram.shopping.widget.clickabletext;

import X.C0f9;
import X.C1342364l;
import X.C14360o3;
import X.InterfaceC43388JFd;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ClickableTextContainer extends LinearLayout {
    public InterfaceC43388JFd A00;
    public final C1342364l A01;

    public ClickableTextContainer(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        setAlpha(((1.0f - this.A01.A00) * 0.3f) + 0.7f);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1440307382);
        C14360o3.A0B(motionEvent, 0);
        boolean z = false;
        if (super.onTouchEvent(motionEvent)) {
            z = true;
        }
        C0f9.A0C(805195058, A05);
        return z;
    }

    public final void setOnTouchListener(InterfaceC43388JFd interfaceC43388JFd) {
        this.A00 = interfaceC43388JFd;
    }

    public ClickableTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.A01 = new C1342364l(this);
    }

    public ClickableTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ ClickableTextContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
