package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gvw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38475Gvw extends C3OO {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final InterfaceC56392iX A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38475Gvw(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (FrameLayout) AbstractC166987dD.A0c(view, R.id.non_visual_variant_item_background);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.non_visual_variant_item_selected_overlay_stub);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.non_visual_variant_item_text);
        this.A02 = A0N;
        AbstractC37300Gc1.A0d(A0N, true);
        View requireViewById = view.requireViewById(R.id.non_visual_variant_item_sold_out_slash);
        this.A00 = requireViewById;
        C38294Gsd c38294Gsd = new C38294Gsd(AbstractC166997dE.A0L(view), z);
        c38294Gsd.A00 = R.dimen.abc_action_bar_elevation_material;
        requireViewById.setBackground(c38294Gsd);
    }
}
