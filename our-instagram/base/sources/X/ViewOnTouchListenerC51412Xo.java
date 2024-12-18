package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2Xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC51412Xo implements View.OnTouchListener {
    public C2V9 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.2XB] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        C2V9 c2v9 = this.A00;
        if (c2v9 != 0) {
            C2XV.A00();
            ?? obj = new Object();
            obj.A01 = view;
            obj.A00 = motionEvent;
            Object A00 = c2v9.A00(obj);
            if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
