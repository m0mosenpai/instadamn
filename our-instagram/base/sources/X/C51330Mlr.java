package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Mlr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51330Mlr extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final IgdsCheckBox A04;

    public C51330Mlr(View view) {
        super(view);
        this.A00 = AbstractC166987dD.A0c(view, R.id.lead_ad_multi_submit_row);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.lead_ad_multi_submit_advertiser_username);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.lead_ad_multi_submit_advertiser_subtitle);
        this.A03 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A04 = (IgdsCheckBox) AbstractC166987dD.A0c(view, R.id.lead_ad_multi_submit_check_box);
    }
}
