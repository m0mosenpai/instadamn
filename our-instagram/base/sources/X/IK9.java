package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes7.dex */
public final class IK9 {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;
    public final RoundedCornerImageView A05;
    public final Runnable A06;

    public IK9(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.shopping_item_image);
        this.A05 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.shopping_item_name);
        this.A03 = A0T;
        AbstractC37300Gc1.A0d(A0T, true);
        this.A02 = AbstractC166997dE.A0T(view, R.id.shopping_item_details);
        this.A04 = (IgFrameLayout) view.requireViewById(R.id.shopping_item_add_button);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.shopping_item_delete_button);
        this.A06 = new RunnableC43090J3f(this);
    }
}
