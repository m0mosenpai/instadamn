package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class FN3 {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public FN3(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A04 = AbstractC167007dF.A0T(view, R.id.profile_available_banner_item_left_icon);
        this.A03 = AbstractC167007dF.A0T(view, R.id.profile_featured_banner_item_banner_icon);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_title);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_subtitle);
    }
}
