package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes7.dex */
public final class IJK {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TouchOverlayView A03;
    public final IgImageView A04;

    public IJK(View view) {
        this.A02 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        this.A04 = AbstractC37302Gc3.A0K(view, R.id.image);
        this.A01 = AbstractC166987dD.A0c(view, R.id.tint);
        this.A03 = (TouchOverlayView) AbstractC166987dD.A0c(view, R.id.touch_overlay);
    }
}
