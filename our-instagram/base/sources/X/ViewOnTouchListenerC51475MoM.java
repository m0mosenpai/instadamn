package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.MoM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC51475MoM extends C5SZ implements InterfaceC144626fi, View.OnTouchListener {
    public InterfaceC58125Ppo A00;
    public InterfaceC58065Poq A01;
    public O5E A02;
    public final C50778Mbk A03 = new C50778Mbk(this, 1);
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent == null || this.A00 == null) {
            return false;
        }
        return ((C50546MTb) this.A06.getValue()).A01(motionEvent, motionEvent2, this, f, f2, false);
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        boolean onTouchEvent = ((GestureDetector) this.A04.getValue()).onTouchEvent(motionEvent);
        motionEvent.getAction();
        boolean onTouchEvent2 = ((ScaleGestureDetector) this.A05.getValue()).onTouchEvent(motionEvent);
        if (!onTouchEvent && !onTouchEvent2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        InterfaceC58125Ppo interfaceC58125Ppo = this.A00;
        if (interfaceC58125Ppo != null && interfaceC58125Ppo.DrR()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        InterfaceC58125Ppo interfaceC58125Ppo = this.A00;
        if (interfaceC58125Ppo != null && interfaceC58125Ppo.DrU()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return false;
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC58125Ppo interfaceC58125Ppo = this.A00;
        if (interfaceC58125Ppo != null && interfaceC58125Ppo.Dra()) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        InterfaceC58065Poq interfaceC58065Poq = this.A01;
        if (interfaceC58065Poq != null && interfaceC58065Poq.DBN()) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC58065Poq interfaceC58065Poq = this.A01;
        if (interfaceC58065Poq != null) {
            interfaceC58065Poq.DmY();
            return true;
        }
        return false;
    }

    public ViewOnTouchListenerC51475MoM(Context context) {
        this.A04 = C57536PgA.A00(context, this, 26);
        this.A06 = AbstractC09440dt.A01(new C57553PgR(context, 17));
        this.A05 = C57536PgA.A00(context, this, 27);
    }
}
