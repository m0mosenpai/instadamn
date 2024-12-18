package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FRI {
    public final View A00;
    public final View A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final CircularImageView A06;

    public final void A01(String str) {
        IgTextView igTextView = this.A04;
        igTextView.setVisibility(0);
        igTextView.setText(str);
    }

    public final void A00(int i) {
        IgSimpleImageView igSimpleImageView = this.A02;
        igSimpleImageView.setVisibility(0);
        AbstractC166997dE.A19(igSimpleImageView.getContext(), igSimpleImageView, i);
    }

    public FRI(View view) {
        this.A00 = view;
        this.A05 = AbstractC25231BEo.A0d(view, R.id.item_title);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.item_subtitle);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.item_icon);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.item_circular_icon);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.notification_dot);
        this.A01 = AbstractC166997dE.A0S(view, R.id.new_badge);
    }
}
