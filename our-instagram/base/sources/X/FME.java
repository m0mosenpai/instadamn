package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class FME {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgdsButton A03;

    public FME(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.rff_banner_title_textview);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.rff_banner_dismiss_button);
        this.A03 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.rff_banner_continue_button);
    }
}
