package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes7.dex */
public final class IJ7 {
    public JHM A00;
    public IN1 A01;
    public final View A02;
    public final SimpleZoomableViewContainer A03;
    public final C7EQ A04;

    public IJ7(View view, int i) {
        this.A03 = (SimpleZoomableViewContainer) AbstractC166987dD.A0c(view, R.id.container);
        View A0S = AbstractC166997dE.A0S(view, i);
        this.A02 = A0S;
        C7EQ c7eq = new C7EQ(AbstractC166997dE.A0L(view));
        this.A04 = c7eq;
        A0S.setOnTouchListener(new ViewOnTouchListenerC42050IkJ(this, 3));
        ((ScaleGestureDetectorOnScaleGestureListenerC81153jk) c7eq).A01.add(new C39397Hah(this));
    }
}
