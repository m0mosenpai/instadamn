package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.pollresults.PollResultsView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* loaded from: classes11.dex */
public final class WlW implements InterfaceC71957XCj {
    public PollResultsView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;

    @Override // X.InterfaceC71957XCj
    public final CircularImageView BxW() {
        return this.A04;
    }

    @Override // X.InterfaceC71957XCj
    public final StackedAvatarView BzV() {
        return (StackedAvatarView) this.A07.A01();
    }

    public WlW(View view) {
        this.A01 = view;
        this.A04 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        this.A05 = AbstractC31177DnL.A0U(view, R.id.row_user_imageview_reelring);
        this.A07 = AbstractC31177DnL.A0U(view, R.id.row_user_stacked_avatar);
        this.A03 = (TextView) view.requireViewById(R.id.row_text);
        this.A08 = AbstractC31177DnL.A0U(view, R.id.row_stacked_media_image);
        this.A06 = AbstractC31177DnL.A0U(view, R.id.reel_media_view);
        this.A02 = (ViewStub) view.requireViewById(R.id.poll_results_stub);
    }
}
