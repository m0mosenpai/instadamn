package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BZ9 extends FrameLayout {
    public final C27999CVw A00;
    public final BZI A01;

    public final void setInitialProgress(int i) {
        BZI.A01(this.A01, i, 0L);
    }

    public final void setProgress(int i) {
        this.A01.setProgress(i);
    }

    public BZ9(Context context, C27999CVw c27999CVw) {
        super(context);
        int i;
        this.A00 = c27999CVw;
        float f = c27999CVw.A00;
        if (f > 0.0f) {
            i = (int) (1.0f / f);
        } else {
            i = 100;
        }
        BZI bzi = new BZI(context);
        bzi.setThumb(context.getDrawable(R.drawable.body_parametric_slider_thumb));
        bzi.getThumb().setTint(c27999CVw.A02);
        bzi.A00 = c27999CVw.A01;
        bzi.A01 = c27999CVw.A03;
        bzi.setThumbOffset(0);
        bzi.setMax(i);
        this.A01 = bzi;
        addView(bzi, new ViewGroup.MarginLayoutParams(-1, -2));
    }

    public final C27999CVw getBodyParametricStyleParameters() {
        return this.A00;
    }
}
