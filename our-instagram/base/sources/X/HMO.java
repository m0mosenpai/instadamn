package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HMO extends AbstractC38513GwY {
    public final TextView A00;

    public HMO(View view) {
        super(view);
        view.setBackgroundResource(0);
        AbstractC166997dE.A0S(view, R.id.row_search_for_x_container).setVisibility(0);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.row_search_for_x_textview);
        this.A00 = A0T;
        AbstractC166987dD.A1O(AbstractC37301Gc2.A03(this), A0T, AbstractC53242c7.A0E(AbstractC37301Gc2.A03(this)));
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.search_loading_spinner);
        A0D.setColorFilter(C3DY.A00(AbstractC53242c7.A05(AbstractC37301Gc2.A03(this))));
        A0D.setVisibility(0);
    }
}
