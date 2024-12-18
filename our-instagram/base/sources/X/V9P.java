package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public final class V9P extends AbstractC67886V0t {
    public static final String __redex_internal_original_name = "QuickPromotionIIGCelebrationFullscreen";
    public IgSimpleImageView A00;
    public CircularImageView A01;
    public CircularImageView A02;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(473362156);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_celebration_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) AbstractC67886V0t.A00(inflate, this);
        this.A02 = circularImageView;
        this.A05 = circularImageView;
        this.A01 = (CircularImageView) inflate.findViewById(R.id.animation_over_image);
        this.A00 = (IgSimpleImageView) inflate.findViewById(R.id.background_simple_imageview);
        C0f9.A09(-113262650, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1367089087);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        C0f9.A09(-214635048, A02);
    }

    @Override // X.AbstractC67886V0t, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        CircularImageView circularImageView;
        int A02 = C0f9.A02(439250282);
        super.onResume();
        C4NJ c4nj = this.A07;
        if (c4nj != null && !this.A0A) {
            A02(c4nj);
            UserSession userSession = (UserSession) this.A0E.getValue();
            if (userSession != null && (circularImageView = this.A02) != null) {
                circularImageView.setUrl(AbstractC166997dE.A0Y(userSession).A0C(), this);
            }
            IgSimpleImageView igSimpleImageView = this.A00;
            if (igSimpleImageView != null) {
                C69422Vn7 c69422Vn7 = new C69422Vn7(igSimpleImageView, getModuleName(), igSimpleImageView.getRootView());
                c69422Vn7.A03 = AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_dimmer);
                c69422Vn7.A00 = 5;
                igSimpleImageView.setBackground(new C66305U8d(c69422Vn7));
            }
            CircularImageView circularImageView2 = this.A01;
            if (circularImageView2 != null) {
                AbstractC73003Pb.A00(requireContext(), circularImageView2);
                AbstractC73003Pb.A01(circularImageView2.getDrawable());
            }
        } else {
            A01();
            this.A09 = true;
        }
        C0f9.A09(-510503725, A02);
    }
}
