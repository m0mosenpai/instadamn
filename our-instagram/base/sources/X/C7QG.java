package X;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7QG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7QG extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C7QH {
    public Object A00;
    public InterfaceC72025XFn A01;
    public final InterfaceC165077Zw A02;
    public final boolean A03;
    public final GestureDetector A04;
    public final View A05;
    public final C7QJ A06;
    public final boolean A07;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    private InterfaceC72025XFn A00() {
        InterfaceC162347Ow interfaceC162347Ow;
        InterfaceC72025XFn interfaceC72025XFn = this.A01;
        if (interfaceC72025XFn == null) {
            View view = this.A05;
            View view2 = view;
            while (true) {
                interfaceC162347Ow = null;
                if (!(view2 instanceof RecyclerView)) {
                    view2 = (View) view2.getParent();
                    if (view2 == null) {
                        break;
                    }
                } else {
                    Object A0X = ((RecyclerView) view2).A0X(view);
                    C18C.A07(A0X, "This container can only be used in a RecyclerView.ViewHolder");
                    if (A0X instanceof InterfaceC162347Ow) {
                        interfaceC162347Ow = (InterfaceC162347Ow) A0X;
                    }
                }
            }
            if (this.A07) {
                interfaceC72025XFn = new WjE(view, interfaceC162347Ow);
            } else {
                interfaceC72025XFn = new WjD(view);
            }
            this.A01 = interfaceC72025XFn;
        }
        return interfaceC72025XFn;
    }

    public boolean A01() {
        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) this.A00;
        if (interfaceC129525tH != null) {
            return interfaceC129525tH.CYW();
        }
        return false;
    }

    public final boolean A02(MotionEvent motionEvent, boolean z) {
        if (((InterfaceC165507ad) this.A02).CQu()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.A05.setPressed(false);
                if (z && this.A03) {
                    A00().Enw();
                }
            }
        } else if (z && this.A03) {
            A00().EM8(motionEvent);
        }
        Object obj = this.A00;
        if (obj != null) {
            this.A06.Dtz(motionEvent, obj);
        }
        return this.A04.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A00 != null && !((InterfaceC165507ad) this.A02).CQu() && A01() && this.A06.DBa(this.A00)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.A00 != null && !((InterfaceC165507ad) this.A02).CQu()) {
            if (this.A03) {
                A00().Enw();
            }
            this.A05.performHapticFeedback(0);
            this.A06.DTA(motionEvent, this.A00, A01());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        this.A05.setPressed(true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != null) {
            InterfaceC165077Zw interfaceC165077Zw = this.A02;
            if (!((InterfaceC165507ad) interfaceC165077Zw).CQu() && A01() && interfaceC165077Zw.isResumed() && this.A06.DT5(motionEvent, this.A00)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A00 != null && !((InterfaceC165507ad) this.A02).CQu() && !A01() && this.A06.DT5(motionEvent, this.A00)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (this instanceof C7QF) {
            C14360o3.A0B(view, 0);
            C14360o3.A0B(motionEvent, 1);
            InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) this.A00;
            z = true;
            if (interfaceC129525tH == null || !interfaceC129525tH.ARd()) {
                z = false;
            }
        } else {
            z = true;
        }
        return A02(motionEvent, z);
    }

    public C7QG(View view, InterfaceC165077Zw interfaceC165077Zw, C7QJ c7qj, boolean z, boolean z2) {
        this.A05 = view;
        this.A06 = c7qj;
        this.A02 = interfaceC165077Zw;
        this.A04 = new GestureDetector(view.getContext(), this, new Handler(Looper.getMainLooper()));
        this.A07 = z2;
        this.A03 = z;
    }
}
