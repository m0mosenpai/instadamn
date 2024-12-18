package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class FOF {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;

    public FOF(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0N(view, R.id.link_option_text);
        this.A02 = AbstractC167007dF.A0N(view, R.id.link_option_sub_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.is_pinned_text);
        this.A07 = AbstractC167007dF.A0T(view, R.id.custom_link_icon);
        this.A04 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.preset_icon_frame);
        this.A08 = AbstractC167007dF.A0T(view, R.id.preset_icon);
        this.A05 = AbstractC31176DnK.A0T(view, R.id.link_option_icon);
        this.A06 = AbstractC31176DnK.A0T(view, R.id.link_option_overflow_icon);
    }
}
