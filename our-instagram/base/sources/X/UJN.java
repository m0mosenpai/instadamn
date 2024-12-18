package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class UJN extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final RoundedCornerImageView A03;
    public final IgdsButton A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJN(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(viewGroup, R.id.messaging_ad_suggested_post_thumbnail);
        this.A01 = AbstractC25231BEo.A0d(viewGroup, R.id.messaging_ad_suggested_post_caption);
        this.A00 = AbstractC166997dE.A0S(viewGroup, R.id.promote_ad_messaging_post_selector_card);
        this.A02 = AbstractC167007dF.A0T(viewGroup, R.id.promote_ad_messaging_post_selector_thumbnail);
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(viewGroup, R.id.promote_ad_tools_suggest_post_cta);
    }
}
