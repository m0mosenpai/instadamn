package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class FMY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final GradientSpinnerAvatarView A03;

    public FMY(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC31176DnK.A0f(view, R.id.follow_list_user_imageview);
        this.A01 = AbstractC167007dF.A0N(view, R.id.follow_list_mutual_count);
        this.A02 = AbstractC167007dF.A0N(view, R.id.follow_list_comma_separated);
    }
}
