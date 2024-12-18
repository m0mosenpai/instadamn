package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.FMx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34614FMx {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final CircularImageView A04;

    public C34614FMx(ViewGroup viewGroup) {
        this.A00 = viewGroup;
        this.A04 = AbstractC31173DnH.A0T(viewGroup, R.id.avatar_image_view);
        this.A03 = AbstractC31180DnO.A06(viewGroup);
        View requireViewById = viewGroup.requireViewById(R.id.login_button);
        this.A01 = requireViewById;
        AbstractC56952jT.A01(requireViewById);
        this.A02 = viewGroup.requireViewById(R.id.option_button);
    }
}
