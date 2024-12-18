package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jqh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44698Jqh extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final GradientSpinnerAvatarView A02;

    public C44698Jqh(View view) {
        super(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.row_user_primary_name);
        this.A01 = AbstractC167007dF.A0N(view, R.id.row_user_secondary_name);
        this.A02 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.row_user_avatar);
    }
}
