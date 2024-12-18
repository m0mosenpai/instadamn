package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes11.dex */
public final class UMC extends C5SZ {
    public boolean A00;
    public final U9C A01;
    public final InterfaceC145396gy A02;
    public final C50546MTb A03;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A00 = false;
        U9C u9c = this.A01;
        u9c.removeCallbacksAndMessages(null);
        u9c.sendEmptyMessageDelayed(1, ViewConfiguration.getLongPressTimeout());
        this.A02.DBc(motionEvent.getRawX());
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        this.A01.removeCallbacksAndMessages(null);
        if (motionEvent != null) {
            return this.A03.A01(motionEvent, motionEvent2, this.A02, f, f2, this.A00);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A01.removeCallbacksAndMessages(null);
        if (this.A00) {
            return false;
        }
        this.A02.DsB(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01.removeCallbacksAndMessages(null);
        if (!this.A00) {
            this.A02.Dik();
            return true;
        }
        return false;
    }

    public UMC(Context context, InterfaceC145396gy interfaceC145396gy) {
        this.A02 = interfaceC145396gy;
        U9C u9c = new U9C();
        this.A01 = u9c;
        this.A03 = new C50546MTb(context);
        u9c.A00 = new C68835Vcr(this);
    }
}
