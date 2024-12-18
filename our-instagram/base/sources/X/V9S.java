package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public class V9S extends AbstractC67886V0t {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithCircularImageFragment";
    public CircularImageView A00;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1903742807);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) AbstractC67886V0t.A00(inflate, this);
        this.A00 = circularImageView;
        this.A05 = circularImageView;
        super.A00 = inflate.findViewById(R.id.content_container);
        C0f9.A09(-896488725, A02);
        return inflate;
    }
}
