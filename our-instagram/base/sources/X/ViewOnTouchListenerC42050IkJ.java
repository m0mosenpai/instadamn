package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.SeekBar;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Iterator;

/* renamed from: X.IkJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42050IkJ implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC42050IkJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        C1342364l c1342364l;
        switch (this.A00) {
            case 0:
                IKD ikd = (IKD) this.A01;
                C14360o3.A0A(motionEvent);
                C14360o3.A0B(motionEvent, 0);
                if (motionEvent.getPointerCount() >= 2) {
                    MediaFrameLayout mediaFrameLayout = ikd.A03.A0F;
                    if (mediaFrameLayout.getParent() != null) {
                        mediaFrameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && (parent = ikd.A03.A0F.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                ikd.A06.A01(motionEvent);
                ikd.A01.onTouchEvent(motionEvent);
                return true;
            case 1:
                return ((J19) this.A01).A02.Du7(motionEvent);
            case 2:
                if (motionEvent.getActionMasked() == 0) {
                    SeekBar seekBar = ((C42739IvZ) this.A01).A07;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (x >= seekBar.getLeft() && x <= seekBar.getRight() && y >= seekBar.getTop() && y <= seekBar.getBottom()) {
                        return true;
                    }
                    return false;
                }
                if (motionEvent.getActionMasked() == 1) {
                    C42739IvZ.A00((C42739IvZ) this.A01);
                    return true;
                }
                return false;
            case 3:
                C7EQ c7eq = ((IJ7) this.A01).A04;
                C14360o3.A0A(motionEvent);
                return c7eq.A01(motionEvent);
            case 4:
                C38509GwU c38509GwU = (C38509GwU) this.A01;
                ClickableTextContainer clickableTextContainer = c38509GwU.A09;
                AbstractC167007dF.A1C(motionEvent);
                clickableTextContainer.A01.A02(motionEvent);
                c38509GwU.A06.A00.A02(motionEvent);
                return false;
            case 5:
                IN7 in7 = (IN7) this.A01;
                Iterator it = in7.A03.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view2 instanceof ClickableTextContainer) {
                        AbstractC167007dF.A1C(motionEvent);
                        c1342364l = ((ClickableTextContainer) view2).A01;
                    } else if (view2 instanceof TouchOverlayView) {
                        AbstractC167007dF.A1C(motionEvent);
                        c1342364l = ((TouchOverlayView) view2).A00;
                    }
                    c1342364l.A02(motionEvent);
                }
                if (!in7.A02.onTouchEvent(motionEvent)) {
                    InterfaceC16620sF interfaceC16620sF = in7.A01;
                    if (interfaceC16620sF == null) {
                        return false;
                    }
                    C14360o3.A0A(view);
                    C14360o3.A0A(motionEvent);
                    if (!AbstractC166987dD.A1a(interfaceC16620sF.invoke(view, motionEvent))) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                GestureDetector gestureDetector = ((ReelDashboardFragment) this.A01).A02;
                if (gestureDetector != null) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
