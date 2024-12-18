package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31976E3e extends C3OO {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final GradientSpinnerAvatarView A06;

    public C31976E3e(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        this.A02 = AbstractC166997dE.A0S(view, R.id.user_row_background);
        this.A06 = AbstractC31176DnK.A0f(view, R.id.avatar_container);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.thread_title);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.thread_subtitle);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.existing_thread_radio_button);
    }
}
