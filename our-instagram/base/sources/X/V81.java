package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class V81 extends AbstractC68982VfK {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final CircularImageView A05;
    public final IgdsButton A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V81(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.suggested_upsell_card_image);
        this.A04 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.icon_badge);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.suggested_upsell_card_title);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.suggested_upsell_card_subtitle);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.suggested_upsell_card_extra_text);
        this.A06 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.suggested_upsell_card_primary_button);
        this.A00 = AbstractC166987dD.A0c(view, R.id.dismiss_button);
    }
}
