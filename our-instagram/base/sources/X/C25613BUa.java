package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.BUa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25613BUa extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final /* synthetic */ C4FH A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25613BUa(View view, C4FH c4fh) {
        super(view);
        this.A05 = c4fh;
        this.A03 = (IgImageView) AbstractC166987dD.A0c(view, R.id.map_image);
        this.A00 = AbstractC166987dD.A0c(view, R.id.map_current_location_dot);
        this.A02 = (IgImageView) AbstractC166987dD.A0c(view, R.id.map_current_city_name);
        this.A01 = (IgTextView) AbstractC166987dD.A0c(view, R.id.map_pog_label);
        this.A04 = (IgImageView) AbstractC166987dD.A0c(view, R.id.map_update_cluster_view);
    }

    public static final void A00(C4F3 c4f3, C25613BUa c25613BUa, boolean z) {
        String str = c4f3.A05;
        if (str != null && str.length() != 0 && z) {
            IgImageView igImageView = c25613BUa.A02;
            igImageView.setVisibility(0);
            C27072Bww c27072Bww = new C27072Bww(AbstractC166997dE.A0L(c25613BUa.itemView), str);
            igImageView.setImageDrawable(c27072Bww);
            ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
            if (layoutParams != null) {
                C6RB c6rb = c27072Bww.A00;
                layoutParams.width = c6rb.A0A;
                layoutParams.height = c6rb.A06;
                igImageView.setLayoutParams(layoutParams);
                return;
            }
            throw AbstractC166987dD.A15(AbstractC111324zv.A00(0));
        }
        c25613BUa.A02.setVisibility(8);
    }
}
