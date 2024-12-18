package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class ODR {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public ODR(View view) {
        this.A04 = AbstractC37302Gc3.A0K(view, R.id.user_verified_icon);
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.user_badge_icon);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.user_badge_count);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.user_pinned_icon);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.user_pinned_text);
    }
}
