package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.Gxb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38575Gxb extends C5SZ {
    public final Context A00;
    public final C86583tW A01;
    public final C50546MTb A02;

    public C38575Gxb(Context context, C86583tW c86583tW) {
        C14360o3.A0B(c86583tW, 2);
        this.A00 = context;
        this.A01 = c86583tW;
        this.A02 = new C50546MTb(context);
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC16610sE interfaceC16610sE;
        Object invoke;
        String A00;
        C14360o3.A0B(motionEvent2, 1);
        C38620GyN c38620GyN = new C38620GyN(motionEvent, motionEvent2, f, f2);
        int intValue = this.A02.A00(motionEvent, motionEvent2, f, f2, false).intValue();
        if (intValue != 3) {
            if (intValue == 2) {
                C86583tW c86583tW = this.A01;
                interfaceC16610sE = c86583tW.A0I;
                invoke = c86583tW.A05.invoke();
                A00 = "swipe_up_other_area";
            }
            return true;
        }
        C86583tW c86583tW2 = this.A01;
        interfaceC16610sE = c86583tW2.A0I;
        invoke = c86583tW2.A05.invoke();
        A00 = AbstractC111324zv.A00(1321);
        interfaceC16610sE.invoke(A00, c38620GyN, invoke);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A01.A09.invoke();
        return true;
    }
}
