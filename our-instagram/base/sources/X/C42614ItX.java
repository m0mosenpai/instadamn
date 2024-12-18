package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ItX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42614ItX implements InterfaceC81103jf {
    public final int A00;
    public final JPY A01;
    public final C81473kH A02;
    public final C38321qM A03;
    public final C75113Zb A04;
    public final GestureDetector A05;
    public final C39399Haj A06;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A07;

    public C42614ItX(Context context, JPY jpy, C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(jpy, 2);
        AbstractC167017dG.A1T(c38321qM, c75113Zb);
        this.A01 = jpy;
        this.A02 = c81473kH;
        this.A00 = i;
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        C39399Haj c39399Haj = new C39399Haj(this);
        this.A06 = c39399Haj;
        GestureDetector gestureDetector = new GestureDetector(context, c39399Haj);
        gestureDetector.setIsLongpressEnabled(false);
        this.A05 = gestureDetector;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c39399Haj);
        this.A07 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        ViewParent parent;
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A02.A09;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A02.A09.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A07.A01(motionEvent);
        this.A05.onTouchEvent(motionEvent);
        return true;
    }
}
