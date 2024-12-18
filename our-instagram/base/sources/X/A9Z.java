package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes4.dex */
public final class A9Z {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;

    public A9Z(View view) {
        this.A00 = view;
        this.A02 = AbstractC166997dE.A0T(view, R.id.row_user_fullname);
        this.A03 = AbstractC166997dE.A0T(view, R.id.row_user_username);
        this.A04 = (GradientSpinnerAvatarView) view.requireViewById(R.id.row_user_avatar);
        this.A01 = view.requireViewById(R.id.row_user_not_mentionable_overlay);
    }
}
