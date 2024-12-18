package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class NOH extends AbstractC51215Mk0 {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOH(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC167007dF.A0T(view, R.id.header_image);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title_text_view);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.title_text_view_smaller);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.profile_image);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.username_text_view);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.follower_number_text_view);
    }
}
