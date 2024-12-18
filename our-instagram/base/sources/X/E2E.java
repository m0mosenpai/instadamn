package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes6.dex */
public final class E2E extends C3OO {
    public final View A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public E2E(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.boost_guidance_preview_container);
        this.A02 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.boost_guidance_image_preview);
        this.A01 = AbstractC167007dF.A0N(view, R.id.boost_guidance_title);
    }
}
