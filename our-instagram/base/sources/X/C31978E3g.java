package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.E3g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31978E3g extends C3OO {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgdsRadioButton A06;

    public C31978E3g(View view) {
        super(view);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.hall_pass_row_container);
        this.A01 = AbstractC31176DnK.A0C(view, R.id.hall_pass_name_container);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.hall_pass_name);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.hall_pass_member_count);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.subtitle_right_chevron);
        this.A06 = (IgdsRadioButton) AbstractC166997dE.A0R(view, R.id.hall_pass_radio_button);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.right_chevron);
    }
}
