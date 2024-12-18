package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class E2D extends C3OO {
    public final TextView A00;
    public final CircularImageView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2D(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.charity_profile_picture);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.fundraiser_info);
    }
}
