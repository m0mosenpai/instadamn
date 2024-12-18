package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8DG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DG extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ ColorPalette A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 > r2.A00) goto L6;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette r2 = r3.A01
            float r1 = r4.getY()
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            float r0 = r2.A00
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L18
        L17:
            r0 = 0
        L18:
            r3.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8DG.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            ColorPalette colorPalette = this.A01;
            colorPalette.setMode(C8DF.A02);
            float y = motionEvent.getY();
            if (y >= colorPalette.A01 && y <= colorPalette.A00) {
                float x = motionEvent.getX();
                Iterator it = colorPalette.A0F.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    C14360o3.A07(next);
                    ACO aco = (ACO) next;
                    if (aco.A01(x, y)) {
                        int A00 = aco.A00(x, y);
                        colorPalette.A04 = A00;
                        C8D4 c8d4 = colorPalette.A05;
                        if (c8d4 != null) {
                            colorPalette.getLocationInWindow(ColorPalette.A0N);
                            c8d4.D5z(A00, x + r1[0], y + r1[1]);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ColorPalette colorPalette = this.A01;
        ArrayList arrayList = colorPalette.A0F;
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            Object obj = arrayList.get(i);
            C14360o3.A07(obj);
            ACO aco = (ACO) obj;
            if (aco.A01(x, y)) {
                C8DD c8dd = aco.A07;
                int i2 = i - 1;
                colorPalette.A04 = c8dd.A00;
                C8D4 c8d4 = colorPalette.A05;
                if (c8d4 != null) {
                    c8d4.D5y(c8dd, 1, i2);
                }
                return true;
            }
        }
        return super.onSingleTapUp(motionEvent);
    }

    public C8DG(ColorPalette colorPalette) {
        this.A01 = colorPalette;
    }
}
