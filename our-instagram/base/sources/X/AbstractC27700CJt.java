package X;

import android.view.View;
import com.facebook.R;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.CJt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27700CJt {
    public static final boolean A00(C139566Tl c139566Tl) {
        if (c139566Tl.A01 != null) {
            return false;
        }
        View inflate = c139566Tl.A09.inflate();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4992));
        ReelBrandingBadgeView reelBrandingBadgeView = (ReelBrandingBadgeView) inflate;
        c139566Tl.A01 = reelBrandingBadgeView;
        int dimensionPixelSize = AbstractC25228BEl.A0M(reelBrandingBadgeView).getDimensionPixelSize(R.dimen.abc_control_corner_material);
        ReelBrandingBadgeView reelBrandingBadgeView2 = c139566Tl.A01;
        if (reelBrandingBadgeView2 != null) {
            reelBrandingBadgeView2.setTranslationX(dimensionPixelSize);
        }
        if (c139566Tl.A01 == null) {
            return false;
        }
        return true;
    }
}
