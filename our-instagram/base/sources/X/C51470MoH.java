package X;

import android.view.MotionEvent;

/* renamed from: X.MoH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51470MoH extends C5SZ {
    public final /* synthetic */ C138376Ot A00;
    public final /* synthetic */ boolean A01;

    public C51470MoH(C138376Ot c138376Ot, boolean z) {
        this.A01 = z;
        this.A00 = c138376Ot;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0d.DPL();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.A01;
    }
}
