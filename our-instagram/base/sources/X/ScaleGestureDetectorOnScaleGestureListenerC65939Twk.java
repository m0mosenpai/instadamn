package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.Twk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC65939Twk extends GestureDetectorOnGestureListenerC148016lX implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public final ScaleGestureDetector A01;
    public final InterfaceC1119453g A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleGestureDetectorOnScaleGestureListenerC65939Twk(Context context, InterfaceC1119253e interfaceC1119253e, InterfaceC1119453g interfaceC1119453g) {
        super(context, interfaceC1119253e);
        C14360o3.A0B(context, 1);
        this.A02 = interfaceC1119453g;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A01 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        scaleGestureDetector.setStylusScaleEnabled(false);
    }

    @Override // X.GestureDetectorOnGestureListenerC148016lX, X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A01.onTouchEvent(motionEvent);
        if (!this.A00 && !super.DMc(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.GestureDetectorOnGestureListenerC148016lX, X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        ScaleGestureDetector scaleGestureDetector = this.A01;
        scaleGestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.A00) {
            this.A00 = false;
            this.A02.onScaleEnd(scaleGestureDetector);
        }
        if (!this.A00) {
            super.Du7(motionEvent);
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        this.A00 = true;
        return this.A02.onScale(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        this.A00 = true;
        return this.A02.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        this.A02.onScaleEnd(scaleGestureDetector);
    }

    @Override // X.GestureDetectorOnGestureListenerC148016lX
    public final boolean A03() {
        if (!super.A00 && !this.A00) {
            return false;
        }
        return true;
    }
}
