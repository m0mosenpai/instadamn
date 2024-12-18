package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class IJG {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsButton A04;

    public IJG(View view) {
        this.A03 = AbstractC25231BEo.A0d(view, R.id.incentive_title);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.auto_applied_at_checkout_text);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.expiration_text);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.incentive_description);
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.buy_on_ig_incentive_button);
    }
}
