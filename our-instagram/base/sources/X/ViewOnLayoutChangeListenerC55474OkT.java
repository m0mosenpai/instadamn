package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;

/* renamed from: X.OkT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC55474OkT implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnLayoutChangeListenerC55474OkT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PunchedOverlayView punchedOverlayView;
        RectF rectF;
        float A05;
        float f;
        switch (this.A00) {
            case 1:
                float f2 = (i3 - i) / ((KCX) this.A02).A00;
                punchedOverlayView = (PunchedOverlayView) this.A01;
                float A00 = AbstractC25227BEk.A00(AbstractC166987dD.A08(punchedOverlayView), f2);
                rectF = new RectF(0.0f, i2 + A00, i3 - i, i4 - A00);
                A05 = AbstractC166997dE.A05(punchedOverlayView.getResources());
                break;
            case 2:
                float f3 = i3;
                float f4 = f3 / 3.0f;
                if (((AbstractC52139N5o) this.A02).A04) {
                    f = 1.3333334f * f4;
                } else {
                    f = f4;
                }
                float f5 = (f3 - f4) / 2.0f;
                float f6 = i4 / 2.0f;
                float f7 = f / 2.0f;
                rectF = new RectF(f5, f6 - f7, f3 - f5, f6 + f7);
                punchedOverlayView = (PunchedOverlayView) this.A01;
                A05 = 0.0f;
                break;
            case 3:
                C14360o3.A0B(view, 0);
                view.removeOnLayoutChangeListener(this);
                ((C55210OeT) this.A02).A00 = null;
                ((Runnable) this.A01).run();
                return;
            default:
                View view2 = (View) this.A02;
                C14360o3.A0A(view2);
                View view3 = (View) this.A01;
                AbstractC13880nE.A0Y(view2, view3.getHeight());
                view3.removeOnLayoutChangeListener(this);
                return;
        }
        punchedOverlayView.A00(new KL0(rectF, A05));
    }
}
