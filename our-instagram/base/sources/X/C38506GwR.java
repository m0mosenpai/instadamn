package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* renamed from: X.GwR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38506GwR extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final RoundedCornerImageView A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final AutoWidthToggleButton A08;

    public C38506GwR(View view) {
        super(view);
        this.A00 = view;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.product_image);
        this.A05 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.product_name);
        this.A03 = A0T;
        AbstractC37300Gc1.A0d(A0T, true);
        this.A02 = AbstractC166997dE.A0T(view, R.id.product_details);
        this.A07 = AbstractC31179DnN.A0M(view, R.id.product_sku_info);
        this.A06 = AbstractC31179DnN.A0M(view, R.id.product_picker_checkbox);
        this.A01 = view.requireViewById(R.id.info_image);
        this.A08 = (AutoWidthToggleButton) view.requireViewById(R.id.product_action_button);
        this.A04 = (IgSimpleImageView) view.requireViewById(R.id.more_button);
    }
}
