package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes7.dex */
public final class II9 {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final GradientSpinnerAvatarView A03;

    public II9(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.user_profile_picture);
        this.A02 = AbstractC31178DnM.A0C(view);
        this.A01 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A00 = AbstractC167007dF.A0N(view, R.id.description);
    }
}
