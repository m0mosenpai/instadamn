package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class V9O extends AbstractC67886V0t {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithRectangularImageFragment";
    public IgImageView A00;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1047167028);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_rectangular_image_fragment, viewGroup, false);
        IgImageView igImageView = (IgImageView) AbstractC67886V0t.A00(inflate, this);
        this.A00 = igImageView;
        this.A05 = igImageView;
        super.A00 = inflate.findViewById(R.id.content_container);
        C0f9.A09(-1274390395, A02);
        return inflate;
    }
}
