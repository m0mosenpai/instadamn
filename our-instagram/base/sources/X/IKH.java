package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* loaded from: classes7.dex */
public final class IKH {
    public IgdsButton A00;
    public final View A01;
    public final ViewStub A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final AfiSecondaryLinkButton A06;
    public final HorizontalFlowLayout A07;

    public IKH(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A04 = AbstractC25231BEo.A0d(view, R.id.afi_view_title);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.afi_view_subtitle);
        this.A05 = AbstractC167007dF.A0T(view, R.id.afi_view_dismiss_button);
        this.A07 = (HorizontalFlowLayout) AbstractC166997dE.A0R(view, R.id.afi_view_interests_pill_container);
        this.A06 = (AfiSecondaryLinkButton) AbstractC166997dE.A0R(view, R.id.afi_view_expand_interests_button);
        this.A02 = AbstractC167007dF.A0M(view, R.id.afi_post_selection_stub);
    }
}
