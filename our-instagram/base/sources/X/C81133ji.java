package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81133ji implements InterfaceC81103jf {
    public final int A00;
    public final C38321qM A01;
    public final InterfaceC81123jh A02;
    public final C75113Zb A03;
    public final MediaFrameLayout A04;
    public final Context A05;
    public final GestureDetector A06;
    public final C81143jj A07;
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A08;

    public C81133ji(Context context, C38321qM c38321qM, InterfaceC81123jh interfaceC81123jh, C75113Zb c75113Zb, MediaFrameLayout mediaFrameLayout, int i) {
        C14360o3.A0B(c75113Zb, 4);
        this.A05 = context;
        this.A02 = interfaceC81123jh;
        this.A01 = c38321qM;
        this.A03 = c75113Zb;
        this.A04 = mediaFrameLayout;
        this.A00 = i;
        C81143jj c81143jj = new C81143jj(this);
        this.A07 = c81143jj;
        GestureDetector gestureDetector = new GestureDetector(context, c81143jj);
        gestureDetector.setIsLongpressEnabled(false);
        this.A06 = gestureDetector;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c81143jj);
        this.A08 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        ViewParent parent;
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout = this.A04;
            if (mediaFrameLayout.getParent() != null) {
                mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = this.A04.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.A08.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
