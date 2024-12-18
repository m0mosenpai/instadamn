package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.8TM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TM extends C5SZ implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public final /* synthetic */ C8TI A01;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A00 = false;
        return super.onDown(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (!this.A00) {
            C8TI c8ti = this.A01;
            C8HI c8hi = c8ti.A0K;
            ShutterButton shutterButton = c8hi.A1I;
            if (shutterButton.A0i.A0A) {
                float f3 = c8ti.A00;
                float f4 = c8ti.A01;
                C184848Hz c184848Hz = c8hi.A0o;
                if (c8hi.A1M && c184848Hz != null) {
                    float zoomDragAvailableHeight = shutterButton.getZoomDragAvailableHeight();
                    if (c184848Hz.A09.get() == C8I1.A03) {
                        CameraAREffect cameraAREffect = c184848Hz.A07.A05.A09;
                        if ((cameraAREffect != null && cameraAREffect.A0Z.get("worldTracker") != null) || c184848Hz.A03.contains((int) f3, (int) f4)) {
                            return true;
                        }
                        float A02 = C17s.A02(((f4 - motionEvent2.getY()) - c184848Hz.A05.getScaledTouchSlop()) / zoomDragAvailableHeight, -1.0f, 1.0f);
                        float f5 = A02 * A02 * (3.0f - (2.0f * A02));
                        int i = 1;
                        if (A02 < 0.0f) {
                            i = -1;
                        }
                        float f6 = f5 * i;
                        if (f6 < 0.0f) {
                            f6 = C17s.A02(c184848Hz.A01 + f6, 0.0f, 100.0f);
                        }
                        c184848Hz.DCD(f6);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public C8TM(C8TI c8ti) {
        this.A01 = c8ti;
    }
}
