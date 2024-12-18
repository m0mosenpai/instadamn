package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.JrJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44736JrJ extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final RoundedCornerFrameLayout A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44736JrJ(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.cta_container);
        this.A00 = AbstractC167007dF.A0N(view, R.id.cta_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.icon);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.cta_chevron);
    }
}
