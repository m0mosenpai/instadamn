package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mlf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51318Mlf extends C3OO {
    public final IgTextView A00;
    public final IgView A01;
    public final CircularImageView A02;
    public final IgdsButton A03;

    public C51318Mlf(View view) {
        super(view);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.lead_ad_multi_submit_advertiser_username);
        this.A02 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A01 = (IgView) AbstractC166987dD.A0c(view, R.id.horizontal_divider);
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.thank_you_cta_button);
    }
}
