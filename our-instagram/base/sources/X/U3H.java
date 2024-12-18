package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public final class U3H {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final ViewStub A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final CircularImageView A07;

    public U3H(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A06 = AbstractC25231BEo.A0d(view, R.id.row_search_keyword_title);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.row_search_keyword_subtitle);
        this.A03 = AbstractC167007dF.A0M(view, R.id.dismiss_button_stub);
        this.A04 = AbstractC167007dF.A0M(view, R.id.icon_stub);
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.row_search_profile_image);
        this.A07 = A0U;
        AbstractC65702TsY.A0w(view.getResources(), AbstractC31177DnL.A0G(A0U));
    }
}
