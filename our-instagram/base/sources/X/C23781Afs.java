package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Afs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23781Afs implements BEF {
    public final List A00;
    public final GestureDetector A01;
    public final ScaleGestureDetector A02;
    public final ATF A03;
    public final C124425jy A04;

    public C23781Afs(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = AbstractC166987dD.A1E();
        this.A03 = new ATF(this);
        Handler A0J = AbstractC167007dF.A0J();
        this.A01 = new GestureDetector(context, this, A0J);
        this.A02 = new ScaleGestureDetector(context, this, A0J);
        this.A04 = new C124425jy(context, this);
    }

    @Override // X.InterfaceC131365wR
    public final boolean DhW(C124425jy c124425jy) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185708Lp) it.next()).DiI(scaleGestureDetector.getScaleFactor());
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185708Lp) it.next()).DiO(scaleGestureDetector.getScaleFactor());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC131365wR
    public final boolean DhV(C124425jy c124425jy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185708Lp) it.next()).DhU((float) Math.toDegrees(Math.atan2(c124425jy.A03, c124425jy.A02) - Math.atan2(c124425jy.A01, c124425jy.A00)));
        }
        return true;
    }

    @Override // X.BEF
    public final void DuA(MotionEvent motionEvent, View view) {
        this.A01.onTouchEvent(motionEvent);
        this.A02.onTouchEvent(motionEvent);
        this.A04.A00(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC185708Lp) it.next()).Dim(-f, -f2);
        }
        return true;
    }
}
