package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class FNF {
    public ViewGroup A00;
    public GradientSpinnerAvatarView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public FNF(View view) {
        this.A00 = AbstractC31176DnK.A0C(view, R.id.row_user_container);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_user_username);
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_user_info);
        this.A02 = AbstractC167007dF.A0N(view, R.id.user_social_context);
        GradientSpinnerAvatarView A0f = AbstractC31176DnK.A0f(view, R.id.selectable_user_row_avatar);
        this.A01 = A0f;
        A0f.setGradientSpinnerVisible(false);
    }
}
