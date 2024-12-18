package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E3G extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsRadioButton A03;
    public final GradientSpinnerAvatarView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3G(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A04 = AbstractC31176DnK.A0f(this.itemView, R.id.channel_icon);
        this.A01 = AbstractC167007dF.A0N(this.itemView, R.id.channel_name);
        this.A03 = (IgdsRadioButton) AbstractC166997dE.A0R(this.itemView, R.id.channel_toggle);
        this.A02 = AbstractC167007dF.A0N(this.itemView, R.id.channel_subtitle);
    }
}
