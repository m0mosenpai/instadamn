package X;

import android.view.MotionEvent;

/* renamed from: X.6Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139916Uv implements InterfaceC139926Uw {
    public C6V0 A00;
    public ScaleGestureDetectorOnScaleGestureListenerC139956Uz A01;
    public boolean A02;
    public final Runnable A03 = new Runnable() { // from class: X.6Ux
        @Override // java.lang.Runnable
        public final void run() {
            C139916Uv c139916Uv = C139916Uv.this;
            C6V0 c6v0 = c139916Uv.A00;
            if (c6v0 != null) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                try {
                    c6v0.A04.onTouchEvent(obtain);
                    obtain.recycle();
                    c139916Uv.A00 = null;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
            c139916Uv.A01 = null;
            c139916Uv.A02 = false;
        }
    };

    @Override // X.InterfaceC139926Uw
    public final boolean Ced() {
        C6V0 c6v0 = this.A00;
        if (c6v0 != null && c6v0.A03) {
            return true;
        }
        return false;
    }
}
