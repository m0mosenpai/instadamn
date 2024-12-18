package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class UA5 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ WO6 A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public UA5(WO6 wo6) {
        this.A00 = wo6;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double max;
        WO6 wo6 = this.A00;
        Integer num = wo6.A00;
        if (num == C05F.A0N) {
            return false;
        }
        double d = f2;
        if (num == C05F.A0C) {
            max = Math.min(d, -2000.0d);
        } else {
            max = Math.max(d, 2000.0d);
        }
        WO6.A00(wo6, max);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        WO6 wo6 = this.A00;
        if (f2 > 0.0f) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        wo6.A00 = num;
        View view = wo6.A01;
        float max = Math.max(0.0f, view.getTranslationY() - f2);
        if (Float.compare(max, 0.0f) == 0) {
            wo6.A00 = C05F.A0N;
        }
        view.setTranslationY(max);
        return true;
    }
}
