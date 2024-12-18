package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.GpA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38081GpA extends C5SZ {
    public final GestureDetector A00;
    public final InterfaceC144636fj A01;
    public final C50546MTb A02;

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent == null) {
            return false;
        }
        int intValue = this.A02.A00(motionEvent, motionEvent2, f, f2, false).intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                return false;
            }
            return this.A01.DrS(motionEvent2.getRawY() - motionEvent.getRawY(), f2);
        }
        return this.A01.Drb(motionEvent, motionEvent2, f, f2);
    }

    public C38081GpA(Context context, InterfaceC144636fj interfaceC144636fj) {
        AbstractC167017dG.A1P(context, interfaceC144636fj);
        this.A01 = interfaceC144636fj;
        this.A00 = new GestureDetector(context, this);
        this.A02 = new C50546MTb(context);
    }
}
