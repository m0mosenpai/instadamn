package X;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.7sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC176337sq implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Float A05;
    public final InterfaceC175067qg A06;
    public final InterfaceC174927qS A07;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC175067qg interfaceC175067qg = this.A06;
        if (!interfaceC175067qg.isConnected() || !this.A00 || !((Boolean) interfaceC175067qg.AlU().A01(AbstractC176767tY.A0f)).booleanValue()) {
            return false;
        }
        float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A01) / this.A07.getWidth();
        Float f = this.A05;
        if (f != null) {
            interfaceC175067qg.EmH(null, Math.min(1.0f, Math.max(-1.0f, (currentSpan * 2.0f) + f.floatValue())));
        } else {
            interfaceC175067qg.EhW(null, Math.min(this.A03, Math.max(this.A04, ((int) (currentSpan * (r3 - r2))) + this.A02)));
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ViewParent parent;
        InterfaceC175067qg interfaceC175067qg = this.A06;
        boolean z = false;
        if (interfaceC175067qg.isConnected() && this.A00 && ((Boolean) interfaceC175067qg.AlU().A01(AbstractC176767tY.A0f)).booleanValue()) {
            View view = this.A07.getView();
            z = true;
            if (view != null && (parent = view.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            Object A02 = interfaceC175067qg.Bty().A02(AbstractC176797tb.A11);
            A02.getClass();
            this.A02 = ((Number) A02).intValue();
            if (((Boolean) interfaceC175067qg.AlU().A01(AbstractC176767tY.A0U)).booleanValue()) {
                this.A05 = (Float) interfaceC175067qg.Bty().A02(AbstractC176797tb.A0t);
            }
            this.A03 = ((Number) interfaceC175067qg.AlU().A01(AbstractC176767tY.A0j)).intValue();
            this.A04 = ((Number) interfaceC175067qg.AlU().A01(AbstractC176767tY.A0l)).intValue();
            this.A01 = scaleGestureDetector.getCurrentSpan();
        }
        return z;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC176337sq(InterfaceC175067qg interfaceC175067qg, InterfaceC174927qS interfaceC174927qS) {
        this.A06 = interfaceC175067qg;
        this.A07 = interfaceC174927qS;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
