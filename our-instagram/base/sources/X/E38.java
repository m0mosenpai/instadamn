package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E38 extends C3OO {
    public final GradientSpinnerAvatarView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsSwitch A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E38(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC31176DnK.A0f(view, R.id.avatar);
        this.A01 = AbstractC167007dF.A0N(view, R.id.primary_text);
        this.A02 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A03 = (IgdsSwitch) AbstractC166997dE.A0R(view, R.id.switch_button);
    }
}
