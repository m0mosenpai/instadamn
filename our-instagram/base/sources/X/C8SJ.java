package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8SJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SJ extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ C8SB A01;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C8SJ(C8SB c8sb) {
        this.A01 = c8sb;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C8SB c8sb;
        View A03;
        C3OO A0Y;
        if (this.A00 && (A03 = (c8sb = this.A01).A03(motionEvent)) != null && (A0Y = c8sb.A0I.A0Y(A03)) != null) {
            C8S8 c8s8 = c8sb.A0F;
            if (c8s8.hasDragFlag(c8sb.A0I, A0Y)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = c8sb.A07;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    c8sb.A02 = x;
                    c8sb.A03 = y;
                    c8sb.A01 = 0.0f;
                    c8sb.A00 = 0.0f;
                    if (c8s8.isLongPressDragEnabled()) {
                        c8sb.A08(A0Y, 2);
                    }
                }
            }
        }
    }
}
