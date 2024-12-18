package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

/* loaded from: classes7.dex */
public abstract class IA0 {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.5vh] */
    public static final C130935vh A00(Context context, C38620GyN c38620GyN) {
        MotionEvent motionEvent;
        AbstractC167017dG.A1N(c38620GyN, context);
        MotionEvent motionEvent2 = c38620GyN.A03;
        if (motionEvent2 != null && (motionEvent = c38620GyN.A02) != null) {
            DisplayMetrics A0I = AbstractC13880nE.A0I(context);
            float rawX = motionEvent2.getRawX();
            C14360o3.A0B(A0I, 0);
            float f = rawX / A0I.density;
            float rawY = motionEvent2.getRawY() / A0I.density;
            float rawX2 = motionEvent.getRawX() / A0I.density;
            float rawY2 = motionEvent.getRawY();
            float f2 = A0I.density;
            float f3 = rawY2 / f2;
            float f4 = c38620GyN.A00 / f2;
            float f5 = c38620GyN.A01 / f2;
            ?? obj = new Object();
            obj.A02 = f;
            obj.A03 = rawY;
            obj.A00 = rawX2;
            obj.A01 = f3;
            obj.A04 = f4;
            obj.A05 = f5;
            return obj;
        }
        return null;
    }
}
