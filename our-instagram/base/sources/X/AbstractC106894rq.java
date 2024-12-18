package X;

import android.view.MotionEvent;

/* renamed from: X.4rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106894rq {
    public static final C1KO A00(MotionEvent motionEvent, String str) {
        C1KO c49v;
        C14360o3.A0B(str, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            long eventTime = motionEvent.getEventTime();
            long downTime = motionEvent.getDownTime();
            int actionIndex = motionEvent.getActionIndex();
            int pointerCount = motionEvent.getPointerCount();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int actionMasked2 = motionEvent.getActionMasked();
            boolean z = false;
            if (actionMasked2 == 3) {
                z = true;
            }
            c49v = new C107944td(str, rawX, rawY, actionIndex, pointerCount, eventTime, downTime, z);
            return c49v;
        }
        long eventTime2 = motionEvent.getEventTime();
        c49v = new C49v(str, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getActionIndex(), motionEvent.getPointerCount(), eventTime2);
        return c49v;
    }
}
