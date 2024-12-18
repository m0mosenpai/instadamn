package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes11.dex */
public final class WlY implements InterfaceC71957XCj {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final View A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final C57012jc A09;
    public final C57012jc A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;

    public static void A00(WlY wlY) {
        C57012jc c57012jc = wlY.A09;
        if (c57012jc.A00 == null) {
            View A01 = c57012jc.A01();
            wlY.A00 = A01.requireViewById(R.id.row_newsfeed_like_button_click_area);
            wlY.A02 = (TextView) A01.requireViewById(R.id.row_newsfeed_textview_reply_button);
            wlY.A01 = (TextView) A01.requireViewById(R.id.row_newsfeed_textview_private_reply_button);
            wlY.A03 = (TextView) A01.requireViewById(R.id.row_newsfeed_textview_send_button);
        }
    }

    @Override // X.InterfaceC71957XCj
    public final CircularImageView BxW() {
        return this.A06;
    }

    @Override // X.InterfaceC71957XCj
    public final StackedAvatarView BzV() {
        return (StackedAvatarView) this.A0C.A01();
    }

    public WlY(View view) {
        this.A04 = view;
        this.A06 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        this.A0B = AbstractC31177DnL.A0V(view, R.id.row_user_imageview_reelring);
        this.A0C = AbstractC31177DnL.A0V(view, R.id.row_user_stacked_avatar);
        this.A05 = (TextView) view.requireViewById(R.id.row_text);
        this.A0A = AbstractC31177DnL.A0V(view, R.id.row_media_image);
        this.A09 = AbstractC31177DnL.A0V(view, R.id.row_like_and_reply_controls);
        this.A08 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey);
        this.A07 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey_confirmation);
    }
}
