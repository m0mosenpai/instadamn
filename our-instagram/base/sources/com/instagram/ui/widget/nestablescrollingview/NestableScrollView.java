package com.instagram.ui.widget.nestablescrollingview;

import X.C0f9;
import X.C130735vM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: classes3.dex */
public class NestableScrollView extends ScrollView {
    public final C130735vM A00;

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A00.A01(motionEvent, this, false);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        C130735vM c130735vM = this.A00;
        c130735vM.A00 = i;
        c130735vM.A01 = false;
    }

    public void setPassThroughOnOverScroll(boolean z) {
        this.A00.A02 = z;
        setOverScrollMode(2);
    }

    public NestableScrollView(Context context) {
        super(context);
        this.A00 = new C130735vM(getContext());
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1263435863);
        this.A00.A00(motionEvent, this);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-100652460, A05);
        return onTouchEvent;
    }

    public NestableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C130735vM(getContext());
    }

    public NestableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C130735vM(getContext());
    }
}
