package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.VlH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69309VlH {
    public IgSimpleImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final CircularImageView A04;

    public C69309VlH(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.row_search_map_query_title);
        this.A03 = A0N;
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.row_search_icon);
        this.A04 = A0U;
        this.A02 = AbstractC167007dF.A0M(view, R.id.dismiss_button_stub);
        AbstractC37300Gc1.A0d(A0N, true);
        AbstractC65702TsY.A0w(view.getResources(), AbstractC31177DnL.A0G(A0U));
    }
}
