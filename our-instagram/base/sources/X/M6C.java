package X;

import android.graphics.RectF;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;

/* loaded from: classes8.dex */
public final class M6C implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ PunchedOverlayView A02;
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A03;

    public M6C(PunchedOverlayView punchedOverlayView, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, float f, int i) {
        this.A02 = punchedOverlayView;
        this.A00 = f;
        this.A01 = i;
        this.A03 = gestureDetectorOnGestureListenerC43829JZs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PunchedOverlayView punchedOverlayView = this.A02;
        float f = this.A00;
        punchedOverlayView.A00(new KL0(new RectF(f, 0.0f, this.A01 - f, punchedOverlayView.getBottom()), AbstractC166987dD.A04(this.A03.getResources(), R.dimen.abc_dialog_padding_material)));
    }
}
