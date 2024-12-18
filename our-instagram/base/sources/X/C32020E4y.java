package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.E4y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32020E4y extends C5SZ {
    public final int A00;
    public final int A01;
    public final GXT A02;

    public C32020E4y(Context context, GXT gxt) {
        C14360o3.A0B(gxt, 2);
        this.A02 = gxt;
        this.A01 = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.A00 = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent != null) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(y) >= this.A01 && Math.abs(f2) >= this.A00 && y > 0.0f) {
                this.A02.DrQ();
                return true;
            }
        }
        return false;
    }
}
