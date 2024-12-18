package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.accessibility.AccessibleTextView;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Tu8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65790Tu8 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final AccessibleTextView A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;

    public C65790Tu8(View view, View view2) {
        super(view);
        this.A00 = view2;
        this.A04 = AbstractC31176DnK.A0T(view2, R.id.inline_insights_icon);
        this.A03 = (IgLinearLayout) AbstractC166997dE.A0R(view2, R.id.inline_insights_container);
        AccessibleTextView accessibleTextView = (AccessibleTextView) AbstractC166997dE.A0R(view2, R.id.inline_insights_text);
        this.A02 = accessibleTextView;
        TextView A0N = AbstractC167007dF.A0N(view2, R.id.boost_post);
        this.A01 = A0N;
        AbstractC13880nE.A0l(A0N, 16, 7, 16, 7);
        A0N.setTextAppearance(R.style.igds_emphasized_body_1);
        accessibleTextView.setTextAppearance(R.style.igds_emphasized_body_1);
    }
}
