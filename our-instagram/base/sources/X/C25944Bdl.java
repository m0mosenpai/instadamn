package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Bdl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25944Bdl extends C3OO {
    public View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final IgLinearLayout A05;
    public final IgSimpleImageView A06;
    public final IgSimpleImageView A07;
    public final RoundedCornerFrameLayout A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25944Bdl(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A08 = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.cta_container);
        this.A05 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.texts_container);
        this.A03 = AbstractC167007dF.A0N(view, R.id.cta_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A07 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.icon);
        this.A06 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.cta_chevron);
        this.A02 = AbstractC166997dE.A0S(view, R.id.top_divider);
        this.A01 = AbstractC166997dE.A0S(view, R.id.bottom_divider);
    }
}
