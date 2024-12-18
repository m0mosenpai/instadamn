package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public abstract class VWY {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.row_search_map_query, false);
        C69309VlH c69309VlH = new C69309VlH(A0C);
        CircularImageView circularImageView = c69309VlH.A04;
        U3G.A00(context, circularImageView, C05F.A00);
        AbstractC31172DnG.A1B(context, circularImageView, AbstractC53242c7.A0D(context));
        circularImageView.setStrokeAlpha(circularImageView.A00);
        A0C.setTag(c69309VlH);
        return A0C;
    }
}
