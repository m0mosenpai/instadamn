package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31995E3x extends C3OO {
    public final ViewGroup A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgTextView A07;
    public final C31447Drr A08;
    public final IgdsButton A09;
    public final IgdsButton A0A;

    public C31995E3x(View view) {
        super(view);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.row_inbox_container);
        this.A00 = A0C;
        this.A08 = new C31447Drr(null, null, null, AbstractC56372iV.A00(A0C.requireViewById(R.id.group_photo_faceswarm_stub)), (GradientSpinnerAvatarView) AbstractC166997dE.A0S(A0C, R.id.avatar_container));
        this.A06 = AbstractC31176DnK.A0T(A0C, R.id.row_inbox_icon);
        this.A05 = AbstractC31176DnK.A0T(A0C, R.id.row_avatar_placeholder);
        IgTextView A0d = AbstractC25231BEo.A0d(A0C, R.id.row_inbox_username);
        this.A07 = A0d;
        this.A04 = AbstractC167007dF.A0N(A0C, R.id.row_inbox_digest);
        this.A03 = AbstractC167007dF.A0N(A0C, R.id.row_search_user_secondary_subtitle);
        this.A02 = AbstractC167007dF.A0N(A0C, R.id.row_search_debug_info);
        this.A01 = (FrameLayout) AbstractC166997dE.A0R(A0C, R.id.inbox_option_view);
        this.A09 = (IgdsButton) AbstractC166997dE.A0R(A0C, R.id.row_direct_action_button);
        this.A0A = (IgdsButton) AbstractC166997dE.A0R(A0C, R.id.row_direct_message_button);
        A0d.A00 = true;
    }
}
