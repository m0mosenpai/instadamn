package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.E2u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31966E2u extends C3OO {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgdsRadioButton A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31966E2u(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.direct_inbox_filter_option_title);
        this.A03 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.direct_inbox_filter_option_radio);
        this.A02 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.direct_inbox_filter_option_icon);
    }
}
