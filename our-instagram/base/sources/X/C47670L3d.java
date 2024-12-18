package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.L3d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47670L3d {
    public final TextView A00;
    public final TextView A01;
    public final IgLinearLayout A02;
    public final IgSimpleImageView A03;
    public final RoundedCornerConstraintLayout A04;

    public C47670L3d(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.row_feed_notice_with_thumbnail);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.row_feed_notice_text);
        this.A01 = A0N;
        this.A00 = AbstractC167007dF.A0N(view, R.id.row_feed_notice_sub_text);
        this.A04 = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.row_feed_notice_thumbnail);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.row_feed_notice_icon);
        AbstractC25227BEk.A11(A0N);
    }
}
