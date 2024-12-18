package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IJi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41143IJi {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final IgImageView A05;

    public C41143IJi(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A05 = AbstractC167007dF.A0T(view, R.id.brand_image);
        this.A03 = AbstractC167007dF.A0N(view, R.id.brand_username);
        this.A02 = AbstractC167007dF.A0N(view, R.id.brand_subtitle);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.info_icon);
        this.A00 = AbstractC166997dE.A0S(view, R.id.chevron);
    }
}
