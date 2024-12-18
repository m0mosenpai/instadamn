package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes6.dex */
public final class E3Q extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final RoundedCornerImageView A03;
    public final TouchOverlayView A04;

    public E3Q(View view) {
        super(view);
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.icon);
        this.A02 = AbstractC31176DnK.A0U(view, R.id.avatar);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.primary_text);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.secondary_text);
        this.A04 = (TouchOverlayView) AbstractC166997dE.A0R(view, R.id.touch_overlay);
    }
}
