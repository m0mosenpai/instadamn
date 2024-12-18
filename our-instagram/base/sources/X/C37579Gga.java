package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Gga, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37579Gga implements InterfaceC149626oF {
    public C37578GgZ A00;
    public final C50546MTb A01;
    public final GestureDetector.OnGestureListener A02;
    public final GestureDetector A03;

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A03.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A03.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
    }

    public C37579Gga(Context context, C37578GgZ c37578GgZ) {
        this.A00 = c37578GgZ;
        this.A01 = new C50546MTb(context);
        C37580Ggb c37580Ggb = new C37580Ggb(this);
        this.A02 = c37580Ggb;
        this.A03 = new GestureDetector(context, c37580Ggb);
    }
}
