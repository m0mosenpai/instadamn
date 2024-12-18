package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.Aft, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23782Aft implements BEF {
    @Override // X.InterfaceC131365wR
    public final boolean DhV(C124425jy c124425jy) {
        A00("onRotate");
        return true;
    }

    @Override // X.InterfaceC131365wR
    public final boolean DhW(C124425jy c124425jy) {
        A00("onRotateBegin");
        return true;
    }

    @Override // X.BEF
    public final void DuA(MotionEvent motionEvent, View view) {
        A00("onTouchEvent");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        A00("onDown");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        A00("onFling");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        A00("onLongPress");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        A00("onScale");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        A00("onScaleBegin");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        A00("onScaleEnd");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        A00("onScroll");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        A00("onShowPress");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        A00("onSingleTapUp");
        return true;
    }

    public static final void A00(String str) {
        C18950wb.A00("MEDIA_TRANSFORM_GESTURE_CONTROLLER", 817898841, false).ABW("precapture function name", str);
    }
}
