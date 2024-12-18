package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes11.dex */
public final class WlV implements InterfaceC71957XCj {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final C57012jc A03;
    public final C57012jc A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;

    @Override // X.InterfaceC71957XCj
    public final CircularImageView BxW() {
        return this.A02;
    }

    @Override // X.InterfaceC71957XCj
    public final StackedAvatarView BzV() {
        return (StackedAvatarView) this.A08.A01();
    }

    public WlV(View view) {
        this.A00 = view;
        this.A02 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        this.A08 = AbstractC31177DnL.A0U(view, R.id.row_user_stacked_avatar);
        this.A06 = AbstractC31177DnL.A0U(view, R.id.row_user_imageview_reelring);
        this.A01 = (TextView) view.requireViewById(R.id.row_text);
        this.A03 = AbstractC31177DnL.A0U(view, R.id.blue_dot);
        this.A07 = AbstractC31177DnL.A0U(view, R.id.right_arrow);
        this.A05 = AbstractC31177DnL.A0U(view, R.id.row_inline_survey);
        this.A04 = AbstractC31177DnL.A0U(view, R.id.row_inline_survey_confirmation);
    }
}
