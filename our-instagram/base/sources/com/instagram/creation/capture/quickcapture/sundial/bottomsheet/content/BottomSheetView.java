package com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content;

import X.AbstractC13880nE;
import X.C0f9;
import X.C14360o3;
import X.C55638OnN;
import X.InterfaceC57815Pkh;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class BottomSheetView extends ConstraintLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public InterfaceC57815Pkh A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public GestureDetector.OnGestureListener A0A;
    public GestureDetector A0B;
    public final double A0C;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return A00(motionEvent, true);
    }

    public final InterfaceC57815Pkh getDelegate() {
        return this.A04;
    }

    public /* synthetic */ BottomSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01e0, code lost:
    
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(android.view.MotionEvent r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView.A00(android.view.MotionEvent, boolean):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(680043681);
        C14360o3.A0B(motionEvent, 0);
        boolean A00 = A00(motionEvent, false);
        if (A00) {
            performClick();
        }
        C0f9.A0C(-1768615237, A05);
        return A00;
    }

    public final void setDelegate(InterfaceC57815Pkh interfaceC57815Pkh) {
        this.A04 = interfaceC57815Pkh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C55638OnN c55638OnN = new C55638OnN(this);
        this.A0A = c55638OnN;
        GestureDetector gestureDetector = new GestureDetector(context, c55638OnN);
        this.A0B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0C = AbstractC13880nE.A04(context, 16);
    }
}
