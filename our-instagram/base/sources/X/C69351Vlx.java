package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vlx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69351Vlx {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;

    public C69351Vlx(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = AbstractC166997dE.A0S(view, R.id.universal_cta_description_layout);
        this.A03 = AbstractC167007dF.A0N(view, R.id.universal_cta_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.universal_cta_subtitle);
        this.A05 = AbstractC167007dF.A0T(view, R.id.universal_cta_icon_rounded);
        this.A02 = (ImageView) AbstractC166997dE.A0R(view, R.id.universal_cta_chevron);
    }
}
