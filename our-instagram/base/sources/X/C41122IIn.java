package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.IIn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41122IIn {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final GradientSpinnerAvatarView A04;

    public C41122IIn(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A01 = AbstractC31176DnK.A0C(viewGroup, R.id.row_user_container_base);
        this.A04 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(viewGroup, R.id.row_user_imageview);
        this.A02 = AbstractC25231BEo.A0d(viewGroup, R.id.row_user_primary_name);
        this.A03 = AbstractC25231BEo.A0d(viewGroup, R.id.row_user_secondary_name);
    }
}
