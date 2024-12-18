package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.CIk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27665CIk {
    public static final View A00(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.direct_user_mention_row_view, viewGroup, false);
        inflate.setTag(new CRW(AbstractC167007dF.A0N(inflate, R.id.row_user_primary_name), AbstractC167007dF.A0N(inflate, R.id.row_user_secondary_name), (GradientSpinnerAvatarView) AbstractC166997dE.A0R(inflate, R.id.row_user_avatar)));
        return inflate;
    }
}
