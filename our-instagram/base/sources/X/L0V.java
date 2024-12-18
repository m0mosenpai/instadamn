package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class L0V {
    public final View A00;
    public final FrameLayout A01;

    public L0V(FrameLayout frameLayout) {
        this.A01 = frameLayout;
        this.A00 = frameLayout.requireViewById(R.id.background_view);
    }
}
