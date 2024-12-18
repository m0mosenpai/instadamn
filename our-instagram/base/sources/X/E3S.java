package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class E3S extends C3OO {
    public final Drawable A00;
    public final Drawable A01;
    public final LinearLayout A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3S(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = (LinearLayout) AbstractC166987dD.A0c(view, R.id.row_highlight_container);
        this.A05 = (IgImageView) AbstractC166987dD.A0c(view, R.id.cover_image);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.title);
        this.A03 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.radio_button);
        Context A0L = AbstractC166997dE.A0L(view);
        int A0C = AbstractC53242c7.A0C(A0L);
        Paint paint = C3LQ.A00;
        this.A00 = C3LQ.A05(A0L, R.drawable.instagram_payments_icons_radio, A0L.getColor(A0C));
        this.A01 = C3LQ.A05(A0L, R.drawable.unchecked, A0L.getColor(R.color.baseline_neutral_80));
    }
}
