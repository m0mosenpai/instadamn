package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes5.dex */
public final class CRM {
    public final View A00;
    public final LithoView A01;
    public final RoundedCornerFrameLayout A02;

    public CRM(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = (LithoView) AbstractC166987dD.A0c(view, R.id.comment_row_view);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.comment_row_view_container);
        this.A02 = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setElevation(30.0f);
        Context A0L = AbstractC166997dE.A0L(view);
        int A0C = AbstractC166987dD.A0C(A0L, 6);
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(20));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(A0C, 0, A0C, 0);
        roundedCornerFrameLayout.setLayoutParams(marginLayoutParams);
        roundedCornerFrameLayout.setBackgroundColor(AbstractC167007dF.A09(A0L, R.attr.elevatedBackgroundColor));
    }
}
