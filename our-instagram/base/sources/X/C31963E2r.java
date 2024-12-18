package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E2r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31963E2r extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgdsButton A02;
    public final GradientSpinnerAvatarView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31963E2r(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View findViewById = view.findViewById(R.id.row_user_imageview);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) findViewById;
        gradientSpinnerAvatarView.A05();
        C14360o3.A07(findViewById);
        this.A03 = gradientSpinnerAvatarView;
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.row_user_primary_name);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.row_user_secondary_name);
        View findViewById2 = view.findViewById(R.id.row_direct_action_button);
        IgdsButton igdsButton = (IgdsButton) findViewById2;
        igdsButton.setVisibility(0);
        igdsButton.setText(igdsButton.getContext().getString(2131973280));
        C14360o3.A07(findViewById2);
        this.A02 = igdsButton;
    }
}
