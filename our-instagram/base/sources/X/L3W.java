package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes8.dex */
public final class L3W {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final CircularImageView A04;

    public L3W(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = AbstractC31176DnK.A0T(view, R.id.null_state_action_item_icon);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.null_state_circular_action_item_icon);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.null_state_circular_action_item_icon_large);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.null_state_action_item_text);
    }
}
