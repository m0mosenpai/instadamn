package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class WjU implements C7QD, InterfaceC161707Mf {
    public C6T7 A00;
    public final C126545np A01;

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        View childAt = this.A01.getChildAt(0);
        if (childAt != null) {
            childAt.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return AbstractC13880nE.A0G(this.A01).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return true;
    }

    @Override // X.C7QD
    public final /* bridge */ /* synthetic */ View BKF() {
        return this.A01;
    }

    public WjU(Context context) {
        this.A01 = new C126545np(context);
    }
}
