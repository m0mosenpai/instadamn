package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Jjh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44404Jjh extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C51622Yk A00;

    public C44404Jjh(C51622Yk c51622Yk) {
        this.A00 = c51622Yk;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A00.A0D.A06(0.9d);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0D.A03();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.A00.A0D.A03();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0D.A03();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C51622Yk c51622Yk = this.A00;
        c51622Yk.A0D.A03();
        InterfaceC147206jw interfaceC147206jw = c51622Yk.A03;
        if (interfaceC147206jw != null) {
            interfaceC147206jw.onClick();
        }
        c51622Yk.A03(true);
        return true;
    }
}
