package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class FN4 {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public FN4(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.profile_header_banner_item_icon);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_title);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_subtitle);
        this.A04 = AbstractC167007dF.A0T(view, R.id.banner_chevron_right_icon);
    }
}
