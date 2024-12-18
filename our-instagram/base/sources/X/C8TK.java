package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.8TK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TK implements View.OnTouchListener {
    public final /* synthetic */ C8TI A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        C8TI c8ti = this.A00;
        Context applicationContext = c8ti.A0C.getApplicationContext();
        C14360o3.A07(applicationContext);
        if (!AbstractC184448Gi.A00(applicationContext)) {
            return false;
        }
        boolean onTouchEvent = c8ti.A0F.onTouchEvent(motionEvent);
        float rawX = c8ti.A00 - motionEvent.getRawX();
        float rawY = c8ti.A01 - motionEvent.getRawY();
        if (!c8ti.A08 && !c8ti.A07) {
            boolean z = false;
            boolean z2 = false;
            if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > c8ti.A0B) {
                z2 = true;
            }
            double degrees = Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
            if (z2) {
                if (degrees < 45.0d) {
                    c8ti.A07 = true;
                } else {
                    if (c8ti.A01 > c8ti.A0A) {
                        z = true;
                    }
                    c8ti.A08 = z;
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        Iterator it = c8ti.A0T.iterator();
        while (it.hasNext()) {
            ((InterfaceC1829689r) it.next()).DJG(c8ti.A04, c8ti.A05, c8ti.A00, c8ti.A01, c8ti.A03, c8ti.A07, c8ti.A08);
        }
        c8ti.A03 = 0.0f;
        c8ti.A04 = 0.0f;
        c8ti.A05 = 0.0f;
        c8ti.A09 = false;
        return onTouchEvent;
    }

    public C8TK(C8TI c8ti) {
        this.A00 = c8ti;
    }
}
