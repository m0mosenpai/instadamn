package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

/* loaded from: classes7.dex */
public final class IJ6 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final CustomCTAButton A04;

    public IJ6(View view) {
        this.A00 = view;
        this.A04 = (CustomCTAButton) AbstractC166997dE.A0R(view, R.id.cta_button);
        this.A03 = AbstractC167007dF.A0T(view, R.id.cta_product_image);
        this.A01 = AbstractC167007dF.A0N(view, R.id.cta_product_name);
        this.A02 = AbstractC167007dF.A0N(view, R.id.cta_product_price);
    }
}
