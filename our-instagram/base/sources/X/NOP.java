package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes9.dex */
public final class NOP extends AbstractC51367MmS {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public NOP(View view, UserSession userSession) {
        super(view, userSession);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.customer_info_title);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.customer_info_description);
        this.A00 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.customer_info_questions_container);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.profile_image);
    }
}
