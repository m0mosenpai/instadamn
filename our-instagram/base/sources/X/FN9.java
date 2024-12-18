package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class FN9 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final InterfaceC56392iX A03;
    public final GradientSpinnerAvatarView A04;

    public FN9(View view) {
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_user_container);
        this.A04 = AbstractC31176DnK.A0f(view, R.id.selectable_user_row_avatar);
        this.A02 = AbstractC167007dF.A0N(view, R.id.row_user_username);
        this.A01 = AbstractC167007dF.A0N(view, R.id.row_user_info);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.selectable_user_row_checkbox_view_stub), false, false);
        this.A03 = A01;
        A01.EZv(G0S.A00);
        A01.setVisibility(0);
    }
}
