package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes11.dex */
public final class WlX implements InterfaceC71957XCj {
    public View A00;
    public TextView A01;
    public final View A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final C57012jc A09;
    public final C57012jc A0A;

    @Override // X.InterfaceC71957XCj
    public final CircularImageView BxW() {
        return this.A04;
    }

    @Override // X.InterfaceC71957XCj
    public final StackedAvatarView BzV() {
        return (StackedAvatarView) this.A0A.A01();
    }

    public WlX(View view) {
        this.A02 = view;
        this.A04 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        this.A0A = AbstractC31177DnL.A0V(view, R.id.row_user_stacked_avatar);
        this.A08 = AbstractC31177DnL.A0V(view, R.id.row_user_imageview_reelring);
        this.A03 = (TextView) view.requireViewById(R.id.row_text);
        this.A05 = AbstractC31177DnL.A0V(view, R.id.row_follow_button);
        this.A09 = AbstractC31177DnL.A0V(view, R.id.row_requested_user_actions_group);
        this.A07 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey);
        this.A06 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey_confirmation);
    }
}
