package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.DxI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31761DxI extends GestureDetector.SimpleOnGestureListener {
    public final Context A00;
    public final C35129FeW A01;
    public final C2OG A02;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null) {
            if (Math.abs(f2) <= Math.abs(f) || motionEvent2.getRawY() >= motionEvent.getRawY()) {
                return false;
            }
            C2OG c2og = this.A02;
            C35129FeW c35129FeW = this.A01;
            C2OG.A05(c2og, true);
            GZB gzb = c35129FeW.A08;
            if (gzb != null) {
                gzb.onDismiss();
            }
            return true;
        }
        C0w9.A03("InAppNotificationViewBinder", "MotionEvent null");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C2OG c2og = this.A02;
        Context context = this.A00;
        C35129FeW c35129FeW = this.A01;
        List A02 = c2og.A05.A02(context);
        GZB gzb = c35129FeW.A08;
        if (gzb != null) {
            C2OG.A05(c2og, false);
            gzb.D3J(context);
        } else {
            C2OG.A05(c2og, true);
        }
        c2og.A02.D4k(c35129FeW, A02);
        return true;
    }

    public C31761DxI(Context context, C35129FeW c35129FeW, C2OG c2og) {
        this.A00 = context;
        this.A02 = c2og;
        this.A01 = c35129FeW;
    }
}
