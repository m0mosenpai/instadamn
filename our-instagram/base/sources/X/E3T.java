package X;

import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E3T extends C3OO {
    public final CheckBox A00;
    public final TextView A01;
    public final TextView A02;
    public final ConstraintLayout A03;
    public final IgSimpleImageView A04;
    public final GradientSpinnerAvatarView A05;

    public E3T(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.A03 = constraintLayout;
        this.A00 = (CheckBox) AbstractC166997dE.A0R(constraintLayout, R.id.edit_icon);
        this.A05 = AbstractC31176DnK.A0f(constraintLayout, R.id.image_view);
        this.A01 = AbstractC167007dF.A0N(constraintLayout, R.id.header);
        this.A02 = AbstractC167007dF.A0N(constraintLayout, R.id.sub_header);
        this.A04 = AbstractC31176DnK.A0T(constraintLayout, R.id.right_drag_handle);
    }
}
