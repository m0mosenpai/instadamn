package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E2a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31946E2a extends C3OO {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;

    public C31946E2a(View view) {
        super(view);
        this.A00 = view;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.echo_text);
        this.A01 = A0N;
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.row_search_profile_image);
        this.A02 = A0U;
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0U);
        Resources resources = view.getResources();
        A0G.setMarginStart(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        A0G.setMarginEnd(AbstractC166997dE.A05(resources));
        U3G.A00(AbstractC166997dE.A0L(view), A0U, C05F.A00);
        AbstractC56952jT.A01(A0N);
    }
}
