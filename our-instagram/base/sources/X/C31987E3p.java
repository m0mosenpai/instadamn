package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31987E3p extends C3OO {
    public ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final InterfaceC56392iX A05;
    public final GradientSpinnerAvatarView A06;
    public final ViewGroup A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31987E3p(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A07 = AbstractC31176DnK.A0C(viewGroup, R.id.row_user_container_base);
        this.A06 = AbstractC31176DnK.A0f(this.A00, R.id.row_user_imageview);
        this.A02 = AbstractC167007dF.A0N(this.A00, R.id.row_user_primary_name);
        this.A03 = AbstractC167007dF.A0N(this.A00, R.id.row_user_secondary_name);
        this.A01 = AbstractC167007dF.A0N(this.A00, R.id.row_user_label);
        this.A04 = AbstractC31176DnK.A0T(this.A00, R.id.message_button);
        this.A05 = AbstractC166997dE.A0X(this.A00, R.id.follow_button_stub);
    }
}
