package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101094gP implements InterfaceC81103jf {
    public final int A00;
    public final int A01;
    public final InterfaceC101074gN A02;
    public final C905741s A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final GestureDetector A06;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A07;

    public C101094gP(Context context, InterfaceC101074gN interfaceC101074gN, C905741s c905741s, C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2, boolean z) {
        C14360o3.A0B(interfaceC101074gN, 2);
        C14360o3.A0B(c38321qM, 6);
        this.A02 = interfaceC101074gN;
        this.A03 = c905741s;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
        C101104gQ c101104gQ = new C101104gQ(this);
        GestureDetector gestureDetector = new GestureDetector(context, c101104gQ);
        gestureDetector.setIsLongpressEnabled(!z);
        this.A06 = gestureDetector;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c101104gQ);
        this.A07 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
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
        this.A07.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
