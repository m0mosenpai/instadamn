package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.E3l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31983E3l extends C3OO {
    public final ViewGroup A00;
    public final IgLinearLayout A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgdsCheckBox A07;

    public C31983E3l(View view) {
        super(view);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.audience_list_row_container);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.audience_list_label);
        this.A01 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.audience_list_member_count_container);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.audience_list_member_count);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.audience_list_member_count_chevron);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.audience_list_facepile);
        this.A07 = (IgdsCheckBox) AbstractC166997dE.A0R(view, R.id.audience_list_checkbox);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.audience_list_right_chevron);
    }
}
