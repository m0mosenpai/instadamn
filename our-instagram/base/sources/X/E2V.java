package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E2V extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final GradientSpinnerAvatarView A02;

    public E2V(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.avatar_container);
        this.A02 = AbstractC31176DnK.A0f(view, R.id.avatar);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.username);
    }
}
