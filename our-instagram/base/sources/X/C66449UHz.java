package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.UHz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66449UHz extends C3OO {
    public final RoundedCornerImageView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66449UHz(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.campaign_controls_media_thumbnail);
        this.A00 = roundedCornerImageView;
        if (z) {
            ViewGroup.LayoutParams layoutParams = roundedCornerImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (layoutParams.height * 9) / 16;
                roundedCornerImageView.setLayoutParams(layoutParams);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
