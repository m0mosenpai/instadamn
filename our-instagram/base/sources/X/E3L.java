package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class E3L extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;

    public E3L(View view) {
        super(view);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.direct_private_share_warning_icon);
        this.A03 = AbstractC167007dF.A0N(view, R.id.direct_share_privacy_warning_title);
        this.A02 = AbstractC167007dF.A0N(view, R.id.direct_share_privacy_warning_subtitle);
        this.A00 = AbstractC166997dE.A0S(view, R.id.direct_private_share_warning_bottom_divider);
        this.A01 = AbstractC166997dE.A0S(view, R.id.direct_private_share_warning_top_divider);
    }
}
