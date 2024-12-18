package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class UJV extends C3OO {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final CircularImageView A06;
    public final IgdsButton A07;

    public UJV(View view) {
        super(view);
        this.A04 = AbstractC167007dF.A0N(view, R.id.suggested_upsell_card_title);
        this.A03 = AbstractC167007dF.A0N(view, R.id.suggested_user_card_subtitle);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.suggested_upsell_card_image);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.invite_upsell_card_image);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.facepiles_image);
        this.A01 = AbstractC166997dE.A0S(view, R.id.dismiss_button);
        this.A07 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.suggested_upsell_card_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.suggested_upsell_card_container);
    }
}
