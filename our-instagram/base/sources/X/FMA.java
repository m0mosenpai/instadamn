package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FMA {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public FMA(ViewGroup viewGroup) {
        this.A03 = AbstractC31173DnH.A0T(viewGroup, R.id.avatar_image_view);
        this.A02 = AbstractC31180DnO.A06(viewGroup);
        this.A01 = AbstractC166997dE.A0T(viewGroup, R.id.full_name);
        this.A00 = viewGroup.requireViewById(R.id.login_button);
    }
}
