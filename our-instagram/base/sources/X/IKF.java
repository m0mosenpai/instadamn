package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes7.dex */
public final class IKF {
    public ViewGroup A00;
    public IgImageView A01;
    public IgImageView A02;
    public IgImageView A03;
    public final ViewStub A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;

    public IKF(View view) {
        C14360o3.A0B(view, 1);
        this.A07 = AbstractC167007dF.A0T(view, R.id.business_profile_pic);
        this.A06 = AbstractC167007dF.A0N(view, R.id.business_name);
        this.A05 = AbstractC167007dF.A0N(view, R.id.business_category);
        this.A04 = AbstractC167007dF.A0M(view, R.id.grid_image_container_stub);
    }
}
