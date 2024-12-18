package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes6.dex */
public final class E3N extends C3OO {
    public final View A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final RoundedCornerImageView A03;
    public final RoundedCornerImageView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3N(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC167007dF.A0T(view, R.id.reels_icon_overlay_view);
        this.A04 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.tinted_view);
        this.A01 = AbstractC167007dF.A0T(view, R.id.icon_overlay_view);
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.image_view);
    }
}
