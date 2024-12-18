package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class UJI extends C3OO {
    public final LinearLayout A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJI(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.campaign_controls_row);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.campaign_controls_row_text);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.campaign_controls_row_subtext);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.campaign_controls_row_arrow);
    }
}
