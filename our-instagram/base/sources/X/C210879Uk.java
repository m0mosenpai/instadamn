package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.9Uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210879Uk extends C3OO {
    public final IgSimpleImageView A00;
    public final RoundedCornerImageView A01;

    public C210879Uk(View view, C187318Ry c187318Ry) {
        super(view);
        this.A01 = (RoundedCornerImageView) AbstractC166987dD.A0c(view, R.id.background_image_view);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.plus_image);
        this.A00 = igSimpleImageView;
        C3P9 A0s = AbstractC166987dD.A0s(igSimpleImageView);
        A0s.A0D = true;
        A0s.A07 = true;
        A0s.A02 = 0.95f;
        A0s.A04 = new C48540Ldd(c187318Ry, 3);
        A0s.A00();
    }
}
