package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.WnC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71057WnC implements InterfaceC149626oF {
    public final GestureDetector A00;
    public final C5SZ A01;
    public final /* synthetic */ C71058WnD A02;

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
    }

    public C71057WnC(Context context, C71058WnD c71058WnD, InterfaceC144626fi interfaceC144626fi) {
        this.A02 = c71058WnD;
        C50552MTj c50552MTj = new C50552MTj(0, new C50546MTb(context), interfaceC144626fi);
        this.A01 = c50552MTj;
        this.A00 = new GestureDetector(context, c50552MTj);
    }
}
