package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MlY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51311MlY extends C3OO {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51311MlY(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_container);
        this.A02 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.profile_picture);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.title);
    }
}
