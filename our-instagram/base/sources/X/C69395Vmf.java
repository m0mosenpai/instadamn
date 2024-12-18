package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.Vmf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69395Vmf {
    public IgSimpleImageView A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final ReelBrandingBadgeView A06;

    public C69395Vmf(View view) {
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.row_search_profile_image);
        this.A06 = (ReelBrandingBadgeView) AbstractC166997dE.A0R(view, R.id.branding_badge);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.row_places_container);
        this.A01 = A0C;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.row_place_title);
        this.A03 = A0d;
        AbstractC37300Gc1.A0d(A0d, true);
        this.A04 = (IgTextView) view.requireViewById(R.id.row_place_subtitle);
        this.A02 = (ViewStub) view.requireViewById(R.id.dismiss_button_stub);
        A0C.setBackgroundResource(AbstractC53242c7.A0H(view.getContext(), R.attr.backgroundDrawable));
    }
}
