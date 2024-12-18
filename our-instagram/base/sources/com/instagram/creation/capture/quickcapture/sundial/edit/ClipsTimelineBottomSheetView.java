package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC13880nE;
import X.C008102v;
import X.C0f9;
import X.C14360o3;
import X.C55639OnO;
import X.InterfaceC57816Pki;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClipsTimelineBottomSheetView extends ConstraintLayout {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public InterfaceC57816Pki A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public GestureDetector.OnGestureListener A0B;
    public C008102v A0C;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return A00(motionEvent, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public final InterfaceC57816Pki getDelegate() {
        return this.A05;
    }

    public /* synthetic */ ClipsTimelineBottomSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fe, code lost:
    
        if (r4.A0H == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r4.A0H != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r1 = 0.4105f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        r3.remove(java.lang.Float.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(android.view.MotionEvent r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView.A00(android.view.MotionEvent, boolean):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1094566501);
        C14360o3.A0B(motionEvent, 0);
        boolean A00 = A00(motionEvent, false);
        if (A00) {
            performClick();
        }
        C0f9.A0C(231961860, A05);
        return A00;
    }

    public final void setDelegate(InterfaceC57816Pki interfaceC57816Pki) {
        this.A05 = interfaceC57816Pki;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsTimelineBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C55639OnO c55639OnO = new C55639OnO(this);
        this.A0B = c55639OnO;
        C008102v c008102v = new C008102v(context, c55639OnO);
        this.A0C = c008102v;
        c008102v.A00.setIsLongpressEnabled(false);
        this.A00 = AbstractC13880nE.A04(context, 16);
    }
}
