package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IkR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42058IkR implements View.OnTouchListener {
    public final C41153IJs A00;
    public final /* synthetic */ C69228Vjw A01;
    public final /* synthetic */ C904341d A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C75113Zb A04;

    public ViewOnTouchListenerC42058IkR(C69228Vjw c69228Vjw, C904341d c904341d, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        this.A02 = c904341d;
        this.A01 = c69228Vjw;
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        this.A00 = new C41153IJs(c904341d.A00, c904341d.A02, c69228Vjw, c38321qM, c75113Zb, i);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (C18U.A06(C06090Tz.A06, this.A02.A01, 36321026594382920L)) {
            MediaFrameLayout mediaFrameLayout = this.A01.A03;
            if (mediaFrameLayout.getTouchDelegate() != null && mediaFrameLayout.getTouchDelegate().onTouchEvent(motionEvent)) {
                return true;
            }
        }
        C41153IJs c41153IJs = this.A00;
        if (motionEvent.getPointerCount() >= 2) {
            MediaFrameLayout mediaFrameLayout2 = c41153IJs.A03.A03;
            if (mediaFrameLayout2.getParent() != null) {
                mediaFrameLayout2.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            MediaFrameLayout mediaFrameLayout3 = c41153IJs.A03.A03;
            if (mediaFrameLayout3.getParent() != null) {
                mediaFrameLayout3.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        c41153IJs.A06.A01(motionEvent);
        c41153IJs.A01.onTouchEvent(motionEvent);
        return true;
    }
}
