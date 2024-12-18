package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.E2c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31948E2c extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public C31948E2c(View view) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.product_image);
        this.A02 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.product_name);
        this.A01 = A0T;
        A0T.getPaint().setFakeBoldText(true);
        this.A00 = AbstractC166997dE.A0T(view, R.id.merchant_name);
    }
}
