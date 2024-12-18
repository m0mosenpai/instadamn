package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105274oh implements InterfaceC81103jf {
    public final int A00;
    public final int A01;
    public final InterfaceC105254of A02;
    public final C105184oY A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final GestureDetector A06;
    public final C105284oi A07;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A08;

    public C105274oh(Context context, InterfaceC105254of interfaceC105254of, C105184oY c105184oY, C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2, boolean z) {
        C14360o3.A0B(interfaceC105254of, 2);
        C14360o3.A0B(c38321qM, 6);
        C14360o3.A0B(c75113Zb, 7);
        this.A02 = interfaceC105254of;
        this.A03 = c105184oY;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
        C105284oi c105284oi = new C105284oi(this);
        this.A07 = c105284oi;
        GestureDetector gestureDetector = new GestureDetector(context, c105284oi);
        gestureDetector.setIsLongpressEnabled(!z);
        this.A06 = gestureDetector;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c105284oi);
        this.A08 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        ViewParent parent;
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A03.A0J;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A03.A0J.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A08.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
