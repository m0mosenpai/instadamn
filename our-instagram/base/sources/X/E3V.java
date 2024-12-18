package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E3V extends C3OO {
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;
    public final GradientSpinnerAvatarView A05;

    public E3V(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A01 = view;
        this.A05 = AbstractC31176DnK.A0f(view, R.id.thread_image);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.thread_name);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.thread_secondary_name);
        this.A04 = (IgdsRadioButton) AbstractC166997dE.A0R(view, R.id.target_thread_radio_button);
    }
}
