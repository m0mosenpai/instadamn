package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Jjc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44399Jjc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ L5R A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = 0;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        L5R l5r = this.A00;
        l5r.A02 = motionEvent2.getRawY() - motionEvent.getRawY();
        l5r.A03 = f;
        l5r.A04 = f2;
        while (true) {
            List list = l5r.A0G;
            if (i < list.size()) {
                ((InterfaceC1829689r) list.get(i)).DHW(motionEvent2, f, f2, l5r.A07, l5r.A08);
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = 0;
        while (true) {
            L5R l5r = this.A00;
            List list = l5r.A0G;
            if (i < list.size()) {
                ((InterfaceC1829689r) list.get(i)).Dir(f, f2, l5r.A00, l5r.A01, l5r.A07, l5r.A08);
                i++;
            } else {
                return true;
            }
        }
    }

    public C44399Jjc(L5R l5r) {
        this.A00 = l5r;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        L5R l5r = this.A00;
        l5r.A00 = motionEvent.getRawX();
        l5r.A01 = motionEvent.getRawY();
        int i = 0;
        l5r.A07 = false;
        l5r.A08 = false;
        l5r.A04 = 0.0f;
        l5r.A02 = 0.0f;
        while (true) {
            List list = l5r.A0G;
            if (i < list.size()) {
                ((InterfaceC1829689r) list.get(i)).Du2(l5r.A00, l5r.A01);
                i++;
            } else {
                return true;
            }
        }
    }
}
