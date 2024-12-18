package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E2G extends C3OO {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final GradientSpinnerAvatarView A02;

    public E2G(View view) {
        super(view);
        this.A02 = AbstractC31176DnK.A0f(view, R.id.grid_view_action_pog_avatar_view);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.grid_view_action_pog_text_view);
        this.A00 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.grid_view_action_label_container);
    }
}
