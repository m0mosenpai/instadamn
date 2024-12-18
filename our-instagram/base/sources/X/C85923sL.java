package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85923sL extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            boolean z = false;
            for (TouchDelegate touchDelegate : this.A00) {
                motionEvent.setLocation(x, y);
                if (touchDelegate.onTouchEvent(motionEvent) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public C85923sL(View view) {
        super(A01, view);
        this.A00 = new ArrayList();
    }
}
